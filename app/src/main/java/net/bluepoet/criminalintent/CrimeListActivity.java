package net.bluepoet.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by bluepoet on 2017. 1. 9..
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
