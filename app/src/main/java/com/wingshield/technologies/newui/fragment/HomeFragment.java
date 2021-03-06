package com.wingshield.technologies.newui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wingshield.technologies.newui.R;
import com.wingshield.technologies.newui.adapter.CategoryAdapter;
import com.wingshield.technologies.newui.model.CategoryData;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Arun Kumar on 14/8/20.
 * Copyright (c) 2020 wing shield technologies.com All rights reserved.
 */

public class HomeFragment extends BaseFragment {
    private static final String TAG = HomeFragment.class.getSimpleName();
    private List<CategoryData> categoryDataList;
    private RecyclerView rv_category;
    private Context context;


    public HomeFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        context = getActivity();
        categoryDataList = new ArrayList<>();
        rv_category = view.findViewById(R.id.rv_category);
        setRecyclerViewCategory(categoryDataList);

        return view;
    }


    /**
     * Set Gallery Image in RecyclerView
     */
    private void setRecyclerViewCategory(List<CategoryData> categoryDataList) {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        rv_category.setLayoutManager(mLayoutManager);
        rv_category.setAdapter(new CategoryAdapter(context, categoryDataList));
    }

   /* private void setChatsAdapter() {
        rvChats.setLayoutManager(new LinearLayoutManager(context));
        SlideInRightAnimationAdapter alphaInAnimationAdapter = new SlideInRightAnimationAdapter(new ChatsAdapter(context, chatUsersList));
        alphaInAnimationAdapter.setDuration(1000);
        alphaInAnimationAdapter.setInterpolator(new DecelerateInterpolator());
        alphaInAnimationAdapter.setFirstOnly(false);
        rvChats.setAdapter(new ScaleInAnimationAdapter(alphaInAnimationAdapter));
        rvChats.setAdapter(alphaInAnimationAdapter);
    }*/


}
