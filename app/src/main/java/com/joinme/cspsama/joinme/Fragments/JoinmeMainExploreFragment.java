package com.joinme.cspsama.joinme.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joinme.cspsama.joinme.R;

public class JoinmeMainExploreFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View exploreView = inflater.inflate(R.layout.activity_joinme_main_explore,container,false);
        return exploreView;
    }
}
