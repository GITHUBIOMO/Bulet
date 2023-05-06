package com.example.bulet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private String nameSrt;
    private String moSrt;
    private String mpSrt;
    private String voSrt;
    private String vpSrt;
    private String sbSrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView3);

        Bundle bundle = getIntent().getExtras();

        nameSrt = bundle.getString("name");
        moSrt = bundle.getString("mo");
        mpSrt = bundle.getString("mp");
        voSrt = bundle.getString("vo");
        vpSrt = bundle.getString("vp");
        sbSrt = bundle.getString("sb");

        textView.setText("ФИО: " + nameSrt + "\n" +
                "Место отправления: " + moSrt + "\n" +
                "Место прибытия: " + mpSrt + "\n" +
                "Время отправления: " + voSrt + "\n" +
                "Время прибытия: " + vpSrt + "\n" +
                "Стоимость билета: " + sbSrt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}