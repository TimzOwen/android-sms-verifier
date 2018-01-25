package com.androidstudy.smsverifier;

/**
 * Created by Juma on 1/25/2018.
 */

public interface OnSmsCatchListener<T> {
    void onSmsCatch(String message);
}