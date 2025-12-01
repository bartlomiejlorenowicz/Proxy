package com.kodilla.proxy.db;

import java.util.Random;

public class WeatherApp {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            WeatherForecast forecast = new LazyWeatherForecastProxy();

            if (random.nextInt(100) < 20) {
                forecast.refreshData();
            }

            System.out.println(forecast.getWeather());
            System.out.println("Execution #" + i + " done");
        }

        long end = System.currentTimeMillis();
        System.out.println("Execution took: " + (end - begin) + " ms");
    }
}
