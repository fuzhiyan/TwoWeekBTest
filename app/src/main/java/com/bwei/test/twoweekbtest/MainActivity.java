package com.bwei.test.twoweekbtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Bean> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv= (ListView) findViewById(R.id.lv);
        initData();
        lv.setAdapter(new MyBaseAdapter(list,MainActivity.this));
        //点击每条item进行跳转
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    //初始化数据
    private void initData() {
        list.add(new Bean(R.mipmap.ic_launcher,"旅行","所谓旅行就是从一个自己呆腻了的地方到一个别人呆腻了的地方"));
        list.add(new Bean(R.mipmap.ic_launcher,"学习","所谓学习就是把别人的思想变成自己的思想的一个过程"));
        list.add(new Bean(R.mipmap.ic_launcher,"生活","所谓生活就是实现自己梦想的一个过程，虽然结果大多不如人意"));
        list.add(new Bean(R.mipmap.ic_launcher,"梦想","所谓梦想要么逃避现实的幻想，要么把梦变成一个奇迹"));
    }
}
