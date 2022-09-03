package com.zb.service;

import com.zb.entity.SysUser;

import java.util.List;

/**
 * @author 10727
 * @description 针对表【sys_user】的数据库操作Service
 * @createDate 2022-09-03 13:05:42
 */
public interface SysUserService {

    List<SysUser> selectUser();
}
