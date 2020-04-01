package com.sxgf.springboot.demo.user.dao;

import com.sxgf.springboot.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    List<UserEntity> getAll(@Param("content") Map map);

    void deIById(Integer id);

    public void save(UserEntity userEntity);

    public UserEntity getUserById(Integer id );

    public void updateUserById(UserEntity userEntity);
}
