package com.example.sagar.sicklab;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);

        TextView tv1 = (TextView) findViewById(R.id.textView2);
        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUP.class);

                startActivity(intent);

            }
        });


        TextView tv2 = (TextView) findViewById(R.id.textView5);
        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUP.class);

                startActivity(intent);

            }
        });
    }
}
