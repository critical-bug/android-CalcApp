package jp.techacademy.critical_bug.calcapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1", 0.0);
        double value2 = intent.getDoubleExtra("VALUE2", 0.0);
        String op = intent.getStringExtra("OP");

        TextView textView = (TextView) findViewById(R.id.textView);
        double result = 0;
        switch (op) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                result = value1 / value2;
                break;
        }
        textView.setText(String.valueOf(result));
    }
}
