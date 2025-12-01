package com.kodilla.proxy.db;

public interface WeatherForecast {

    String getWeather() throws InterruptedException;
    void refreshData() throws InterruptedException;
}
