package com.bg.xxlJob.demo.jobhandler;

import com.bg.xxlJob.demo.service.UserService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHander;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 任务Handler的一个Demo（Bean模式）
 *
 * 开发步骤：
 * 1、继承 “IJobHandler” ；
 * 2、装配到Spring，例如加 “@Service” 注解；
 * 3、加 “@JobHander” 注解，注解value值为新增任务生成的JobKey的值;多个JobKey用逗号分割;
 * 4、执行日志：需要通过 "XxlJobLogger.log" 打印执行日志；
 */
@JobHander(value="userPasswordJob")
@Service
public class UserPasswordJobHandler extends IJobHandler {
	@Autowired
	UserService userService;

	@Override
	public ReturnT<String> execute(String... params) {
		XxlJobLogger.log("这里记录执行日志才能在执行日志中看到(其他日志不受影响)");
		try{
			userService.reverseAllUserPassword();
		}catch (Throwable t){
			XxlJobLogger.log("任务执行失败");
			return ReturnT.FAIL;
		}
		XxlJobLogger.log("任务执行成功");
		System.out.println("任务执行成功");
		return ReturnT.SUCCESS;
	}
}
