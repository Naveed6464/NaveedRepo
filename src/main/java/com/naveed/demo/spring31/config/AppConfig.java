/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.demo.spring31.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
//import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author naveedur
 */
//@ImportResource( {"classpath*:/rest_config.xml"})
@ComponentScan(basePackages = "com.naveed.demo.spring31", excludeFilters = {
    @ComponentScan.Filter(Controller.class)})
public class AppConfig {
//    @Bean
//    public static PropertyPlaceholderConfigurer properties() {
//        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
//        final Resource[] resources = new ClassPathResource[]{
//            new ClassPathResource("persistence.properties"),
//            new ClassPathResource("restfull.properties")
//        };
//        ppc.setLocations(resources);
//        ppc.setIgnoreUnresolvablePlaceholders(true);
//        return ppc;
//    }
//    @Bean(destroyMethod = "shutdown")
//    public DataSource dataSource(){
//        return new EmbeddedDatabaseBuilder()
//                .setName("bookDB")
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("classpath:book-schema.sql")
//                .build();
//    }
//
//    @Bean
//    public JdbcTemplate jdbcTemplate(){
//        return new JdbcTemplate(dataSource());
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(){
//        return new DataSourceTransactionManager(dataSource());
//    }
}
