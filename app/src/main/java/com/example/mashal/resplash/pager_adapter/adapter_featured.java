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
public class adapter_featured extends RecyclerView.Adapter<adapter_featured.itemview> {
    Context context;
    ArrayList<Collection> collections;
    ImageView imageView;

    public adapter_featured(ArrayList<Collection>collections,Context context){
        this.collections=collections;
        this.context=context;
    }

    @Override
    public itemview onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.view,parent,false);
        return new itemview(view);
    }

    @Override
    public void onBindViewHolder(itemview holder, int position) {
        Collection photo=collections.get(position);
        Picasso.with(context).load((Uri) photo.getPreviewPhotos()).into(imageView);
    }

    @Override
    public int getItemCount() {
        return collections.size();
    }

    class itemview extends RecyclerView.ViewHolder{

        public itemview(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.images);

        }
    }
}
