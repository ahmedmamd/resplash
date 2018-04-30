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
import com.example.mashal.resplash.model.HDphoto;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.mashal.resplash.R.*;

/**
 * Created by mashal on 2018-04-18.
 */
public class NEW extends Fragment {
    RecyclerView recyclerView;
    ArrayList<HDphoto> photo;
    adapter_new HDPHOTO;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
             View view= inflater.inflate(R.layout.new_pager, container, false);
             photo=new ArrayList<>();
             recyclerView=(RecyclerView)view.findViewById(id.recycle_new);
             recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
             HDPHOTO=new adapter_new(photo,getContext());
             recyclerView.setAdapter(HDPHOTO);
             requestData();
        return view;

    }

    private void requestData() {
        final String TAG="requestdata";
        Call<List<HDphoto>> call =  ApiService.getInstance().createRetrofit().getphoto("photo",ApiService.apiKey);
        call.enqueue(new Callback<List<HDphoto>>() {
            @Override
            public void onResponse(Call<List<HDphoto>> call, Response<List<HDphoto>> response) {
                String resposedata=String.valueOf(response.body());
//                Log.e(TAG, "onResponse: " );
                if (resposedata.equalsIgnoreCase("ok")){
                List<HDphoto>photolist=response.body();
                    photo.addAll(photolist);
                   Log.e(TAG,String.valueOf( photolist) );
            }}

            @Override
            public void onFailure(Call<List<HDphoto>> call, Throwable t) {

            }
        });






//        call.enqueue(new Callback<ArrayList<HDphoto>>() {
////
//            @Override
//            public void onResponse(Call<ArrayList<HDphoto>> call, Response<ArrayList<HDphoto>> response) {
////                Log.e(TAG, "true" );
//
////                Links d1=new Links();
////                String result =d1.getPhotos() ;
////
////                Toast.makeText(getContext(),result ,Toast.LENGTH_SHORT).show();
////             String result1 = String.valueOf(response.body().getUrls());
////               if (result.equalsIgnoreCase("ok")){
//                HDphoto links =  response.body().get(10);
//                photo.addAll((Collection<? extends Urls>) links);
//                HDPHOTO.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<HDphoto>> call, Throwable t) {
//
//            }});



//            @Override
//            public void onFailure(Call<HDphoto> call, Throwable t) {
//             Urls hDphoto = new Urls();
//                String x=String.valueOf(hDphoto.getRaw()) ;
//                 Log.e(TAG, "onFailure: failier" );
//                Toast.makeText(getContext(),x ,Toast.LENGTH_SHORT).show();
//            }});


        }}
