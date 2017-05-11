package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearoot=new LinearLayout(this);
        linearoot.setOrientation(linearoot.VERTICAL);
        //LinearLayout.LayoutParams param=new LinearLayout.LayoutParams(500,500);
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        linearoot.setLayoutParams(param);

        final EditText txt1=new EditText(this);
        txt1.setHint("Enter first Number");
        //LinearLayout.LayoutParams param1=new LinearLayout.LayoutParams(500,100);
        LinearLayout.LayoutParams param1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        txt1.setLayoutParams(param1);
        linearoot.addView(txt1);

        final EditText txt2=new EditText(this);
        txt2.setHint("Enter second Number");
        //LinearLayout.LayoutParams param2=new LinearLayout.LayoutParams(500,100);
        LinearLayout.LayoutParams param2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        txt2.setLayoutParams(param2);
        linearoot.addView(txt2);

        final EditText txt3=new EditText(this);
        txt3.setHint("Result");
        // LinearLayout.LayoutParams param3=new LinearLayout.LayoutParams(500,100);
        LinearLayout.LayoutParams param3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        txt3.setLayoutParams(param2);
        linearoot.addView(txt3);


        final Button butn1=new Button(this);
        butn1.setText("Add");
        butn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = new Integer(txt1.getText().toString());

                int num2 = new Integer(txt2.getText().toString());

                int add = num1 + num2;

                txt3.setText("Sum of two numbers:"+add);
            }
        });
        // LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(500,100);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        butn1.setLayoutParams(params);
        linearoot.addView(butn1);


        final Button butn2=new Button(this);
        butn2.setText("Minus");
        butn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = new Integer(txt1.getText().toString());

                int num2 = new Integer(txt2.getText().toString());

                int minus = num1 - num2;

                txt3.setText("Minus of two numbers:"+minus);
            }
        });
        // LinearLayout.LayoutParams param4=new LinearLayout.LayoutParams(500,100);
        LinearLayout.LayoutParams param4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        butn2.setLayoutParams(param4);
        linearoot.addView(butn2);


        final Button butn3=new Button(this);
        butn3.setText("Multply");
        butn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = new Integer(txt1.getText().toString());

                int num2 = new Integer(txt2.getText().toString());

                int multply = num1 * num2;

                txt3.setText("Multiply of two numbers:"+multply);
            }
        });
        //LinearLayout.LayoutParams param5=new LinearLayout.LayoutParams(500,100);
        LinearLayout.LayoutParams param5 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        butn3.setLayoutParams(param5);
        linearoot.addView(butn3);


        final Button butn4=new Button(this);
        butn4.setText("Div");
        butn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = new Integer(txt1.getText().toString());

                int num2 = new Integer(txt2.getText().toString());

                int Div = num1 / num2;

                txt3.setText("Div of two numbers:"+Div);
            }
        });
        //LinearLayout.LayoutParams param6=new LinearLayout.LayoutParams(500,100);
        LinearLayout.LayoutParams param6 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        butn4.setLayoutParams(param6);
        linearoot.addView(butn4);
        setContentView(linearoot);
    }
}

