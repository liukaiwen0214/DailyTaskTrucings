package com.imax.service;

import com.imax.pojo.UserTablePojo;

import java.util.ArrayList;

/**
 * @author admin
 * @date 2023/11/21
 * 超级管理员接口,可实现
 * 登陆
 * 注销
 * 新增普通用户
 * 删除普通用户
 * 新增普通管理员
 * 删除普通管理员
 * 查看名下的管理用户?
 *
 */

public interface SuperAdministratorTable {
    /**
     * @return {@link Boolean}
     * 普通管理员登陆
     */
    public Boolean OrdinaryAdministratorLogin();

    /**
     * @return {@link Boolean}
     * 普通管理员注销
     */
    public Boolean OrdinaryAdministratorDelete();

    /**
     * @return {@link UserTablePojo}
     * 普通用户增加
     */
    public UserTablePojo UserRegistration();

    /**
     * @return {@link Boolean}
     * 普通用户删除
     */
    public Boolean UserDelete();

    /**
     * @return {@link UserTablePojo}
     * 管理员用户增加
     */
    public UserTablePojo AdminRegistration();

    /**
     * @return {@link Boolean}
     * 管理员用户删除
     */
    public Boolean AdminDelete();

    /**
     * @return {@link ArrayList}<{@link UserTablePojo}>
     * 查看名下所有用户信息
     */
    public ArrayList<UserTablePojo> SelectUserMe();

}
