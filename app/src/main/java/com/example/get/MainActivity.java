package com.example.get;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et_username,et_password;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_password=findViewById(R.id.et_password);
        et_username=findViewById(R.id.et_username);

    }
    public void click(View view)
    {
        final  String  username=et_username.getText().toString().trim();
        final  String  password=et_password.getText().toString().trim();
      new Thread(){
          @Override
          public void run() {

              }
      }.start();
    }
}