package com.easy.controller;

import com.alibaba.fastjson.JSON;
import com.easy.bean.Reply;
import com.easy.bean.User;
import com.easy.mapper.UserMapper;
import com.easy.support.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by j on 2019/4/9.
 */
@RestController
public class UserController {
    @Autowired
    Redis redis;
    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public Reply login(@RequestBody User user){
        if (redis.hasKey(user.getUsername()) && redis.get(user.getUsername()).equals(user.getPassword()))
            return Reply.success();
        User data = userMapper.findUserByUsername(user);
        if (data != null && data.getPassword().equals(user.getPassword())) {
            redis.set(user.getUsername(), user.getPassword(), 3600);
            return Reply.success();
        } else if(data==null){
            return Reply.error("用户名不存在");
        }
            return Reply.error("密码不正确");
    }
}
