package com.jagito.test.presenter;

import android.view.View;

import com.jagito.test.contracts.TestContract;
import com.jagito.test.model.QuestionData;
import com.jagito.test.model.TestRepository;

public class TestPresenter implements TestContract.Presenter {
    private TestContract.Model model;
    private TestContract.View view;

    public TestPresenter(TestContract.Model model, TestContract.View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void itemClick(View view) {
        this.view.changeButtons(view);
    }

    @Override
    public void setCurrentCategory(TestRepository.CATEGORIES category) {
        model.setCurrentCategory(category);
        view.loadDataToView(model.getCurrentQuestionData(), model.getQuestionCount());
    }

    @Override
    public void nextClicked(int position) {
        if (position == -1) {
            return;
        }
        QuestionData data = model.getCurrentQuestionData();
        String temp = "";
        switch (position) {
            case 0:
                temp = data.getVariant1();
                break;
            case 1:
                temp = data.getVariant2();
                break;
            case 2:
                temp = data.getVariant3();
                break;
            case 3:
                temp = data.getVariant4();
                break;
        }

        if (temp.equals(data.getAnswer())) {
            model.setRightCount(model.getRightCount() + 1);
            model.setQuestionCount(model.getQuestionCount() + 1);
        } else {
            model.setWrongCount(model.getWrongCount() + 1);
            model.setQuestionCount(model.getQuestionCount() + 1);
        }

        if (model.getQuestionCount() == 10) {
            view.showResult(model.getRightCount(), model.getWrongCount());
            return;
        }
        view.loadDataToView(model.getCurrentQuestionData(), model.getQuestionCount());
    }

    @Override
    public void finishClicked(int position) {
        if (position != -1) {
            QuestionData data = model.getCurrentQuestionData();
            String temp = "";
            switch (position) {
                case 0:
                    temp = data.getVariant1();
                    break;
                case 1:
                    temp = data.getVariant2();
                    break;
                case 2:
                    temp = data.getVariant3();
                    break;
                case 3:
                    temp = data.getVariant4();
                    break;
            }

            if (temp.equals(data.getAnswer())) {
                model.setRightCount(model.getRightCount() + 1);
                model.setQuestionCount(model.getQuestionCount() + 1);
            } else {
                model.setWrongCount(model.getWrongCount() + 1);
                model.setQuestionCount(model.getQuestionCount() + 1);
            }
        }
        view.showResult(model.getRightCount(), model.getWrongCount());
    }
}
