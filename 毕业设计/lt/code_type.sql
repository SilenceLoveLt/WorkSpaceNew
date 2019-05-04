/*
 Navicat MySQL Data Transfer

 Source Server         : bakery
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost
 Source Database       : bakery

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : utf-8

 Date: 05/03/2019 22:34:54 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `code_type`
-- ----------------------------
DROP TABLE IF EXISTS `code_type`;
CREATE TABLE `code_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `CODE_TYPE` varchar(100) NOT NULL DEFAULT '' COMMENT '字典编号',
  `CODE_NAME` varchar(100) DEFAULT NULL COMMENT '字典名称',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态标识',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`CODE_TYPE`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `code_type`
-- ----------------------------
BEGIN;
INSERT INTO `code_type` VALUES ('8', 'DPT_TYPE', '部门标识', '1', '部门标识'), ('9', 'JOB_TYPE', '工作类别', '1', '工作类别'), ('6', 'MEASER', '计量单位', '1', '计量单位'), ('10', 'PAY_METHOD', '支付方式', '1', '支付方式'), ('5', 'PDT_TYPE', '商品类别', '1', '商品类别'), ('2', 'ROLE_ID', '员工标识', '1', '员工标识'), ('3', 'SEX', '性别', '1', '性别'), ('1', 'STATUS', '状态', '1', '状态说明'), ('7', 'STOCK_FLAG', '进销标识', '1', '进销标识'), ('4', 'USER_LEVEL', '用户级别', '1', '用户级别'), ('12', 'YESORNO', '是否', '1', '是否');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
