package com.hemukeji.dao;

import org.junit.Test;

public class UserDaoTest
{

    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {

            System.out.println(user);

        }


        sqlSession.close();


    }

}
