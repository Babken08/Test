package com.example.android.avand;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FillInfo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_info);

        Toolbar toolbar= (Toolbar) findViewById(R.id.tool_bar);
//        toolbar.setPadding(0, getStatusBarHeight(), 0, 0);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        initWidget();


    }

    private void initWidget() {
        Button btnFaceBook = (Button) findViewById(R.id.btn_facebook);
        Button btnManually = (Button) findViewById(R.id.btn_manually);
        TextView tvFaceBook = (TextView) findViewById(R.id.tv_facebook);
        TextView tvIconNedHelp = (TextView) findViewById(R.id.tv_icon_need_help);
        TextView tvIconLanguage = (TextView) findViewById(R.id.tv_icon_localisation);
        TextView tvToolBar = (TextView) findViewById(R.id.tv_tool_bar);
        TextView tvIconBack = (TextView) findViewById(R.id.tv_icon_back);
        tvToolBar.setText("FILL PERSONAL INFO");

        Typeface font = Typeface.createFromAsset(getAssets(), "font/fa-solid-900.ttf");
        Typeface font1 = Typeface.createFromAsset(getAssets(), "font/fa-brands-400.ttf");
        tvFaceBook.setTypeface(font1);
        tvIconNedHelp.setTypeface(font);
        tvIconLanguage.setTypeface(font);
        tvIconBack.setTypeface(font);

        tvFaceBook.setText("\uf39e");
        tvIconNedHelp.setText("\uf02d");
        tvIconLanguage.setText("\uf0ac");



        btnFaceBook.setOnClickListener(this);
        btnManually.setOnClickListener(this);
        tvIconBack.setText("\uF137");
        tvIconBack.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_facebook: {
                Toast.makeText(this, "aaaaaaaaaaaaa", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.btn_manually: {
                startActivity(new Intent(FillInfo.this, Login.class));
                break;
            }
            case R.id.tv_icon_back: {
                onBackPressed();
                break;
            }
        }
    }
}
