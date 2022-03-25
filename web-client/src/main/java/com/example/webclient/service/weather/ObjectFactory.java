
package com.example.webclient.service.weather;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service.weather package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindWeatherResponse_QNAME = new QName("http://w.service.com", "findWeatherResponse");
    private final static QName _FindWeather_QNAME = new QName("http://w.service.com", "findWeather");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service.weather
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindWeather }
     * 
     */
    public FindWeather createFindWeather() {
        return new FindWeather();
    }

    /**
     * Create an instance of {@link FindWeatherResponse }
     * 
     */
    public FindWeatherResponse createFindWeatherResponse() {
        return new FindWeatherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://w.service.com", name = "findWeatherResponse")
    public JAXBElement<FindWeatherResponse> createFindWeatherResponse(FindWeatherResponse value) {
        return new JAXBElement<FindWeatherResponse>(_FindWeatherResponse_QNAME, FindWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://w.service.com", name = "findWeather")
    public JAXBElement<FindWeather> createFindWeather(FindWeather value) {
        return new JAXBElement<FindWeather>(_FindWeather_QNAME, FindWeather.class, null, value);
    }

}
