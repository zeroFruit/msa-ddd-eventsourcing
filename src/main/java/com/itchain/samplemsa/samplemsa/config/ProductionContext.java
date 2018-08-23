package com.itchain.samplemsa.samplemsa.config;

import com.itchain.samplemsa.samplemsa.common.AggregateRepository;
import com.itchain.samplemsa.samplemsa.common.EventRepository;
import com.itchain.samplemsa.samplemsa.delivery.DeliveryRepository;
import com.itchain.samplemsa.samplemsa.eventstore.EventStorageService;
import com.itchain.samplemsa.samplemsa.eventstore.MongodbStore;
import com.itchain.samplemsa.samplemsa.eventstore.domain.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
@ComponentScan(basePackages = "com.itchain.samplemsa.samplemsa.eventstore")
public class ProductionContext {
    @Autowired
    private MongodbStore store;
    @Autowired
    private MongoClient client;
    @Bean
    public AggregateRepository aggregateRepository() {
        EventRepository eventRepository = new EventStorageService(store);
        return new AggregateRepository(eventRepository);
    }

    @Bean
    public DeliveryRepository deliveryRepository() {
        EventRepository eventRepository = new EventStorageService(store);
        return new DeliveryRepository(eventRepository);
    }

    @Bean
    public MongodbStore mongodbStore() {
        return store;
    }

    @Bean
    public EventRepository eventRepository() {
        return new EventStorageService(store);
    }

    @Bean
    public MongoClient mongoClient() {
        return client;
    }
}
