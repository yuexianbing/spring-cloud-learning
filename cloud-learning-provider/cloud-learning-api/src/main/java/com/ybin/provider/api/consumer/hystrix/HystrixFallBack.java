package com.ybin.provider.api.consumer.hystrix;

import com.ybin.provider.api.consumer.ProviderApi;
import com.ybin.provider.api.consumer.domain.ConsumerBo;
import org.springframework.stereotype.Component;

/**
 * @Describe:
 * @Author: bing.yue001
 */
@Component
public class HystrixFallBack implements ProviderApi {

    @Override
    public ConsumerBo getProvider(String id) {
        ConsumerBo consumerBo = new ConsumerBo();
        consumerBo.setServerName("Xxxx");
        return consumerBo;
    }

}
