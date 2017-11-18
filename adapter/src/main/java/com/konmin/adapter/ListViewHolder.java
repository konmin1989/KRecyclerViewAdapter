package com.konmin.adapter;

import android.view.View;

/**
 * Created by konmin on 2017/11/18.
 */

public class ListViewHolder {


    private View mItemView;

    public ListViewHolder(View itemView) {

        mItemView = itemView;

    }


    public <T extends View> T findViewById(int id) {
        return mItemView.findViewById(id);
    }


}
