package com.sxgf.springboot.demo.user.service;

import com.sxgf.springboot.demo.user.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);
    void deIById(Integer id);

    //保存用户
    public void save(UserEntity userEntity);

    //根据id查询用户数据
    public UserEntity getUserById(Integer id );

    //根据id修改用户数据
    public void updateUserById(@RequestBody UserEntity userEntity);

}
