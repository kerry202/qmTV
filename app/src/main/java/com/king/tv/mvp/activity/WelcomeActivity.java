package com.king.tv.mvp.activity;

import android.view.animation.Animation;

import com.king.base.SplashActivity;
import com.king.tv.MainActivity;
import com.king.tv.R;

/**
 * @author yangbo
 * @since 2017/9/29
 * @mail 903023560@qq.com
 */

public class WelcomeActivity extends SplashActivity {
    @Override
    public int getContentViewId() {
        return R.layout.activity_welcome;
    }

    @Override
    public Animation.AnimationListener getAnimationListener() {
        return new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivityFinish(MainActivity.class);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        };
    }
}
