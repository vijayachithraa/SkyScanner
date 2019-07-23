package com.example.skyscanner.Network;

import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {
    private static final String BASIC_URL = "https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices";
    @Provides
    public ServiceData getRetrofitUtil(){
        return new Retrofit.Builder()
                .baseUrl(BASIC_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ServiceData.class);
    }
}
