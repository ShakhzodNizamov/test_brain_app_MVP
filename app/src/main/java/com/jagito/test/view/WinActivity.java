package com.jagito.test.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.jagito.test.R;

public class WinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        loadViews();
    }
    private void loadViews(){
        setTitle("FINISH");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            ((TextView)findViewById(R.id.tvw_wrong)).setText(bundle.getString("WRONG"));
            ((TextView)findViewById(R.id.tvw_correct)).setText(bundle.getString("CORRECT"));
        }
        findViewById(R.id.restart).setOnClickListener(v->{
            setResult(1);
            finish();
        });
        findViewById(R.id.menu).setOnClickListener(v->{
            setResult(2);
            finish();
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            setResult(1);
            finish();
        }
        return true;
    }

    @Override
    public void onBackPressed() {

    }
}
