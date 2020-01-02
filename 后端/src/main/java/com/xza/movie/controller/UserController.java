package com.xza.movie.controller;


import com.xza.movie.model.Admin;
import com.xza.movie.model.UserModel;
import com.xza.movie.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *  Author: AO
 *  Time: 2019/12/10

 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/register")
    public JSONObject register(@RequestBody UserModel user){
        JSONObject result = new JSONObject();
        //调用service层
        int i = userService.register(user);
        result.put("state", 1);
        return result;
    }
    @RequestMapping("/login")
    public JSONObject login(@RequestBody UserModel user){
        JSONObject result = new JSONObject();
        UserModel i = userService.UserLogin(user);
        result.put("state",1);
        return result;
    }

    @RequestMapping("/getList")
    public List<UserModel> getList(){
        return userService.getUserList();
    }
}
