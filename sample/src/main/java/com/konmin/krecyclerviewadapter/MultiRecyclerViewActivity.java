package com.konmin.krecyclerviewadapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.konmin.adapter.MultiRecyclerViewAdapter;
import com.konmin.adapter.ViewHolder;
import com.konmin.krecyclerviewadapter.entity.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe
 *
 * @author Konmin
 * @version 创建时间：2017/11/13
 */

public class MultiRecyclerViewActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private MultiRecyclerViewAdapter<Note> mMultiRecyclerViewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.rv);
        mMultiRecyclerViewAdapter = new MultiRecyclerViewAdapter<Note>() {

            @Override
            public void onBindView(ViewHolder viewHolder, int viewType, Note note, int position) {

            }

            @Override
            public int getViewLayout(int viewType) {

                switch (viewType) {
                    case 1:
                        return R.layout.item_note_2;
                    case 2:
                        return R.layout.item_note;
                    default:
                        return 0;
                }
            }


            @Override
            public int getItemViewType(int position) {
                switch (position) {
                    case 0:
                        return 1;
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    case 5:
                        return 2;
                    case 6:
                        return 1;
                    case 7:
                        return 1;
                    case 8:
                        return 2;
                }

                return 1;
            }
        };
        mRecyclerView.setAdapter(mMultiRecyclerViewAdapter);
        initData();
    }


    private void initData() {

        List<Note> notes = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Note note = new Note("iiiii", "sjsjsjsjs", 1L);
            notes.add(note);
        }
        mMultiRecyclerViewAdapter.setDataList(notes);

    }


}
