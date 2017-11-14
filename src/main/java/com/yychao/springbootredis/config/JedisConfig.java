package com.yychao.springbootredis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

//<bean id="jedisPool" class="redis.clients.jedis.JedisPool">
//<constructor-arg name="host" value="192.168.0.110"/>
//<constructor-arg name="port" value="6379"/>
//</bean>
//<!-- 连接redis单机版 -->
//<bean id="jedisClientPool" class="com.yychao.redis.impl.JedisClientPool">
//<property name="jedisPool" ref="jedisPool"/>
//</bean>
@Configuration
public class JedisConfig {
    //将Jedis注入spring容器
    @Bean
    public JedisPool getJedisPool(){
        //局域网内redis的IP 和 端口号
        JedisPool jedisPool = new JedisPool("192.168.0.110",6379);
        return jedisPool;
    }

}
