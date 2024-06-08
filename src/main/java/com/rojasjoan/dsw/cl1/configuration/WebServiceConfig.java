package com.rojasjoan.dsw.cl1.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet,"/ws/*");
    }
    @Bean(name = "obrero")
    public DefaultWsdl11Definition obreroWsdl11Definition(XsdSchema obreroSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ObreroPort");
        wsdl11Definition.setLocationUri("/ws/obrero");
        wsdl11Definition.setTargetNamespace("http://www.joan-rojas.cl1.pe/ws/objects");
        wsdl11Definition.setSchema(obreroSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema obreroSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/obrero.xsd"));
    }

}
