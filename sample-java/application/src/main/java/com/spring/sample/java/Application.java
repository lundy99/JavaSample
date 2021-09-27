package com.spring.sample.java;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
// import com.mhi.zx0000.utils.LogUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// @ServletComponentScan({"com.sap.cloud.sdk", "com.spring.sample.java", "com.mhi.zx0000"})
@SpringBootApplication(scanBasePackages = {"com.sap", "com.spring.sample.java", "com.mhi.zx0000"})
public class Application extends SpringBootServletInitializer
{
    // @Autowired
    // private LogUtils log;
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure( final SpringApplicationBuilder application )
    {
        return application.sources(Application.class);
    }

    public static void main( final String[] args )
    {
        // スキャンされているbeanを出力する
        logger.info("START:スキャンされているbeanを出力する");
        AnnotationConfigApplicationContext     applicationContext =
          new AnnotationConfigApplicationContext(Application.class);

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            logger.info(beanName);
        }
        applicationContext.close();
         logger.info("END:スキャンされているbeanを出力する");

        SpringApplication.run(Application.class, args);
    }
}
