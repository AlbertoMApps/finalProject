package com.example.tae_user0.finalprojectapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.tae_user0.finalprojectapp1.dbModel.User;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by TAE_user0 on 21/01/2016.
 */
public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.txtName) EditText txtName;
    @Bind(R.id.txtEmail)EditText txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btnLogin) protected void onClick(View view){
        User user =new User();
        String userName = txtName.getText().toString();
        user.setName(txtName.getText().toString());
        user.setEmail(txtEmail.getText().toString());
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("user",user);
        startActivity(i);
    }
}
