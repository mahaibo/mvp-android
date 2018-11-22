package com.example.mahaibo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.example.mahaibo.myapplication.mvp.LoginPresenter;
import com.example.mahaibo.myapplication.mvp.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView,View.OnClickListener{
    TextView mTextView;
    LoginPresenter mPresenter;
    Button btnLogin;
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter=new LoginPresenter();
        mPresenter.attach(this);
        mPresenter.bindView(this);
        btnLogin=(Button)findViewById(R.id.login);
        btnLogin.setOnClickListener(this);

        mWebView = (WebView) findViewById(R.id.web_view);
        mWebView.loadUrl("file:///android_asset/video.html");


        WebSettings s = mWebView.getSettings();

        s.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);

        s.setUseWideViewPort(true);

        s.setLoadWithOverviewMode(true);

        s.setJavaScriptEnabled(true);

        s.setGeolocationEnabled(true);

        s.setDomStorageEnabled(true);

        mWebView.requestFocus();

        mWebView.setScrollBarStyle(0);
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
