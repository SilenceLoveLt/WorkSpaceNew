/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : bakery

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-15 15:39:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bky_order_dtl
-- ----------------------------
DROP TABLE IF EXISTS `bky_order_dtl`;
CREATE TABLE `bky_order_dtl` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `ORDER_DTL_ID` varchar(100) NOT NULL COMMENT '明细编号',
  `ORDER_ID` varchar(100) NOT NULL COMMENT '订单编号',
  `PDTID` varchar(100) DEFAULT NULL COMMENT '商品编号',
  `PDT_NAME` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `UNIT_PRICE` varchar(100) DEFAULT NULL COMMENT '单价',
  `TOTAL_PRICE` varchar(100) DEFAULT NULL COMMENT '总价',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '客户名称',
  `USERID` varchar(100) DEFAULT NULL COMMENT '客户编号（与电话号码同）',
  `DONE_TIME` date DEFAULT NULL COMMENT '下单时间',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ORDER_DTL_ID`),
  KEY `PDTID` (`PDTID`),
  KEY `USERID` (`USERID`),
  KEY `ID` (`ID`),
  KEY `bky_order_dtl_ibfk_3` (`ORDER_ID`),
  CONSTRAINT `bky_order_dtl_ibfk_3` FOREIGN KEY (`ORDER_ID`) REFERENCES `bky_order` (`ORDER_ID`),
  CONSTRAINT `bky_order_dtl_ibfk_1` FOREIGN KEY (`PDTID`) REFERENCES `bky_pdt` (`PDTID`),
  CONSTRAINT `bky_order_dtl_ibfk_2` FOREIGN KEY (`USERID`) REFERENCES `bky_user` (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bky_order_dtl
-- ----------------------------
