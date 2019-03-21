package edu.quinnipiac.ser210.ls12_tabs;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int numTabs;
    Context context;
    public TabsAdapter(FragmentManager fm, int numTabs, Context context) {
        super(fm);
        this.numTabs = numTabs;
        this.context = context;
    }
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
