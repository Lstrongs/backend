package com.xza.movie.serviceImpl;
/*
 *  Author: AO
 *  Time: 2019/12/23
 */


import com.xza.movie.mapper.UserMapper;
import com.xza.movie.model.Admin;
import com.xza.movie.model.UserModel;
        import com.xza.movie.service.UserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper usermapper;

    @Override
    public int register(UserModel user) {
        UserModel u0= usermapper.selectUserByUsername(user.getUsername());
        int i = -1;
        if (u0 == null){
            i = usermapper.insertUser(user);
        }else {
            i = 2;
        }
        return i;
    }
    @Override
    public UserModel UserLogin(UserModel user) {
        UserModel result = usermapper.selectUserForLogin(user.getUsername());
        return  result;
    }

    @Override
    public List<UserModel> getUserList() {
        return usermapper.selectAllUsers();
    }


}
