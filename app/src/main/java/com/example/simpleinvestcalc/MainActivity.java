package com.example.simpleinvestcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        EditText field1 = (EditText) findViewById(R.id.et_sum_field);
        EditText field2 = (EditText) findViewById(R.id.et_month_field);
        EditText field3 = (EditText) findViewById(R.id.et_percentage_field);
        TextView tw1 = (TextView) findViewById(R.id.tv_result);

        double sum = Double.parseDouble(field1.getText().toString());//сума інвестицій
        double month = Double.parseDouble(field2.getText().toString());//період
        double percentage = Double.parseDouble(field3.getText().toString());//відсоток
        double count;
        double investSum = sum * month;
        double percentageBy100 = (month/12)/100;
        double percentageInMonth = percentageBy100*sum;
        double percentageSum = 0;


        for (count = percentageInMonth ; count<month; count++){

            percentageSum += percentageInMonth++;

        }
        double totalResult = investSum + percentageSum;
        tw1.setText(Double.toString(totalResult));



    }
}