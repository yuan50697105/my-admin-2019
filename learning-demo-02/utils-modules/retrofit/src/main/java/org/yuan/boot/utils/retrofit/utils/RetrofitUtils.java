package org.yuan.boot.utils.retrofit.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 20:23
 */
public class RetrofitUtils {

    public static Retrofit retrofit() {
        return new Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(JacksonConverterFactory.create()).build();
    }


}