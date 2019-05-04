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

 Date: 05/03/2019 21:28:40 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `bky_user`
-- ----------------------------
DROP TABLE IF EXISTS `bky_user`;
CREATE TABLE `bky_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `USER_ID` varchar(100) NOT NULL COMMENT '客户编号',
  `USER_NAME` varchar(100) DEFAULT NULL COMMENT '客户名称',
  `USER_PHONE` varchar(100) DEFAULT NULL COMMENT '电话号码',
  `SEX` int(10) DEFAULT NULL COMMENT '性别',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态标识',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`USER_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `bky_user`
-- ----------------------------
BEGIN;
INSERT INTO `bky_user` VALUES ('3', '1ebe10d4ad0fa65831920ffcdb797fa3', '张三', '17894309278', '0', '1', '2019-04-26', '2019-04-18', ''), ('9', '32bab0dbf495c02e0d27272570df8806', 'Wans', '17894305276', '0', '1', '2019-04-26', '2019-04-26', ''), ('8', '33c2bdbbd8ae645be1ceab619c9125ef', 'Peter', '17454309276', '0', '1', '2019-04-26', '2019-04-26', ''), ('10', '342d463ec33641529337e2a23fa2a640', '野兽', '12423546784', '0', null, '2019-05-01', null, ''), ('5', '62d5f02e2efb1c6e66ed9308c6a5fb05', '王五', '13894309276', '1', '1', '2019-04-26', '2019-04-26', ''), ('7', '737d3486e04e079df3f29afa316e1486', 'jack', '15894309276', '1', '1', '2019-04-26', '2019-04-26', ''), ('12', '817173d0374d4338bc7593bf359e86c6', '佩琦', '2434543564', '1', null, '2019-05-01', null, ''), ('11', '95647a091ff9417c84954d631b97cb9d', '野兽', '4567386546', '0', null, null, null, ''), ('2', '97693e9c88f654bfcab00246865a3e23', '二浪', '17894309277', '0', '1', '2019-04-26', '2019-04-26', ''), ('13', 'a2805c8e599b4c1aac16e9b7d617635e', '维尼', '3457564568', '0', '1', null, null, ''), ('4', 'd6fa4f2454cff56e485bad64a69b9484', '李四', '17893302276', '0', '1', '2019-04-26', '2019-04-26', ''), ('1', 'e6eb63fa3fd9b0dd6c3c997648e38f85', '花粥', '17894309276', '0', '1', '2019-04-26', '2019-04-26', ''), ('6', 'fb53e71506146920b259298070e26897', 'Jasper', '17494309277', '1', '0', '2019-04-26', '2019-05-01', '');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
