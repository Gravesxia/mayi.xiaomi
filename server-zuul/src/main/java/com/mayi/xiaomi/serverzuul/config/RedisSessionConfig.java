package com.mayi.xiaomi.serverzuul.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800,redisNamespace = "xiaomi")
public class RedisSessionConfig {
}
