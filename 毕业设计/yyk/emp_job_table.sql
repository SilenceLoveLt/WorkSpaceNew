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
DROP TABLE IF EXISTS `emp_job_table`;
CREATE TABLE `emp_job_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `EMP_JOB_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '关联编号',
  `EMP_ID` varchar(100) DEFAULT NULL COMMENT '员工编号',
  `JOB_ID` varchar(100) DEFAULT NULL COMMENT '职位编号',
  `JOB_CODE` varchar(40) DEFAULT NULL COMMENT '职位编码',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`EMP_JOB_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_table
-- ----------------------------
