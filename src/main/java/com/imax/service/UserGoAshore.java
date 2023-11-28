package com.imax.service;

import com.imax.pojo.UserTablePojo;

import java.io.IOException;

/**
 * @author liukaiwen
 * @date 2023/11/21
 * 普通用户的登陆，注册，注销方法
 *
 *
 */
public interface UserGoAshore {
    /**
     * @return {@link Boolean}
     * 普通用户登陆方法,返回值为Boolean,登陆成功
     *
     */
    public boolean UserLogin(String uid,String pwd) throws IOException;

    /**
     * @return {@link UserTablePojo}
     * 普通用户注册方法,返回一个用户类型,增加到数据库
     */
    public UserTablePojo UserRegistration();

    /**
     * @return {@link Boolean}
     * 普通用户注销方法,返回值为Boolean,删除成功
     */
    public Boolean UserDelete();
}
