package com.github.snowdream.android.support.v4.app;

import com.github.snowdream.android.core.Snowdream;

/**
 * Created by hui.yang on 2015/2/26.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Snowdream.init(getApplicationContext());
    }


}
