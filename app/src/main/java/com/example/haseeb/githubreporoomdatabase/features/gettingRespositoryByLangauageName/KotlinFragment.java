package com.example.haseeb.githubreporoomdatabase.features.gettingRespositoryByLangauageName;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.haseeb.githubreporoomdatabase.R;
import com.example.haseeb.githubreporoomdatabase.data.Respository;
import com.example.haseeb.githubreporoomdatabase.data.models.Item;

import java.util.List;


public class KotlinFragment extends Fragment implements RespsitoryView {

    KotlinPresenterImpl presenter;

    RecyclerView recyclerVie;
    ProgressBar loadingKotlinRepos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_kotlin, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = new KotlinPresenterImpl(new Respository(), this);
        recyclerVie = view.findViewById(R.id.fragment_kotlin_recylerView);
        loadingKotlinRepos=view.findViewById(R.id.fragment_java_pg);
        loadingKotlinRepos.setVisibility(View.VISIBLE);
        recyclerVie.setLayoutManager(new LinearLayoutManager(getContext()));
        presenter.GettingKootlinRepos("kotlin");
    }

    @Override
    public void GettingRepositoryList(List<Item> respoModels) {
        recyclerVie.setAdapter(new KotlinAdpater(getActivity(), respoModels));
        loadingKotlinRepos.setVisibility(View.INVISIBLE);


    }

    @Override
    public void GettingEmptyRepository() {
        Toast.makeText(getContext(), "kotlin Repository is Null", Toast.LENGTH_SHORT).show();
        loadingKotlinRepos.setVisibility(View.INVISIBLE);
    }

    @Override
    public void GettingErrorRespository() {
        Toast.makeText(getContext(), " Error kotlin Repository", Toast.LENGTH_SHORT).show();
        loadingKotlinRepos.setVisibility(View.INVISIBLE);
    }

    @Override
    public void GettingSuccessResponce() {
        Toast.makeText(getContext(), "kotlin Repository Success", Toast.LENGTH_SHORT).show();
        loadingKotlinRepos.setVisibility(View.INVISIBLE);

    }
}
