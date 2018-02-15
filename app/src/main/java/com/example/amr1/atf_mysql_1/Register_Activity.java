package com.example.amr1.atf_mysql_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btn_go_home(View view) {
        startActivity(new Intent(getApplicationContext(),Home_Activity.class));
    }


    public void btn_go_Login(View view) {
        startActivity(new Intent(getApplicationContext(),Login_Activity.class));
    }
}
