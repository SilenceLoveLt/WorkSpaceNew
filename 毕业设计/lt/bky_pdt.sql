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

 Date: 05/03/2019 21:28:30 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `bky_pdt`
-- ----------------------------
DROP TABLE IF EXISTS `bky_pdt`;
CREATE TABLE `bky_pdt` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `PDT_ID` varchar(100) NOT NULL COMMENT '商品编号',
  `PDT_NAME` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `PDT_TYPE` int(11) DEFAULT NULL COMMENT '商品类别',
  `UNIT_PRICE` varchar(50) DEFAULT NULL COMMENT '单价',
  `MEASER` varchar(50) DEFAULT NULL COMMENT '计量单位',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `PICTURE` varchar(100) DEFAULT NULL COMMENT '图片',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`PDT_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `bky_pdt`
-- ----------------------------
BEGIN;
INSERT INTO `bky_pdt` VALUES ('6', '27f981bcd886c66b51d2dd167a155208', '月半蕉', null, '25', null, '1', '2019-04-26', null, null, null), ('1', '43beb9b53d76986a6419a17cd8ed850d', '红茶奶酥', null, '5', null, '1', '2019-04-02', null, null, null), ('9', '80001b64f83bb950d60e03a13a0b672b', '蔓陀罗', null, '29', null, '1', '2019-04-03', null, null, null), ('3', '822c5cad58490c21b5247dcd8928f544', '高纤奶酪', null, '18', null, '1', '2019-04-02', null, null, null), ('8', '82aa6423abe00ab21091b6c6cc4328a4', '云顶小花', null, '26', null, '1', '2019-04-05', null, null, null), ('7', 'bef2a05b07ab8aabe5b1aad230d5822a', '芝士丹麦酥', null, '28', null, '1', '2019-04-22', null, null, null), ('5', 'd2f19746a30bf9c81af656c9e2954f5f', '黑糖麻薯', null, '37', null, '1', '2019-03-02', null, null, null), ('2', 'd8ed4bea2f9a365009b90b5a0edf0dc1', '绿野仙踪', null, '25', null, '1', '2019-04-21', null, null, null), ('4', 'e03ee9f83f85872835d05331df20140f', '提子桃桃卷', null, '18', null, '1', '2019-04-02', null, null, null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
