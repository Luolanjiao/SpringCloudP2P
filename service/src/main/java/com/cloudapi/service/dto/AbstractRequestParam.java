package com.cloudapi.service.dto;

/**
 * @author Jogen
 * @date 2019/3/17
 */
public abstract class AbstractRequestParam {
    public String getRequstNo() {
        return requstNo;
    }

    public void setRequstNo(String requstNo) {
        this.requstNo = requstNo;
    }

    private String requstNo = "";
}
