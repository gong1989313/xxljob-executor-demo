# Spring-Boot-arch
`Spring-Boot-arch`主要是基于`Spring-Boot`集成`Mybatis`框架，为所有新增的项目提供模板，方便快速构建项目，
而不需要从O开始集成`Mybatis`，直接通过Maven的骨架便可以简单生成项目基本文件目录结构。

`spring-boot-template`项目作为一个项目模板提供给各个项目搭建使用，项目已集成下面框架

* [Spring boot](http://docs.spring.io/spring-boot/docs/1.5.6.RELEASE/reference/htmlsingle/)
* [Mybatis-plus](http://mp.baomidou.com/#/quick-start)
* [Swagger](https://swagger.io/docs/)
* [Spring Security](http://docs.spring.io/spring-security/site/docs/4.2.3.RELEASE/reference/htmlsingle/)

* 请搜索项目中的`TODO`，并且替换内容
* 查看代码中的实例，不需要请修改或者删除
* `swagger`请访问http://localhost:8080/swagger-ui.html
* 基于模板中`Dockerfile`修改来生成系统镜像文件
* 基于模板中`docker-compose.yaml`修改，来实现系统的本地部署
* 修改本`README.md`

* 增加k8s目录和yaml实例文件
* 增加jenkinsfile实现通过jenkins一键部署到k8s
* 添加Spring Boot健康检查支持
    - 健康检查大家可以结合jenkinsfile里面最后一步`k8s-health`可以采用`curl http://xxxx/health`来检查
