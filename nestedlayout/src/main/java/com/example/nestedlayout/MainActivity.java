package com.example.nestedlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Switch)findViewById(R.id.switchd)).isChecked())
                ((ImageView)findViewById(R.id.img)).setImageResource(R.drawable.mob);
                else
                    ((ImageView)findViewById(R.id.img)).setImageResource(R.drawable.os);

            }
        });
    }
}
