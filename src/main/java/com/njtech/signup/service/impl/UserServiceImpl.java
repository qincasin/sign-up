package com.njtech.signup.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.njtech.signup.dao.bean.UserBean;
import com.njtech.signup.dao.bean.UserDTO;
import com.njtech.signup.dao.mapper.UserMapper;
import com.njtech.signup.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author casin
 * @create 2018-09-05 20:04
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Boolean insertUser(UserBean userBean) {
        return this.userMapper.insertUser(userBean)>0;
    }

    @Override
    public PageInfo<UserDTO> userList(Integer pageSize,Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserDTO> userDTOS = this.userMapper.listUser();
        return new PageInfo<>(userDTOS);
    }
}
