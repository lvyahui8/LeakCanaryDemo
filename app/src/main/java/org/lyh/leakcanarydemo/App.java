package org.lyh.leakcanarydemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * @author lvyahui (lvyahui8@gmail.com,lvyahui8@126.com)
 * @since 2016/9/4 14:57
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
