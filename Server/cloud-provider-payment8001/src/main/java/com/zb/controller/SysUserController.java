package com.zb.controller;

import com.zb.entity.SysUser;
import com.zb.model.ServiceResponse;
import com.zb.service.impl.SysUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户管理")
public class SysUserController {
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    SysUserServiceImpl sysUserService;

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
}
