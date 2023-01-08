package com.duclv.backend.web.web.config;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChannelConfig {

    @Bean
    public Channel initialChannel() {
        return ManagedChannelBuilder
                .forAddress("localhost", 5555)
                .usePlaintext()
                .build();
    }

}
