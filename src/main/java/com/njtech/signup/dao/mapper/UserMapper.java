package com.njtech.signup.dao.mapper;

import com.njtech.signup.dao.bean.UserBean;
import com.njtech.signup.dao.bean.UserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author casin
 * @create 2018-09-05 20:04
 **/
@Mapper
public interface UserMapper {

    @Insert("INSERT INTO t_user( user_name, sex, class_name, tel, department, interest) VALUES (#{userName}, #{sex}, #{className}, #{tel}, #{department}, #{interest}) ")
    Integer insertUser(UserBean bean);



    @Select("select a.user_name userName,\n" +
            "case when a.sex =1 then '男' else '女' end as sex,\n" +
            "a.class_name className,a.tel,a.interest,b.department from t_user a \n" +
            "left join t_dep b on a.department =b.id ")
    List<UserDTO> listUser();



}
