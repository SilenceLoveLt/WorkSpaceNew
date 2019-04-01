/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:52:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for emp_table
-- ----------------------------
DROP TABLE IF EXISTS `emp_table`;
CREATE TABLE `emp_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `EMP_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '员工编号',
  `EMP_NAME` varchar(100) DEFAULT NULL COMMENT '员工名称',
  `PASSWORD` varchar(100) DEFAULT NULL COMMENT '员工密码',
  `PHONE` varchar(40) DEFAULT NULL COMMENT '电话号码',
  `ROLEID` int(11) DEFAULT NULL COMMENT '员工标识',
  `JOB` varchar(40) DEFAULT NULL COMMENT '员工职位',
  `SEX` int(11) DEFAULT NULL COMMENT '员工性别',
  `SAL` varchar(40) DEFAULT NULL COMMENT '员工薪资',
  `ADDR` varchar(100) DEFAULT NULL COMMENT '居住地址',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`EMP_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp_table
-- ----------------------------
