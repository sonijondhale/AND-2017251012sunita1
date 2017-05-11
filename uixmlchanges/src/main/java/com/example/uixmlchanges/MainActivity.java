package com.example.uixmlchanges;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn = (Button)findViewById(R.id.button1);

        final EditText et1 = (EditText)findViewById(R.id.editText1);

        final EditText et2 = (EditText)findViewById(R.id.editText2);

        final TextView result = (TextView)findViewById(R.id.textView1);

        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)

            {

                int x = new Integer(et1.getText().toString());

                int y = new Integer(et2.getText().toString());

                int sum = x + y;

                result.setText("The Sum of "+x+" and "+y+" is "+sum);

            }

        });
    }
}
