package com.example.thenewsapp;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL = " https://api.thenewsapi.com/";
//    @GET("v1/news/all")
//    Call<TheNews> getNews(
//            @Query("language") String language,
//            @Query("page") int page,
//            @Query("api_token") String key
//    );

    @GET("v1/news/all")
    Call<TheNews> getCategoriesNews(
            @Query("language") String language,
            @Query("page") int page,
            @Query("categories") String categories,
            @Query("api_token") String key
    );

}
