package com.jzs.getway;

import com.jzs.getway.filter.SimpleFilter;
import com.jzs.getway.filter.UserAgentFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableZuulProxy
@EnableFeignClients
public class GateWayApplication {

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }

    @Bean
    public UserAgentFilter userAgentFilter(){
        return new UserAgentFilter();
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(ProtobufHttpMessageConverter hmc) {
//            RestTemplate  r = new RestTemplate();
//            r.getMessageConverters().add(hmc);
//            return r;
            return new RestTemplate(Arrays.asList(hmc));
        }

//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

//    @Configuration
//    public static class RestClientConfiguration {
//
//        @Bean
//        RestTemplate restTemplate(ProtobufHttpMessageConverter hmc) {
////            RestTemplate  r = new RestTemplate();
////            r.getMessageConverters().add(hmc);
////            return r;
//            return new RestTemplate(Arrays.asList(hmc));
//        }
//
//        @Bean
//        ProtobufHttpMessageConverter protobufHttpMessageConverter() {
//            return new ProtobufHttpMessageConverter();
//        }
//
//        @Bean
//        GsonHttpMessageConverter gsonHttpMessageConverter() {
//            return new GsonHttpMessageConverter();
//        }
//    }

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }


    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
