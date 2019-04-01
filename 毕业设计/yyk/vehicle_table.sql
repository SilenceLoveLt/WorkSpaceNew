/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:53:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for vehicle_table
-- ----------------------------
DROP TABLE IF EXISTS `vehicle_table`;
CREATE TABLE `vehicle_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `VEHICLE_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '车辆编号',
  `VEHICLE_CODE` varchar(100) DEFAULT NULL COMMENT '车辆编码',
  `VEHICLE_TYPE` varchar(100) DEFAULT NULL COMMENT '车辆类别',
  `VEHICLE_NAME` varchar(40) DEFAULT NULL COMMENT '车辆名称',
  `WEIGHT` int(11) DEFAULT NULL COMMENT '承重量',
  `VOLUME` int(11) DEFAULT NULL COMMENT '承重体积',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`VEHICLE_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vehicle_table
-- ----------------------------
