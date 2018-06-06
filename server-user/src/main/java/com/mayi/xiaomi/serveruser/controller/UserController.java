package com.mayi.xiaomi.serveruser.controller;

import com.mayi.xiaomi.serveruser.entity.UserEntity;
import com.mayi.xiaomi.serveruser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/queryUser",method = RequestMethod.GET)
    public Map<String,Object> queryUser(Long id){
        UserEntity userEntity = userService.findUserById(id);
        Map<String,Object> map = new HashMap<>();
        map.put("user",userEntity);
        return map;
    }
}
