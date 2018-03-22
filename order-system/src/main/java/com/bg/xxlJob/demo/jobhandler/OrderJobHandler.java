package com.bg.xxlJob.demo.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHander;
import com.xxl.job.core.log.XxlJobLogger;
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
@JobHander(value="orderJob")
@Service
public class OrderJobHandler extends IJobHandler {

	@Override
	public ReturnT<String> execute(String... params) throws Exception {
		XxlJobLogger.log("这里记录执行日志才能在执行日志中看到(其他日志不受影响)");
		System.out.println("orderJob:hello world! I am orderJob1");
		return ReturnT.SUCCESS;
	}

}
