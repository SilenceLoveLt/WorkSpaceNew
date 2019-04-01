/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:52:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods_shelves_table
-- ----------------------------
DROP TABLE IF EXISTS `goods_shelves_table`;
CREATE TABLE `goods_shelves_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `GOODS_SHELVES_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '货物货架编号',
  `SHELVES_ID` varchar(100) DEFAULT NULL COMMENT '货架编号',
  `GOODS_ID` varchar(100) DEFAULT NULL COMMENT '货物编号',
  `GOODS_CODE` varchar(40) DEFAULT NULL COMMENT '货物编码',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`GOODS_SHELVES_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_shelves_table
-- ----------------------------
