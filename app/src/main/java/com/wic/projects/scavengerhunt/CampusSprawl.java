package com.wic.projects.scavengerhunt;

import android.app.Application;
import com.estimote.sdk.BeaconManager;
import com.estimote.sdk.Region;

import java.util.UUID;

/**
 * Created by Julianna Rose on 10/24/2015.
 */

public class CampusSprawl extends Application {
    private BeaconManager bm;

    @Override
    public void onCreate() {
        super.onCreate();
        bm = new BeaconManager(getApplicationContext());

        bm.connect(new BeaconManager.ServiceReadyCallback() {
            @Override
            public void onServiceReady() {
                bm.startMonitoring(new Region(
                        "monitored region",
                        UUID.fromString("B9407F30-F5F8-466E-AFF9-25556B57FE6D"),
                        22504, 48827));
            }
        });
    }


    public void showNotifcation(String title, String message){
        Intent notifyIntent = new Intent(rhis, MainActivity.class);
        notifyIntent.setFlags
    }

}
