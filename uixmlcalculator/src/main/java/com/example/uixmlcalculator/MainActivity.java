package com.example.uixmlcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;

import android.os.Bundle;

import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;

import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button1);
        Button btn1 = (Button)findViewById(R.id.button2);
        Button btn2= (Button)findViewById(R.id.button3);
        Button btn3 = (Button)findViewById(R.id.button4);
        final EditText et1 = (EditText)findViewById(R.id.editText1);
        final EditText et2 = (EditText)findViewById(R.id.editText2);
        final EditText et3 = (EditText)findViewById(R.id.editText3);
        btn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                int num1 = new Integer(et1.getText().toString());
                int num2 = new Integer(et2.getText().toString());
                int add = num1 + num2;
                et3.setText(Integer.toString(add));
            }
        });
        btn1.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                int num1 = new Integer(et1.getText().toString());
                int num2 = new Integer(et2.getText().toString());
                int minus = num1 - num2;
                et3.setText(Integer.toString(minus));
            }
        });
        btn2.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                int num1 = new Integer(et1.getText().toString());
                int num2 = new Integer(et2.getText().toString());
                int multiply = num1 * num2;
                et3.setText(Integer.toString(multiply));
            }
        });
        btn3.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                int num1 = new Integer(et1.getText().toString());
                int num2 = new Integer(et2.getText().toString());
                int div = num1 / num2;
                et3.setText(Integer.toString(div));
            }
        });
    }
}

