package com.konmin.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * ListView用的Adapter
 * Created by konmin on 2017/11/18.
 */

public abstract class SimpleListViewAdapter<T> extends BaseAdapter {


    private int mItemLayoutId;

    private List<T> mData;


    public SimpleListViewAdapter(int itemLayoutId) {
        mItemLayoutId = itemLayoutId;
    }


    @Override
    public int getCount() {

        if (mData == null) return 0;
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(mItemLayoutId, parent, false);
            holder = new ListViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ListViewHolder) convertView.getTag();
        }
        bindData(holder, mData.get(position), position);
        return convertView;
    }

    public abstract void bindData(ListViewHolder holder, T t, int position);


    public void setDataList(List<T> dataList) {
        mData = dataList;
    }


    public void addDataAtLast(T t) {

        if (mData == null) {
            mData = new ArrayList<>();
        }

        mData.add(t);
    }

    public void addDataAtFirst(T data) {

        if (mData == null) {
            mData = new ArrayList<>();
        }
        mData.add(0, data);
    }

    public void addDataAtPosition(int position, T data) {

        if (mData == null) {
            return;
        }

        if (mData.size() < position) {
            return;
        }
        mData.add(0, data);
    }
}
