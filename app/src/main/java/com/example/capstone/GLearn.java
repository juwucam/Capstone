package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GLearn extends AppCompatActivity implements View.OnClickListener{
    ImageButton btnHome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glearn);

        btnHome2 = findViewById(R.id.btnHome2);
        btnHome2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHome2:
                Intent intent4 = new Intent(GLearn.this, MainActivity.class);
                startActivity(intent4);
                break;

        }

    }
}