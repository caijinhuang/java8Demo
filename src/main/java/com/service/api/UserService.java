/*
 * @(#) UserService
 * <br> Copyright:  Copyright (c) 2017
 * <br> @author caijinhuang
 * <br> 2017-10-29 15:50:43
 */

package com.service.api;

import java.util.List;

import com.domain.UserEntity;

public interface UserService {
    public UserEntity getUserInfo(int id);
    public List<UserEntity> getUserAll();
    public void insertUser(UserEntity userEntity);
}
