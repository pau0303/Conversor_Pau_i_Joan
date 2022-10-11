package com.example.conversor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Declarar widgets
    EditText editText;
    TextView textView, textView2, textView3, textView4, textView5, textView6,textView7, textView8, textView9;
    Button button5, button6, button7, button8;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        button5.setOnClickListener(v -> {
            String num = editText.getText().toString();
            int number = Integer.parseInt(num);
            float segons = (number);
            float minuts = (number / 60);
            float hores = (number / 3600);
            float anys = (number / 31536000);
            textView6.setText("" + segons);
            textView7.setText("" + minuts);
            textView8.setText("" + hores);
            textView9.setText("" + anys);

        });

        button6.setOnClickListener(view -> {
            String num = editText.getText().toString();
            int number = Integer.parseInt(num);
            float segons = (number * 60);
            float minuts = (number);
            float hores = (number / 60);
            float anys = (number / 525600);
            textView6.setText("" + segons);
            textView7.setText("" + minuts);
            textView8.setText("" + hores);
            textView9.setText("" + anys);
        });

        button7.setOnClickListener(view -> {
            String num = editText.getText().toString();
            int number = Integer.parseInt(num);
            float segons = (number * 3600);
            float minuts = (number * 60);
            float hores = (number );
            float anys = (number / 21900);
            textView6.setText("" + segons);
            textView7.setText("" + minuts);
            textView8.setText("" + hores);
            textView9.setText("" + anys);
        });

        button8.setOnClickListener(view -> {
            String num = editText.getText().toString();
            int number = Integer.parseInt(num);
            float segons = (number * 31536000);
            float minuts = (number * 525600);
            float hores = (number * 8760);
            float anys = (number);
            textView6.setText("" + segons);
            textView7.setText("" + minuts);
            textView8.setText("" + hores);
            textView9.setText("" + anys);
        });
    }
}