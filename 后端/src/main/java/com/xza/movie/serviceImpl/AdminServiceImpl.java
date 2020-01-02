package com.xza.movie.serviceImpl;

import com.xza.movie.mapper.AdminMapper;
import com.xza.movie.model.Admin;
import com.xza.movie.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin adminLogin(Admin admin) {
        Admin result = adminMapper.selectAdmin(admin.getAdmin_name());
        return result;
    }

    @Override
    public int addAdmin(Admin admin) {
        Admin A1 = adminMapper.selectAdminByadmin_name(admin.getAdmin_name());
        int i = -1;
        if (A1 == null){
            i = adminMapper.insertAdmin(admin);
        }else {
            i = 2;
        }
        return i;
    }


}
