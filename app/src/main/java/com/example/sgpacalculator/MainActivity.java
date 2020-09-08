package com.example.sgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   // public static final String s ="com.example.sgpacalculator.s";
    public void calc(View view)
    {
        EditText e=(EditText) findViewById(R.id.editText);
        String s =e.getText().toString();
        if(s.isEmpty()) {s = "0";}
        EditText e2=(EditText) findViewById(R.id.editText2);
        String s2 =e2.getText().toString();
        if(s2.isEmpty()) {s2="0";}
        EditText e3=(EditText) findViewById(R.id.editText3);
        String s3 =e3.getText().toString();
        if(s3.isEmpty()){s3="0";}
        EditText e4=(EditText) findViewById(R.id.editText4);
        String s4 =e4.getText().toString();
        if(s4.isEmpty()){s4="0";}
        EditText e5=(EditText) findViewById(R.id.editText5);
        String s5 =e5.getText().toString();
        if(s5.isEmpty()){s5="0";}
        EditText e6=(EditText) findViewById(R.id.editText6);
        String s6 =e6.getText().toString();
        if(s6.isEmpty()){s6="0";}
        EditText e7=(EditText) findViewById(R.id.editText7);
        String s7 =e7.getText().toString();
        if(s7.isEmpty()){s7="0";}
        EditText e8=(EditText) findViewById(R.id.editText8);
        String s8 =e8.getText().toString();
        if(s8.isEmpty()){s8="0";}
        EditText e9=(EditText) findViewById(R.id.editText9);
        String s9 =e9.getText().toString();
        if(s9.isEmpty()){s9="0";}
        EditText e10=(EditText) findViewById(R.id.editText10);
        String s10 =e10.getText().toString();
        if(s10.isEmpty()){s10="0";}
        EditText e11=(EditText) findViewById(R.id.editText11);
        String s11 =e11.getText().toString();
        if(s11.isEmpty()){s11="0";}
        EditText e12=(EditText) findViewById(R.id.editText12);
        String s12 =e12.getText().toString();
        if(s12.isEmpty()){s12="0";}
        EditText e13=(EditText) findViewById(R.id.editText13);
        String s13 =e13.getText().toString();
        if(s13.isEmpty()){s13="0";}
        EditText e14=(EditText) findViewById(R.id.editText14);
        String s14 =e14.getText().toString();
        if(s14.isEmpty()){s14="0";}
        EditText e15=(EditText) findViewById(R.id.editText15);
        String s15 =e15.getText().toString();
        if(s15.isEmpty()){s15="0";}
        EditText e16=(EditText) findViewById(R.id.editText16);
        String s16 =e16.getText().toString();
        if(s16.isEmpty()){s16="0";}
        EditText e17=(EditText) findViewById(R.id.editText17);
        String s17 =e17.getText().toString();
        if(s17.isEmpty()){s17="0";}
        EditText e18=(EditText) findViewById(R.id.editText18);
        String s18 =e18.getText().toString();
        if(s18.isEmpty()){s18="0";}
        double a1=Double.parseDouble(s);
        double a2=Double.parseDouble(s2);
        double a3=Double.parseDouble(s3);
        double a4=Double.parseDouble(s4);
        double a5=Double.parseDouble(s5);
        double a6=Double.parseDouble(s6);
        double a7=Double.parseDouble(s7);
        double a8=Double.parseDouble(s8);
        double a9=Double.parseDouble(s9);
        double a10=Double.parseDouble(s10);
        double a11=Double.parseDouble(s11);
        double a12=Double.parseDouble(s12);
        double a13=Double.parseDouble(s13);
        double a14=Double.parseDouble(s14);
        double a15=Double.parseDouble(s15);
        double a16=Double.parseDouble(s16);
        double a17=Double.parseDouble(s17);
        double a18=Double.parseDouble(s18);
        double sc=a1+a3+a5+a7+a9+a11+a13+a15+a17;
        double x1=gpoint(a2);
        double x2=gpoint(a4);
        double x3=gpoint(a6);
        double x4=gpoint(a8);
        double x5=gpoint(a10);
        double x6=gpoint(a12);
        double x7=gpoint(a14);
        double x8=gpoint(a16);
        double x9=gpoint(a18);
        double sgpa=((a1*x1)+(a3*x2)+(a5*x3)+(a7*x4)+(a9*x5)+(a11*x6)+(a13*x7)+(a15*x8)+(a17*x9))/sc;
        /*TextView t=(TextView) findViewById(R.id.textView11);
        t.setText("Your Sgpa is "+sgpa);*/
        String message = "";
        if(sgpa>10.0 || sgpa<0)
        {
            message+="Error in data Provided ";
        }
        else if(sgpa>=8.0 && sgpa<=10.0)
        {
            message+="Congratulations!\nYou passed with distinction\nYour Sgpa is "+sgpa+"\nBest of luck for next Semester";
        }
        else if(sgpa>=6.0 && sgpa<8.0)
        {
            message+="Congratulations!\nYour Sgpa is "+sgpa+"\nBest of luck for next Semester";
        }
        else if(sgpa>4.0 && sgpa<6.0)
        {
            message+="Your Sgpa is "+sgpa+"\nWork hard in next Semester";
        }
        else
        {
            message+="Your Sgpa is "+sgpa+"\nWarning : if you are unable to maintain 4 cgpa in current year, \nthen it is year back";
        }
        Intent intent=new Intent(this,Result.class);
        intent.putExtra("str", message);
        startActivity(intent);


    }
    double gpoint(double x) {
        if (x >= 90 && x <= 100) {
            return 10.0;
        } else if (x >= 80 && x < 90) {
            return 9.0;
        } else if (x >= 70 && x < 80) {
            return 8.0;
        } else if (x >= 60 && x < 70) {
            return 7.0;
        } else if (x >= 50 && x < 60) {
            return 6.0;
        } else if (x >= 40 && x < 50) {
            return 5.0;
        } else if (x >= 35 && x < 40) {
            return 4.0;
        } else if (x >= 0 && x < 35) {
            return 0.0;
        }
        else {
            return 11.0;
        }
    }
    public void reset(View view)
    {
        EditText e=(EditText) findViewById(R.id.editText);
        e.setText("");
        EditText e2=(EditText) findViewById(R.id.editText2);
        e2.setText("");
        EditText e3=(EditText) findViewById(R.id.editText3);
        e3.setText("");
        EditText e4=(EditText) findViewById(R.id.editText4);
        e4.setText("");
        EditText e5=(EditText) findViewById(R.id.editText5);
        e5.setText("");
        EditText e6=(EditText) findViewById(R.id.editText6);
        e6.setText("");
        EditText e7=(EditText) findViewById(R.id.editText7);
        e7.setText("");
        EditText e8=(EditText) findViewById(R.id.editText8);
        e8.setText("");
        EditText e9=(EditText) findViewById(R.id.editText9);
        e9.setText("");
        EditText e10=(EditText) findViewById(R.id.editText10);
        e10.setText("");
        EditText e11=(EditText) findViewById(R.id.editText11);
        e11.setText("");
        EditText e12=(EditText) findViewById(R.id.editText12);
        e12.setText("");
        EditText e13=(EditText) findViewById(R.id.editText13);
        e13.setText("");
        EditText e14=(EditText) findViewById(R.id.editText14);
        e14.setText("");
        EditText e15=(EditText) findViewById(R.id.editText15);
        e15.setText("");
        EditText e16=(EditText) findViewById(R.id.editText16);
        e16.setText("");
        EditText e17=(EditText) findViewById(R.id.editText17);
        e17.setText("");
        EditText e18=(EditText) findViewById(R.id.editText18);
        e18.setText("");
    }
    /*public void shut(View view)
    {
        //System.exit(0);
        //android.os.Process.killProcess(android.os.Process.myPid());
    }*/
}
