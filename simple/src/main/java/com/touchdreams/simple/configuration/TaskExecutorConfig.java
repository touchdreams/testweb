package com.touchdreams.simple.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 线程池的配置
 * Created by jinyh on 2020-8-3.
 */
@EnableAsync
@Configuration
public class TaskExecutorConfig {

    @Bean("asyncTaskExecutor")
    public AsyncTaskExecutor asyncTaskExecutor() {
        ThreadPoolTaskExecutor asyncTaskExecutor = new ThreadPoolTaskExecutor();
        asyncTaskExecutor.setCorePoolSize(10);
        asyncTaskExecutor.setMaxPoolSize(10);
        asyncTaskExecutor.setThreadNamePrefix("async-task-");
        asyncTaskExecutor.setQueueCapacity(1000);
        asyncTaskExecutor.setAllowCoreThreadTimeOut(true);
        asyncTaskExecutor.initialize();
        return asyncTaskExecutor;
    }
}
