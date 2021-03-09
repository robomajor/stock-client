package com.example.stockclient;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfiguration {

    @Bean
    public WebClientStockClient webClientStockClient(WebClient WebClient) {
        return new WebClientStockClient(WebClient);
    }

    @Bean
    @ConditionalOnMissingBean
    public WebClient webClient() {
        return  WebClient.builder().build();
    }

}
