package com.yupi.springbootinit.config;

import lombok.Data;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author xulongfei
 * @date 2023/8/18 16:35
 */
@Configuration
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedissonConfig {


    private Integer database;

    private String host;

    private Integer port;

    private Integer timeout;

    private String password;

    @Bean
    public RedissonClient redissonClient() {
        // 1. Create config object
        Config config = new Config();
//        config.useSingleServer()
//                .setAddress("redis://47.120.15.216:11021")
//                .setPassword("123456")
//                .setDatabase(9);
        config.useSingleServer()
                .setTimeout(timeout)
                .setAddress("redis://" + host + ":" + port)
                .setPassword(password)
                .setDatabase(database);
        RedissonClient redisson = Redisson.create(config);
        return redisson;
    }
}
