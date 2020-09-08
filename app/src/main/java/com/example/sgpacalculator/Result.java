package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

import static com.example.sgpacalculator.MainActivity.*;

public class Result extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent= getIntent();
        String message=intent.getStringExtra("str");
        TextView txt=(TextView) findViewById(R.id.res);
        txt.setText(message);
    }
    public void about(View view)
    {
        Intent intent=new Intent(this,About.class);
        startActivity(intent);
    }
}
