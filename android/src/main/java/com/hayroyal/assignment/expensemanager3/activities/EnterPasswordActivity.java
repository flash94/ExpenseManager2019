package com.hayroyal.assignment.expensemanager3.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hayroyal.assignment.expensemanager3.R;

//created by Folalu Timothy 02/02/2019
public class EnterPasswordActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_password);

//        get the password for sharedpreferences
        SharedPreferences settings = getSharedPreferences("PREFS",0);
        password = settings.getString("password", "");

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();

                if(text.equals(password)){
                    //                        login to the app
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(EnterPasswordActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
