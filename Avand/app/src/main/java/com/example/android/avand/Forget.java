package com.example.android.avand;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Forget extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

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
        tvToolBar.setText(R.string.forget_password);
        Button btnLogin  = (Button) findViewById(R.id.btn_send);

        Typeface font = Typeface.createFromAsset(getAssets(), "font/fa-solid-900.ttf");

        tvIconNeedHelp.setTypeface(font);
        tvIconLocalisation.setTypeface(font);
        tvIconBack.setTypeface(font);

        tvIconNeedHelp.setTypeface(font);
        tvIconLocalisation.setTypeface(font);
        tvIconBack.setTypeface(font);

        tvIconNeedHelp.setText("\uf02d");
        tvIconLocalisation.setText("\uf0ac");
        tvIconBack.setText("\uF137");

        btnLogin.setOnClickListener(this);
        tvIconBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.tv_icon_back: {
                onBackPressed();
                break;
            }
        }

    }
}
