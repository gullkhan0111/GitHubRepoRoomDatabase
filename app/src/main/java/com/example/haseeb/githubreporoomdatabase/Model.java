package com.example.haseeb.githubreporoomdatabase;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by haseeb on 3/28/2018.
 */

public class Model {

    public void GettingAllRepos(String lanaguageName, final AllRespositoryCallback callback) {
        GetRetrofitObject.getService().getAllRespository(lanaguageName).enqueue(new Callback<List<RespoModel>>() {
            @Override
            public void onResponse(Call<List<RespoModel>> call, Response<List<RespoModel>> response) {

                try {
                    List<RespoModel> respoModels = response.body();
                    callback.GettingReposioryList(respoModels);

                } catch (NullPointerException ex) {
                    callback.GettingEmptyRepository();

                }

            }

            @Override
            public void onFailure(Call<List<RespoModel>> call, Throwable t) {
                callback.GettingErrorRepository();

            }
        });
    }

    public interface AllRespositoryCallback {
        void GettingReposioryList(List<RespoModel> respoModels);

        void GettingEmptyRepository();

        void GettingErrorRepository();
    }

}
