package com.example.admin.staggeredrecyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 4/5/2017.
 */

public class StaggeredAdapter extends RecyclerView.Adapter<StaggeredAdapter.ViewHolder> {

    private ArrayList <Beaches>beachList;

    public  static  class ViewHolder extends  RecyclerView.ViewHolder {

        public TextView  beachName;
        public ImageView beachPic;

        public ViewHolder(View itemView) {
            super(itemView);

            beachName =(TextView)itemView.findViewById(R.id.BeachName);
            beachPic =(ImageView)itemView.findViewById(R.id.BeachPic);

        }
    }

    public StaggeredAdapter (ArrayList<Beaches> beachList){
        this.beachList=beachList;
    }

    @Override
    public StaggeredAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.staggered_layout,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.beachName.setText(beachList.get(position).getName());
        holder.beachPic.setImageResource(beachList.get(position).getImgid());

    }



    @Override
    public int getItemCount() {
        return beachList.size();
    }
}
