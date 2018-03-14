package com.example.android.avand;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginOrSignup extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG  = "ssssssssssssssss";


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_signup);

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
        TextView tvToolBar = (TextView) findViewById(R.id.tv_tool_bar);
        TextView tvIconBack = (TextView) findViewById(R.id.tv_icon_back);
        tvToolBar.setText(R.string.welcome);
        Button btnLogin = (Button) findViewById(R.id.btn_login);
        Button btnSignUp = (Button) findViewById(R.id.btn_sign_up);

        btnLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
        tvIconBack.setOnClickListener(this);

        Typeface font = Typeface.createFromAsset(getAssets(), "font/fa-solid-900.ttf");

        tvIconNeedHelp.setTypeface(font);
        tvIconLocalisation.setTypeface(font);
        tvIconBack.setTypeface(font);

        tvIconNeedHelp.setText("\uf02d");
        tvIconLocalisation.setText("\uf0ac");
        tvIconBack.setText("\uF137");
    }

//    private int getStatusBarHeight() {
//        int height;
//
//        Resources myResources = getResources();
//        int idStatusBarHeight = myResources.getIdentifier(
//                "status_bar_height", "dimen", "android");
//        if (idStatusBarHeight > 0) {
//            height = getResources().getDimensionPixelSize(idStatusBarHeight);
//            Log.i(TAG, "Status Bar Height = " + height);
//        }else{
//            height = 0;
//            Log.i(TAG, "Resources NOT found");
//        }
//
//        return height;
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login: {
                startActivity(new Intent(LoginOrSignup.this, FillInfo.class));
                break;
            }
            case R.id.btn_sign_up: {
                startActivity(new Intent(LoginOrSignup.this, SignUp.class));
                break;
            }
            case R.id.tv_icon_back: {
                onBackPressed();
                break;
            }
        }
    }


}
