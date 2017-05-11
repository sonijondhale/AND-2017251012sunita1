package com.example.uixml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txt1=(EditText)findViewById(R.id.editName);
        final Button but=(Button)findViewById(R.id.ButnName);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txt1.getText().toString();
                txt1.setText(str.toUpperCase());
            }
        });
    }
}
