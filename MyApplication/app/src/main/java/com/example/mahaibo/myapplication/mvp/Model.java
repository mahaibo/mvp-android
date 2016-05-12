package com.example.mahaibo.myapplication.mvp;

/**
 * Created by mahaibo on 16/5/12.
 */
public abstract class Model<T>{
    T mCallback;

    public void setCallback(T callback){
        this.mCallback=callback;
    }
}
