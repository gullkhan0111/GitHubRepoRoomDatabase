package com.example.haseeb.githubreporoomdatabase.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.haseeb.githubreporoomdatabase.data.models.Item;

@Database(entities = {Item.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {

    public abstract RepoDao repoDao();

}
