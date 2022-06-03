package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GCorrect extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcorrect);

        btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHome:
                Intent intent3 = new Intent(GCorrect.this, MainActivity.class);
                startActivity(intent3);
                break;
        }
    }
}