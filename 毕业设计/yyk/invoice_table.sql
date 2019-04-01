/*
Navicat MySQL Data Transfer

Source Server         : bakery
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-03-20 10:52:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for invoice_table
-- ----------------------------
DROP TABLE IF EXISTS `invoice_table`;
CREATE TABLE `invoice_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `INVOICE_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '发货单编号',
  `ORDER_ID` varchar(100) DEFAULT NULL COMMENT '订单编号',
  `GOODS_ID` varchar(100) DEFAULT NULL COMMENT '货物编号',
  `VEHICLE_ID` varchar(40) DEFAULT NULL COMMENT '车辆编号',
  `LINE_ID` varchar(100) DEFAULT NULL COMMENT '线路编号',
  `EMP_ID` varchar(100) DEFAULT NULL COMMENT '员工编号',
  `INVOICE_STATUS` int(11) DEFAULT NULL COMMENT '发货状态',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`INVOICE_ID`),
  KEY `ORDER_ID` (`ORDER_ID`),
  KEY `GOODS_ID` (`GOODS_ID`),
  KEY `VEHICLE_ID` (`VEHICLE_ID`),
  KEY `LINE_ID` (`LINE_ID`),
  KEY `EMP_ID` (`EMP_ID`),
  KEY `ID` (`ID`),
  CONSTRAINT `invoice_table_ibfk_1` FOREIGN KEY (`ORDER_ID`) REFERENCES `order_table` (`ORDER_ID`),
  CONSTRAINT `invoice_table_ibfk_2` FOREIGN KEY (`GOODS_ID`) REFERENCES `goods_table` (`GOODS_ID`),
  CONSTRAINT `invoice_table_ibfk_3` FOREIGN KEY (`VEHICLE_ID`) REFERENCES `vehicle_table` (`VEHICLE_ID`),
  CONSTRAINT `invoice_table_ibfk_4` FOREIGN KEY (`LINE_ID`) REFERENCES `line_table` (`LINE_ID`),
  CONSTRAINT `invoice_table_ibfk_5` FOREIGN KEY (`EMP_ID`) REFERENCES `emp_table` (`EMP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of invoice_table
-- ----------------------------
