/*
 * @(#) UserDao
 * <br> Copyright:  Copyright (c) 2017
 * <br> @author caijinhuang
 * <br> 2017-10-29 15:49:43
 */

package com.dao.api;

import java.util.List;

import com.domain.UserEntity;

public interface UserDao {
    public UserEntity getUserInfo(int id);
    public List<UserEntity> getUserAll();
    public void insertUser(UserEntity userEntity);
}
