package com.itchain.samplemsa.samplemsa.config;

import com.itchain.samplemsa.samplemsa.common.AggregateRepository;
import com.itchain.samplemsa.samplemsa.common.EventRepositoryImpl;
import com.itchain.samplemsa.samplemsa.delivery.DeliveryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestAppContext {
    private EventRepositoryImpl eventRepository = new EventRepositoryImpl();

    @Bean
    public AggregateRepository aggregateRepository() {

        return new AggregateRepository(eventRepository);
    }

    @Bean
    public DeliveryRepository deliveryRepository() {
        return new DeliveryRepository(eventRepository);
    }
}
