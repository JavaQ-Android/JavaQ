package com.mina.aki.javaq.Presentation.Quiz;

import android.support.v4.app.Fragment;

import com.mina.aki.javaq.Presentation.SingleFragmentActivity;

public class QuizActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new QuizFragment();
    }
}
