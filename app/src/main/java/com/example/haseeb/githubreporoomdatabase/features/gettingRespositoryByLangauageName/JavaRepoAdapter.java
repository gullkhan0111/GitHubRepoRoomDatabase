package com.example.haseeb.githubreporoomdatabase.features.gettingRespositoryByLangauageName;

import android.content.Context;
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

class JavaRepoAdapter extends RecyclerView.Adapter <JavaRepoAdapter.JavaViewHolder> {

    List<Item> items ;
    Context context;

    public JavaRepoAdapter( Context context,List<Item> respoModels) {
        this.context=context;
        this.items=respoModels;
    }

    @Override
    public JavaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.javalistview, parent, false);
        return new JavaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(JavaViewHolder holder, int position) {
        holder.fragment_java_tv_name.setText(items.get(0).getFullName().toString());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class JavaViewHolder extends RecyclerView.ViewHolder {

        TextView fragment_java_tv_name,watchers,star;
        public JavaViewHolder(View itemView) {
            super(itemView);
            fragment_java_tv_name=itemView.findViewById(R.id.fragment_java_tv_name);

        }
    }
}
