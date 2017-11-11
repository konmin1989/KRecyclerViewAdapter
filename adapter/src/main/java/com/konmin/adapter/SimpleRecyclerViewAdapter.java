package com.konmin.adapter;

import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Describe 简单的单一样式的 SimpleRecyclerViewAdapter
 *
 * @author Konmin
 * @version 创建时间：2017/11/11
 */

public abstract class SimpleRecyclerViewAdapter<T> extends RecyclerView.Adapter<ViewHolder> {


    private int mLayoutId;

    private List<T> mDataList;

    private OnItemClickListener mOnItemClickListener;

    private OnItemLongClickListener mOnItemLongClickListener;

    public SimpleRecyclerViewAdapter(int layoutId) {

        mLayoutId = layoutId;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(mLayoutId, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListener.onItemClick(v, viewHolder);
            }
        });

        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return mOnItemLongClickListener.onItemLongClick(v, viewHolder);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        bindViewData(holder, mDataList.get(position), position);
    }


    public abstract void bindViewData(ViewHolder holder, T t, int position);

    @Override
    public int getItemCount() {
        if (mDataList == null) {
            return 0;
        }
        return mDataList.size();
    }


}
