package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edTxt_num1 = findViewById(R.id.edTxt_num1);
        final EditText edTxt_num2 = findViewById(R.id.edTxt_num2);
        final EditText edTxt_result = findViewById(R.id.edTxt_result);

        Button btn_add = findViewById(R.id.btn_add);
        Button btn_sub = findViewById(R.id.btn_sub);
        Button btn_multi = findViewById(R.id.btn_multi);
        Button btn_div = findViewById(R.id.btn_div);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str_num1 = edTxt_num1.getText().toString();
                String str_num2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(str_num1);
                double num2 = Double.valueOf(str_num2);

                double result = num1 + num2;

                String str_result = String.valueOf(result);

                edTxt_result.setText(str_result);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str_num1 = edTxt_num1.getText().toString();
                String str_num2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(str_num1);
                double num2 = Double.valueOf(str_num2);

                double result = num1 - num2;

                String str_result = String.valueOf(result);

                edTxt_result.setText(str_result);
            }
        });


        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str_num1 = edTxt_num1.getText().toString();
                String str_num2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(str_num1);
                double num2 = Double.valueOf(str_num2);

                double result = num1 * num2;

                String str_result = String.valueOf(result);

                edTxt_result.setText(str_result);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str_num1 = edTxt_num1.getText().toString();
                String str_num2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(str_num1);
                double num2 = Double.valueOf(str_num2);

                double result = num1 / num2;

                String str_result = String.valueOf(result);

                edTxt_result.setText(str_result);
            }
        });

    }
}

// end