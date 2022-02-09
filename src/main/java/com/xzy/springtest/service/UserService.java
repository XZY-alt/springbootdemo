package com.xzy.springtest.service;

import com.xzy.springtest.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);
}
