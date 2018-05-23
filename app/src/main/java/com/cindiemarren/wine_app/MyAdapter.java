package com.cindiemarren.wine_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{


    private List<OtherListActivity> listItems;
    private Context context;


    //creates the viewholder
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.activity_other_list, parent, false);
        return new ViewHolder(v);
    }



    //bindds the data to the viewholder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        OtherListActivity listItem = listItems.get(position);

        holder.textViewWine.setText(listItem.getWine());
        holder.textViewDescription.setText(listItem.getDescription());

    }


    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewWine;
        public TextView textViewDescription;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewWine = (TextView) itemView.findViewById(R.id.textViewWine);
            textViewDescription = (TextView) itemView.findViewById(R.id.textViewDescription);
        }
    }

}
