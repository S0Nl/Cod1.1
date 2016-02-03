package com.example.yorik.gotonextactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class NextActivity extends Activity implements View.OnClickListener{

    TextView textView2;
    EditText editText2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);

        textView2 = (TextView) findViewById(R.id.textView2);
        editText2 = (EditText) findViewById(R.id.editText2);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView2.setText(name);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("name", editText2.getText().toString());
        startActivity(intent);

        Toast toast = Toast.makeText(getApplicationContext(), "Вітаю на MainActivity ;)", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        finish();
    }
}

