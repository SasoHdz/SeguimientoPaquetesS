package com.itq.seguimientopaquetes.service;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs // Habilita a la clase con la funcionalidad para crear un WS SOAP
@Configuration // Habilita a la clase con la funcionalidad para procesar Beans

public class PaqueteriaWebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "servicioCreacion")
    public Wsdl11Definition servicioCreacionWsdl() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("wsdl/servicioCreacion.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "cliente")
    public XsdSchema clienteSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/cliente.xsd"));
    }

    @Bean(name = "paquete")
    public XsdSchema paqueteSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/paquete.xsd"));
    }

    @Bean(name = "repartidor")
    public XsdSchema repartidorSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/repartidor.xsd"));
    }

    @Bean(name = "ubicacion")
    public XsdSchema ubicacionSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/ubicacion.xsd"));
    }
}
