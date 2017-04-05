package com.leiyu.feijitang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wh on 2017/4/3.
 */
@Configuration
public class MvcConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
        configurer.setUseSuffixPatternMatch(false);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("index.html");
        registry.addViewController("/index").setViewName("index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
