package com.hayroyal.assignment.expensemanager3.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hayroyal.assignment.expensemanager3.R;

//Created by Folalu Timothy

public class CreatePasswordActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();

                if (text1.equals("") || text2.equals("")){
//                    password not entered
                    Toast.makeText(CreatePasswordActivity.this, "No password entered", Toast.LENGTH_SHORT).show();
                }else {
//                    create passord in sharedpreferences
                    if (text1.equals(text2)){
                        SharedPreferences settings  = getSharedPreferences("PREFS", 0);
                        SharedPreferences.Editor editor = settings.edit();
                        editor.putString("password", text1);
                        editor.apply();

//                        login to the app
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();

                    }else {
                        Toast.makeText(CreatePasswordActivity.this, "Password does not match!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
