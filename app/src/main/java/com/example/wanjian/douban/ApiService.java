package com.example.wanjian.douban;

import com.example.wanjian.douban.Bean.Main;
import com.example.wanjian.douban.Bean.Top250;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wanjian on 2017/5/10.
 */

public interface ApiService {

    /**
     * 即将上映
     * @return
     */
    @GET("in_theaters")
    Observable<Main> getLiveFilm(@Query("start") int start, @Query("count") int count);

    /**
     * 获取top250
     * @param start
     * @param count
     * @return
     */
    @GET("top250")
    Observable<Top250> getTop250(@Query("start")int start, @Query("count")int count);

}
