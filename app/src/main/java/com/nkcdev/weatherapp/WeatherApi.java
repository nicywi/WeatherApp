package com.nkcdev.weatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("weather?appid=750515b1e2051f85ca38feeb9ce38973&units=metric")
    Call<OpenWeatherMap> getWeatherWithLocation(@Query("lat") double lat, @Query("lon") double lon);

    @GET("weather?appid=750515b1e2051f85ca38feeb9ce38973&units=metric")
    Call<OpenWeatherMap> getWeatherWithCity(@Query("q") String name);
}
