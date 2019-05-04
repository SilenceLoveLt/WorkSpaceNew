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

 Date: 05/03/2019 21:28:19 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `bky_order_dtl`
-- ----------------------------
DROP TABLE IF EXISTS `bky_order_dtl`;
CREATE TABLE `bky_order_dtl` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `ORDER_DTL_ID` varchar(100) NOT NULL COMMENT '明细编号',
  `ORDER_ID` varchar(100) NOT NULL COMMENT '订单编号',
  `PDT_ID` varchar(100) DEFAULT NULL COMMENT '商品编号',
  `PDT_NUM` int(50) NOT NULL COMMENT '商品数量',
  `DTL_TOTAL_PRICE` varchar(100) DEFAULT NULL COMMENT '总价',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ORDER_DTL_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `bky_order_dtl`
-- ----------------------------
BEGIN;
INSERT INTO `bky_order_dtl` VALUES ('3', '026c6c439c40f538e8d752e1cb6ae8b6', '3d87a874348d934820c9d5109bf79931', '43beb9b53d76986a6419a17cd8ed850d', '3', '15', '1', '2019-04-26', null, null), ('4', '07874a5ea95d672ca76358addea84e1d', '3d87a874348d934820c9d5109bf79932', '822c5cad58490c21b5247dcd8928f544', '1', '5', '1', '2019-04-26', null, null), ('7', '271a17bad7c7ce3ce4af5f3d08f008e2', '3d87a874348d934820c9d5109bf79932', '80001b64f83bb950d60e03a13a0b672b', '1', '5', '1', '2019-04-26', null, null), ('5', '383c4990afa78cb3e8ee3e91def380a2', '3d87a874348d934820c9d5109bf79933', 'd8ed4bea2f9a365009b90b5a0edf0dc1', '1', '4', '0', '2019-04-26', null, null), ('6', 'b46300f63fce158cfbe4f6904e159d83', '3d87a874348d934820c9d5109bf79933', 'bef2a05b07ab8aabe5b1aad230d5822a', '1', '4', '0', '2019-04-26', null, null), ('2', 'db2ab4a7c852ae0110513ad73e4a0133', '3d87a874348d934820c9d5109bf79932', 'd2f19746a30bf9c81af656c9e2954f5f', '1', '4', '1', '2019-04-26', null, null), ('9', 'dfdb1693541128f6ec5b296cfed0873d', '3d87a874348d934820c9d5109bf79931', '27f981bcd886c66b51d2dd167a155208', '2', '50', '1', '2019-04-26', null, null), ('1', 'e97b49a4e1b13b0f419bcd09c1fd838b', '3d87a874348d934820c9d5109bf79931', 'e03ee9f83f85872835d05331df20140f', '1', '4', '0', '2019-04-26', null, null), ('8', 'f39f2ddb94b4f5b528ccec7cee2a86f1', '3d87a874348d934820c9d5109bf79932', 'e03ee9f83f85872835d05331df20140f', '1', '4', '1', '2019-04-26', null, null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
