package com.xza.movie.mapper;

/*
 *  Author: AO
 *  Time: 2019/12/30
 */

import com.xza.movie.model.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    public Admin selectAdmin(String admin_name);
    public Admin selectAdminByadmin_name(String admin_name);
    public int insertAdmin(Admin admin);

}
