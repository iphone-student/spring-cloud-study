package com.zb.service;

import com.github.pagehelper.PageInfo;
import com.zb.vo.SysUserVo;

/**
 * @author 10727
 * @description 针对表【sys_user】的数据库操作Service
 * @createDate 2022-09-03 13:05:42
 */
public interface SysUserService {

    PageInfo<SysUserVo> selectUser(Integer pageNum, Integer pageSize);
}
