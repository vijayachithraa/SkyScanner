package com.example.skyscanner.Network;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ServiceManager {

    ServiceManager serviceManager;

    @Inject
    public ServiceManager(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    public Observable<BaseQuotes> getQuotes(String country, String currency, String locale, String originplace, String destinationplace, String outboundpartialdate, String inboundpartialdate) {
        return serviceManager.getQuotes(country, currency, locale, originplace, destinationplace, outboundpartialdate, inboundpartialdate).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}