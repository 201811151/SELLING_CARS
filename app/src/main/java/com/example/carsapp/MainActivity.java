package com.example.carsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button butoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butoon  = (Button) findViewById(R.id.button );
        butoon .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity();
            }
        });
    }
    public void  LoginActivity(){
        Intent intent=new Intent(MainActivity .this, LoginActivity .class);
        startActivity(intent);
    }
}