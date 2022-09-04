package com.zb.controller;

import com.netflix.discovery.DiscoveryClient;
import com.zb.entity.SysUser;
import com.zb.model.ServiceResponse;
import com.zb.service.impl.SysUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户管理")
@Slf4j
public class SysUserController {
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    SysUserServiceImpl sysUserService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/selectUser")
    @ApiOperation(value = "查询用户")
    public ServiceResponse<List<SysUser>> selectUser() {

        List<SysUser> roles = sysUserService.selectUser();

        if (roles != null) {
            return ServiceResponse.ok(roles);
        } else {
            return ServiceResponse.error("查询角色失败！！！");
        }

    }
    //服务发现
//    @GetMapping("/payment/discovery")
//    public Object discovery(){
//        //所有服务
//        List<String> services = discoveryClient.getServices();
//        for (String element : services){
//            log.info("+++++++element:"+ element);
//        }
//        //一个服务下的所有实例
//        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
//        return this.discoveryClient;
//    }



}
