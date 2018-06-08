package com.mayi.xiaomi.serverhome.hystric;

/**
 * 用户服务添加的断路器
 */

import com.mayi.xiaomi.serverhome.feign.UserServer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Component
public class SchedualUserServerHystric implements UserServer{

    @Override
    public Map<String,Object> queryUser(@RequestParam(value = "id") Long id){
        Map<String,Object> map = new HashMap<>();
        map.put("error","获取用户信息失败");
        return map;
    }
}
