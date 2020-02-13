package com.hemukeji.dao;

import com.hemukeji.pojo.User;
import com.hemukeji.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {


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
