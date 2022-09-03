package com.zb.mapper;

import com.zb.vo.SysUserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 10727
 * @description 针对表【sys_user】的数据库操作Mapper
 * @createDate 2022-09-03 13:05:42
 * @Entity com.zb.entity.SysUser
 */
@Mapper
public interface SysUserMapper {

    List<SysUserVo> selectList();
}




