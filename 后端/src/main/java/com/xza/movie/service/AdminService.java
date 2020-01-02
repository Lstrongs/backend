package com.xza.movie.service;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */

import com.xza.movie.model.Admin;

public interface AdminService {
    public Admin adminLogin(Admin admin);
    public int addAdmin(Admin admin);
}
