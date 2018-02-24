/*
 * @(#) UserServiceImpl
 * <br> Copyright:  Copyright (c) 2017
 * <br> @author caijinhuang
 * <br> 2017-10-29 15:50:33
 */

package com.service.imp;

import com.dao.api.UserDao;
import com.domain.UserEntity;
import com.service.api.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public UserEntity getUserInfo(int id) {
        return userDao.getUserInfo(id);
    }

    public List<UserEntity> getUserAll() {
        return null;
    }

    /*@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)*/
    public void insertUser(UserEntity userEntity) {
        for(int i=0;i<10;i++){
            userEntity.setId(111+i);
            userEntity.setUsername("mybatis "+i);
            userDao.insertUser(userEntity);
        }
    }
}
