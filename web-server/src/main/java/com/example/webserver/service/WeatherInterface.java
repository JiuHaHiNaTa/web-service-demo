package com.example.webserver.service;

import org.springframework.stereotype.Service;

@Service
public interface WeatherInterface {

    public String findWeather(String cityName);
}
