package com.easy.mapper;

import com.easy.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by j on 2019/4/9.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    User findUserByUsername(User user);
}
