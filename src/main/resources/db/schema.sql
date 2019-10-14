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

DROP TABLE IF EXISTS `gxm`;
CREATE TABLE `gxm` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL comment '姓名',
  `representativeWork` varchar(255) DEFAULT NULL comment '代表作',
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL comment '角色',
  `portrait` varchar(200) DEFAULT '' comment '写真照',
  PRIMARY KEY (`id`)
);