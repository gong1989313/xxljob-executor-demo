package com.bg.xxlJob.demo.service;

import com.bg.xxlJob.demo.entity.UserEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

public interface UserService extends IService<UserEntity>{

    boolean deleteAll();

    public List<UserEntity> selectListBySQL();

    public void reverseAllUserPassword();
}