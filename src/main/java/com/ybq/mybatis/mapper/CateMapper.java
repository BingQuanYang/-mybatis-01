package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.Cate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CateMapper {
    int insert(@Param("cate")Cate cate);
    List<Cate> selectList();
}
