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

public class HelloMyBatisMoreOp {

    public static void main(String[] args) {
        moreOp();
    }

    private static void moreOp() {
        // 1. 声明配置⽂文件
        String resource = "conf.xml";
        // 2. 加载应⽤用配置⽂文件
        InputStream is = HelloMyBatisMoreOp.class.getClassLoader()
                .getResourceAsStream(resource);
        // 3. 创建SqlSessonFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                .build(is);
        SqlSession session = sessionFactory.openSession(true);
        try {
            // 5. 获取操作类
            UserOp userOp = session.getMapper(UserOp.class);
            User user = new User("XiaoMing", 50);

            // 插入用户
            userOp.addUser(user);
            System.out.println(user.getId());

            // 查询用户
            user = userOp.getUser(user.getId());
            System.out.println(user.getId() + " " + user.getUserName() + " "
                    + user.getAccount());

            user.setUserName("LiMing");
            // 更新用户
            userOp.updateUser(user);

            // 删除用户
            userOp.deleteUser(user.getId());

        } finally {
            // 7.关闭Session
            session.close();
        }
    }

}
