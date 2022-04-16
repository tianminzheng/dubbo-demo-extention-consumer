package com.jiker.dubbo.demo;

import java.util.concurrent.CompletableFuture;

public interface UserService {

    User getUserByUserName(String userName);

}