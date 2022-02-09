package com.xzy.springtest.mapper;

import com.xzy.springtest.bean.UserBean;

public interface UserMapper {
    UserBean getInfo(String name,String password);
}
