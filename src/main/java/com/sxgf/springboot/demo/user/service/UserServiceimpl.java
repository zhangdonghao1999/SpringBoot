package com.sxgf.springboot.demo.user.service;

import com.sxgf.springboot.demo.user.dao.UserDao;
import com.sxgf.springboot.demo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceimpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map){

        return userDao.getAll(map);
    }

    @Override
    public void deIById(Integer id) {
        userDao.deIById(id);
    }

    @Override
    public void save(UserEntity userEntity) {

            userEntity.setCreatetime(new Date());
            userEntity.setStatus(1);
            userDao.save(userEntity);
    }
}
