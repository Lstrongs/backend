package com.xza.movie.controller;

import com.xza.movie.model.Admin;
import com.xza.movie.service.AdminService;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("/login")
    public JSONObject login(Admin admin){
        JSONObject result = new JSONObject();
        Admin i = adminService.adminLogin(admin);
        result.put("state", 1);
        return result;
    }
    @RequestMapping("/addAdmin")
    public JSONObject add(@RequestBody Admin admin){
        JSONObject result = new JSONObject();
        int i = adminService.addAdmin(admin);
        result.put("state",1);
        return result;
    }
}
