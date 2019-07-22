package com.example.skyscanner.DependencyInjection;



import com.example.skyscanner.Network.ServiceData;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    private static final String BASE_URL = "https://community-open-weather-map.p.rapidapi.com";

    @Provides
    @Singleton
    ServiceData providesRetrofitInstances(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ServiceData.class);
    }







}

