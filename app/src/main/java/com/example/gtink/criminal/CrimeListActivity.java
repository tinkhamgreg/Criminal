package com.example.gtink.criminal;

import android.support.v4.app.Fragment;

/**
 * Created by gtink on 3/10/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}