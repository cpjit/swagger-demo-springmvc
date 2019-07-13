package com.cpjit.swagger4j.demo.springmvc;

import com.cpjit.swagger4j.SwaggerFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * @author yonghuan
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public FilterRegistrationBean swaggerFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        SwaggerFilter filter = new SwaggerFilter();
        bean.setFilter(filter);
        bean.setUrlPatterns(Collections.singletonList("/api/*"));
        return bean;
    }
}
