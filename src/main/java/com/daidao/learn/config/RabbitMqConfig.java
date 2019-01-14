package com.daidao.learn.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 队列配置，队列的名称，发送者和接受者的名称必须一致，否则接收不到消息
 */
@Configuration
public class RabbitMqConfig {
    @Bean
    public Queue Queue1() {
        return new Queue("lyhTest1");
    }
}

