package com.ybin.provider.api.consumer;

import com.ybin.provider.api.consumer.domain.ConsumerBo;
import com.ybin.provider.api.consumer.hystrix.HystrixFallBackApiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @Describe:
 * @Author: bing.yue
 */
@FeignClient(value = "cloud-service", fallback = HystrixFallBackApiImpl.class)
public interface ProviderApi {

    /**
     * 提供者接口
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/get-provider/{id}")
    ConsumerBo getProvider(@PathVariable("id") String id);


}
