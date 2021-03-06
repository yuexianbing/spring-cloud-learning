package com.ybin.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ybin.provider.api.consumer.ProviderApi;
import com.ybin.provider.api.consumer.domain.ConsumerBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @Describe:
 * @Author: bing.yue
 */
@RequestMapping(value = "/consumer")
@Controller
public class Consumer {

    private static final int COUNT = 15;

    @Value("${test_value}")
    private String testEvn;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProviderApi providerApi;

    @HystrixCommand(fallbackMethod = "testHystrix")
    @RequestMapping(value = "/get/{a}", method = RequestMethod.GET)
    public String test(@PathVariable("a") int a) {
        for (int i = 0; i < COUNT; i++) {

            HttpHeaders headers = new HttpHeaders();
            MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers.setContentType(type);
            JSONObject jsonObject = restTemplate.getForObject("http://CLOUD-SERVICE/get-provider/" + i, JSONObject.class);
            ConsumerBo consumer = jsonObject.toJavaObject(ConsumerBo.class);
            System.out.println(String.format("次数 = [%s], 查询到的数据 = [%s]", i, consumer.toString()));
        }
        return "xxxxxx";
    }

    @RequestMapping(value = "/test-feign-client", method = RequestMethod.GET)
    public void testFenClient() {
        for (int i = 0; i < COUNT; i++) {
            ConsumerBo consumerBo = providerApi.getProvider(i+"");
            System.out.println(String.format("次数 = [%s], 查询到的数据 = [%s]", i, consumerBo.toString()));
        }
    }

    public String testHystrix(int a) {
        return "service is not use, parameter:" + a;
    }

    @RequestMapping(value = "/test-get-testEvn")
    public void testGetTestEvn() {
        System.out.println("从spring-cloud-config获取的配置:" + this.testEvn);
    }

    @RequestMapping(value = "/query-order", method = RequestMethod.GET)
    public ConsumerBo queryCashierRefundOrder(@RequestBody ConsumerBo consumerBo) {
        System.out.println("==========" + consumerBo.toString());
        return null;
    }
}
