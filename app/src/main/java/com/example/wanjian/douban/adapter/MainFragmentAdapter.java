package com.example.wanjian.douban.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.wanjian.douban.Bean.Main;
import com.example.wanjian.douban.R;

import java.util.List;

/**
 * Created by wanjian on 2017/5/9.
 */

public class MainFragmentAdapter extends RecyclerView.Adapter<MainFragmentAdapter.ViewHolder> {


    private Context mContent;
    private List<Main.SubjectsBean> mFlist;


    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView fimage;
        TextView fname;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView;
            //获取到布局中的ImageView和TextView实例
            fimage=(ImageView)itemView.findViewById(R.id.fimage);
            fname=(TextView)itemView.findViewById(R.id.ftext);
//            cardView=(CardView)itemView.findViewById(R.id.cardtext);
//
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    switch (view.getId()){
//                        case R.id.fimage:
//                            Toast.makeText(,"You have click it",Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });

        }
    }


    //该方法用于把要展示的数据源传进来并赋值给全局变量mFlist
    public MainFragmentAdapter(List<Main.SubjectsBean> fList){
        mFlist=fList;
    }



    //重写onCreateViewHolder、onBindViewHolder和getItemCount三个方法

    //将mainfragment_card布局加载进来，并创建一个ViewHolder的实例，将加载出的布局传入构造函数中，并返回ViewHolder实例
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(mContent==null){
            mContent=parent.getContext();
        }
        View view= LayoutInflater.from(mContent).inflate(R.layout.mainfragment_card,parent,false);
//      return new ViewHolder(view);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    //用于对RecyclerView子项的数据进行赋值，在每个子项被滚动到屏幕内的时候执行，
    // 这里通过position参数得到当前项的Fruit实例，再讲数据设置到ViewHolder的ImageView和TextView
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Main.SubjectsBean main=mFlist.get(position);
        holder.fname.setText(main.getTitle());
        Glide.with(mContent).load(main.getImages().getSmall()).into(holder.fimage);
    }

    //告诉recyclerView一共多少子项
    @Override
    public int getItemCount() {
//        Log.d("看这里", String.valueOf(mFlist.size()));
        return mFlist.size();
    }


}
