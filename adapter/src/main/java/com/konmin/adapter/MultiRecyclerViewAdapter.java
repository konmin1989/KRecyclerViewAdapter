package com.konmin.adapter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe
 *
 * @author Konmin
 * @version 创建时间：2017/11/11
 */

public abstract class MultiRecyclerViewAdapter<T> extends RecyclerView.Adapter<ViewHolder> {


    private List<T> mData;

    private OnItemLongClickListener<T> mOnItemLongClickListener;
    private OnItemClickListener<T> mOnItemClickListener;

    public MultiRecyclerViewAdapter() {

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        final View view = LayoutInflater.from(parent.getContext()).inflate(getViewLayout(viewType), parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = viewHolder.getAdapterPosition();
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(position, mData.get(position), view, viewHolder);
                }
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int position = viewHolder.getAdapterPosition();
                return mOnItemLongClickListener != null && mOnItemLongClickListener.onItemLongClick(position, mData.get
                        (position), view, viewHolder);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        onBindView(holder, holder.getViewType(), mData.get(position), position);
    }


    /**
     * View的数据绑定
     *
     * @param viewHolder view holder
     * @param viewType   View 的类型
     * @param t          要绑定数据的bean
     * @param position   位置
     */
    public abstract void onBindView(ViewHolder viewHolder, int viewType, T t, int position);


    @Override
    public int getItemCount() {

        if (mData == null) {
            return 0;
        }
        return mData.size();
    }


    /**
     * 根据不同的ViewType 设置不同的布局
     *
     * @param viewType View 的类型
     * @return layout res
     */
    public abstract int getViewLayout(int viewType);


    /**
     * 设置数据列表
     *
     * @param data
     */
    public void setDataList(List<T> data) {
        mData = data;
    }


    public void setData(T t) {
        if (mData == null) {
            mData = new ArrayList<>();
        }
        mData.add(t);
    }


    public void setOnItemLongClickListener(OnItemLongClickListener<T> onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener<T> onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }
}
