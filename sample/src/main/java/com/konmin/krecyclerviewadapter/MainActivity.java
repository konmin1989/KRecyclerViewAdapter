package com.konmin.krecyclerviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.konmin.adapter.OnItemClickListener;
import com.konmin.adapter.SimpleRecyclerViewAdapter;
import com.konmin.adapter.ViewHolder;
import com.konmin.krecyclerviewadapter.entity.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;


    private SimpleRecyclerViewAdapter<Note> mSimpleRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.rv);
        mSimpleRecyclerViewAdapter = new SimpleRecyclerViewAdapter<Note>(R.layout.item_note) {
            @Override
            public void bindViewData(ViewHolder holder, Note note, int position) {

                holder.setTextViewText(R.id.title, note.getTitle());
            }
        };

        mSimpleRecyclerViewAdapter.setOnItemClickListener(new OnItemClickListener<Note>() {
            @Override
            public void onItemClick(int position, Note note, View itemView, ViewHolder holder) {

            }
        });

        mRecyclerView.setAdapter(mSimpleRecyclerViewAdapter);

        initData();

    }

    private void initData() {


        List<Note> noteList = new ArrayList<>();

        Note note = new Note("SimpleRecyclerAdapter", "SimpleRecyclerAdapter", 0L);
        noteList.add(note);

        mSimpleRecyclerViewAdapter.setDataList(noteList);

    }


    private void showText(CharSequence text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

}
