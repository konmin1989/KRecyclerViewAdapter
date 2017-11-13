package com.konmin.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Describe RecyclerView 的ViewHolder
 *
 * @author Konmin
 * @version 创建时间：2017/11/11
 */

public class ViewHolder extends RecyclerView.ViewHolder {


    private View mItemView;

    private int mViewType;

    public ViewHolder(View itemView) {
        super(itemView);
        mItemView = itemView;
    }


    public int getViewType() {
        return mViewType;
    }

    public void setViewType(int mViewType) {
        this.mViewType = mViewType;
    }

    public void setTextViewText(int id, CharSequence text) {
        TextView textView = findViewById(id);
        textView.setText(text);
    }


    public void setBackgroundResource(int id, int resId) {
        findViewById(id).setBackgroundResource(resId);
    }


    public void setBackgroundColor(int id, int color) {
        findViewById(id).setBackgroundColor(color);

    }


    public void setImageViewURI(int id, Uri uri) {
        ImageView imageView = findViewById(id);
        imageView.setImageURI(uri);
    }


    public void setImageViewDrawable(int id, Drawable drawable) {
        ImageView imageView = findViewById(id);
        imageView.setImageDrawable(drawable);
    }

    public void setImageViewBitmap(int id, Bitmap bitmap) {
        ImageView imageView = findViewById(id);
        imageView.setImageBitmap(bitmap);
    }


    public void setOnClickListener(int id, View.OnClickListener listener) {
        findViewById(id).setOnClickListener(listener);
    }




    public <T extends View> T findViewById(int id) {
        return mItemView.findViewById(id);
    }


}
