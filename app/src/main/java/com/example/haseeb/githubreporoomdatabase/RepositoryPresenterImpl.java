package com.example.haseeb.githubreporoomdatabase;

import java.util.List;

/**
 * Created by haseeb on 3/28/2018.
 */

public class RepositoryPresenterImpl implements Model.AllRespositoryCallback {
    private final Model model;
    private final RespsitoryView respsitoryViewl;

    public RepositoryPresenterImpl(Model model, RespsitoryView respsitoryViewl) {
        this.model = model;
        this.respsitoryViewl = respsitoryViewl;
    }

    public void GettingLangiageName(String lanaguageName) {
        model.GettingAllRepos(lanaguageName, this);
    }

    @Override
    public void GettingReposioryList(List<RespoModel> respoModels) {
        respsitoryViewl.GettingRepositoryList(respoModels);

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
