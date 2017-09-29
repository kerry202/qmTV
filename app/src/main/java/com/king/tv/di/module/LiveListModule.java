package com.king.tv.di.module;

import com.king.tv.App;
import com.king.tv.di.scope.FragmentScope;
import com.king.tv.mvp.presenter.LiveListPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * @author yangbo
 * @since 2017/9/29
 * @mail 903023560@qq.com
 */

@Module
public class LiveListModule {

    private App app;

    public LiveListModule(App app){
        this.app = app;
    }

    @FragmentScope
    @Provides
    public LiveListPresenter provideLiveListPresenter(){
        return new LiveListPresenter(app);
    }

}
