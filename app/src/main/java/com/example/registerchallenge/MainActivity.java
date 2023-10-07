package com.example.registerchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void onRegisterBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText editTxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText editTxtLastName = findViewById(R.id.edtTxtLastName);
        EditText editTxtEmail = findViewById(R.id.edtTxtEmail);

        txtFirstName.setText("First Name: " + editTxtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + editTxtLastName.getText().toString());
        txtEmail.setText("Email: " + editTxtEmail.getText().toString());
    }
}