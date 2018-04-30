package com.example.mashal.resplash.pager_adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mashal.resplash.R;
import com.example.mashal.resplash.api.ApiService;
import com.example.mashal.resplash.model.colection_photos.Collection;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mashal on 2018-04-18.
 */
public class FEATURED extends Fragment {
    RecyclerView recyclerView;
    ArrayList featured_photo;
    adapter_featured featured;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.featured_pager, container, false);
        featured_photo=new ArrayList<>();
        recyclerView=(RecyclerView)view.findViewById(R.id.recycle_feature);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        featured=new adapter_featured(featured_photo,getContext());
        recyclerView.setAdapter(featured);
        requestfeaturedData();
        return view;
    }

    private void requestfeaturedData() {
        final String TAG="requestfeaturedData";
        Call<ArrayList<Collection>> featureddata= ApiService.getInstance().createRetrofit().getcollection("collection",ApiService.apiKey);
        featureddata.enqueue(new Callback<ArrayList<Collection>>() {
            @Override
            public void onResponse(Call<ArrayList<Collection>> call, Response<ArrayList<Collection>> response) {
                Log.e(TAG, "onResponse: " );
                Collection collection_F=new Collection();
                Boolean s=collection_F.isFeatured();
                if (collection_F.equals(true)){
                     List<Collection>item_photo=response.body();
                     featured_photo.addAll(item_photo);
                     featured.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Collection>> call, Throwable t) {
                Log.e(TAG, "onFailure: " );
            }
        });
    }
}

