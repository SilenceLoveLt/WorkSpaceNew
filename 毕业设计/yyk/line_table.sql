/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:53:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for line_table
-- ----------------------------
DROP TABLE IF EXISTS `line_table`;
CREATE TABLE `line_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `LINE_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '线路编号',
  `LINE_CODE` varchar(100) DEFAULT NULL COMMENT '线路编码',
  `LINE_PRICE` varchar(100) DEFAULT NULL COMMENT '线路价格',
  `LINE_LENGTH` int(11) DEFAULT NULL COMMENT '线路长度',
  `LINE_TIME` date DEFAULT NULL COMMENT '线路所需时长',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`LINE_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of line_table
-- ----------------------------
