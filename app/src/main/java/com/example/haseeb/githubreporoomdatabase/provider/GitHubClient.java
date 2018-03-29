package com.example.haseeb.githubreporoomdatabase.provider;

import com.example.haseeb.githubreporoomdatabase.data.models.RepositoryModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by haseeb on 3/28/2018.
 */

public interface GitHubClient {



    //   https://api.github.com/search/repositories?q=java

    @GET("/search/repositories")
    //Call<List<RepositoryModel>> getAllRespository(@Query("q") String q);
    Call<RepositoryModel> getAllRespos(@Query("q") String q);


}

