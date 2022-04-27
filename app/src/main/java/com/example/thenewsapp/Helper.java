package com.example.thenewsapp;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Helper {

    private static final String api = "4qoptW9lhlnibsKahIHiKqeOGAcXwQmycWBqLryN";
    private static final String langauge = "en";

    //"2022-04-09T22:51:15.000000Z" is time when we get data from api
    public static String setTime(String time){
        String format = time.substring(0, 19);
        StringBuilder builder = new StringBuilder(format);
        builder = builder.deleteCharAt(10);     //deleting letter
        builder = builder.insert(10, ' ');
        return builder.toString();
    }

    public static void findNews(String categories, ArrayList<ModelClassNews> modelClassNews, Adapter adapter){

        ApiUtilities.getApiInterface().getCategoriesNews(langauge, 1, categories, api).enqueue(new Callback<TheNews>() {
            @Override
            public void onResponse(@NonNull Call<TheNews> call, @NonNull Response<TheNews> response) {
                if(response.isSuccessful()){
                    if(response.body() != null){
                        modelClassNews.addAll(response.body().getData());
                        adapter.notifyDataSetChanged();
                    }

                }
            }

            @Override
            public void onFailure(@NonNull Call<TheNews> call, Throwable t) {

            }
        });

    }
}
