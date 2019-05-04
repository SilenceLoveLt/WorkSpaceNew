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

 Date: 05/03/2019 21:28:06 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `base_code`
-- ----------------------------
DROP TABLE IF EXISTS `base_code`;
CREATE TABLE `base_code` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `DATA_CODE` varchar(100) NOT NULL COMMENT '数据编码',
  `CODE_TYPE` varchar(100) NOT NULL DEFAULT '' COMMENT '字典编号',
  `CODE_NAME` varchar(100) DEFAULT NULL COMMENT '数据名称',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态标识',
  `SORT` int(11) DEFAULT NULL COMMENT '显示顺序',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ID`),
  KEY `DICT_ID` (`CODE_TYPE`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `base_code`
-- ----------------------------
BEGIN;
INSERT INTO `base_code` VALUES ('1', '0', 'STATUS', '不可用', '1', '1', '不可用'), ('2', '1', 'STATUS', '可用', '1', '2', '可用'), ('3', '2', 'STATUS', '已上架', '1', '3', '已上架'), ('4', '3', 'STATUS', '已下架', '1', '4', '已下架'), ('5', '0', 'ROLE_ID', '普通管理员', '1', '1', '普通管理员'), ('6', '1', 'ROLE_ID', '普通职员', '1', '2', '普通员工'), ('7', '0', 'SEX', '男', '1', '1', '男'), ('8', '1', 'SEX', '女 　　    ', '1', '2', '女'), ('11', 'A', 'PDT_TYPE', '蛋糕', '1', '1', '蛋糕'), ('12', 'B', 'PDT_TYPE', '奶茶', '1', '2', '奶茶'), ('13', 'C', 'PDT_TYPE', '布丁', '1', '3', '布丁'), ('14', 'D', 'PDT_TYPE', '面包', '1', '4', '面包'), ('15', 'H', 'MEASER', '盒', '1', '1', '盒'), ('16', 'B', 'MEASER', '杯', '1', '2', '杯'), ('17', 'K', 'MEASER', '块', '1', '3', '块'), ('18', 'G', 'MEASER', '个', '1', '4', '个'), ('19', 'P', 'MEASER', '瓶', '1', '5', '瓶'), ('20', 'IN', 'STOCK_FLAG', '入库', '1', '1', '入库'), ('21', 'OUT', 'STOCK_FLAG', '出库', '1', '2', '出库'), ('22', 'PRO', 'DPT_TYPE', '生产部', '1', '1', '生产部'), ('23', 'SAL', 'DPT_TYPE', '销售部', '1', '2', '销售部'), ('24', 'FIN', 'DPT_TYPE', '财务部', '1', '3', '财务部'), ('25', 'PER', 'DPT_TYPE', '人事部', '1', '4', '人事部'), ('26', '1', 'JOB_TYPE', '经理', '1', '1', '经理'), ('27', '2', 'JOB_TYPE', '店长', '1', '2', '店长'), ('28', '3', 'JOB_TYPE', '普通职员', '1', '3', '普通职员'), ('29', 'ZFB', 'PAY_METHOD', '支付宝', '1', '1', '支付宝'), ('30', 'VX', 'PAY_METHOD', '微信', '1', '2', '微信'), ('31', 'XJ', 'PAY_METHOD', '现金', '1', '3', '现金'), ('32', 'Y', 'YESORNO', '是', '1', '1', '是'), ('33', 'N', 'YESORNO', '否', '1', '1', '否');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
