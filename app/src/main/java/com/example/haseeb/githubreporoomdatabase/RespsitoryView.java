package com.example.haseeb.githubreporoomdatabase;

import java.util.List;

/**
 * Created by haseeb on 3/28/2018.
 */

public interface RespsitoryView {
    void GettingRepositoryList(List<RespoModel>respoModels);
    void GettingEmptyRepository();
    void GettingErrorRespository();
}
