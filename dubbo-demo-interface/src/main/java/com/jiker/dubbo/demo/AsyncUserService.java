package com.jiker.dubbo.demo;

import java.util.concurrent.CompletableFuture;

public interface AsyncUserService {

    CompletableFuture<User> getUserByUserNameAsync(String name);
}
