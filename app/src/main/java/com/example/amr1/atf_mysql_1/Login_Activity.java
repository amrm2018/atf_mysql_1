package com.example.amr1.atf_mysql_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login_Activity extends AppCompatActivity {

    EditText ed_email_log , ed_pass_log ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed_email_log=findViewById(R.id.ed_email_log);
        ed_pass_log=findViewById(R.id.ed_pass_log);




    }

    public void btn_login (View v )
    {
        String Email=ed_email_log.getText().toString().trim();
        String Password=ed_pass_log.getText().toString().trim();

        String type="login";
        backgroundWorker_login backgroundWorker =new backgroundWorker_login(this);
        backgroundWorker.execute(type,Email,Password);
    }



    public void btn_go_Register (View v )
    {
        startActivity(new Intent(getApplicationContext(),Register_Activity.class));
    }
}
