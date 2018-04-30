package com.example.mashal.resplash.pager_adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mashal.resplash.R;
import com.example.mashal.resplash.model.HDphoto;
import com.example.mashal.resplash.model.Links;
import com.example.mashal.resplash.model.Urls;
import com.example.mashal.resplash.model.colection_photos.Collection;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mashal on 2018-04-19.
 */
public class adapter_new extends RecyclerView.Adapter<adapter_new.view> {
    ArrayList<HDphoto> photo=new ArrayList<>();
    Context context;
    ImageView imageView;
    public adapter_new(ArrayList<HDphoto> photo, Context context){

        this.context=context;
        this.photo=photo;

    }

    @Override
    public view onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.view,parent,false);
        return new view(view);
    }

    @Override
    public void onBindViewHolder(view holder, int position) {
        HDphoto photos=  photo.get(position);
        Picasso.with(context).load(String.valueOf(photos.getUrls().getFull())).into(imageView);
    }

    @Override
    public int getItemCount() {
        return photo.size();

    }

    class view extends RecyclerView.ViewHolder{

        public view(View itemView) {
            super(itemView);
            imageView=(ImageView) itemView.findViewById(R.id.images);
        }
    }
}
