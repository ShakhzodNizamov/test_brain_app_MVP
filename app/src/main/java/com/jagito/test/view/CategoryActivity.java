package com.jagito.test.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.jagito.test.R;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        loadView();
    }

    private void loadView() {
        setTitle("КАТЕГОРИИ");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ViewGroup groupLeft = findViewById(R.id.left);
        ViewGroup groupRight = findViewById(R.id.right);
        for (int i = 0; i < groupLeft.getChildCount(); i++) {
            if (groupLeft.getChildAt(i) instanceof FrameLayout &&
                    groupRight.getChildAt(i) instanceof FrameLayout) {
                FrameLayout frameLayoutRight = (FrameLayout) groupRight.getChildAt(i);
                FrameLayout frameLayoutLeft = (FrameLayout) groupLeft.getChildAt(i);
                frameLayoutLeft.setOnClickListener(this::onClick);
                frameLayoutRight.setOnClickListener(this::onClick);
            }
        }
    }

    private void onClick(View v) {
        Intent intent = new Intent(this, TestingActivity.class);
        intent.putExtra("SELECTED", String.valueOf(v.getTag()).toUpperCase());
        Toast.makeText(this,String.valueOf(v.getTag()).toUpperCase(),Toast.LENGTH_LONG).show();
        startActivityForResult(intent, 1);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==1){
            finish();
        }
    }
}
