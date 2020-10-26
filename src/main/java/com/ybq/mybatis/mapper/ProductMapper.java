package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int insert(@Param("product")Product product);
    List<Product> selectListById(@Param("cateId")int cateId);
}
