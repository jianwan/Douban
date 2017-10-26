package com.example.wanjian.douban.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wanjian.douban.ApiService;
import com.example.wanjian.douban.Bean.Top250;
import com.example.wanjian.douban.R;
import com.example.wanjian.douban.adapter.TopFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wanjian on 2017/5/10.
 */

public class TopFragment extends Fragment {


    private List<Top250.SubjectsBean> mList=new ArrayList<>();
    private TopFragmentAdapter adapter;
    RecyclerView recyclerView;
    TextView ftext;
    ImageView fimage;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.topfragment,container,false);

        recyclerView=(RecyclerView)view.findViewById(R.id.topfragment_recycleview);

        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(layoutManager);


        fimage=(ImageView)view.findViewById(R.id.fimage);
        ftext=(TextView)view.findViewById(R.id.ftext);

        getTop250();

        return view;
    }

    private void getTop250() {

        String baseUrl="https://api.douban.com/v2/movie/";

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();


        ApiService doubanApi= retrofit.create(ApiService.class);

        doubanApi.getTop250(0,20)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Top250>() {
                    @Override
                    public void onCompleted() {
                        Toast.makeText(getActivity(),"这里是Top250的电影",Toast.LENGTH_SHORT).show();
                        adapter=new TopFragmentAdapter(mList);
                        recyclerView.setAdapter(adapter);

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Top250 top250) {
                        mList.addAll(top250.getSubjects());
                    }


                });

    }


}
