package com.jagito.test.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jagito.test.R;
import com.jagito.test.contracts.TestContract;
import com.jagito.test.model.QuestionData;
import com.jagito.test.model.TestRepository;
import com.jagito.test.presenter.TestPresenter;

import java.util.ArrayList;

public class TestingActivity extends AppCompatActivity implements TestContract.View {
    private int lastSelected = -1;
    private ArrayList<ViewGroup> groups = new ArrayList<>();
    private TestContract.Presenter presenter;
    private TextView textQuestion;
    private TextView textCurrentCount;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        TestRepository testRepository = new TestRepository();
        presenter = new TestPresenter(testRepository,this);

        loadViews();
        bundle = getIntent().getExtras();
        restart();
        Log.d("TTT", "1");
    }

    private void loadViews() {
        setTitle("ТЕСТЫ");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        textQuestion = findViewById(R.id.textQuestion);
        textCurrentCount = findViewById(R.id.tvw_current_count);

        groups.add(findViewById(R.id.item1));
        groups.add(findViewById(R.id.item2));
        groups.add(findViewById(R.id.item3));
        groups.add(findViewById(R.id.item4));

        for (int i = 0; i < groups.size(); i++) {
            ViewGroup group = groups.get(i);
            group.setTag(i);
            group.setOnClickListener(presenter::itemClick);
        }
        findViewById(R.id.buttonNext).setOnClickListener(v -> presenter.nextClicked(lastSelected));
        findViewById(R.id.buttonFinish).setOnClickListener(v -> presenter.finishClicked(lastSelected));
    }

    private void setItemImage(int position, @DrawableRes int resId) {
        Log.d("TTT", "------" + position);

        ViewGroup group = groups.get(position);

        ImageView imageView = (ImageView) group.getChildAt(0);
        imageView.setImageResource(resId);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

    @Override
    public void changeButtons(View view) {
        ViewGroup group = (ViewGroup) view;
        int pos = (int) group.getTag();
        if (lastSelected == pos) return;
        if (lastSelected != -1) {
            setItemImage(lastSelected, R.drawable.ic_radio_button_unchecked);
        }
        setItemImage(pos, R.drawable.ic_check_circle);
        lastSelected = pos;
    }

    @Override
    public void loadDataToView(QuestionData data, int currentCount) {
        ((TextView) groups.get(0).getChildAt(2)).setText(data.getVariant1());
        ((TextView) groups.get(1).getChildAt(2)).setText(data.getVariant2());
        ((TextView) groups.get(2).getChildAt(2)).setText(data.getVariant3());
        ((TextView) groups.get(3).getChildAt(2)).setText(data.getVariant4());
        textQuestion.setText(data.getQuestion());
        textCurrentCount.setText(String.valueOf(currentCount));
        lastSelected = -1;
        reloadImage();
    }

    private void reloadImage() {
        setItemImage(0, R.drawable.ic_radio_button_unchecked);
        setItemImage(1, R.drawable.ic_radio_button_unchecked);
        setItemImage(2, R.drawable.ic_radio_button_unchecked);
        setItemImage(3, R.drawable.ic_radio_button_unchecked);
    }

    @Override
    public void showResult(int correct, int wrong) {
        Intent intent = new Intent(this, WinActivity.class);

        intent.putExtra("CORRECT", String.valueOf(correct));
        intent.putExtra("WRONG", String.valueOf(wrong));
        startActivityForResult(intent, 1);
    }

    @Override
    public void restart() {
        Log.d("TTT", "2");

        presenter = new TestPresenter(new TestRepository(), this);
        if (bundle != null) {
            Log.d("TTT", bundle.getString("SELECTED"));

            presenter.setCurrentCategory(TestRepository.CATEGORIES.valueOf(bundle.getString("SELECTED")));
            setTitle(bundle.getString("SELECTED"));
        }

        reloadImage();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1) {
            restart();
        } else if (resultCode == 2) {
            setResult(1);
            finish();
        }
    }
}
