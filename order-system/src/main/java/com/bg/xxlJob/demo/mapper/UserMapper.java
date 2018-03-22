package com.bg.xxlJob.demo.mapper;

import com.bg.xxlJob.demo.entity.UserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<UserEntity>{
    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select id, username, password, status from user")
    List<UserEntity> selectListBySQL();
}
