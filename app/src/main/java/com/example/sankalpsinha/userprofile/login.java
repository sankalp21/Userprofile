package com.example.sankalpsinha.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void toast (View view){
        Toast message = Toast.makeText(this,"you are logged in!",Toast.LENGTH_SHORT);
        message.show();
    }

}
