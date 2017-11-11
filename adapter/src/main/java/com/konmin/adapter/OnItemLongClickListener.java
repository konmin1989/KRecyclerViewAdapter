package com.konmin.adapter;

import android.view.View;

/**
 * Describe
 *
 * @author Konmin
 * @version 创建时间：2017/11/11
 */

public interface OnItemLongClickListener<T> {
    boolean onItemLongClick(int position,T t ,View itemView, ViewHolder holder);
    //boolean onItemLongClick(View itemView, ViewHolder holder);
}
