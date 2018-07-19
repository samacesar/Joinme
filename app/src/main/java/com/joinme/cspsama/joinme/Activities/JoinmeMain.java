package com.joinme.cspsama.joinme.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.joinme.cspsama.joinme.Fragments.*;
import com.joinme.cspsama.joinme.Helpers.BottomNavigationViewHelper;
import com.joinme.cspsama.joinme.R;

public class JoinmeMain extends AppCompatActivity {


    private TextView mTextMessage;
    public Fragment fragmentHome = new JoinmeMainHomeFragment();
    public Fragment fragmentExplore = new JoinmeMainExploreFragment();
    public Fragment fragmentNewJoin = new JoinmeMainNewJoinFragment();
    public Fragment fragmentNotification = new JoinmeMainNotificationFragment();
    public Fragment fragmentProfile = new JoinmeMainProfileFragment();


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {
                case R.id.joinme_home:
                    mTextMessage.setText(R.string.title_home);
                    fr.replace(R.id.container, fragmentHome);
                    fr.addToBackStack(null);
                    fr.commit();
                    break;
                    case R.id.joinme_explore:
                    mTextMessage.setText(R.string.title_explore);
                    fr.replace(R.id.container, fragmentExplore);
                    fr.addToBackStack(null);
                        fr.commit();
                    break;
                    case R.id.joinme_new:
                    mTextMessage.setText(R.string.title_new);
                    fr.replace(R.id.container, fragmentNewJoin);
                    fr.addToBackStack(null);
                        fr.commit();
                     break;
                     case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    fr.replace(R.id.container, fragmentNotification);
                    fr.addToBackStack(null);
                         fr.commit();
                    break;
                    case R.id.joinme_perfil:
                    mTextMessage.setText(R.string.title_perfil);
                    fr.replace(R.id.container, fragmentProfile);
                    fr.addToBackStack(null);
                        fr.commit();
                    break;
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joinme_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.container, fragmentHome);
        fr.commit();
    }

}
