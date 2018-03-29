package com.example.haseeb.githubreporoomdatabase.data;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.example.haseeb.githubreporoomdatabase.data.models.Item;
import com.example.haseeb.githubreporoomdatabase.data.models.RepositoryModel;
import com.example.haseeb.githubreporoomdatabase.database.AppDatabase;
import com.example.haseeb.githubreporoomdatabase.database.MyRoomConnection;
import com.example.haseeb.githubreporoomdatabase.provider.GetRetrofitObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Respository {
    AppDatabase database;
    Context context;

    public Respository(Context context) {
        this.context=context;
    }

    public void GettingAllRepos(String languageName, final AllRespositoryCallback callback) {
        GetRetrofitObject.getService().getAllRespos(languageName).enqueue(new Callback<RepositoryModel>() {
            @Override
            public void onResponse(Call<RepositoryModel> call, Response<RepositoryModel> response) {
                try {

                    callback.GettingSuccessResponce();
                    Log.d("lang name",response.body().getItems().get(0).getFull_name());
                    List<Item> repositoryModels =response.body().getItems();
                    callback.GettingRespositoryList(repositoryModels);
                    Item item = new Item();
                    for(int i=0;i<repositoryModels.size();i++) {
                        item.setFull_name(repositoryModels.get(0).getFull_name());
                        MyRoomConnection.getDb(context).repoDao().insert(item);
                    }
                  callback.GettingjavaListFromRoom(database.repoDao().getAllRepos());

                }catch (NullPointerException ex){
                    callback.GettingEmptyRepository();
                }
            }

            @Override
            public void onFailure(Call<RepositoryModel> call, Throwable t) {
                callback.GettingErrorRepository();

            }
        });

    }

    public void GettingAllKootlinRepository(String kotlin,final  AllKootlinRepositoryCallback callback){
        GetRetrofitObject.getService().getAllRespos(kotlin).enqueue(new Callback<RepositoryModel>() {
            @Override
            public void onResponse(Call<RepositoryModel> call, Response<RepositoryModel> response) {
                try {
                    callback.GettingSuccessResponce();
                    List<Item>items= response.body().getItems();
                    callback.GettingRespositoryList(items);

                }catch (NullPointerException ex){
                    ex.printStackTrace();
                    callback.GettingEmptyRepository();

                }
            }

            @Override
            public void onFailure(Call<RepositoryModel> call, Throwable t) {
                callback.GettingErrorRepository();

            }
        });
    }


    public interface AllRespositoryCallback {
       void GettingRespositoryList(List<Item> repoModels);
        void GettingSuccessResponce();
        void GettingEmptyRepository();
        void GettingErrorRepository();
        void GettingjavaListFromRoom(List<Item> items);
    }
    public  interface AllKootlinRepositoryCallback{

        void GettingRespositoryList(List<Item> repoModels);
        void GettingSuccessResponce();
        void GettingEmptyRepository();
        void GettingErrorRepository();
    }

}
