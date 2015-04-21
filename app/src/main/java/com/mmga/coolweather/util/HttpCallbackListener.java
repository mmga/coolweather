package com.mmga.coolweather.util;

/**
 * Created by mmga on 2015/4/8.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
