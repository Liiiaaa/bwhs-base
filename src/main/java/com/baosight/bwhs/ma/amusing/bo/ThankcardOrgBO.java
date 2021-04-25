package com.baosight.bwhs.ma.amusing.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * 机构感谢卡bo
 */
@Data
public class ThankcardOrgBO implements Serializable {
    private static final long serialVersionUID = -5750528034401853027L;

    private String guid;

    private String thankcardName;

    private String imgUrl;

    private String orgCode;

    private String hrareaCode;
}
