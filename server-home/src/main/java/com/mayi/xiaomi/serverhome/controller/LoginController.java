package com.mayi.xiaomi.serverhome.controller;

import com.mayi.xiaomi.serverhome.feign.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/home")
public class LoginController {

    @Autowired
    private UserServer userServer;

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/queryUser",method = RequestMethod.GET)
    public Map<String,Object> queryUser(@RequestParam Long id){
        Map<String,Object> map = userServer.queryUser(id);
        return map;
    }
}
