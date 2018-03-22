# XXL-JOB分布式调度平台的介绍和安装

## 简单介绍
XXL-Job是分布式调度平台，基于Quartz实现调度，将整个调度平台分为两个部分，一部分是调度中心，主要核心是Quartz，负责调度触发；另外一部分是执行器中心，主要负责业务逻辑处理。并且两个组件都可以HA，提供高可用。更多特性请参考[官方说明](http://www.xuxueli.com/xxl-job/#/?id=_12-%e7%89%b9%e6%80%a7)

## 安装步骤
整个项目安装可以参考[官方文档的步骤](http://www.xuxueli.com/xxl-job/#/?id=%e4%ba%8c%e3%80%81%e5%bf%ab%e9%80%9f%e5%85%a5%e9%97%a8),这里给出简单步骤：
- 0，环境说明：请参考[环境说明](http://www.xuxueli.com/xxl-job/#/?id=_15-%e7%8e%af%e5%a2%83)
- 1，下载源码：在[github](https://github.com/xuxueli/xxl-job/releases)上下载源码（不需要登录）
- 2，执行SQL：SQL脚本位置请参考[这里](http://www.xuxueli.com/xxl-job/#/?id=_21-%e5%88%9d%e5%a7%8b%e5%8c%96%e8%b0%83%e5%ba%a6%e6%95%b0%e6%8d%ae%e5%ba%93)
- 3，使用IDEA导入Maven项目
- 4，修改调度中心模块的配置文件（xxl-job-admin），修改配置文件，尤其是`JDBC`和`email`配置，详细请参考[这里](http://www.xuxueli.com/xxl-job/#/?id=%e6%ad%a5%e9%aa%a4%e4%b8%80%ef%bc%9a%e8%b0%83%e5%ba%a6%e4%b8%ad%e5%bf%83%e9%85%8d%e7%bd%ae%ef%bc%9a)
- 5，使用`maven`打出war，然后部署到tomcat里面，然后接口访问了。详情请参考[官方文档](http://www.xuxueli.com/xxl-job/#/?id=%e6%ad%a5%e9%aa%a4%e4%ba%8c%ef%bc%9a%e9%83%a8%e7%bd%b2%e9%a1%b9%e7%9b%ae%ef%bc%9a)

至此，整个调度中心部署完毕。

### 调度中心高可用

    调度中心支持集群部署，提升调度系统可用性。
    集群部署唯一要求为：保证每个集群节点配置（db和登陆账号等）保持一致。调度中心通过db配置区分不同集群。
    调度中心在集群部署时可通过nginx负载均衡，此时可以为集群分配一个域名。该域名一方面可以用于访问，另一方面也可以用于配置执行器回调地址。

## 执行器中心
[官方文档](http://www.xuxueli.com/xxl-job/#/?id=%e6%ad%a5%e9%aa%a4%e5%9b%9b%ef%bc%9a%e9%83%a8%e7%bd%b2%e6%89%a7%e8%a1%8c%e5%99%a8%e9%a1%b9%e7%9b%ae%ef%bc%9a) 提供了两种类型的项目例子

- spring类型
- spring-boot类型

都可以作为执行器的节点。具体的步骤请参考官方文档。

### 执行器高可用
    
    集群部署唯一要求为：保证集群中每个执行器的配置项 "xxl.job.admin.addresses/调度中心地址" 保持一致，执行器根据该配置进行执行器自动注册等操作。

## 任务配置
界面的任务配置官方文档已经说得很详细，大家可以参考[官方文档](http://www.xuxueli.com/xxl-job/#/?id=%e4%b8%89%e3%80%81%e4%bb%bb%e5%8a%a1%e8%af%a6%e8%a7%a3)学习了解