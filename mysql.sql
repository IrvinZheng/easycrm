/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : easycrm

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2019-04-09 22:32:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
