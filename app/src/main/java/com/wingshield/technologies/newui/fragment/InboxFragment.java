package com.wingshield.technologies.newui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wingshield.technologies.newui.R;
import com.wingshield.technologies.newui.adapter.ChatsAdapter;
import com.wingshield.technologies.newui.model.ChatUsers;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.SlideInRightAnimationAdapter;


/**
 * Created by Arun Kumar on 14/8/20.
 * Copyright (c) 2020 wing shield technologies.com All rights reserved.
 */

public class InboxFragment extends BaseFragment {

    private static final String TAG = InboxFragment.class.getSimpleName();
    private List<ChatUsers> chatUsersList;
    private RecyclerView rvChats;
    private Context context;


    public InboxFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inbox, container, false);
        context = getActivity();
        chatUsersList = new ArrayList<>();
        rvChats = view.findViewById(R.id.rvChats);

        setChatsAdapter();

        return view;
    }


    private void setChatsAdapter() {
        rvChats.setLayoutManager(new LinearLayoutManager(context));
        SlideInRightAnimationAdapter alphaInAnimationAdapter = new SlideInRightAnimationAdapter(new ChatsAdapter(context, chatUsersList));
        alphaInAnimationAdapter.setDuration(1000);
        alphaInAnimationAdapter.setInterpolator(new DecelerateInterpolator());
        alphaInAnimationAdapter.setFirstOnly(false);
        rvChats.setAdapter(new ScaleInAnimationAdapter(alphaInAnimationAdapter));
        rvChats.setAdapter(alphaInAnimationAdapter);
    }


}
