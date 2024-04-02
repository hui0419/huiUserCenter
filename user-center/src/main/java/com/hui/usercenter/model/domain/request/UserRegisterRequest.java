package com.hui.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author 王程辉
 * @version 1.0
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 6790314492999717518L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
