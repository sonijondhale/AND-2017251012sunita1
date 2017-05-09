package com.example.sunita.firstapp;

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

        LinearLayout linearroot=new LinearLayout(this);
        linearroot.setOrientation(linearroot.VERTICAL);
        LinearLayout.LayoutParams linear=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        linearroot.setLayoutParams(linear);

        final EditText txt=new EditText(this);
        txt.setHint("Type here");
        LinearLayout.LayoutParams linear1=new LinearLayout.LayoutParams(500,150);
        txt.setLayoutParams(linear1);
        linearroot.addView(txt);

        Button butn=new Button(this);
        butn.setText("Click butn");
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String str=txt.getText().toString();
                txt.setText(str.toUpperCase());
            }
        });
        butn.setText("OK");
        LinearLayout.LayoutParams b1=new LinearLayout.LayoutParams(500,100);
        butn.setLayoutParams(b1);
        linearroot.addView(butn);
        setContentView(linearroot);








    }
}
