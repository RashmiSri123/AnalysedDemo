package com.example.sumit.analyseddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.buttonDashboard)
    Button buttonDashboard;
    @BindView(R.id.buttonProfile)
    Button buttonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.buttonDashboard, R.id.buttonProfile})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.buttonDashboard:
                startActivity(new Intent(this,DashBoardActivity.class));

                break;
            case R.id.buttonProfile:
                startActivity(new Intent(this,ProfileActivity.class));

                break;
        }
    }
}
