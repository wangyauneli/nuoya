package com.nuoya.springdayone.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class ThreadPoolConfig {
    @Bean
    public Executor getExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //线程池维护线程的最少数量
        executor.setCorePoolSize(5);
        //线程池维护线程的最大数量
        executor.setMaxPoolSize(30);
        //缓存队列
        executor.setQueueCapacity(8);
        //对拒绝task的处理策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //允许的空闲时间
        executor.setKeepAliveSeconds(60);
        executor.initialize();
        return executor;
    }
}
