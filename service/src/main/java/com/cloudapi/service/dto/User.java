package com.cloudapi.service.dto;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author Jogen
 * @date 2019/3/17
 */
public class User extends AbstractRequestParam {
    @NotBlank
    @Size(min = 2, message = "您的名字必须有两个字以上")
    private String name;
    private String AccountNo;
    private String id;

    private Date registerDateTime;

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
