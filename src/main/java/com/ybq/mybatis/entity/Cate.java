package com.ybq.mybatis.entity;

import java.util.Date;
import java.util.List;

public class Cate {
    /**
     * 主键
     */
    private Integer cateId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 0 表示未删除  1 表示删除
     */
    private Integer status;

    private List<Product> products;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Cate{" +
                "cateId=" + cateId +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", status=" + status +
                ", products=" + products +
                '}';
    }
}

