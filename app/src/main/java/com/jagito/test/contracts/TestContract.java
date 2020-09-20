package com.jagito.test.contracts;

import com.jagito.test.model.QuestionData;
import com.jagito.test.model.TestRepository;

import java.util.ArrayList;

public interface TestContract {
    interface Model {
        QuestionData getQuestionData(TestRepository.CATEGORIES category, int i);

        TestRepository.CATEGORIES getCurrentCategory();

        void setCurrentCategory(TestRepository.CATEGORIES currentCategory);

        int getQuestionCount();

        QuestionData getCurrentQuestionData();

        void setQuestionCount(int questionCount);

        int getWrongCount();

        void setWrongCount(int wrongCount);

        int getRightCount();

        void setRightCount(int rightCount);
    }

    interface View {
        void changeButtons(android.view.View view);
        void loadDataToView(QuestionData data, int currentCount);
        void showResult(int correct, int wrong);
        void restart();
    }

    interface Presenter {
        void itemClick(android.view.View view);
        void setCurrentCategory(TestRepository.CATEGORIES category);
        void nextClicked(int position);
        void finishClicked(int position);
    }
}
