package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.Test1;
import org.apache.ibatis.annotations.Param;

public interface TestInsertMapper {
    int insert(@Param("test") Test1 test);
}
