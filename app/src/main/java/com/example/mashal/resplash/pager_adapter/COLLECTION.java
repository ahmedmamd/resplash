package com.example.mashal.resplash.pager_adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mashal.resplash.R;
import com.example.mashal.resplash.api.ApiService;
import com.example.mashal.resplash.model.Urls;
import com.example.mashal.resplash.model.colection_photos.Collection;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mashal on 2018-04-18.
 */
public class COLLECTION extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Collection> collections_photo;
    adapter_collection collection;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.collection_pager, container, false);
        collections_photo=new ArrayList<>();
        recyclerView=(RecyclerView)view.findViewById(R.id.recycle_collection);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        collection=new adapter_collection(collections_photo,getContext());
        recyclerView.setAdapter(collection);
        requestcollection();
        return view;
    }

    private void requestcollection() {
        Call<ArrayList<Collection>> listCall= ApiService.getInstance().createRetrofit().getcollection("collection",ApiService.apiKey);
        listCall.enqueue(new Callback<ArrayList<Collection>>() {
            @Override
            public void onResponse(Call<ArrayList<Collection>> call, Response<ArrayList<Collection>> response) {
                List<Collection>item_photo=response.body();
                collections_photo.addAll(item_photo);
                collection.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ArrayList<Collection>> call, Throwable t) {

            }
        });
    }

}
