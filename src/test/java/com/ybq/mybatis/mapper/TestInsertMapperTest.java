package com.ybq.mybatis.mapper;

import com.ybq.mybatis.entity.Test1;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestInsertMapperTest {
    SqlSession sqlSession;
    TestInsertMapper mapper;

    @Before
    public void before() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(UserMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        sqlSession = factory.openSession(true);
        mapper = sqlSession.getMapper(TestInsertMapper.class);
    }

    @After
    public void after() {
        sqlSession.close();
    }

    @Test
    public void insert() {
        Test1 test1 = new Test1();
        test1.setName("admin1");
        int insert = mapper.insert(test1);
        if (insert > 0){
            System.out.println("添加成功");
            System.out.println(test1.getId());
        }else {
            System.out.println("添加失败");
        }
    }

}
