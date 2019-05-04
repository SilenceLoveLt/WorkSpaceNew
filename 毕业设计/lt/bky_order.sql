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

 Date: 05/03/2019 21:28:56 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `bky_order`
-- ----------------------------
DROP TABLE IF EXISTS `bky_order`;
CREATE TABLE `bky_order` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `ORDER_ID` varchar(100) NOT NULL DEFAULT '' COMMENT '订单编号',
  `TOTAL_PRICE` varchar(100) DEFAULT NULL COMMENT '总价',
  `IS_VIP` varchar(20) NOT NULL COMMENT '是否是会员',
  `USER_PHONE` varchar(100) DEFAULT NULL COMMENT '客户编号（默认游客不可点击，选择是会员时释放可以点击通过电话号查询姓名）',
  `PAY_METHOD` varchar(100) DEFAULT NULL COMMENT '支付方式',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态标识',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ORDER_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `bky_order`
-- ----------------------------
BEGIN;
INSERT INTO `bky_order` VALUES ('1', '3d87a874348d934820c9d5109bf79930', '6', '', '17894309278', '', '1', '2019-04-26', null, '张三'), ('2', '3d87a874348d934820c9d5109bf79931', '69', '', '17454309276', '', '1', '2019-04-09', null, '红茶'), ('3', '3d87a874348d934820c9d5109bf79932', '69', 'N', '13894309276', null, '1', '2019-04-22', null, null), ('4', '3d87a874348d934820c9d5109bf79933', '69', '', '62d5f02e2efb1c6e66ed9308c6a5fb05', '', '0', '2019-04-01', null, '游客'), ('5', '3d87a87y348d934820c9d5109bf79933', '', '', '', '', '1', null, null, '123');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
