package com.example.haseeb.githubreporoomdatabase.features.gettingRespositoryByLangauageName;

import android.support.v7.widget.RecyclerView;

import com.example.haseeb.githubreporoomdatabase.data.Respository;
import com.example.haseeb.githubreporoomdatabase.data.models.Item;

import java.util.List;

/**
 * Created by haseeb on 3/29/2018.
 */

public class KotlinPresenterImpl implements Respository.AllKootlinRepositoryCallback {

    private final Respository respository;
    private final RespsitoryView respsitoryView;

    public KotlinPresenterImpl(Respository respository, RespsitoryView respsitoryView) {
        this.respository = respository;
        this.respsitoryView = respsitoryView;
    }

    public void GettingKootlinRepos(String kotlin) {
        respository.GettingAllKootlinRepository(kotlin, this);
    }

    @Override
    public void GettingRespositoryList(List<Item> repoModels) {
        respsitoryView.GettingRepositoryList(repoModels);

    }

    @Override
    public void GettingSuccessResponce() {
        respsitoryView.GettingSuccessResponce();

    }

    @Override
    public void GettingEmptyRepository() {
        respsitoryView.GettingEmptyRepository();

    }

    @Override
    public void GettingErrorRepository() {
        respsitoryView.GettingErrorRespository();
    }
}
