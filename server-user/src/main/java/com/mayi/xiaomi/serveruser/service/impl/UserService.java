package com.mayi.xiaomi.serveruser.service.impl;

import com.mayi.xiaomi.serveruser.dao.UserMapper;
import com.mayi.xiaomi.serveruser.entity.UserEntity;
import com.mayi.xiaomi.serveruser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    UserMapper userMapper;

    public UserEntity findUserById(Long id){
        return userMapper.findUserById(id);
    }
}
