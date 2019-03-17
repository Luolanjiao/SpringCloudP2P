package com.cloudapi.service.dto;

/**
 * @author Jogen
 * @date 2019/3/17
 */
public class User extends AbstractRequestParam{
    private String name;
    private String AccountNo;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
