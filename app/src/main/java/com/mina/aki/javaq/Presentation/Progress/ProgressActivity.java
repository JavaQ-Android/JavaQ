package com.mina.aki.javaq.Presentation.Progress;


import android.support.v4.app.Fragment;

import com.mina.aki.javaq.Presentation.DrawermenuSingleFragmentActivity;

public class ProgressActivity extends DrawermenuSingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ProgressFragment();
    }
}
