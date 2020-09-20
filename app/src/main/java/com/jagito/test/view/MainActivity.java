package com.jagito.test.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jagito.test.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start).setOnClickListener(v -> startActivity(new Intent(this, CategoryActivity.class)));
        findViewById(R.id.about).setOnClickListener(v-> startActivity(new Intent(this, AboutActivity.class)));
        findViewById(R.id.exit).setOnClickListener(c->finishAffinity());
    }
}
