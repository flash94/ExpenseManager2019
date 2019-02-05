package com.hayroyal.assignment.expensemanager3.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import com.hayroyal.assignment.expensemanager3.R;
import com.hayroyal.assignment.expensemanager3.fragments.SettingsFragment;
import com.hayroyal.assignment.expensemanager3.fragments.SettingsFragment;

public class SettingsActivity extends BaseFragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        insertFragment(new SettingsFragment());

        setTitle(com.hayroyal.assignment.expensemanager3.R.string.nav_settings);

        setupActionBar();
    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar (toolbar).
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
