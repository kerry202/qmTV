package com.king.tv.mvp.fragment;

import com.king.tv.mvp.base.BaseFragment;
import com.king.tv.mvp.base.BasePresenter;
import com.king.tv.mvp.base.BaseView;

/**
 * @author yangbo
 * @since 2017/9/29
 * @mail 903023560@qq.com
 */

public abstract class SimpleFragment extends BaseFragment<BaseView,BasePresenter<BaseView>> {

    @Override
    public BasePresenter<BaseView> createPresenter() {
        return new BasePresenter<>(getApp());
    }
}
