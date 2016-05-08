package com.example.mahaibo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mahaibo.myapplication.mvp.LoginView;
import com.example.mahaibo.myapplication.mvp.Presenter;

public class MainActivity extends AppCompatActivity implements LoginView,View.OnClickListener{
    TextView mTextView;
    Presenter mPresenter;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter=new Presenter();
        mPresenter.attach(this);
        btnLogin=(Button)findViewById(R.id.login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onLoginSuccess() {
        mTextView=(TextView) findViewById(R.id.textView);
        mTextView.setText("login success");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                mPresenter.login();

                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }
}
