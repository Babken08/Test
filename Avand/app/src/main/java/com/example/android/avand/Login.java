package com.example.android.avand;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
        TextView tvIconPassword = (TextView) findViewById(R.id.tv_icon_password);
        TextView tvForgetPassword = (TextView) findViewById(R.id.tv_forget_password);
        TextView tvIconNeedHelp = (TextView) findViewById(R.id.tv_icon_need_help);
        TextView tvIconLocalisation = (TextView) findViewById(R.id.tv_icon_localisation);
        TextView tvToolBar = (TextView) findViewById(R.id.tv_tool_bar);
        TextView tvIconBack = (TextView) findViewById(R.id.tv_icon_back);
        tvToolBar.setText(R.string.login);
        Button btnLogin  = (Button) findViewById(R.id.btn_login);

        Typeface font = Typeface.createFromAsset(getAssets(), "font/fa-solid-900.ttf");

        tvIconNeedHelp.setTypeface(font);
        tvIconLocalisation.setTypeface(font);
        tvIconBack.setTypeface(font);
        tvIconPassword.setTypeface(font);

        tvIconNeedHelp.setTypeface(font);
        tvIconLocalisation.setTypeface(font);
        tvIconBack.setTypeface(font);

        tvIconNeedHelp.setText("\uf02d");
        tvIconLocalisation.setText("\uf0ac");
        tvIconBack.setText("\uF137");
        tvIconPassword.setText("\uf023");

        btnLogin.setOnClickListener(this);
        tvForgetPassword.setOnClickListener(this);
        tvIconBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:{
                break;
            }
            case R.id.tv_forget_password: {
                Intent i = new Intent(Login.this, Forget.class);
                startActivity(i);
                break;
            }
            case R.id.tv_icon_back: {
                onBackPressed();
                break;
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
