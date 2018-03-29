package com.example.haseeb.githubreporoomdatabase.features.gettingRespositoryByLangauageName;

import com.example.haseeb.githubreporoomdatabase.data.models.Item;

import java.util.List;

/**
 * Created by haseeb on 3/28/2018.
 */

public interface RespsitoryView {
    void GettingRepositoryList(List<Item>respoModels);
    void GettingEmptyRepository();
    void GettingErrorRespository();
    void GettingSuccessResponce();
    void GettingListFromRoomDatabase(List<Item>items);
}
