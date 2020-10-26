package com.ybq.mybatis;

import com.ybq.mybatis.entity.Cate;
import com.ybq.mybatis.entity.Product;
import com.ybq.mybatis.mapper.CateMapper;
import com.ybq.mybatis.mapper.ProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.math.BigDecimal;
import java.util.List;

public class TestMain2 {
    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(TestMain2.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(false);
        CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        try {
            //插入
            /*Cate cate = new Cate();
            cate.setName("华为手机");
            cateMapper.insert(cate);
            for (int i = 0; i < 2; i++) {
                Product product = new Product();
                product.setCateId(cate.getCateId());
                product.setContent("aaa"+i);
                product.setImg("/img/phone/"+i+".png");
                product.setTitle("i"+i);
                product.setPrice(new BigDecimal("999.00"));
                productMapper.insert(product);
            }*/

            //查询
            List<Cate> cates = cateMapper.selectList();
            cates.forEach(cate -> {
                List<Product> products = productMapper.selectListById(cate.getCateId());
                cate.setProducts(products);
            });
            System.out.println(cates);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }

    }
}
