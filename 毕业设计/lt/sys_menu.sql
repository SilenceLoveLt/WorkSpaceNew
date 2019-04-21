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

 Date: 04/21/2019 15:43:51 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `DATA_CODE` varchar(100) DEFAULT '' COMMENT '数据编码',
  `DATA_NAME` varchar(100) DEFAULT NULL COMMENT '数据名称',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态标识',
  `FUNCTION_NAME` varchar(99) DEFAULT NULL,
  `CSS_ICON` varchar(99) DEFAULT NULL,
  `SORT` int(11) DEFAULT NULL COMMENT '显示顺序',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `sys_menu`
-- ----------------------------
BEGIN;
INSERT INTO `sys_menu` VALUES ('1', 'add', '新增', '1', 'addFun', 'fa fa-plus fa-fw', '1', '新增'), ('2', 'update', '修改', '1', 'updateFun', 'fa fa-pencil fa-fw', '2', '修改'), ('3', 'delete', '删除', '1', 'deleteFun', 'fa fa-trash-o fa-fw', '3', '删除'), ('4', 'show', '查看', '1', 'showdataFun', 'fa fa-search-plus fa-fw', '4', '查看'), ('5', 'upShell', '上架', '1', 'upShellFun', 'fa fa-arrow-upl fa-fw', '5', '上架'), ('6', 'downShell', '下架', '1', 'downShellFun', 'fa fa-arrow-down fa-fw', '6', '下架'), ('43', 'refresh', '刷新', '1', 'refreshFun', 'fa fa-refresh fa-spin', '7', '刷新');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
