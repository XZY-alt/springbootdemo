package com.xzy.springtest.seviceImpl;

import com.xzy.springtest.bean.UserBean;
import com.xzy.springtest.mapper.UserMapper;
import com.xzy.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
