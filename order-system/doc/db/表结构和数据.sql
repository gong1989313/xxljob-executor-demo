create database `springboot_demo` character set utf8mb4;

use springboot_demo;

# ======================================================

DROP TABLE IF EXISTS `USER`;

CREATE TABLE `USER` (
  `id` bigint(19) NOT NULL COMMENT '主键ID',
  `username` varchar(32) NOT NULL ,
  `password` varchar(50) NOT NULL ,
  `status` varchar(50) NOT NULL ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

# ======================================================

