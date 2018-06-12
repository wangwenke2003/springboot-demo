package com.dchealth.cdsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by wangwkc on 2018/5/28.
 */
@SpringBootApplication
public class BootApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(BootApp.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(this.getClass());
        return super.configure(builder);
    }
}
