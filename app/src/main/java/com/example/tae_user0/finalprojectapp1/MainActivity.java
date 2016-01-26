package com.example.tae_user0.finalprojectapp1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart1.FragmentSearch;
import com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart2.FragmentMaps;
import com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart3.FragmentAbout;
import com.example.tae_user0.finalprojectapp1.Service.SaveDataService;
import com.example.tae_user0.finalprojectapp1.dbModel.User;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;

import java.security.MessageDigest;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private  DrawerLayout drawerLayout;
    private FragmentSearch  fSearch;
    private FragmentMaps fMaps;
    private FragmentAbout fAbout;
    private String message;
    private CallbackManager callbackManager;
    private ShareDialog shareDialog;
    //ProgressDialog progress;
   // private ProgressDialog progressDialog;
    private User user;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//Facebook sdk integration
        FacebookSdk.sdkInitialize(getApplicationContext());
        getUserInfo();

//Facebook ShareButton Content integrations
//        ShareButton shareButton = (ShareButton)findViewById(R.id.nav_share);
//        shareButton.getShareContent();
//
////Fabrics
//        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
//toolbar options
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//drawer options
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
//navigation options
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

       // ActionBar actionBar = getActionBar();
// add the custom view to the action bar
  /**      actionBar.setCustomView(R.layout.action_tool_view);
        EditText search = (EditText) actionBar.getCustomView().findViewById(R.id.searchfield);
        search.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId,
                                          KeyEvent event) {
                Toast.makeText(MainActivity.this, "Search triggered",
                        Toast.LENGTH_LONG).show();
                return false;
            }
        });
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM
                | ActionBar.DISPLAY_SHOW_HOME);
**/
        user = getIntent().getParcelableExtra("user");
        Log.i("getName", user.getName());
        i = new Intent(this, SaveDataService.class);
        i.putExtra("user", user);
        startService(i);
//        stopService(i);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if( id ==R.id.fb){
            setfacebookLogin();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        //init fragments
         fSearch = new FragmentSearch();
         fMaps = new FragmentMaps();
         fAbout = new FragmentAbout();
        // Handle navigation view item clicks here.
        int id = item.getItemId();
//First in the app we create the fragment to search the cities
        if (id == R.id.search) {
            //Toast.makeText(getApplicationContext(), "first",Toast.LENGTH_SHORT).show();
            //first fragment to load the cities api1 depending on searching
            FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.main_fragment, fSearch, "fragmentPart1");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);

        } else if (id == R.id.maps) {
            //Fragment for loading the maps in all cities
            FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.main_fragment, fMaps, "fragmentPart2");
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);

        } else if (id == R.id.about) {
            //Fragment about showing the version of the app
            FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.main_fragment, fAbout, "fragmentPart3");
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);

        } else if (id == R.id.nav_share) {
            setfacebookLogin();

        } else if (id == R.id.log) {
            stopService(i);
            i = new Intent(this, LoginActivity.class);
            //i.putExtra("close", user);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    //Extra methods

    /***
     * Facebook hash key generation after sdk integrated
     * */

    public void getUserInfo() {
        try{
            PackageInfo info  = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
            for (android.content.pm.Signature sign : info.signatures){
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(sign.toByteArray());
                Log.d("Key hash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (Exception e ){
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Logs 'install' and 'app activate' App Events.
        AppEventsLogger.activateApp(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Logs 'app deactivate' App Event.
        AppEventsLogger.deactivateApp(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    //@Override
//    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        callbackManager.onActivityResult(requestCode, resultCode, data);
//    }
    public void setfacebookLogin (){
        //facebook sharedialog integration
        callbackManager = CallbackManager.Factory.create();
        shareDialog = new ShareDialog(this);
        // this part is optional
        //shareDialog.registerCallback(callbackManager, new FacebookCallback<Sharer.Result>() { ... });
        if (ShareDialog.canShow(ShareLinkContent.class)) {
            ShareLinkContent linkContent = new ShareLinkContent.Builder()
                    .setContentTitle("Hello Facebook")
                    .setContentDescription(
                            "The 'Hello Facebook' sample  showcases simple Facebook integration")
                    .setContentUrl(Uri.parse("http://developers.facebook.com/android"))
                    .build();

            shareDialog.show(linkContent);
        }
    }

    ///progress bar dialog
    public void loading (){
        final ProgressDialog progressDialog;
        progressDialog = new ProgressDialog(MainActivity.this, R.style.AppTheme);
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(true);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
    }
    public void dismissProgressDialog(){
        final ProgressDialog progressDialog;
        progressDialog = new ProgressDialog(MainActivity.this, R.style.AppTheme);
        progressDialog.dismiss();
    }
}
