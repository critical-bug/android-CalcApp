package jp.techacademy.critical_bug.calcapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonAdd).setOnClickListener(this);
        findViewById(R.id.buttonSub).setOnClickListener(this);
        findViewById(R.id.buttonMul).setOnClickListener(this);
        findViewById(R.id.buttonDiv).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("VALUE1", Double.parseDouble(((EditText)findViewById(R.id.editText)).getText().toString()));
        intent.putExtra("VALUE2", Double.parseDouble(((EditText)findViewById(R.id.editText2)).getText().toString()));
        intent.putExtra("OP", ((Button)v).getText().toString());
        startActivity(intent);
    }

}
