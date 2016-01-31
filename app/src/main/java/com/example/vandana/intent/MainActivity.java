package com.example.vandana.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button);
        et1= (EditText) findViewById(R.id.editText);
        et2= (EditText) findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             String s1,s2;
                s1=et1.getText().toString();
                s2=et2.getText().toString();

                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("1",s1);
                i.putExtra("2",s2);
                startActivity(i);


            }
        });
    }

 }
