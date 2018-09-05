package com.njtech.signup.controller;

import com.njtech.signup.dao.bean.Apps;
import com.njtech.signup.dao.bean.UserBean;
import com.njtech.signup.service.UserService;
import com.njtech.signup.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author casin
 * @create 2018-09-05 20:16
 **/
@Slf4j
@Controller
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private UserService userService;
    private static final String BOOK_LIST_PATH_NAME = "userList";
    private static final String BOOK_FORM_PATH_NAME = "bookForm";


    @GetMapping("/index")
    public String index(){
        return BOOK_FORM_PATH_NAME;
    }

    @GetMapping("/userList")
    public String userList3(ModelMap map){
        Apps apps= new Apps();
        map.addAttribute("userList",userService.userList(apps.getPageSize(),apps.getPageNum()));
        return "userList";
    }

    @PostMapping("/insert")
    public String insertUser2(@ModelAttribute UserBean userBean,ModelMap map){
        log.info("userBean =>{}",userBean);
        userService.insertUser(userBean);
        Apps apps= new Apps();
        map.addAttribute("userList",userService.userList(apps.getPageSize(),apps.getPageNum()));
        return BOOK_LIST_PATH_NAME;
    }

    @PostMapping("/insert-user")
    public JsonResult insertUser(@RequestBody UserBean userBean){
        log.info("userBean =>{}",userBean);
        try{
            return new JsonResult(1,userService.insertUser(userBean));
        }catch  (Exception e){
            e.printStackTrace();
        }
        return null;
    }


//    @PostMapping("/list")
    public JsonResult userList(@RequestBody Apps apps){
        try{
            return new JsonResult(1,userService.userList(apps.getPageSize(),apps.getPageNum()));
        }catch  (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/list")
    public String userList2(ModelMap map){
        Apps apps= new Apps();
        map.addAttribute("userList",userService.userList(apps.getPageSize(),apps.getPageNum()));
        return BOOK_LIST_PATH_NAME;
    }




}
