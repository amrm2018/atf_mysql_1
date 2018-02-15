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

    EditText txtfname , txtemail ,  txtphone  ;
    RadioButton rdmale , rdfemale;
    Button btn_save_reg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtfname=(EditText) findViewById(R.id.ed_fullname_reg);

        final EditText txtemail=(EditText) findViewById(R.id.ed_email_reg);
        final EditText  txtpass=(EditText) findViewById(R.id.ed_pass);
        final EditText txtcomfpass=(EditText) findViewById(R.id.ed_comfpass_reg);

        txtphone=(EditText) findViewById(R.id.ed_phone_reg);


        rdmale=(RadioButton)findViewById(R.id.rdo_male);
        rdfemale=(RadioButton)findViewById(R.id.rdo_female);
        btn_save_reg=(Button)findViewById(R.id.btn_register);

        btn_save_reg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //==================  star code insert
                DB_Connection db = new DB_Connection();
                Connection conn = db.connectionclass();
                if (conn == null) {
                    Toast.makeText(Register_Activity.this, " Check Internet", Toast.LENGTH_LONG).show();
                }
                else {
                    try {
                        Statement stmt = conn.createStatement();
                        String gen;
                        if (rdmale.isChecked())
                            gen = "male";
                        else
                            gen = "female";
                        int z = stmt.executeUpdate("insert into t_user (full_name,email,password,phone,gender) Values('" + txtfname.getText() + "','" + txtemail.getText() + "','" + txtpass.getText() + "','" + gen + "','" + txtphone.getText() + "')");
                        if (z >= 1) {
                            startActivity(new Intent(Register_Activity.this , Home_Activity.class));
                            Toast.makeText(Register_Activity.this, " Saved Register  ", Toast.LENGTH_SHORT).show();
                        }
                        else {

                            Toast.makeText(Register_Activity.this, " Not Saved Register", Toast.LENGTH_LONG).show();
                        }
                    } catch (SQLException e) {
                        Toast.makeText(Register_Activity.this, " Error is:   " + e.getMessage(), Toast.LENGTH_LONG).show();

                    }
                }//========end code insert

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
