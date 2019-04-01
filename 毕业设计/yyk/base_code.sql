/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:52:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for base_code
-- ----------------------------
DROP TABLE IF EXISTS `base_code`;
CREATE TABLE `base_code` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `CODE` varchar(100) NOT NULL DEFAULT '' COMMENT '数据编码',
  `CODE_TYPE` varchar(100) DEFAULT NULL COMMENT '编码类型',
  `DATA_NAME` varchar(100) DEFAULT NULL COMMENT '数据名称',
  `ENABLE` varchar(100) DEFAULT NULL COMMENT '是否有效',
  `SORT` int(11) DEFAULT NULL COMMENT '显示顺序',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`CODE`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_code
-- ----------------------------
