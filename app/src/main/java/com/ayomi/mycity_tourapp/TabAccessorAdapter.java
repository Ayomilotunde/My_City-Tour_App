package com.ayomi.mycity_tourapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAccessorAdapter extends FragmentPagerAdapter {
    public TabAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SchoolsFragment schoolsFragment = new SchoolsFragment();
                return schoolsFragment;

            case 1:
                HotelsFragment hotelsFragment = new HotelsFragment();
                return hotelsFragment;

            case 2:
                EventsFragment eventsFragment = new EventsFragment();
                return eventsFragment;

            case 3:
//                RequestFragment requestFragment = new RequestFragment();
//                return requestFragment;

            default:

                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Schools";

            case 1:
                return "Hotels";

            case 2:
                return "Events";

           /* case 3:
                return "Requests";*/

            default:

                return null;
        }
    }
}
