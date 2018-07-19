package com.joinme.cspsama.joinme.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joinme.cspsama.joinme.R;

public class JoinmeMainNotificationFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View notiViews = inflater.inflate(R.layout.activity_joinme_main_notifications,container,false);
        return notiViews;
    }
}
