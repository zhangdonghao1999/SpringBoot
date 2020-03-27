package com.sxgf.springboot.demo.user.service;

import com.sxgf.springboot.demo.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);
    void deIById(Integer id);

    //保存用户
    public void save(UserEntity userEntity);
}
