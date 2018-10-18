package com.example.mohamed.mvptestproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity implements ViewInterface {

    PresenterInterface pref;
    @BindView(R.id.textview)
    EditText editText;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        pref=new PresenterImp(this);
        pref.excuteRetrofit();
    }
    @OnClick(R.id.button1)
    public void onClick(View view){
        editText.setText(data);



    }


    @Override
    public void showData(String name) {
        data = name;

    }
}
