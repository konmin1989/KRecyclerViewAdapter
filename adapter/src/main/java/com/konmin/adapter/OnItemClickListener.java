package com.konmin.adapter;

import android.view.View;

/**
 * Describe
 *
 * @author Konmin
 * @version 创建时间：2017/11/11
 */

public interface OnItemClickListener <T> {

    void onItemClick(int position,T t ,View itemView, ViewHolder holder);
}
