package com.bignerdranch.android.criminalintent;

import android.app.Fragment;

/**
 * Created by Dennis on 4/19/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
