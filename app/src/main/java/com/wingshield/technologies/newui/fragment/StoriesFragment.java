package com.wingshield.technologies.newui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.wingshield.technologies.newui.R;


/**
 * Created by Arun Kumar on 14/8/20.
 * Copyright (c) 2020 wing shield technologies.com All rights reserved.
 */

public class StoriesFragment extends BaseFragment {

    private static final String TAG = StoriesFragment.class.getSimpleName();
    private Context context;
    private String image_url;


    public StoriesFragment(String image_url) {
        this.image_url = image_url;
    }

    public StoriesFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stories, container, false);
        context = getActivity();
        ImageView image_view = view.findViewById(R.id.image_view);

        Glide.with(context).load(image_url).into(image_view);


        return view;
    }




}
