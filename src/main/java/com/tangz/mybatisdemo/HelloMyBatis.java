package com.tangz.mybatisdemo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Author: tangzhen
 * Package: com.tangz.mybatisdemo
 * Name: HelloMyBatis
 * Date: 2017/5/31
 * Time: 21:26
 */

public class HelloMyBatis {

    public static void main(String[] args) {
        //1. 声明配置⽂文件的目录渎职
        String resource = "conf.xml";
        //2. 加载应⽤用配置⽂文件
        InputStream is = HelloMyBatis.class.getClassLoader()
                .getResourceAsStream(resource);
        // 3. 创建SqlSessonFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                .build(is);
        // 4. 获取Session
        SqlSession session = sessionFactory.openSession();
        try {
            // 5. 获取操作类
            GetUserInfo getUserInfo =
                    session.getMapper(GetUserInfo.class);
            // 6. 完成查询操作
            User user = getUserInfo.getUser(1);
            System.out.println(user.getId() + " " + user.getUserName() + " "
                    + user.getAccount());
        } finally {
            // 7.关闭Session
            session.close();
        }
    }
}
