package com.example.haseeb.githubreporoomdatabase;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by haseeb on 3/28/2018.
 */

interface GitHubClient {


/*
        //https://api.apixu.com/v1/current.json?key=00a7b0e44e1f4b6dbfb111338180702&q=Paris
        @GET("v1/current.json")
        Call<WeatherList>getCurrent (@Query("key") String key, @Query("q") String q);
 */

    //   https://api.github.com/search/repositories?q=java

    @GET("/search/repositories")
    Call<List<RespoModel>> getAllRespository(@Query("q") String q);


}

