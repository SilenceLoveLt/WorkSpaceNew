/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:53:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_table
-- ----------------------------
DROP TABLE IF EXISTS `user_table`;
CREATE TABLE `user_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `USER_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '客户编号',
  `USER_NAME` varchar(100) DEFAULT NULL COMMENT '客户姓名',
  `USER_PWD` varchar(100) DEFAULT NULL COMMENT '客户密码',
  `USER_PHONE` varchar(40) DEFAULT NULL COMMENT '电话号码',
  `ADDR` varchar(100) DEFAULT NULL COMMENT '地址',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`USER_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_table
-- ----------------------------
