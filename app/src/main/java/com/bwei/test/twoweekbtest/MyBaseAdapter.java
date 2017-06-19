package com.bwei.test.twoweekbtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/18.
 * time:
 * author:付智焱
 */

public class MyBaseAdapter extends BaseAdapter{
    private List<Bean> list;
    private Context context;

    public MyBaseAdapter(List<Bean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //listview 优化
        ViewHolder v;
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.baseadpter,null);
            v=new ViewHolder();
            v.image= (ImageView) convertView.findViewById(R.id.image);
            v.tv1= (TextView) convertView.findViewById(R.id.tv1);
            v.tv2= (TextView) convertView.findViewById(R.id.tv2);
            v.but= (Button) convertView.findViewById(R.id.but);
            convertView.setTag(v);
        }else{
            v= (ViewHolder) convertView.getTag();
        }
        v.image.setImageResource(list.get(position).getPic());
        v.tv1.setText(list.get(position).getTitle());
        v.tv2.setText(list.get(position).getNews());
        //点击删除按钮进行条目的删除
        v.but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(position);
                notifyDataSetChanged();
            }
        });
        return convertView;
    }
    class ViewHolder{
        private TextView tv1,tv2;
        private ImageView image;
        private Button but;
    }
}
