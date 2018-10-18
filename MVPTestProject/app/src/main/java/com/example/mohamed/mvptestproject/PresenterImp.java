package com.example.mohamed.mvptestproject;


import com.example.mohamed.mvptestproject.RetrofitConfig.Api;
import com.example.mohamed.mvptestproject.RetrofitConfig.ApiInterface;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.Subscriber;


public class PresenterImp implements PresenterInterface {
ApiInterface apiInterface;
ViewInterface viewInterface;

public PresenterImp( ViewInterface viewInterface){
    this.viewInterface = viewInterface;
    }
    @Override
    public void excuteRetrofit() {
        viewInterface.showData("heyyyyy");
//        apiInterface = Api.getClient().create(ApiInterface.class);
//        apiInterface.showData()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<String>() {
//                    @Override
//                    public void onCompleted() {
//
//                        viewInterface.showData("heyyy");
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(String s) {
//
//                    }
//                });

    }
}
