package com.jiker.dubbo.demo.provider;

import com.jiker.dubbo.demo.ParamsUserService;
import com.jiker.dubbo.demo.User;
import com.jiker.dubbo.demo.UserParams;

public class ParamsUserServiceImpl implements ParamsUserService {
    @Override
    public User getUserByParams(UserParams userParams) {
        return new User(1L, userParams.getUserName(), "123456");
    }
}
