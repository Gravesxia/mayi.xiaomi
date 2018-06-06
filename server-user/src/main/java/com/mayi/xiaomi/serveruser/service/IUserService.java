package com.mayi.xiaomi.serveruser.service;

import com.mayi.xiaomi.serveruser.entity.UserEntity;

public interface IUserService {
    UserEntity findUserById(Long id);
}
