package com.zb.vo;

import lombok.Data;

import java.util.Date;

@Data
public class SysUserVo {
    /**
     *
     */
    
    private Long id;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String nickName;

    /**
     *
     */
    private String headImgUrl;

    /**
     *
     */
    private String phone;

    /**
     *
     */
    private Integer sex;

    /**
     *
     */
    private Integer enabled;

    /**
     *
     */
    private String type;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

}
