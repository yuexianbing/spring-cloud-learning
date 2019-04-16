package com.ybin.provider.api.consumer.hystrix;

import com.ybin.provider.api.consumer.ProviderApi;
import com.ybin.provider.api.consumer.domain.ConsumerBo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Describe:
 * @Author: bing.yue
 */
@Component
public class HystrixFallBackApiImpl implements ProviderApi {

    @Override
    public ConsumerBo getProvider(String id) {
        ConsumerBo consumerBo = new ConsumerBo();
        consumerBo.setServerName("Xxxx");
        return consumerBo;
    }

}
