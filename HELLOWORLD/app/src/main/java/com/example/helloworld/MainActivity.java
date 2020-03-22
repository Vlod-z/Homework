package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.btn1);
        final TextView tv1 =findViewById(R.id.tv1);
        Switch s1 = findViewById(R.id.s1);

        s1.setChecked(false);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Welcome！");
            }
        });

        Log.d("MainActivity","active");
    }
}
