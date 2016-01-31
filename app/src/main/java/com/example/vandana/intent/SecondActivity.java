package com.example.vandana.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
String s1,s2,s3,s4;
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1= (TextView) findViewById(R.id.textView);
        tv2= (TextView) findViewById(R.id.textView2);
        tv3= (TextView) findViewById(R.id.textView3);
        tv4= (TextView) findViewById(R.id.textView4);

        Intent i=getIntent();
        s1=i.getExtras("1");
        s2=i.getExtras("2");

        tv1.setText(s1);
        tv2.setText(s2);



        Bundle bu=getIntent().getExtras();
        s3=bu.getString("1");
        s4=bu.getString("2");

        tv3.setText(s3);
        tv4.setText(s4);



    }


}
