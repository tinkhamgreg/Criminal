package com.example.gtink.criminal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by gtink on 3/3/2016.
 */

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
