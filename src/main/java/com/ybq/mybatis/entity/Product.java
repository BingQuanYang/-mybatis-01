package com.ybq.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    /**
     * 主键
     */
    private Integer productId;

    /**
     * 商品的标题
     */
    private String title;

    /**
     * 详细信息
     */
    private String content;

    /**
     * 商品的图片
     */
    private String img;

    /**
     * 商品的价格
     */
    private BigDecimal price;

    /**
     *
     */
    private Integer cateId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 0 表示未删除  1 表示删除
     */
    private Integer status;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", cateId=" + cateId +
                ", createDate=" + createDate +
                ", status=" + status +
                '}';
    }
}

