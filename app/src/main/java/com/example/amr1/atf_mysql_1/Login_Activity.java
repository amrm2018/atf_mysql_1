package com.example.amr1.atf_mysql_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);





    }
    public void btn_go_Register (View v )
    {
        startActivity(new Intent(getApplicationContext(),Register_Activity.class));
    }
}
