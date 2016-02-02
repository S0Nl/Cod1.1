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


public class MainActivity extends Activity implements View.OnClickListener {

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, NextActivity.class);
        intent.putExtra("name", editText.getText().toString());
        startActivity(intent);

        Toast toast = Toast.makeText(getApplicationContext(), "Вітаю на NextActivity ;) ", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
}
