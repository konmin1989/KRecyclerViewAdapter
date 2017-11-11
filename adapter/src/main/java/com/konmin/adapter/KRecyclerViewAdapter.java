package com.konmin.adapter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Describe
 *
 * @author Konmin
 * @version 创建时间：2017/11/11
 */

public abstract class KRecyclerViewAdapter<T> extends RecyclerView.Adapter<ViewHolder> {



    private List<T> mData;

    public KRecyclerViewAdapter() {

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(getViewLayout(viewType), parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    /**
     * 根据不同的ViewType 设置不同的布局
     * @param viewType View 的类型
     * @return
     */
    abstract int getViewLayout(int viewType);

}
