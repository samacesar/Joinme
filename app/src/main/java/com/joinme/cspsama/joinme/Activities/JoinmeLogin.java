package com.joinme.cspsama.joinme.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.joinme.cspsama.joinme.R;

public class JoinmeLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joinme_login);
    }

    /** Called when the user taps the Send button */
    public void login(View view) {
        Intent intent = new Intent(this,JoinmeMain.class);
        startActivity(intent);
        finish();
    }

}
