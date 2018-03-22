package com.bg.xxlJob.demo.jobhandler;

import com.bg.xxlJob.demo.entity.UserEntity;
import com.bg.xxlJob.demo.service.UserService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHander;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@JobHander(value="printJob")
@Service
public class PrintJobHandler extends IJobHandler {
    @Autowired
    UserService userService;
    @Override
    public ReturnT<String> execute(String... params) throws Exception {
        List<UserEntity> userEntities = userService.selectListBySQL();
        userEntities.forEach(userEntity -> System.out.println(userEntity));
        return ReturnT.SUCCESS;
    }
}
