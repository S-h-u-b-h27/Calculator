package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    private Button Btn1 , Btn2 , Btn3 , Btn4 , Btn5 , Btn6 , Btn7 , Btn8 , Btn9 , Btn0 ,
    Btnplus , Btnminus , Btnmultiply , Btndivide , Btnpoint , Btnmodulus , Btnclear , Btnresult ;
    float value1 , value2 ;
    boolean addition , subtraction , division , multiplication , modulus ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn0 = findViewById(R.id.Btn0);
        Btn1 = findViewById(R.id.Btn1);
        Btn2 = findViewById(R.id.Btn2);
        Btn3 = findViewById(R.id.Btn3);
        Btn4 = findViewById(R.id.Btn4);
        Btn5 = findViewById(R.id.Btn5);
        Btn6 = findViewById(R.id.Btn6);
        Btn7 = findViewById(R.id.Btn7);
        Btn8 = findViewById(R.id.Btn8);
        Btn9 = findViewById(R.id.Btn9);

        Btnplus = findViewById(R.id.Btnplus);
        Btnminus = findViewById(R.id.Btnminus);
        Btnmultiply = findViewById(R.id.Btnmultiply);
        Btndivide = findViewById(R.id.Btndivide);
        Btnmodulus = findViewById(R.id.Btnmodulus);
        Btnpoint = findViewById(R.id.Btnpoint);
        Btnresult = findViewById(R.id.Btnresult);
        Btnclear = findViewById(R.id.Btnclear);
        ed1 = findViewById(R.id.text1);

        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        Btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+".");
            }
        });

        Btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ed1 == null){
                    ed1.setText("");
                }else {
                    if(ed1.getText().toString().isEmpty())
                        return;
                    else{
                        value1 = Float.parseFloat(ed1.getText() + "");
                        addition = true;
                        ed1.setText(null);
                    }

                }
            }
        });

        Btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }else {
                    if(ed1.getText().toString().isEmpty())
                        return;
                    else{
                        value1 = Float.parseFloat(ed1.getText() + "");
                        subtraction = true;
                        ed1.setText(null);
                    }

                }

            }
        });

        Btnmodulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }else {
                    if(ed1.getText().toString().isEmpty())
                        return;
                    else{
                        value1 = Float.parseFloat(ed1.getText() + "");
                        modulus = true;
                        ed1.setText(null);
                    }

                }
            }
        });

        Btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }else {
                    if(ed1.getText().toString().isEmpty())
                        return;
                    else{
                        value1 = Float.parseFloat(ed1.getText() + "");
                        multiplication = true;
                        ed1.setText(null);
                    }

                }
            }
        });

        Btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }else {
                    if(ed1.getText().toString().isEmpty())
                        return;
                    else{
                        value1 = Float.parseFloat(ed1.getText() + "");
                        division = true;
                        ed1.setText(null);
                    }

                }
            }
        });

        Btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(ed1.getText() + "");

                if (addition == true){

                    ed1.setText(value1 + value2 +"");
                    addition=false;
                }


                if (subtraction == true){
                    ed1.setText(value1 - value2 +"");
                    subtraction=false;
                }

                if (multiplication == true){
                    ed1.setText(value1 * value2 + "");
                    multiplication=false;
                }

                if (division == true){
                    ed1.setText(value1 / value2+"");
                    division=false;
                }
            }
        });

        Btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

    }
}