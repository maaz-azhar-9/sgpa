package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView t=(TextView) findViewById(R.id.textView16);
        t.setText("Scripthon is a coding community founded by students of MCA, Aligarh Muslim University. We are a group of talented and enthusiastic students who have experience in certain area like ML/AI,Web development, Android Development, Ethical Hacking & many more\nOur Team Members\n1.Mohd Maaz Azhar\n2.Mohd Aquib\n3.Nikhil Upadhyay\n4.Mahiya Khan\n5.Dilanshi varshney\n\nMade by Mohd Maaz Azhar");
    }
    public void home(View view)
    {
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }
}
