package com.github.snowdream.android.support;

import android.content.Context;

/**
 * Created by hui.yang on 2015/2/7.
 */
public class FragmentActivity extends android.support.v4.app.FragmentActivity {
    /**
     * @return the context from the activity
     */
    final public Context getContext() {
        return getBaseContext();
    }

    /**
     * The same as finish.
     *
     * @see android.support.v4.app.FragmentActivity#finish
     */
    public void finishActivity() {
        finish();
    }

}
