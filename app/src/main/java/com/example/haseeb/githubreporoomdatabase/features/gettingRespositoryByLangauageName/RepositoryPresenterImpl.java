package com.example.haseeb.githubreporoomdatabase.features.gettingRespositoryByLangauageName;

import com.example.haseeb.githubreporoomdatabase.data.Respository;
import com.example.haseeb.githubreporoomdatabase.data.models.Item;

import java.util.List;

public class RepositoryPresenterImpl implements Respository.AllRespositoryCallback {
    private final Respository model;
    private final RespsitoryView respsitoryViewl;

    public RepositoryPresenterImpl(Respository model, RespsitoryView respsitoryViewl) {
        this.model = model;
        this.respsitoryViewl = respsitoryViewl;
    }

    public void GettingLanguageName(String lanaguageName) {
        model.GettingAllRepos(lanaguageName, this);
    }


    @Override
    public void GettingRespositoryList(List<Item> repoModels) {
        respsitoryViewl.GettingRepositoryList(repoModels);
    }

    @Override
    public void GettingSuccessResponce() {
        respsitoryViewl.GettingSuccessResponce();

    }

    @Override
    public void GettingEmptyRepository() {
        respsitoryViewl.GettingEmptyRepository();

    }

    @Override
    public void GettingErrorRepository() {
        respsitoryViewl.GettingErrorRespository();
    }
}
