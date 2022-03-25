package com.example.webclient;

import com.example.webclient.service.weather.WeatherInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceClient;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class WebclientApplication {

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlDocumentLocation = new URL("http://localhost:12345/weather?wsdl");
        QName serviceName = new QName("http://w.service.com","WeatherService");

        Service service = Service.create(wsdlDocumentLocation,serviceName);

        WeatherInterface weatherInterface = service.getPort(WeatherInterface.class);
        String message = weatherInterface.findWeather("北京");
        System.out.println(message);
//        SpringApplication.run(WebclientApplication.class, args);
    }

}
