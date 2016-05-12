package com.example.mahaibo.myapplication.mvp;


/**
 * Created by mahaibo on 16/5/7.
 */
public class LoginModel extends Model<Callback> {
    public void login(){
        mCallback.onSuccess();
    }

}
