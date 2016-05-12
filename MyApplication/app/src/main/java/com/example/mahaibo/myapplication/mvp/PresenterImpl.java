package com.example.mahaibo.myapplication.mvp;

import android.content.Context;

/**
 * Created by mahaibo on 16/5/7.
 */
public abstract class PresenterImpl<V extends IView, M extends Model<?>> implements IPresenter {
    V mView;
    M mModel;
    private Context mContext;


    @Override
    public void attach(Context context) {
        mContext=context;
        if (getModel()!=null){
            try{
                mModel=getModel().newInstance();
            }catch (InstantiationException e){

            }catch (IllegalAccessException e){

            }

        }

    }

    @Override
    public void detach() {
        mView=null;
        mModel=null;
    }

    protected abstract Class<M> getModel();
    public void bindView(V view){
        mView=view;
    }
}
