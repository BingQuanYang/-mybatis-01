package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert (@Param("user") User user);
    User selectByUserId(@Param("userId") Integer userId);
    int update(@Param("user") User user);
}
