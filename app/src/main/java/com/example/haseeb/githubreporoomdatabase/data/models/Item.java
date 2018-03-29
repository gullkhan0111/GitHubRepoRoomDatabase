
package com.example.haseeb.githubreporoomdatabase.data.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity
public class Item {
    @PrimaryKey(autoGenerate = true)
    private Integer id;

    @ColumnInfo(name = "full_name")
    private String full_name;

    public String getFull_name() {
        return full_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}