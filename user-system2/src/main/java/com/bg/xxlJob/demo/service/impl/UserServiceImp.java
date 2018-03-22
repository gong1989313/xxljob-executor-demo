package com.bg.xxlJob.demo.service.impl;

import com.bg.xxlJob.demo.entity.UserEntity;
import com.bg.xxlJob.demo.mapper.UserMapper;
import com.bg.xxlJob.demo.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp extends ServiceImpl<UserMapper, UserEntity> implements UserService{


    @Override
    public boolean deleteAll() {
        return retBool(baseMapper.deleteAll());
    }

    @Override
    public List<UserEntity> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }

    @Override
    public void reverseAllUserPassword() {
        List<UserEntity> userEntities = baseMapper.selectListBySQL();
        userEntities.forEach(userEntity -> {
            String paw = new StringBuffer(userEntity.getPassword()).reverse().toString();
            userEntity.setPassword(paw);
            baseMapper.updateAllColumnById(userEntity);
        });
    }
}
