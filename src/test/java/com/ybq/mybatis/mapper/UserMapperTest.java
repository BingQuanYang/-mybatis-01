package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserMapperTest {
    SqlSession sqlSession;
    UserMapper mapper;
    @Before
    public void before(){
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(UserMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        sqlSession = factory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        int insert = mapper.insert(user);
        System.out.println(insert);
    }
    @Test
    public void selectByUserId(){
        User user = mapper.selectByUserId(3);
        System.out.println(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setPassword("admin");
        user.setUserId(3);
        System.out.println(mapper.update(user));
    }
}
