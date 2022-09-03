package com.zb.controller;

import com.github.pagehelper.PageInfo;
import com.zb.model.ServiceResponse;
import com.zb.service.impl.SysUserServiceImpl;
import com.zb.vo.SysUserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户管理")
public class SysUserController {

    @Autowired
    SysUserServiceImpl sysUserService;

    @GetMapping("/user/selectUser")
    @ApiOperation(value = "查询用户")
    public ServiceResponse<PageInfo<SysUserVo>> selectUser(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {

        PageInfo<SysUserVo> roles = sysUserService.selectUser(pageNum, pageSize);

        if (roles != null) {
            return ServiceResponse.ok(roles);
        } else {
            return ServiceResponse.error("查询角色失败！！！");
        }

    }
}
