package com.example.androidcase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toTextViewCase(View view) {
        Intent intent = new Intent(this, TextViewCaseActivity.class);
        startActivity(intent);
    }

    public void toButtonCase(View view) {
        Intent intent = new Intent(this, ButtonViewCase.class);
        startActivity(intent);
    }
    public void toEditViewCase(View view) {
        Intent intent = new Intent(this, EditViewCase.class);
        startActivity(intent);
    }
    public void toImageCase(View view) {
        Intent intent = new Intent(this, ImageCase.class);
        startActivity(intent);
    }
}
