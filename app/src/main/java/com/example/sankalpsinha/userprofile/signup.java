package com.example.sankalpsinha.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void Toast(View view){
        Toast message = Toast.makeText(this,"you are registered", Toast.LENGTH_SHORT);
        message.show();
    }

}
