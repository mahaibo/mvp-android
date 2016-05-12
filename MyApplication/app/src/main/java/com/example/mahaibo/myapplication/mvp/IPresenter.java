package com.example.mahaibo.myapplication.mvp;

import android.content.Context;

/**
 * Created by mahaibo on 16/5/7.
 */
public interface IPresenter {
    void attach(Context context);
    void detach();
}
