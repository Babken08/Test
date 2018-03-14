package com.example.android.avand;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmPhoneNumber extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corfirm_phone_number);


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
        TextView tvIconSendAgein = (TextView) findViewById(R.id.ttv_send_agein);
        tvToolBar.setText(R.string.confirm_phone_number);
        Button btnConfirm  = (Button) findViewById(R.id.btn_confirm);

        Typeface font = Typeface.createFromAsset(getAssets(), "font/fa-solid-900.ttf");

        tvIconNeedHelp.setTypeface(font);
        tvIconLocalisation.setTypeface(font);
        tvIconBack.setTypeface(font);
        tvIconSendAgein.setTypeface(font);

        tvIconSendAgein.setText("\uf2f9");
        tvIconNeedHelp.setText("\uf02d");
        tvIconLocalisation.setText("\uf0ac");
        tvIconBack.setText("\uF137");

        btnConfirm.setOnClickListener(this);
        tvIconBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_confirm: {

                break;
            }
            case R.id.tv_icon_back: {
                onBackPressed();
                break;
            }
        }
    }
}
