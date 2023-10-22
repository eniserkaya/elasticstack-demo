package com.eniserkaya.elasticstackdemo.binder;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogbackRabbitBinder {

    @Bean
    public TopicExchange logbackRabbitTopic() {
        return new TopicExchange(Exchanges.LOGGER, true, false);
    }

    @Bean
    public Queue logbackRabbitQueue() {
        return QueueBuilder.durable(Queues.LOGGER)
                .build();
    }

    @Bean
    public Binding logbackRabbitBinding() {
        return BindingBuilder.bind(logbackRabbitQueue())
                .to(logbackRabbitTopic())
                .with(RoutingKeys.LOGS);
    }
}

