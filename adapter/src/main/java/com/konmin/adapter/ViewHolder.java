package com.konmin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Describe RecyclerView 的ViewHolder
 *
 * @author Konmin
 * @version 创建时间：2017/11/11
 */

public class ViewHolder extends RecyclerView.ViewHolder {


    private View mItemView;

    public ViewHolder(View itemView) {
        super(itemView);
        mItemView = itemView;
    }






    public void setTextViewText(int id, CharSequence text) {
        TextView textView = findViewById(id);
        textView.setText(text);
    }


    public <T extends View> T findViewById(int id) {
        return mItemView.findViewById(id);
    }


}
