package com.example.myproject.NetWork;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
        public static String BASE_URL ="https://simpleapp-nodejs.herokuapp.com/";
        private static Retrofit retrofit;
        public static Retrofit getClient(){
            if(retrofit == null){
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }


