package com.xza.movie.service;
/*
 *  Author: AO
 *  Time: 2019/12/23
 */


import com.xza.movie.model.Admin;
import com.xza.movie.model.UserModel;

import java.util.List;

public interface UserService {
    public int register(UserModel user);
    public UserModel UserLogin(UserModel user);
    public List<UserModel> getUserList();
}
