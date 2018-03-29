package com.example.haseeb.githubreporoomdatabase.features.gettingRespositoryByLangauageName;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.haseeb.githubreporoomdatabase.R;
import com.example.haseeb.githubreporoomdatabase.data.models.Item;

import java.util.List;

/**
 * Created by haseeb on 3/29/2018.
 */

class KotlinAdpater extends RecyclerView.Adapter <KotlinAdpater.KotlinViewHoolder> {
    Context context;
    List<Item> items;

    public KotlinAdpater(FragmentActivity activity, List<Item> respoModels) {
        this.context = activity;
        this.items = respoModels;


    }

    @Override
    public KotlinViewHoolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.kootlinlistview, parent, false);
        return new KotlinViewHoolder(itemView);
    }

    @Override
    public void onBindViewHolder(KotlinViewHoolder holder, int position) {
        holder.kotlinRepoName.setText(items.get(0).getFull_name());
//        holder.watchers.setText(items.get(0).getWatchers());
  //      holder.star.setText(items.get(0).getStargazersCount());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class KotlinViewHoolder extends RecyclerView.ViewHolder {
        TextView kotlinRepoName,watchers,star;
        public KotlinViewHoolder(View itemView) {
            super(itemView);
            kotlinRepoName=itemView.findViewById(R.id.fragment_koktlin_repoName);
          //  watchers=itemView.findViewById(R.id.kotlinwatchers);
           // star=itemView.findViewById(R.id.kotlinstar);
        }
    }
}