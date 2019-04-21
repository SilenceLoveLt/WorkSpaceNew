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

 Date: 04/21/2019 15:18:25 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `bky_emp`
-- ----------------------------
DROP TABLE IF EXISTS `bky_emp`;
CREATE TABLE `bky_emp` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `EMP_NO` varchar(100) NOT NULL DEFAULT '' COMMENT '员工编号',
  `EMP_NAME` varchar(100) DEFAULT NULL COMMENT '员工名称',
  `PASSWORD` varchar(100) DEFAULT NULL COMMENT '员工密码',
  `PHONE` varchar(40) DEFAULT NULL COMMENT '电话号码',
  `ROLE_ID` varchar(11) DEFAULT NULL COMMENT '员工标识',
  `JOB` varchar(40) DEFAULT NULL COMMENT '员工职位',
  `MGR` varchar(40) DEFAULT NULL COMMENT '上级领导',
  `SEX` int(11) DEFAULT NULL COMMENT '员工性别',
  `BIRTH` date DEFAULT NULL COMMENT '出生日期',
  `SAL` varchar(40) DEFAULT NULL COMMENT '员工薪资',
  `ADDR` varchar(100) DEFAULT NULL COMMENT '居住地址',
  `DEP_NO` varchar(40) DEFAULT NULL COMMENT '部门ID',
  `DONE_TIME` date DEFAULT NULL COMMENT '存档时间',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` date DEFAULT NULL COMMENT '修改时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`EMP_NO`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `bky_emp`
-- ----------------------------
BEGIN;
INSERT INTO `bky_emp` VALUES ('11', '008d173c9a0c20c373cf02b8689c6c8f', '陈粒', '123456', '12356283947', '1', '3', '6a88647a66699ce2cf49cda26e457b1e', '1', '2019-04-20', '2000', '北京市通州区八里桥', 'PER', '2019-04-20', '0', '2019-04-20', null, ''), ('10', '15c7ef7d952c837190326cf03f8ea573', '陈粒', '123456', '12356283947', '0', '1', '386caba19baf5508cff1cf885ca45d47', '0', '2019-04-20', '2000', '北京市东城区马连道', 'SAL', '2019-04-16', '1', '2019-04-20', null, ''), ('6', '171d17576dbfebd3248280779008cc68', '陈粒', '123456', '12356283947', '0', '3', 'd36b236d7770d042df3a2b249c2ff375', '0', '2019-04-20', '2000', '北京市朝阳区大望路世茂大厦', 'SAL', '2019-04-13', '1', '2019-04-20', null, ''), ('5', '186e7420c5660ac948e3ce826a80f2bc', '陈粒', '123456', '12356283947', '1', '3', '90006a4336e5479f36fc99da0dfaee83', '1', '2019-04-20', '2000', '辽宁省阜新市', 'PRO', '2019-04-20', '1', '2019-04-20', null, ''), ('33', '261ba9f575814216932c813bf46a4d99', '', null, '', '', '3', '', null, null, '', '', '', null, '1', null, null, ''), ('2', '386caba19baf5508cff1cf885ca45d47', '陈粒', '123456', '12356283947', '0', '3', '6a88647a66699ce2cf49cda26e457b1e', '0', '2019-04-20', '2000', '北京市朝阳区大望路世茂大厦', 'SAL', '2019-04-20', '1', '2019-04-20', null, ''), ('19', '49bbd6f62bf5e47877ece8baf7d8a7a6', '陈粒', '123456', '12356283947', '1', '2', 'd26755feb70d57dd9a94e202d870b946', '1', '2019-04-20', '2000', '北京市通州区八里桥', 'PRO', '2019-04-20', '1', '2019-04-20', null, ''), ('32', '4aeee664d49a4ac984c30080ddde8bbf', '', null, '1743904839', '', '', '', null, null, '', '', '', null, '1', null, null, ''), ('12', '51f6e1588ea3bcc1e5ddf4833a680e08', '陈粒', '123456', '12356283947', '0', '3', '15c7ef7d952c837190326cf03f8ea573', '0', '2019-04-20', '2000', '辽宁省大连市', 'PER', '2019-04-20', '1', '2019-04-20', null, ''), ('14', '57a6290eeddbdaaa7798f4acaf21d58a', '陈粒', '123456', '12356283947', '0', '3', '008d173c9a0c20c373cf02b8689c6c8f', '0', '2019-04-20', '2000', '北京市东城区马连道', 'PRO', '2019-04-20', '1', '2019-04-20', null, ''), ('18', '5feea201a72c44bd8f9535cf250be215', '陈粒', '123456', '12356283947', '0', '3', 'df3d7a86fa9f68fdd289cdbfd3222c45', '0', '2019-04-20', '2000', '辽宁省沈阳市', 'PRO', '2019-04-20', '1', '2019-04-20', null, ''), ('1', '6a88647a66699ce2cf49cda26e457b1e', '陈粒', '123456', '12356283947', '1', '2', null, '1', '2019-04-20', '2000', '辽宁省大连市', 'PRO', '2019-04-20', '1', '2019-04-20', null, ''), ('3', '90006a4336e5479f36fc99da0dfaee83', '陈粒', '123456', '12356283947', '1', '3', '386caba19baf5508cff1cf885ca45d47', '1', '2019-04-20', '2000', '北京市海淀区西二旗', 'SAL', '2019-04-20', '1', '2019-04-20', null, ''), ('8', '9517b285f11e7d4bd72b4d2061288b52', '陈粒', '123456', '12356283947', '0', '1', 'd36b236d7770d042df3a2b249c2ff375', '0', '2019-04-20', '2000', '辽宁省大连市', 'FIN', '2019-04-20', '1', '2019-04-20', null, ''), ('13', 'a83a0ad053fbdbf3b7a54327c3cf24d4', '陈粒', '123456', '12356283947', '1', '3', 'e7ac222aa292cffda795bd4c9a4bec4f', '1', '2019-04-20', '2000', '北京市朝阳区大望路世茂大厦', 'PRO', '2019-04-20', '1', '2019-04-20', null, ''), ('15', 'b81fa8bc60ec6156abee95b7640ee307', '陈粒', '123456', '12356283947', '1', '3', 'e7ac222aa292cffda795bd4c9a4bec4f', '1', '2019-04-20', '2000', '北京市朝阳区高碑店', 'PER', '2019-04-20', '1', '2019-04-20', null, ''), ('16', 'd26755feb70d57dd9a94e202d870b946', '陈粒', '123456', '12356283947', '0', '1', '171d17576dbfebd3248280779008cc68', '0', '2019-04-20', '2000', '辽宁省大连市', 'SAL', '2019-04-20', '1', '2019-04-20', null, ''), ('4', 'd36b236d7770d042df3a2b249c2ff375', '陈粒', '123456', '12356283947', '0', '3', '90006a4336e5479f36fc99da0dfaee83', '0', '2019-04-20', '2000', '辽宁省沈阳市', 'SAL', '2019-04-20', '1', '2019-04-20', null, ''), ('17', 'd8b7df9619573b13e2483ba085547b71', '陈粒', '123456', '12356283947', '1', '1', 'b81fa8bc60ec6156abee95b7640ee307', '1', '2019-04-20', '2000', '辽宁省沈阳市', 'SAL', '2019-04-20', '1', '2019-04-20', null, ''), ('7', 'df3d7a86fa9f68fdd289cdbfd3222c45', '陈粒', '123456', '12356283947', '1', '3', '90006a4336e5479f36fc99da0dfaee83', '1', '2019-04-20', '2000', '辽宁省沈阳市', 'FIN', '2019-04-20', '1', '2019-04-20', null, ''), ('9', 'e7ac222aa292cffda795bd4c9a4bec4f', '陈粒', '123456', '12356283947', '1', '3', 'df3d7a86fa9f68fdd289cdbfd3222c45', '1', '2019-04-20', '2000', '北京市通州区土桥', 'PRO', '2019-04-20', '1', '2019-04-20', null, '');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
