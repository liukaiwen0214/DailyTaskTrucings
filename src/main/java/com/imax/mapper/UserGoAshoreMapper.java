package com.imax.mapper;

import com.imax.pojo.StudentInfoTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGoAshoreMapper {
    Integer UserLoginMapper(@Param("uid") String uid, @Param("pwd") String pwd);
}
