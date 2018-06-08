package com.mayi.xiaomi.serverhome.feign;

import com.mayi.xiaomi.serverhome.hystric.SchedualUserServerHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient(value = "server-user",fallback = SchedualUserServerHystric.class)
public interface UserServer {
    /**
     * 调用server-user服务的queryUser接口
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/queryUser",method = RequestMethod.GET)
    Map<String,Object> queryUser(@RequestParam(value = "id") Long id);
}
