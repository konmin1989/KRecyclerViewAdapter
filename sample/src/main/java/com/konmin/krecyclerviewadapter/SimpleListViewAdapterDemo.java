package com.konmin.krecyclerviewadapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.konmin.adapter.ListViewHolder;
import com.konmin.adapter.SimpleListViewAdapter;
import com.konmin.krecyclerviewadapter.entity.Note;

/**
 * simple list view adapter demo
 * Created by konmin on 2017/11/18.
 */

public class SimpleListViewAdapterDemo extends AppCompatActivity {


    private ListView mListView;


    private SimpleListViewAdapter<Note> mSimpleListViewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mListView = findViewById(R.id.lv);
        mSimpleListViewAdapter = new SimpleListViewAdapter<Note>(R.layout.item_note) {
            @Override
            public void bindData(ListViewHolder holder, Note note, int position) {

            }
        };

        mListView.setAdapter(mSimpleListViewAdapter);
        initData();
    }



    private void initData(){




    }


}
