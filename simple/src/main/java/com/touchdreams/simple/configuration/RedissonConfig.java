package com.touchdreams.simple.configuration;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jyh on 2020/5/12.
 */
//@Configuration
public class RedissonConfig {
    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useClusterServers()
                .setScanInterval(2000)
                .addNodeAddress("redis://10.0.29.30:6379", "redis://10.0.29.95:6379")
                .addNodeAddress("redis://10.0.29.205:6379");
        RedissonClient redisson = Redisson.create(config);

        return redisson;
    }
}
