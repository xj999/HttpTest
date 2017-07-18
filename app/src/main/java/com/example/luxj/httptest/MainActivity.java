package com.example.luxj.httptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.Callback;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    @Bind(R.id.account)
    EditText account;
    @Bind(R.id.pwd)
    EditText pwd;
    @Bind(R.id.login)
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.login)
    public void onViewClicked() {
        OkGo.<TestResponse<String>>post("http://192.168.0.136/sdt.api.com/login")//
                .tag(this)//
                .params("account", account.getText().toString())//
                .params("pwd", pwd.getText().toString())//
                .execute(new Callback<TestResponse<String>>() {
                    @Override
                    public void onStart(Request<TestResponse<String>, ? extends Request> request) {

                    }

                    @Override
                    public void onSuccess(Response<TestResponse<String>> response) {
                        Log.e(TAG, "onSuccess: " + response);
                    }

                    @Override
                    public void onCacheSuccess(Response<TestResponse<String>> response) {

                    }

                    @Override
                    public void onError(Response<TestResponse<String>> response) {
                        Log.e(TAG, "onError: " + response);
                    }

                    @Override
                    public void onFinish() {

                    }

                    @Override
                    public void uploadProgress(Progress progress) {

                    }

                    @Override
                    public void downloadProgress(Progress progress) {

                    }

                    @Override
                    public TestResponse<String> convertResponse(okhttp3.Response response) throws Throwable {
                        return null;
                    }
                });


    }
}
