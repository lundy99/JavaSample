package com.spring.sample.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.fw.sample.java.utils.LogUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @ServletComponentScan({"com.sap.cloud.sdk", "com.spring.sample.java", "com.fw.sample.java"})
@SpringBootApplication(scanBasePackages = {"com.sap.cloud", "com.spring.sample.java", "com.fw.sample.java"})
public class Application extends SpringBootServletInitializer
{
    @Autowired
    private LogUtils log;
    @Override
    protected SpringApplicationBuilder configure( final SpringApplicationBuilder application )
    {
        return application.sources(Application.class);
    }

    public static void main( final String[] args )
    {
        // スキャンされているbeanを出力する
        AnnotationConfigApplicationContext     applicationContext =
          new AnnotationConfigApplicationContext(Application.class);

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
        SpringApplication.run(Application.class, args);
    }
}
