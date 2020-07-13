package com.example.serverproducer.serviceapi;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String index() {
        return "index首页，不需要权限";
    }

    @Override
    public String user() {
        return "user用户页,需要用户权限";
    }

    @Override
    public String admin() {
        return "admin管理员页，需要管理员权限";
    }
}
