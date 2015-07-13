package com.example.dtluc.llistview;



import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recyclerView;
    private List<ItemBean> itemBeanList;
    private TimelineAdapter timelineAdapter;
    private LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initdatas();
        recyclerView.setAdapter(timelineAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initViews(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }

    private void initdatas(){
        itemBeanList = new ArrayList<>();
        for(int i = 0;i < 20;i++){
            itemBeanList.add(new ItemBean("Time"+i,R.drawable.ic_launcher,R.drawable.ic_launcher,"Contents"+i));
        }
        timelineAdapter = new TimelineAdapter(this,itemBeanList);
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    }

}


