package com.xza.movie.mapper;

/*
 *  Author: AO
 *  Time: 2019/12/24
 */

import com.xza.movie.model.Admin;
import com.xza.movie.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    public UserModel selectUserByUsername(String username);
    public int insertUser(UserModel user);
    public UserModel selectUserForLogin(String username);
    public List<UserModel> selectAllUsers();
}
