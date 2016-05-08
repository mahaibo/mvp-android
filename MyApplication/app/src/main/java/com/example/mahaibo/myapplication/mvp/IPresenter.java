package com.example.mahaibo.myapplication.mvp;

/**
 * Created by mahaibo on 16/5/7.
 */
public interface IPresenter {
    void attach(IView view);
    void detach();
}
