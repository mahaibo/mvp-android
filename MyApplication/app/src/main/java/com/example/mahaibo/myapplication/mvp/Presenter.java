package com.example.mahaibo.myapplication.mvp;

/**
 * Created by mahaibo on 16/5/7.
 */
public class Presenter implements IPresenter {
    IModel mModel;
    IView mView;


    @Override
    public void attach(IView view) {
        mModel=new LoginMdel();
        mView=view;
        ((LoginMdel)mModel).registerListener(this);
    }

    @Override
    public void detach() {
        mView=null;
        mModel=null;
    }

    public void login(){
        mModel.login();
    }

    public void onLoginSuccess(){
        ((LoginView)mView).onLoginSuccess();
    }
}
