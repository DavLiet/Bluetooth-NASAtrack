package com.example.airport;

/**
 * Created by David Lie-Tjauw on 7/14/2017.
 */

public interface BeaconContentFactory {

    void getContent(BeaconID beaconID, Callback callback);

    interface Callback {
        void onContentReady(Object content);
    }
}