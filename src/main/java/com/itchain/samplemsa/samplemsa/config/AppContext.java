package com.itchain.samplemsa.samplemsa.config;

import com.itchain.samplemsa.samplemsa.common.AggregateRepository;
import com.itchain.samplemsa.samplemsa.common.EventRepositoryImpl;
import com.itchain.samplemsa.samplemsa.eventstore.EventStorageService;
import org.aspectj.weaver.ast.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import({TestAppContext.class, ProductionContext.class})
public class AppContext {

}
