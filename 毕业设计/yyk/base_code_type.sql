/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:52:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for base_code_type
-- ----------------------------
DROP TABLE IF EXISTS `base_code_type`;
CREATE TABLE `base_code_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `code_type` varchar(100) DEFAULT NULL COMMENT '编码类型',
  `CODE_NAME` varchar(100) DEFAULT NULL COMMENT '字典名称',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_code_type
-- ----------------------------
