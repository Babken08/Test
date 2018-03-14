package com.example.android.avand;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ssssss";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        toolBarInit();
        initWidget();


    }

    private void toolBarInit() {
        Toolbar toolbar= (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initWidget() {

        TextView tvIconNeedHelp = (TextView) findViewById(R.id.tv_icon_need_help);
        TextView tvIconLocalisation = (TextView) findViewById(R.id.tv_icon_localisation);
        Button btnSignUp = (Button) findViewById(R.id.btn_signup);
        TextView tvPassword = (TextView) findViewById(R.id.tv_password);
        TextView tvToolBar = (TextView) findViewById(R.id.tv_tool_bar);
        TextView tvIconBack = (TextView) findViewById(R.id.tv_icon_back);
        tvToolBar.setText(R.string.signup);


        Typeface font = Typeface.createFromAsset(getAssets(), "font/fa-solid-900.ttf");

        tvPassword.setTypeface(font);
        tvIconBack.setTypeface(font);
        tvIconNeedHelp.setTypeface(font);
        tvIconLocalisation.setTypeface(font);
//
        tvPassword.setText("\uf023");
        tvIconBack.setText("\uF137");
        tvIconNeedHelp.setText("\uf02d");
        tvIconLocalisation.setText("\uf0ac");

        btnSignUp.setOnClickListener(this);
        tvIconBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_signup: {
                Intent i = new Intent(SignUp.this, ConfirmPhoneNumber.class);
                startActivity(i);
                break;
            }
            case R.id.tv_icon_back: {
                onBackPressed();
                break;
            }
        }
    }

 /*   private int getStatusBarHeight() {
        int height;
        Resources myResources = getResources();
        int idStatusBarHeight = myResources.getIdentifier(
                "status_bar_height", "dimen", "android");
        if (idStatusBarHeight > 0) {
            height = getResources().getDimensionPixelSize(idStatusBarHeight);
            Log.i(TAG, "Status Bar Height = " + height);
        }else{
            height = 0;
            Log.i(TAG, "Resources NOT found");
        }
        return height;
    }*/
}
