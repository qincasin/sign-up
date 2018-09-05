package com.njtech.signup.dao.bean;

import lombok.Data;

import java.io.PipedReader;

/**
 * @author casin
 * @create 2018-09-05 20:04
 **/
@Data
public class UserBean {
    private Long id;
    private String userName;
    private int sex;
    private String className;
    private String tel;
    private int department;
    private String interest;
}
