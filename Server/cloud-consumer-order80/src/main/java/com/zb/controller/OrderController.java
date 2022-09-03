package com.zb.controller;


import com.zb.config.ServiceResponse;
import com.zb.entity.SysUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001";//绑定服务名称
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/selectUser")
    @ApiOperation(value = "查询用户")
    public ServiceResponse<List<SysUser>> selectConsumerUser() {
        //远程调用
        return restTemplate.getForObject(PAYMENT_URL + "/user/selectUser", ServiceResponse.class);
    }
}
