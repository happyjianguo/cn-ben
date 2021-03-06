package com.cn.ben.api.cms.model.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserRole implements Serializable {
    private String id;

    private String sysUserId;

    private String roleId;

    private Date createTime;

    private Date updateTime;
}