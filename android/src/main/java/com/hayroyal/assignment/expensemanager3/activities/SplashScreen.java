package com.hayroyal.assignment.expensemanager3.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hayroyal.assignment.expensemanager3.R;

//created by Folalu Tomiwa 01/01/2019
public class SplashScreen extends AppCompatActivity {
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        load password
        SharedPreferences settings = getSharedPreferences("PREFS",0);
        password = settings.getString("password", "");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                if(password.equals("")){
//                    i.e password not created
                    Intent intent = new Intent(getApplicationContext(), CreatePasswordActivity.class);
                    startActivity(intent);
                    finish();
                }else {
//                    If there is a password in sharedpreferences storage
                    Intent intent = new Intent(getApplicationContext(), EnterPasswordActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        },2000);
    }
}
