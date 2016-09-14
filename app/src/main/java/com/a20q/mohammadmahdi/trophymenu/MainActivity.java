package com.a20q.mohammadmahdi.trophymenu;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().getDecorView().setBackgroundColor(Color.rgb(31, 97, 141));

        String[] texts = new String[TrophyData.datas.length];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = TrophyData.datas[i].getText();
        }
        int[] ids = new int[TrophyData.datas.length];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = TrophyData.datas[i].getId();
        }

        TrophyRecyclerAdapter adapter = new TrophyRecyclerAdapter(texts, ids);
        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);
    }
}
