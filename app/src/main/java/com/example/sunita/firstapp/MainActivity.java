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

        LinearLayout linearoot=new LinearLayout(this);
        linearoot.setOrientation(linearoot.VERTICAL);
        LinearLayout.LayoutParams linear=new LinearLayout.LayoutParams(500,500);
        linearoot.setLayoutParams(linear);

        final EditText txt=new EditText(this);
        txt.setHint("Type here");
        LinearLayout.LayoutParams linearoot1=new LinearLayout.LayoutParams(500,100);
        //LinearLayout.LayoutParams linearoot1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        txt.setLayoutParams(linearoot1);
        linearoot.addView(txt);

        Button btn=new Button(this);
        btn.setText("CLICK");
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str=txt.getText().toString();
                txt.setText(str.toUpperCase());
            }
        });


        btn.setText("OK");
        LinearLayout.LayoutParams b1=new LinearLayout.LayoutParams(500,100);
        btn.setLayoutParams(b1);
        linearoot.addView(btn);
        setContentView(linearoot);








    }
}
