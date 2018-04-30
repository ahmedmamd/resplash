package com.example.mashal.resplash.pager_adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mashal.resplash.R;
import com.example.mashal.resplash.model.colection_photos.Collection;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by mashal on 2018-04-29.
 */
public class adapter_collection extends RecyclerView.Adapter<adapter_collection.item_view> {
        Context context;
        ArrayList<Collection>collections;
        ImageView imageView;
    public adapter_collection(ArrayList<Collection>collections,Context context){
        this.collections=collections;
        this.context=context;
    }
    @Override
    public item_view onCreateViewHolder(ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(context).inflate(R.layout.view,parent,false);
       return new item_view(view);
    }

    @Override
    public void onBindViewHolder(item_view holder, int position) {

      Collection photo=collections.get(position);
        Picasso.with(context).load((Uri) photo.getPreviewPhotos()).into(imageView);
    }

    @Override
    public int getItemCount() {
        return collections.size();
    }

    class item_view extends RecyclerView.ViewHolder{

        public item_view(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.images);
        }
    }
}
