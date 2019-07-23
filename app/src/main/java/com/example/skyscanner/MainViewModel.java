package com.example.skyscanner;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.example.skyscanner.Model.Example;
import com.example.skyscanner.Network.ServiceManager;

import javax.inject.Inject;
import dagger.Module;
import static android.content.ContentValues.TAG;
public class MainViewModel implements LifecycleObserver {
    ServiceManager serviceManager;
    ItemViewModel itemViewModel;
    public MainViewModel(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }
    @Inject
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void getData(){
        getSkyScannerData();
    }
    private void getSkyScannerData() {
        serviceManager.getQuotes().subscribe(this::onBindViews,this::failure);
    }
    private void failure(Throwable throwable) {
        Log.d(TAG, "failure:");
    }
    private void onBindViews(Example example) {
        itemViewModel.setOrigin(example.getPlaces().get(0).getCountryName());
        itemViewModel.setDestination(example.getPlaces().get(0).getCountryName());
    }
}


