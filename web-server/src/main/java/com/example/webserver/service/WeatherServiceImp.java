package com.example.webserver.service;


import org.springframework.stereotype.Service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@Service
@WebService(serviceName = "WeatherService", portName = "WeatherPort", name = "WeatherInterface",targetNamespace = "http://w.service.com")
public class WeatherServiceImp implements WeatherInterface {
    @Override
    @WebResult(name = "WeatherInfo")
    public String findWeather(@WebParam String cityName) {
        System.out.println("获取城市名" + cityName);
        String weather = "暴雨";
        return weather;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:12345/weather", new WeatherServiceImp());
    }
}
