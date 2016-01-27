package com.example.tae_user0.finalprojectapp1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.dbModel.MyOpenHelperManager;
import com.example.tae_user0.finalprojectapp1.dbModel.User;
import com.example.tae_user0.finalprojectapp1.push_notification.GcmRegistrationAsyncTask;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;

import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by TAE_user0 on 21/01/2016.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.txtName) EditText txtName;
    @Bind(R.id.txtEmail)EditText txtEmail;
    private MyOpenHelperManager mom;
    private User user;
    //paypal attributes
    private Button btnPay;
    private static final String CONFIG_ENVIRONMENT = PayPalConfiguration.ENVIRONMENT_SANDBOX;

    private static final String CONFIG_CLIENT_ID = "Aa4r0Hd3CzQjQcl9Iu0X9o_mf7S3hFFH0GxAIFMTIqRmII3x_R4nmdifAyjK5sxu2J8mzludfqq8Diyo";

    private static final int REQUEST_PAYPAL_PAYMENT = 1;

    private static PayPalConfiguration config = new PayPalConfiguration()
            .environment(CONFIG_ENVIRONMENT)
            .clientId(CONFIG_CLIENT_ID)
                    // The following are only used in PayPalFuturePaymentActivity.
            .merchantName("The Appexperts Ltd")
            .merchantPrivacyPolicyUri(Uri.parse("https://www.example.com/privacy"))
            .merchantUserAgreementUri(Uri.parse("https://www.example.com/legal"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);
        ButterKnife.bind(this);
        //paypal option buttons
        btnPay=(Button)findViewById(R.id.btnDonation);
        btnPay.setOnClickListener(this);

        /**
         * call pay pal services
         */

        Intent intent = new Intent(this, PayPalService.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);
        startService(intent);
    }

    //login actions
    @OnClick(R.id.btnLogin) void btnLogin (View view){
        //User user =new User();
        mom = new MyOpenHelperManager(getApplicationContext());
        List userList = (List) mom.getUsers();
        String userName = txtName.getText().toString();
        String email = txtEmail.getText().toString();
        //user.setName(txtName.getText().toString());
        //user.setEmail(txtEmail.getText().toString());

        if (txtEmail.getText().toString().isEmpty()) {
            txtEmail.setError("Fill email");
        } else if (txtName.getText().toString().isEmpty() ) {
            txtName.setError("Fill name");
        } else if (!this.emailValidator(txtEmail.getText().toString().trim())) {
            txtEmail.setError("Error email format");
        } else if( !userName.isEmpty() || !email.isEmpty()  ) {
            for ( int i =0; i< userList.size(); i++){
                        User user = (User) userList.get(i);
                if (user.getName().equalsIgnoreCase(userName) && user.getEmail().equalsIgnoreCase(email)) {
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra("user", user);
                    startActivity(intent);
                }

            }

        } else {
            Toast.makeText(getApplicationContext(), "Error on login", Toast.LENGTH_SHORT).show();
        }
    }
    @OnClick(R.id.btnReg) void btnRegistration (View view) {
        //Toast.makeText(getApplicationContext(), "Registration btn", Toast.LENGTH_SHORT).show();
        user = new User();
        mom = new MyOpenHelperManager(getApplicationContext());
        //String userName = txtName.getText().toString();
        if (txtEmail.getText().toString().isEmpty()) {
            txtEmail.setError("Fill email");
        } else if (txtName.getText().toString().isEmpty() ) {
            txtName.setError("Fill name");
        } else if (!this.emailValidator(txtEmail.getText().toString().trim())) {
            //Show_Toast("Error on email field");
            txtEmail.setError("Error email format");
        } else {
            user.setName(txtName.getText().toString());
            user.setEmail(txtEmail.getText().toString());
            mom.saveUser(user);
            Toast.makeText(getApplicationContext(), "User registered", Toast.LENGTH_SHORT).show();
        }

    }

    //emailValidator function, returns true or false depending on email
    public boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }


    //Paypal integration methods
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId()){
            case R.id.btnDonation :
                PayPalPayment thingToBuy = new PayPalPayment(new BigDecimal(10),"USD", "theappexperts.co.uk",
                        PayPalPayment.PAYMENT_INTENT_SALE);

                Intent intent = new Intent(LoginActivity.this, PaymentActivity.class);

                intent.putExtra(PaymentActivity.EXTRA_PAYMENT, thingToBuy);

                startActivityForResult(intent, REQUEST_PAYPAL_PAYMENT);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_PAYPAL_PAYMENT) {
            if (resultCode == Activity.RESULT_OK) {
                PaymentConfirmation confirm = data
                        .getParcelableExtra(PaymentActivity.EXTRA_RESULT_CONFIRMATION);
                if (confirm != null) {
                    try {
                        System.out.println("Responseeee"+confirm);
                        Log.i("paymentExample", confirm.toJSONObject().toString());


                        JSONObject jsonObj=new JSONObject(confirm.toJSONObject().toString());

                        String paymentId=jsonObj.getJSONObject("response").getString("id");
                        System.out.println("payment id:-=="+paymentId);
                        Toast.makeText(getApplicationContext(), paymentId, Toast.LENGTH_LONG).show();

                    } catch (JSONException e) {
                        Log.e("paymentExample", "an extremely unlikely failure occurred: ", e);
                    }
                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Log.i("paymentExample", "The user canceled.");
            } else if (resultCode == PaymentActivity.RESULT_EXTRAS_INVALID) {
                Log.i("paymentExample", "An invalid Payment was submitted. Please see the docs.");
            }
        }
    }


}//end of the class
