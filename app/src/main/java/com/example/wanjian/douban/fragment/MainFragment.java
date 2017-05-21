package com.example.wanjian.douban.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wanjian.douban.ApiService;
import com.example.wanjian.douban.Bean.Main;
import com.example.wanjian.douban.adapter.MainFragmentAdapter;
import com.example.wanjian.douban.R;

import java.util.ArrayList;
import java.util.List;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wanjian on 2017/5/9.
 */

public class MainFragment extends Fragment {


    private List<Main.SubjectsBean> fList=new ArrayList<>();
    private MainFragmentAdapter adapter;
    RecyclerView recyclerView;
    TextView ftext;
    ImageView fimage;
    CardView cardView;


    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                              Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.mainfragment,container,false);


        recyclerView=(RecyclerView)view.findViewById(R.id.mainfragment_recycleview);
        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(layoutManager);


        fimage=(ImageView)view.findViewById(R.id.fimage);
        ftext=(TextView)view.findViewById(R.id.ftext);
//        cardView=(CardView)view.findViewById(R.id.cardtext);

//        fimage.setOnClickListener(this);
//        cardView.setOnClickListener(this);

       //得到热映电影
        getLiveFilm();

        return view;
    }



    private void getLiveFilm() {

        String baseUrl="https://api.douban.com/v2/movie/";

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();


        ApiService doubanApi= retrofit.create(ApiService.class);

        doubanApi.getLiveFilm(0,10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Main>() {
                    @Override
                    public void onCompleted() {
                        Toast.makeText(getActivity(),"这里是即将上映的电影",Toast.LENGTH_SHORT).show();
                        adapter=new MainFragmentAdapter(fList);
                        recyclerView.setAdapter(adapter);

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Main main) {

                          fList.addAll(main.getSubjects());

                    }
                });
//       Call<Main> call=doubanApi.getLiveFilm(10);
//
//        call.enqueue(new Callback<Main>() {
//            @Override
//            public void onResponse(Call<Main> call, Response<Main> response) {
//                ftext.setText(response.body().toString());
//                Log.d("恭喜","正确");
//            }
//
//            @Override
//            public void onFailure(Call<Main> call, Throwable t) {
//
//                ftext.setText(t.getMessage());
//            }
//        });
    }



}


