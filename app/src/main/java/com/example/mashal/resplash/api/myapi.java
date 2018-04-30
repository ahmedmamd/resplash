package com.example.mashal.resplash.api;


import com.example.mashal.resplash.model.HDphoto;
import com.example.mashal.resplash.model.Links;
import com.example.mashal.resplash.model.colection_photos.Collection;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.OPTIONS;
import retrofit2.http.Query;

/**
 * Created by mashal on 2018-03-18.
 */
public interface myapi {

    @GET("photos")
    Call<List<HDphoto>> getphoto(@Query("page")String page,@Query("clintid")String clintid );

    @GET("collections")
    Call< ArrayList<Collection>>getcollection(@Query("per_page") String pages, @Query("clintid") String clintid);

}


