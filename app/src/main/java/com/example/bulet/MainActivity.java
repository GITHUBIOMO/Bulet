package com.example.bulet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText nameEdText;
    private EditText moEdText;
    private EditText mpEdText;
    private EditText voEdText;
    private EditText vpEdText;
    private EditText sbEdText;

    private String nameSrt;
    private String moSrt;
    private String mpSrt;
    private String voSrt;
    private String vpSrt;
    private String sbSrt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        nameEdText = findViewById(R.id.name);
        moEdText = findViewById(R.id.mo);
        mpEdText = findViewById(R.id.mp);
        voEdText = findViewById(R.id.vo);
        vpEdText = findViewById(R.id.vp);
        sbEdText   = findViewById(R.id.sb);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameSrt = nameEdText.getText().toString();
                moSrt = moEdText.getText().toString();
                mpSrt = mpEdText.getText().toString();
                voSrt = voEdText.getText().toString();
                vpSrt = vpEdText.getText().toString();
                sbSrt = sbEdText.getText().toString();


                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                intent.putExtra("name", nameSrt);
                intent.putExtra("name", moSrt);
                intent.putExtra("name", mpSrt);
                intent.putExtra("name", voSrt);
                intent.putExtra("name", vpSrt);
                intent.putExtra("name", sbSrt);

                startActivity(intent);
            }
        });
    }
}