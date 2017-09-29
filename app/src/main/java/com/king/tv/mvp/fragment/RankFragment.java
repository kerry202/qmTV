package com.king.tv.mvp.fragment;

import android.os.Bundle;

import com.king.tv.R;

/**
 * @author yangbo
 * @since 2017/9/29
 * @mail 903023560@qq.com
 */

public class RankFragment extends SimpleFragment {

    public static RankFragment newInstance() {

        Bundle args = new Bundle();

        RankFragment fragment = new RankFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_rank;
    }

    @Override
    public void initUI() {

    }

    @Override
    public void initData() {

    }
}
