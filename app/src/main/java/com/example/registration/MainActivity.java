package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   public static final String EXTRA_MESSAGE = "com.example.registration.EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void register(View view) {
            EditText firstName = (EditText) findViewById(R.id.first_name);
            String fName = firstName.getText().toString();

            Intent intent = new Intent(this, Activity2.class);
            intent.putExtra(EXTRA_MESSAGE, fName);
            startActivity(intent);
        }
    }