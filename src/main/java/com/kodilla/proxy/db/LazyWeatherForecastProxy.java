package com.kodilla.proxy.db;

public class LazyWeatherForecastProxy implements WeatherForecast {

    private WeatherForecastImpl realForecast;

    private void createIfNeeded() throws InterruptedException {
        if (realForecast == null) {
            realForecast = new WeatherForecastImpl();
        }
    }

    @Override
    public String getWeather() throws InterruptedException {
        createIfNeeded();
        return realForecast.getWeather();
    }

    @Override
    public void refreshData() throws InterruptedException {
        createIfNeeded();
        realForecast.refreshData();
    }
}
