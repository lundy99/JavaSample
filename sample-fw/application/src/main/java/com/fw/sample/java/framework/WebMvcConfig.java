package com.fw.sample.java.framework;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    
    /**
     * CustomHandlerInterceptorをSpringに認識させる
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomHandlerInterceptor())
                .addPathPatterns("/**") // 適用対象のパス(パターン)を指定する
                .excludePathPatterns("/static/**"); // 除外するパス(パターン)を指定する
    }
}