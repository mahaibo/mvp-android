package com.example.mahaibo.myapplication.mvp;

/**
 * Created by mahaibo on 16/5/7.
 */
public class LoginMdel extends IModel {
    Presenter mPresenter;

    public LoginMdel(){
        registerListener(mPresenter);
    }

    public void registerListener(Presenter presenter){
        mPresenter=presenter;
    }

    @Override
    public void onSuccess() {
        super.onSuccess();
        mPresenter.onLoginSuccess();
    }
}
