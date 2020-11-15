package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button clear;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button reminder;
    private Button equal;



    private TextView result;


    private final char addition = '+';
    private final char subtraction = '-';
    private final char multiplication = '*';
    private final char division = '/';

    private float value1=0;
    private float value2=0;
    private String temp="";
    private String Final = "";


    boolean mAddition = false;
    boolean mSubtraction = false;
    boolean mMultiplication = false;
    boolean mDivision = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtons();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");

            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");

            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
                value1 = 0;
                value2 = 0;
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(result==null){
                result.setText("");
            }

            else{
                value1 = Float.parseFloat(result.getText()+"");
                mAddition=true;
                result.setText(null);
            }}
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(result==null){
                    result.setText("");
                }

                else{
                    value1 = Float.parseFloat(result.getText()+"");
                    mSubtraction=true;
                    result.setText(null);
                }

            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(result==null){
                    result.setText("");
                }

                else{
                    value1 = Float.parseFloat(result.getText()+"");
                    mMultiplication=true;
                    result.setText(null);
                }

            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(result==null){
                    result.setText("");
                }

                else{
                    value1 = Float.parseFloat(result.getText()+"");
                    mDivision=true;
                    result.setText(null);
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(result.getText()+"");

                if(mDivision){result.setText(String.valueOf(value1/value2));}
                else if(mMultiplication){result.setText(String.valueOf(value1*value2));}
                else if(mSubtraction){result.setText(String.valueOf(value1-value2));}
                else if(mAddition){result.setText(String.valueOf(value1+value2));}




            }
        });


    }


    private void setupButtons(){
        clear=(Button)findViewById(R.id.C);
        zero = (Button)findViewById(R.id.zeroButton);
        one = (Button)findViewById(R.id.oneButton);
        two = (Button)findViewById(R.id.twoButton);
        three = (Button)findViewById(R.id.threeButton);
        four = (Button)findViewById(R.id.fourButton);
        five = (Button)findViewById(R.id.fiveButton);
        six = (Button)findViewById(R.id.sixButton);
        seven = (Button)findViewById(R.id.sevenButton);
        eight = (Button)findViewById(R.id.eightButton);
        nine = (Button)findViewById(R.id.nineButton);
        add = (Button)findViewById(R.id.plus);
        sub = (Button)findViewById(R.id.minus);
        mul = (Button)findViewById(R.id.multiple);
        div = (Button)findViewById(R.id.division);
        reminder=(Button)findViewById(R.id.remainder);
        equal=(Button)findViewById(R.id.equal);
        result=(TextView)findViewById(R.id.result);

    }
}