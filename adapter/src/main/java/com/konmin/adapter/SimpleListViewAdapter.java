package com.konmin.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * ListView用的Adapter
 * Created by konmin on 2017/11/18.
 */

public class SimpleListViewAdapter<T> extends BaseAdapter {


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
        return null;
    }



}
