package com.example.amr1.atf_mysql_1;

/**
 * Created by amr1 on 2/15/2018.
 */
import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB_Connection {


    @SuppressLint("NewApi")
    public Connection connectionclass()
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        Connection connection = null;

        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://SQL7002.site4now.net/DB_A350B1_atfalna2018",
                    "DB_A350B1_atfalna2018_admin", "01118502684amr");
        }
        catch (SQLException se)
        {
            Log.e("error Database 1 : ", se.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            Log.e("error Driver 2 : ", e.getMessage());
        }
        catch (Exception e) // Permission
        {
            Log.e("error here 3 : ", e.getMessage());
        }

        return connection;
    }


}
