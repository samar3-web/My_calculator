package com.samar.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean isNewop = true;
    String op = "+";
    String oldNumber ="";
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonC = (Button) findViewById(R.id.buttonC);
        editText = findViewById(R.id.edit1);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }
    public void numberEvent(View view){
        if(isNewop)
            editText.setText("");
        isNewop = false;
        String number = editText.getText().toString();
        switch (view.getId()){
            case R.id.button0:
                number += "0";
                break;
            case R.id.button1:
                number += "1";
                break;
            case R.id.button2:
                number += "2";
                break;
            case R.id.button3:
                number += "3";
                break;
            case R.id.button4:
                number += "4";
                break;
            case R.id.button5:
                number += "5";
                break;
            case R.id.button6:
                number += "6";
                break;
            case R.id.button7:
                number += "7";
                break;
            case R.id.button8:
                number += "8";
                break;
            case R.id.button9:
                number += "9";
                break;
            case R.id.button10:
                number += ".";
                break;

        }
        editText.setText(number);
    }
    public void opertorEvent (View view){
        isNewop = true;
        oldNumber = editText.getText().toString();
        switch (view.getId()){
            case R.id.buttondiv: op ="/"; break;
            case R.id.buttonmul: op ="*"; break;
            case R.id.buttonadd: op ="+"; break;
            case R.id.buttonsub: op ="-"; break;

        }

    }
    public void equalEvent(View view){
            String newNumber = editText.getText().toString();
            double result = 0.0;
            switch (op){
                case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble((newNumber));
                break;
                case "-":
                    result = Double.parseDouble(oldNumber) - Double.parseDouble((newNumber));
                    break;
                case "*":
                    result = Double.parseDouble(oldNumber) * Double.parseDouble((newNumber));
                    break;
                case "/":

                    result = Double.parseDouble(oldNumber) / Double.parseDouble((newNumber));
                    break;
            }
        editText.setText(result+"");

    }


}