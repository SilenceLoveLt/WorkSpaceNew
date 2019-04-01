/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:53:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order_table
-- ----------------------------
DROP TABLE IF EXISTS `order_table`;
CREATE TABLE `order_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `ORDER_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '订单编号',
  `USER_NAME` varchar(100) DEFAULT NULL COMMENT '发货人姓名',
  `SHIPP_ADDRE` varchar(100) DEFAULT NULL COMMENT '发货地址',
  `SHIPP_PHONE` varchar(40) DEFAULT NULL COMMENT '发货人电话',
  `PAY_METHOD` varchar(100) DEFAULT NULL COMMENT '付款方式',
  `GOODS_COOD` varchar(100) DEFAULT NULL COMMENT '货物编码',
  `GOODS_NAME` varchar(40) DEFAULT NULL COMMENT '货物名称',
  `GOODS_TYPE` varchar(100) DEFAULT NULL COMMENT '货物类别',
  `FREIGHT` int(11) DEFAULT NULL COMMENT '运费',
  `GOODS_WEIGHT` int(11) DEFAULT NULL COMMENT '货物重量',
  `GOODS_VOLUME` int(11) DEFAULT NULL COMMENT '货物体积',
  `GOODS_NUM` int(11) DEFAULT NULL COMMENT '货物数量',
  `CONSIGNEE_NAME` varchar(100) DEFAULT NULL COMMENT '收货人姓名',
  `RECE_ADDR` varchar(100) DEFAULT NULL COMMENT '收货地址',
  `RECE_PHONE` varchar(40) DEFAULT NULL COMMENT '收货人电话',
  `ORDER_STATUS` int(11) DEFAULT NULL COMMENT '订单状态',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ORDER_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_table
-- ----------------------------
