package com.jiker.dubbo.demo.provider;

import java.util.concurrent.CompletableFuture;

import com.jiker.dubbo.demo.AsyncUserService;
import com.jiker.dubbo.demo.User;

public class AsyncUserServiceImpl implements AsyncUserService {

    @Override
    public CompletableFuture<User> getUserByUserNameAsync(String name) {

        CompletableFuture<User> future = CompletableFuture.supplyAsync(
                () -> {
                    return new User(1L, "jiker", "123456");
                }
        );

        return future;
    }
}
