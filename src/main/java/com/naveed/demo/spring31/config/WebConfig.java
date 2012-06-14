/*
 * Copyright 2002-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.naveed.demo.spring31.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Spring MVC Java-based configuration.
 *
 * <p>Extends directly from WebMvcConfigurationSupport in order to plug in
 * sub-classes of Spring MVC infrastructure components like
 * {@code RequestMappingHandlerMapping}, {@code RequestMappingHandlerAdapter},
 * etc.
 *
 * <p>Typically extending from {@link WebMvcConfigurerAdapter} and adding null {@code
 *
 * @EnableWebMvc} is sufficient.
 *
 */
//@Configuration
@ComponentScan(basePackages = "com.naveed.demo.spring31",
useDefaultFilters = false,
includeFilters =
@ComponentScan.Filter(Controller.class))
public class WebConfig extends WebMvcConfigurationSupport {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
