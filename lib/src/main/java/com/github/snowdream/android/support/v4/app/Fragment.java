package com.github.snowdream.android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import proguard.annotation.Keep;

import java.util.List;

/**
 * Created by hui.yang on 2015/2/7.
 */
@Keep
public class Fragment extends android.support.v4.app.Fragment {
    /**
     * @return the context from the application
     */
    public final Context getApplicationContext() {
        Activity activity = getActivity();

        if (activity == null) {
            throw new IllegalStateException("Fragment " + this
                    + " not attached to Activity");
        }

        return activity.getApplicationContext();
    }

    /**
     * @return the context from the activity
     */
    public final Context getContext() {
        Activity activity = getActivity();

        if (activity == null) {
            throw new IllegalStateException("Fragment " + this
                    + " not attached to Activity");
        }

        return activity.getBaseContext();
    }

    /**
     * The same as press the back key.
     *
     * @see android.support.v4.app.FragmentActivity#onBackPressed
     */
    public final void finishFragment() {
        Activity activity = getActivity();

        if (activity == null) {
            throw new IllegalStateException("Fragment " + this
                    + " not attached to Activity");
        }

        activity.onBackPressed();
    }

    /**
     * close several fragment by step
     *
     * @param step the number of the fragments which will be finished.
     *
     */
    public final void finishFragmentByStep(int step) {
        Activity activity = getActivity();

        if (activity == null) {
            throw new IllegalStateException("Fragment " + this
                    + " not attached to Activity");
        }

        List<android.support.v4.app.Fragment> list = getFragmentManager().getFragments();
        if ( list == null || list.size() < step) {
            throw new IllegalStateException("There is not enough Fragment to finish.");
        }

        for (int i = 0; i < step; i++) {
            activity.onBackPressed();
        }
    }

}