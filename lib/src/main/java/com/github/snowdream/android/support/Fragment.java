package com.github.snowdream.android.support;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by hui.yang on 2015/2/7.
 */
public class Fragment extends android.support.v4.app.Fragment {

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * @return the context from the activity
     */
    final public Context getApplicationContext() {
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
    final public Context getContext() {
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
    final public void finishFragment() {
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
    final public void finishFragmentByStep(int step) {
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