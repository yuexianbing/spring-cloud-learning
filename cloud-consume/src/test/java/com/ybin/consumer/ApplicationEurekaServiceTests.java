//package com.ybin.consumer;
//
//import com.ybin.provider.api.consumer.domain.ConsumerBo;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.RestTemplate;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = ApplicationConsumerService.class)
//public class ApplicationEurekaServiceTests {
//
////    @Autowired
////	private ProviderApi providerApi;
//
//	@Autowired
//	private RestTemplate restTemplate;
//
//	@Test
//	public void contextLoads() {
//		for (int i = 0; i < 20; i++) {
//			ConsumerBo consumer = restTemplate.getForObject("http://CLOUD-SERVICE/get-provider?id=" + i, ConsumerBo.class);
//			System.out.printf(String.format("次数 = [%s], 查询到的数据 = [%s]", i, consumer.toString()));
//		}
//	}
//
//}
//
