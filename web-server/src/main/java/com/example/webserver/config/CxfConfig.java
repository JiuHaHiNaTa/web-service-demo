package com.example.webserver.config;

import com.example.webserver.service.WeatherInterface;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    WeatherInterface weatherServiceImp;

    @Bean
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/cxf/*");// 发布服务名称 localhost:8080/cxf

    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    //mdm同步人员部门
    @Bean
    public Endpoint syncEmpOrgImpl(SpringBus bus) {
        EndpointImpl endpoint = new EndpointImpl(bus, weatherServiceImp);// 绑定要发布的服务实现类
        endpoint.publish("/syncEmpOrgImpl"); // 接口访问地址
        return endpoint;
    }

    //hello
    @Bean
    public Endpoint hello(SpringBus bus) {
        EndpointImpl endpoint = new EndpointImpl(bus, weatherServiceImp);// 绑定要发布的服务实现类
        endpoint.publish("/weather"); // 接口访问地址
        return endpoint;
    }

}
