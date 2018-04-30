package com.example.mashal.resplash.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mashal on 2018-03-18.
 */
public class ApiService {

        private static String baseUrl = "https://api.unsplash.com";
//        public static final String apiKey = "42b524e3c38fcf0c887e3dd2c383ae1c7f64011566b586d48bc93549632eff46";
        public static final String apiKey = "7e6a661f0bf89d9716578cff2ac3900a2a85091af5cceae320f2e5e9dcf241ca";
        private static ApiService instance = null;

        public static ApiService getInstance(){
            if (instance == null){
                instance = new ApiService();
            }

            return instance;
        }

        private ApiService(){}

        public myapi createRetrofit(){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getclient())
                    .build();

            return retrofit.create(myapi.class);

        }

    private OkHttpClient getclient() {
        return new OkHttpClient().newBuilder().build();
    }
}


