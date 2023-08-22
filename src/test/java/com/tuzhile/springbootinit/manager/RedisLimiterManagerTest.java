package com.tuzhile.springbootinit.manager;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@Slf4j
@SpringBootTest
class RedisLimiterManagerTest {

    @Resource
    private RedisLimiterManager redisLimiterManager;
    @Test
    void doRateLimit() throws InterruptedException {
        String  id = "1";
        for (int i = 0; i < 2; i++) {
            redisLimiterManager.doRateLimit(id);
            log.info("限流之前");
        }
        Thread.sleep(1000);
        for (int i = 0; i < 50; i++) {
            redisLimiterManager.doRateLimit(id);
            log.info("操作成功");
        }
    }
}