package com.ybin.provider.service.provider.impl;

import com.ybin.provider.api.consumer.ProviderApi;
import com.ybin.provider.api.consumer.domain.ConsumerBo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe:
 * @Author: bing.yue001
 */
@RestController
public class ProviderApiImpl implements ProviderApi {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String serverName;

    @Override
    public ConsumerBo getProvider(@PathVariable("id") String id) {
        ConsumerBo consumer = new ConsumerBo();
        consumer.setId(id);
        consumer.setPort(port);
        consumer.setServerName(serverName);
        return consumer;
    }
}
