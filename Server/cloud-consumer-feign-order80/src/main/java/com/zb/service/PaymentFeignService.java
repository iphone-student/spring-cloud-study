package com.zb.service;

import com.zb.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.List;
//掉那个服务就写那个服务名称
@FeignClient("CLOUD-PAYMENT-SERVICE")
@Component
public interface PaymentFeignService {

    List<SysUser> selectUser();
}
