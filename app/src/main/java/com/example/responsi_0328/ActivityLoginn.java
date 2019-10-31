package com.example.responsi_0328;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLoginn extends AppCompatActivity {

    Button btn_login;
    EditText pass;
    EditText uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginn);

        uname = findViewById(R.id.uname);
        pass = findViewById(R.id.pass);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = uname.getText().toString();
                String passwordKey = pass.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("admin123")){
                    //jika berhasil
                    Toast.makeText(getApplicationContext(), "Ayeayyy Login Berhasil",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityLoginn.this,ActivityHome.class);
                    ActivityLoginn.this.startActivity(intent);
                    finish();
                }
                else {
                    //jika gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(ActivityLoginn.this);
                    builder.setMessage("Username atau Password anda SALAH !")
                            .setNegativeButton("Retry",null).create().show();
                }
            }
        });
    }
}
