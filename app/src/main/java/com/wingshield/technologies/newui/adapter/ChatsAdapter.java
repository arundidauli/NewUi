package com.wingshield.technologies.newui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wingshield.technologies.newui.R;
import com.wingshield.technologies.newui.model.ChatUsers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by Arun Kumar on 14/8/20.
 * Copyright (c) 2020  wing shield technologies.com All rights reserved.
 */
public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.ChatsViewHolder> {
    private final Context context;
    private final List<ChatUsers> chatUsersList;

    public ChatsAdapter(Context context, List<ChatUsers> chats) {
        this.context = context;
        this.chatUsersList = chats;
    }

    @NonNull
    @Override
    public ChatsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ChatsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_row, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsViewHolder chatsViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    static class ChatsViewHolder extends RecyclerView.ViewHolder {
        ChatsViewHolder(@NonNull View itemView) {
            super(itemView);

        }

        public String convertTime(String time) {
            SimpleDateFormat formatter = new SimpleDateFormat("h:mm a", Locale.getDefault());
            return formatter.format(new Date(Long.parseLong(time)));
        }

    }
}
