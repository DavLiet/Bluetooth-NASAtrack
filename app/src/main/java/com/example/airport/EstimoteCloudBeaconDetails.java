package com.example.airport;

/**
 * Created by David Lie-Tjauw on 7/14/2017.
 */

import com.estimote.sdk.cloud.model.Color;

public class EstimoteCloudBeaconDetails {

    private String beaconName;
    private Color beaconColor;

    public EstimoteCloudBeaconDetails(String beaconName, Color beaconColor) {
        this.beaconName = beaconName;
        this.beaconColor = beaconColor;
    }

    public String getBeaconName() {
        return beaconName;
    }

    public Color getBeaconColor() {
        return beaconColor;
    }

    @Override
    public String toString() {
        return "[beaconName: " + getBeaconName() + ", beaconColor: " + getBeaconColor() + "]";
    }
}

