package com.example.sankalpsinha.userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
    }
    public void login(View view){
        Intent login= new Intent(getApplicationContext(),login.class);
        startActivity(login);
    }
    public void signup(View view){
        Intent signup=new Intent(getApplicationContext(),signup.class);
        startActivity(signup); }

}
