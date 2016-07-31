package com.example.dong.calculator;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button btnAc;
    private Button btnSign;
    private Button btnPercent;
    private Button btnDivision;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnMultiply;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btnMinus;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btnPlus;
    private Button btn0;
    private Button btnPoint;
    private Button btnEqual;

    private double num1 = 0, num2 = 0; //两个操作数
    private Boolean isEqualClicked = false; //是否按下等号
    private int op = 0; //区分运算符的状态数:1234分别代表加减乘除
    private Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.text_view);
        btnAc = (Button) findViewById(R.id.btn_ac);
        btnSign = (Button) findViewById(R.id.btn_sign);
        btnPercent = (Button) findViewById(R.id.btn_percent);
        btnDivision = (Button) findViewById(R.id.btn_division);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btn0 = (Button) findViewById(R.id.btn_0);
        btnPoint = (Button) findViewById(R.id.btn_point);
        btnEqual = (Button) findViewById(R.id.btn_equal);

        btnAc.setOnClickListener(this);
        btnSign.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnEqual.setOnClickListener(this);

    }


    public void onClick(View view) {
        switch (view.getId()) {
            /*clear*/
            case R.id.btn_ac:
                textView.setText(null);
                break;


            /*btn0 ~ btn9*/
            case R.id.btn_0:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString0 = textView.getText().toString();
                myString0 += "0";
                textView.setText(myString0);
                break;
            case R.id.btn_1:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString1 = textView.getText().toString();
                myString1 += "1";
                textView.setText(myString1);
                break;
            case R.id.btn_2:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString2 = textView.getText().toString();
                myString2 += "2";
                textView.setText(myString2);
                break;
            case R.id.btn_3:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString3 = textView.getText().toString();
                myString3 += "3";
                textView.setText(myString3);
                break;
            case R.id.btn_4:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString4 = textView.getText().toString();
                myString4 += "4";
                textView.setText(myString4);
                break;
            case R.id.btn_5:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString5 = textView.getText().toString();
                myString5 += "5";
                textView.setText(myString5);
                break;
            case R.id.btn_6:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString6 = textView.getText().toString();
                myString6 += "6";
                textView.setText(myString6);
                break;
            case R.id.btn_7:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString7 = textView.getText().toString();
                myString7 += "7";
                textView.setText(myString7);
                break;
            case R.id.btn_8:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString8 = textView.getText().toString();
                myString8 += "8";
                textView.setText(myString8);
                break;
            case R.id.btn_9:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myString9 = textView.getText().toString();
                myString9 += "9";
                textView.setText(myString9);
                break;

            case R.id.btn_point:
                if(isEqualClicked) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                String myStringPoint = textView.getText().toString();
                myStringPoint += ".";
                textView.setText(myStringPoint);
                break;

            /* 加减乘除 */
            case R.id.btn_plus:
                String myStringPlus = textView.getText().toString();
                if(myStringPlus.equals(null)) {
                    return;
                }
                num1 = Double.valueOf(myStringPlus);
                textView.setText(null);
                op = 1;
                isEqualClicked = false;
                break;
            case R.id.btn_minus:
                String myStringMinus = textView.getText().toString();
                if(myStringMinus.equals(null)) {
                    return;
                }
                num1 = Double.valueOf(myStringMinus);
                textView.setText(null);
                isEqualClicked = false;
                op = 2;
                break;
            case R.id.btn_multiply:
                String myStringMultiply = textView.getText().toString();
                if(myStringMultiply.equals(null)) {
                    return;
                }
                num1 = Double.valueOf(myStringMultiply);
                textView.setText(null);
                isEqualClicked = false;
                op = 3;
                break;
            case R.id.btn_division:
                String myStringDivision = textView.getText().toString();
                if(myStringDivision.equals(null)) {
                    return;
                }
                num1 = Double.valueOf(myStringDivision);
                textView.setText(null);
                isEqualClicked = false;
                op = 4;
                break;

            /* 正负号,百分号 */
            case R.id.btn_sign:
                String myStringSign = textView.getText().toString();
                if(myStringSign.equals(null)) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                double num3 = Double.valueOf(myStringSign);
                num3 = (-num3);
                textView.setText(String.valueOf(num3));
                break;
            case R.id.btn_percent:
                String myStringPercent = textView.getText().toString();
                if(myStringPercent.equals(null)) {
                    textView.setText(null);
                    isEqualClicked = false;
                }
                double num4 = Double.valueOf(myStringPercent);
                num3 = num4 * 0.01;
                textView.setText(String.valueOf(num3));
                break;

            /* 等于号 */
            case R.id.btn_equal:
                if(isEqualClicked == true){
                    return;
                }
                String myStringEqual = textView.getText().toString();
                if(myStringEqual.equals(null)) {
                    textView.setText(String.valueOf(num2));
                    isEqualClicked = true;
                }
                num2 = Double.valueOf(myStringEqual);
                textView.setText(null);
                switch (op) {
                    case 0:
                        result = num2;
                        break;
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        try{
                            result = num1 / num2;
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        result = 0.0;
                        break;
                }

                if(result - Math.floor(result) == 0) {
                    int result1 = (int)Math.floor(result);
                    textView.setText(String.valueOf(result1));
                } else {
                    textView.setText(String.valueOf(result));
                }
                isEqualClicked = true;
                op = 0;
                break;

        }

    }
    static int reg = 0;
    public boolean onTouchEvent(MotionEvent event) {
        String myStringBack1 = textView.getText().toString();
        if(myStringBack1.length() > 0) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            int lastX = 0, lastY = 0;


            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    lastX = x;
                    lastY = y;
                    break;
                case MotionEvent.ACTION_MOVE:
                    if (((x - lastX) > 800) && (reg == 0)) {
                        String myStringBack = textView.getText().toString();
                        myStringBack = myStringBack.substring(0, myStringBack.length() - 1);
                        textView.setText(myStringBack);
                        reg = 1;
                        break;
                    }
                    break;
                case MotionEvent.ACTION_UP:
                    reg = 0;

                default:
                    break;
            }
            return true;
        } else
        return true;
    }
}
