package com.mayi.xiaomi.serveruser.dao;

import com.mayi.xiaomi.serveruser.entity.UserEntity;

public interface UserMapper {
    UserEntity findUserById(Long id);
}
