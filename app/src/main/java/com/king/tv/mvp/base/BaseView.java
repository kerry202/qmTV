package com.king.tv.mvp.base;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * @author yangbo
 * @since 2017/9/29
 * @mail 903023560@qq.com
 */

public interface BaseView extends MvpView{


    void showProgress();

    void onCompleted();

    void onError(Throwable e);
}
