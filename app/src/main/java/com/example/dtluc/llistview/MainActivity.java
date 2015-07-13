package com.example.dtluc.llistview;



import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    /*
    * 看到我的修改了么，没看到。
    * */

    private RecyclerView recyclerView;
    private List<ItemBean> itemBeanList;
    private TimelineAdapter timelineAdapter;
    private LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initDatas();
        recyclerView.setAdapter(timelineAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initViews(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }

    private void initDatas(){
        itemBeanList = new ArrayList<>();
        for(int i = 0;i < 20;i++){
            itemBeanList.add(new ItemBean("Time"+i,R.drawable.ic_launcher,R.drawable.ic_launcher,"Contents"+i));
        }
        timelineAdapter = new TimelineAdapter(this,itemBeanList);
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    }

}


