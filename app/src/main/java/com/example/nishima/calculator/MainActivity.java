package com.example.nishima.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    TextView ab=(TextView)findViewById(R.id.textView4);


    public void click(View view) {

showDialog(0);
TextView ab=(TextView)findViewById(R.id.textView4);

        ab.setText("2");
    }
}
