package com.example.haseeb.githubreporoomdatabase.database;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.haseeb.githubreporoomdatabase.data.models.Item;

import java.util.List;


 public interface RepoDao {
    @Insert
    void insert(List<Item>items);

    @Query("Select * from Item ")
     List<Item>getAllRepos();
}
