package com.imax.util;

import com.imax.mapper.StudentInfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    public SqlSession SqlSessionUtil() throws IOException {
        //读取配置文件，读成字节输入流的，注意：现在还没解析
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.解析配置文件，封装成Configuration对象，创建DefaultSqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.生产了DefaultSqlSession实例对象，设置了事务不自动提交，完成了executor对象的创建
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
