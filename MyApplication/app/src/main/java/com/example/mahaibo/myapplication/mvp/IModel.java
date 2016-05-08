package com.example.mahaibo.myapplication.mvp;


/**
 * Created by mahaibo on 16/5/7.
 */
public abstract class IModel implements Callback{
   public void login(){
       onSuccess();
   }

    @Override
    public void onSuccess() {

    }
}
