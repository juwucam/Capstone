package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnGCorrect, btnGLearn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGCorrect = findViewById(R.id.btnGCorrection);
        btnGLearn = findViewById(R.id.btnGLearn);

        btnGCorrect.setOnClickListener(this);
        btnGLearn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnGCorrection:
                Intent intent = new Intent(MainActivity.this, GCorrect.class);
                startActivity(intent);
                break;

            case R.id.btnGLearn:
                Intent intent1 = new Intent(MainActivity.this, GLearn.class);
                startActivity(intent1);
        }

    }
}