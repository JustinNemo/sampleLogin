package com.nikolaihost.samplelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void SampleLogin(View view){
        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("values", usernameEditText.getText().toString());
        Log.i("values", passwordEditText.getText().toString());
        Log.i("info", "Button Pressed");
        Toast.makeText(this, "Hello " + usernameEditText.getText().toString() +
                " Your Password is " + passwordEditText.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
