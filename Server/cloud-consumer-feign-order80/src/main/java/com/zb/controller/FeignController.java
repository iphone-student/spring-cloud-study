package com.zb.controller;

import com.zb.config.ServiceResponse;
import com.zb.entity.SysUser;
import com.zb.service.PaymentFeignService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/selectUser")
    @ApiOperation(value = "查询用户")
    public List<SysUser> selectConsumerUser() {
        return paymentFeignService.selectUser();
    }
}
