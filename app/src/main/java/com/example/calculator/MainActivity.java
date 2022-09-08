package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView resultTv,solutionTv;
    MaterialButton buttonC,buttonBrackOpen,buttonBrackClose;
    MaterialButton buttonDivide,buttonMultiply,buttonPlus,buttonMinus,buttonEquals;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    MaterialButton buttonAC,buttonDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);

        assignId(buttonC,R.id.button_c);
        assignId(buttonBrackOpen,R.id.button_open_bracket);
        assignId(buttonBrackClose,R.id.button_close_bracket);
        assignId(buttonDivide,R.id.button_divide);
        assignId(buttonMultiply,R.id.button_multiply);
        assignId(buttonPlus,R.id.button_plus);
        assignId(buttonMinus,R.id.button_minus);
        assignId(buttonEquals,R.id.button_equals);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttonAC,R.id.button_ac);
        assignId(buttonDot,R.id.button_dot);


        resultTv.setText("0");


    }

    void modifyResult(String value){
        if (resultTv.getText() == "0"){
            resultTv.setText(value);
            return;
        }
        resultTv.setText(resultTv.getText()+value);
    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();

        if (buttonText.equals("AC")) {
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if (buttonText.equals("=")) {
            solutionTv.setText(resultTv.getText());
            return;
        }
        if (buttonText.equals("C")) {
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if (buttonText.equals("7")) {
            solutionTv.setText("");
            modifyResult("7");
            return;
        }
        if (buttonText.equals("8")) {
            solutionTv.setText("");
            modifyResult("8");
            return;
        }
        if (buttonText.equals("9")) {
            solutionTv.setText("");
            modifyResult("9");
            return;
        }
        if (buttonText.equals("4")) {
            solutionTv.setText("");
            modifyResult("4");
            return;
        }
        if (buttonText.equals("5")) {
            solutionTv.setText("");
            modifyResult("5");
            return;
        }
        if (buttonText.equals("6")) {
            solutionTv.setText("");
            modifyResult("6");
            return;
        }
        if (buttonText.equals("1")) {
            solutionTv.setText("");
            modifyResult("1");
            return;
        }
        if (buttonText.equals("2")) {
            solutionTv.setText("");
            modifyResult("2");
            return;
        }
        if (buttonText.equals("3")) {
            solutionTv.setText("");
            modifyResult("3");
            return;
        }
        if (buttonText.equals("0")) {
            solutionTv.setText("");
            modifyResult("0");
            return;
        }
        solutionTv.setText(dataToCalculate);
    }

}