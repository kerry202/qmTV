package com.king.tv.di.component;

import android.content.Context;

import com.king.tv.App;
import com.king.tv.http.APIService;
import com.king.tv.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * @author yangbo
 * @since 2017/9/29
 * @mail 903023560@qq.com
 */
@Singleton
@Component(modules= AppModule.class)
public interface AppComponent {

    void inject(App app);

    Context getContext();

    Retrofit getRetrofit();

    OkHttpClient getOkHttpClient();

    APIService getAPIService();

}
