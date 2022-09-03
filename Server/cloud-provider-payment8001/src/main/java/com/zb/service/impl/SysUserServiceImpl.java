package com.zb.service.impl;

import com.zb.entity.SysUser;
import com.zb.mapper.SysUserMapper;
import com.zb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 10727
 * @description 针对表【sys_user】的数据库操作Service实现
 * @createDate 2022-09-03 13:05:42
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectUser() {

        List<SysUser> users = sysUserMapper.selectList();

        return users;
    }


}




