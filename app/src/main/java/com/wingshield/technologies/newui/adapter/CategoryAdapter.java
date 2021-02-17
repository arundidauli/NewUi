package com.wingshield.technologies.newui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wingshield.technologies.newui.R;
import com.wingshield.technologies.newui.model.CategoryData;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by Arun Kumar on 14/8/20.
 * Copyright (c) 2020  wing shield technologies.com All rights reserved.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ChatsViewHolder> {
    private final Context context;
    private final List<CategoryData> categoryDataList;

    public CategoryAdapter(Context context, List<CategoryData> categoryDataList) {
        this.context = context;
        this.categoryDataList = categoryDataList;
    }

    @NonNull
    @Override
    public ChatsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ChatsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_category_row, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsViewHolder chatsViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
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
