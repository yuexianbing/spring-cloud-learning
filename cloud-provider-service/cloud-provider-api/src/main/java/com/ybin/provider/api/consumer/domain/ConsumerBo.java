package com.ybin.provider.api.consumer.domain;

import lombok.Data;

/**
 * @Describe:
 * @Author: bing.yue
 */
@Data
public class ConsumerBo {

    /**
     * id
     */
    private String id;
    /**
     * 服务名
     */
    private String serverName;
    /**
     * 端口
     */
    private String port;
}
