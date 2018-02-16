package com.example.amr1.atf_mysql_1;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Register_Activity extends AppCompatActivity {

    EditText txtfname , txtemail ,  txtphone  ,txtpass ,txtcomfpass ;
    RadioButton rdmale , rdfemale;
    Button btn_save_reg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtfname=findViewById(R.id.ed_fullname_reg);
        txtemail=findViewById(R.id.ed_email_reg);
        txtpass=findViewById(R.id.ed_pass_reg);
        txtcomfpass=findViewById(R.id.ed_comfpass_reg);
        txtphone=findViewById(R.id.ed_phone_reg);
        rdmale=findViewById(R.id.rdo_male);
        rdfemale=findViewById(R.id.rdo_female);
        btn_save_reg=findViewById(R.id.btn_register);

        btn_save_reg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            }
        });//--------------end btn_save

    }
    //-------------------------------------------------------
    public void btn_go_home(View view) {
        startActivity(new Intent(getApplicationContext(),Home_Activity.class));
    }//--------------------------------------------------------------------


    //-------------------------------------------------------------
    public void btn_go_Login(View view) {
        startActivity(new Intent(getApplicationContext(),Login_Activity.class));
    }//--------------------------------------------------------------------------------
}
