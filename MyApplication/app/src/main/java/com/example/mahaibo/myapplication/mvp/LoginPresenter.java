package com.example.mahaibo.myapplication.mvp;

import android.content.Context;

/**
 * Created by mahaibo on 16/5/12.
 */
public class LoginPresenter extends PresenterImpl<LoginView,LoginModel> implements Callback{

    @Override
    public void attach(Context context) {
        super.attach(context);
        mModel.setCallback(this);
    }

    @Override
    protected Class<LoginModel> getModel() {
        return LoginModel.class;
    }

    @Override
    public void onSuccess() {
        mView.onLoginSuccess();
    }

    public void login(){
        mModel.login();
    }
}
