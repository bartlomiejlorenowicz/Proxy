package com.kodilla.proxy.db;

public class WeatherForecastImpl implements WeatherForecast {

    private String weatherDescription;

    public WeatherForecastImpl() throws InterruptedException {
        refreshData();
    }

    @Override
    public String getWeather() {
        return weatherDescription;
    }

    @Override
    public void refreshData() throws InterruptedException {
        System.out.println("Refreshing weather... (5 seconds)");
        Thread.sleep(5000);
        weatherDescription = "Sunny, 20°C";
    }
}
