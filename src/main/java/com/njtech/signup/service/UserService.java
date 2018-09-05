package com.njtech.signup.service;

import com.github.pagehelper.PageInfo;
import com.njtech.signup.dao.bean.UserBean;
import com.njtech.signup.dao.bean.UserDTO;

/**
 * @author casin
 * @create 2018-09-05 20:03
 **/
public interface UserService {

    Boolean insertUser(UserBean userBean);

    PageInfo<UserDTO> userList(Integer pageSize,Integer pageNum);


}
