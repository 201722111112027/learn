SET NAMES utf8;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL comment '用户名',
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `register_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `enabled` tinyint(1) DEFAULT 1,
  `role` varchar(50) DEFAULT NULL comment '角色',
  `avatar_url` varchar(200) DEFAULT '' comment '头像',
  PRIMARY KEY (`id`)
);

ALTER TABLE `user` ADD UNIQUE (`username`);
ALTER TABLE `user` ADD UNIQUE (`email`);
ALTER TABLE `user` ADD UNIQUE (`phone`);

DROP TABLE IF EXISTS `whmTest`;
CREATE TABLE `whmTest` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`username` varchar(50) DEFAULT NULL comment '用户名',
`password` varchar(255) DEFAULT NULL,
`email` varchar(50) DEFAULT NULL,
`phone` varchar(50) DEFAULT NULL,
PRIMARY KEY (`id`)
);

ALTER TABLE `whmTest` ADD UNIQUE (`username`);
ALTER TABLE `whmTest` ADD UNIQUE (`email`);
ALTER TABLE `whmTest` ADD UNIQUE (`phone`);


DROP TABLE IF EXISTS `cjy`;
CREATE TABLE `cjy` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(50) DEFAULT NULL comment '姓名',
`email` varchar(50) DEFAULT NULL,
`phone` varchar(50) DEFAULT NULL,
PRIMARY KEY (`id`)
);

ALTER TABLE `cjy` ADD UNIQUE (`name`);
ALTER TABLE `cjy` ADD UNIQUE (`email`);
ALTER TABLE `cjy` ADD UNIQUE (`phone`);
