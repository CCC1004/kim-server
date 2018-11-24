/*
Navicat MySQL Data Transfer

Source Server         : localhost-mysql
Source Server Version : 50639
Source Host           : localhost:3306
Source Database       : kimsohyun

Target Server Type    : MYSQL
Target Server Version : 50639
File Encoding         : 65001

Date: 2018-11-23 09:09:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('2');

-- ----------------------------
-- Table structure for kim_index_jptj
-- ----------------------------
DROP TABLE IF EXISTS `kim_index_jptj`;
CREATE TABLE `kim_index_jptj` (
  `guid` varchar(32) NOT NULL COMMENT '主键自增',
  `jp_name` varchar(255) DEFAULT NULL COMMENT '精品名称',
  `jp_image` varchar(32) DEFAULT NULL COMMENT '精品图片id(与资源信息主键匹配)',
  `jp_desc` varchar(255) DEFAULT NULL COMMENT '精品描述',
  `jp_sort` varchar(2) DEFAULT NULL COMMENT '排序',
  `nt` varchar(255) DEFAULT NULL COMMENT '备注',
  `ts` datetime DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`guid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kim_index_jptj
-- ----------------------------
INSERT INTO `kim_index_jptj` VALUES ('8bdf0b712f3c4c4cba89520db3d0d9d6', '金4', 'EE8C4EF7F82840DCA93CE1D98B86F036', 'Hello,I\'m KimSoHyun', '04', null, '2018-11-18 16:07:07');
INSERT INTO `kim_index_jptj` VALUES ('8F2AFB3E108249E4929B848EA31CE433', '金3', 'ee2b8d62174f4beb98aab44dadc0cc74', 'Hello,I\'m KimSoHyun', '03', null, '2018-11-18 16:07:07');
INSERT INTO `kim_index_jptj` VALUES ('935063749954490b9531144d0904f1a9', '金2', 'e6349fd8fbf94fc89fb0796ea06f3381', 'Hello,I\'m KimSoHyun', '02', null, '2018-11-18 16:07:07');
INSERT INTO `kim_index_jptj` VALUES ('98ac004f519e4198a1aa6b3f6ed396b3', '金1', 'e57feec355404496b5b90229cf8d5409', 'Hello,I\'m KimSoHyun', '01', null, '2018-11-18 16:07:07');

-- ----------------------------
-- Table structure for kim_index_lb
-- ----------------------------
DROP TABLE IF EXISTS `kim_index_lb`;
CREATE TABLE `kim_index_lb` (
  `guid` varchar(32) NOT NULL COMMENT '主键自增',
  `lb_name` varchar(255) DEFAULT NULL COMMENT '轮播页名称',
  `lb_image` varchar(32) DEFAULT NULL COMMENT '轮播图片id(与资源信息主键匹配)',
  `lb_sort` varchar(2) DEFAULT NULL COMMENT '排序',
  `nt` varchar(255) DEFAULT NULL COMMENT '备注',
  `ts` datetime DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`guid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kim_index_lb
-- ----------------------------
INSERT INTO `kim_index_lb` VALUES ('0749c464ad0011e8a584448a5ba74111', '第一页', '1ce7c8cefb74417fa515228265f0c026', '01', null, '2018-11-17 12:38:11');
INSERT INTO `kim_index_lb` VALUES ('5bd3a7bbbd92469981f41e5a6069a0b7', '第二页', '7330b9b4b12b4a50a8b3fc6eab595caf', '02', null, '2018-11-17 12:39:01');
INSERT INTO `kim_index_lb` VALUES ('f6c4e12bcb2f4404b75680b4425966b6', '第三页', 'f3ce337c77d4473ebe98b0caf52e907b', '03', null, '2018-11-18 15:53:55');

-- ----------------------------
-- Table structure for kim_index_rmtp
-- ----------------------------
DROP TABLE IF EXISTS `kim_index_rmtp`;
CREATE TABLE `kim_index_rmtp` (
  `guid` varchar(32) NOT NULL COMMENT '主键自增',
  `rm_name` varchar(255) DEFAULT NULL COMMENT '热门名称',
  `rm_image` varchar(32) DEFAULT NULL COMMENT '热门图片id(与资源信息主键匹配)',
  `rm_head_img` varchar(32) DEFAULT NULL COMMENT '头像图片id(与资源信息主键匹配)',
  `rm_title` varchar(255) DEFAULT NULL COMMENT '标题',
  `rm_context` varchar(255) DEFAULT NULL COMMENT '内容',
  `rm_sort` varchar(2) DEFAULT NULL COMMENT '排序',
  `nt` varchar(255) DEFAULT NULL COMMENT '备注',
  `ts` datetime DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`guid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kim_index_rmtp
-- ----------------------------
INSERT INTO `kim_index_rmtp` VALUES ('81E56805D1AC441B8C3477F4D9252DF7', '金1', 'c6d7336683dc49d7b22841dd9c1cfc35', '1ce7c8cefb74417fa51522d265f0c026', 'KimSoHyun', '金所泫（김소현），1999年6月4日出生于澳大利亚，韩国女演员。\r\n            代表作品:想你，拥抱太阳的月亮，My boy，可疑的保姆，学校2015，打架吧鬼神', '01', null, '2018-11-18 16:12:08');
INSERT INTO `kim_index_rmtp` VALUES ('8352a012dbc342ec9589737fe4ef6ad4', '金2', 'c8952e924e6641949ef85521c7e9b799', '1ce7c8cefb74417fa51522d265f0c026', 'KimSoHyun', '金所泫（김소현），1999年6月4日出生于澳大利亚，韩国女演员。\r\n            代表作品:想你，拥抱太阳的月亮，My boy，可疑的保姆，学校2015，打架吧鬼神', '02', null, '2018-11-18 16:12:08');
INSERT INTO `kim_index_rmtp` VALUES ('85EF8DB3AF7E42348976027505172C0D', '金3', 'c9ceef07938f420d8dfe68dc202a06b8', '1ce7c8cefb74417fa51522d265f0c026', 'KimSoHyun', '金所泫（김소현），1999年6月4日出生于澳大利亚，韩国女演员。\r\n            代表作品:想你，拥抱太阳的月亮，My boy，可疑的保姆，学校2015，打架吧鬼神', '03', null, '2018-11-18 16:12:08');
INSERT INTO `kim_index_rmtp` VALUES ('864dcf059a2849bcb80bbbeecd9a6612', '金4', 'd3e49a45c5764e6d937706531c33e788', '1ce7c8cefb74417fa51522d265f0c026', 'KimSoHyun', '金所泫（김소현），1999年6月4日出生于澳大利亚，韩国女演员。\r\n            代表作品:想你，拥抱太阳的月亮，My boy，可疑的保姆，学校2015，打架吧鬼神', '04', null, '2018-11-18 16:12:08');
INSERT INTO `kim_index_rmtp` VALUES ('dfa21218095d43efb91df0962ec6bddd', '金5', 'd7dceb694c77413b8a2fa836a9c9668e', '1ce7c8cefb74417fa51522d265f0c026', 'KimSoHyun', '金所泫（김소현），1999年6月4日出生于澳大利亚，韩国女演员。\r\n            代表作品:想你，拥抱太阳的月亮，My boy，可疑的保姆，学校2015，打架吧鬼神', '05', null, '2018-11-18 16:12:08');

-- ----------------------------
-- Table structure for kim_resources
-- ----------------------------
DROP TABLE IF EXISTS `kim_resources`;
CREATE TABLE `kim_resources` (
  `FILE_CD` char(32) NOT NULL COMMENT '文件代码',
  `FILE_TITL` varchar(256) DEFAULT NULL COMMENT '文件标题',
  `KEY_WORD` varchar(60) DEFAULT NULL COMMENT '关键词',
  `EST_ORG` varchar(60) DEFAULT NULL COMMENT '编制单位名称',
  `ORGCD` char(18) DEFAULT NULL COMMENT '编制单位代码',
  `EST_PERS` varchar(100) DEFAULT NULL COMMENT '编制人员',
  `EST_DT` date DEFAULT NULL COMMENT '编制完成日期',
  `PUB_ORG` varchar(60) DEFAULT NULL COMMENT '发布单位名称',
  `PUB_ORGCD` char(18) DEFAULT NULL COMMENT '发布单位代码',
  `PUB_DT` date DEFAULT NULL COMMENT '发布日期',
  `ABS` varchar(400) DEFAULT NULL COMMENT '摘要信息',
  `MUL_TP` char(1) NOT NULL COMMENT '多媒体文件类型（1文档资料；2图片资料；3视音资料；4其他文件）',
  `FILE_PATH` varchar(256) NOT NULL DEFAULT '' COMMENT '文件路径',
  `FILE_NM` varchar(256) NOT NULL COMMENT '文件名',
  `FILE_SIZE` decimal(10,2) DEFAULT NULL COMMENT '文件大小',
  `FILE_EXT` varchar(10) DEFAULT NULL COMMENT '文件扩展名',
  `IS_SEC` tinyint(1) DEFAULT NULL COMMENT '是否密件',
  `SEC_G` char(1) DEFAULT NULL COMMENT '密件等级（1：公开级 2：限制级 3：秘密级 4：机密级 5：绝密级）',
  `DOC_TP` char(4) DEFAULT NULL COMMENT '资料类别',
  `TS` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '时间戳',
  `NT` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`FILE_CD`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of kim_resources
-- ----------------------------
INSERT INTO `kim_resources` VALUES ('1ce7c8cefb74417fa515228265f0c026', null, null, null, null, null, null, null, null, null, null, '2', 'upload/index/image/1.jpg', '1.jpg', null, 'jpg', null, null, null, '2018-11-17 14:31:48.452', null);
INSERT INTO `kim_resources` VALUES ('1ce7c8cefb74417fa51522d265f0c026', null, null, null, null, null, null, null, null, null, null, '2', 'upload/index/image/timg.jpg', 'timg.jpg', null, 'jpg', null, null, null, '2018-11-18 16:05:01.489', null);
INSERT INTO `kim_resources` VALUES ('7330b9b4b12b4a50a8b3fc6eab595caf', null, null, null, null, null, null, null, null, null, null, '2', 'upload/index/image/2.jpg', '2.jpg', null, 'jpg', null, null, null, '2018-11-17 14:31:50.826', null);
INSERT INTO `kim_resources` VALUES ('996609365bb7468c9b08a8f1a70c6cff', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/21.jpg', '21.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.121', '');
INSERT INTO `kim_resources` VALUES ('aad4b0500ce84f658ec6712cf6a97e85', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/66.jpeg', '66.jpeg', null, 'jpeg', null, '', '', '2018-11-18 16:05:15.669', '');
INSERT INTO `kim_resources` VALUES ('b3e1599b82104a479e8ff17561be9758', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/4.jpg', '4.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.127', '');
INSERT INTO `kim_resources` VALUES ('c6d7336683dc49d7b22841dd9c1cfc35', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/5.jpg', '5.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.129', '');
INSERT INTO `kim_resources` VALUES ('c8952e924e6641949ef85521c7e9b799', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/6.jpg', '6.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.131', '');
INSERT INTO `kim_resources` VALUES ('c9ceef07938f420d8dfe68dc202a06b8', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/7.jpg', '7.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.133', '');
INSERT INTO `kim_resources` VALUES ('d3e49a45c5764e6d937706531c33e788', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/8.jpg', '8.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.136', '');
INSERT INTO `kim_resources` VALUES ('d7dceb694c77413b8a2fa836a9c9668e', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/9.jpg', '9.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.138', '');
INSERT INTO `kim_resources` VALUES ('dbb6c4b8de324d468f855cdd94f3b462', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/10.jpg', '10.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.141', '');
INSERT INTO `kim_resources` VALUES ('DD28FA2616E4435B839230044A5578C7', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/11.jpg', '11.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.143', '');
INSERT INTO `kim_resources` VALUES ('ddd682c9f0ec42178652faa0d0f215ee', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/12.jpg', '12.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.145', '');
INSERT INTO `kim_resources` VALUES ('dfa21218095d43efb91df0962ec6bddd', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/13.jpg', '13.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.147', '');
INSERT INTO `kim_resources` VALUES ('e57feec355404496b5b90229cf8d5409', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/14.jpg', '14.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.149', '');
INSERT INTO `kim_resources` VALUES ('e6349fd8fbf94fc89fb0796ea06f3381', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/15.jpg', '15.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.151', '');
INSERT INTO `kim_resources` VALUES ('ee2b8d62174f4beb98aab44dadc0cc74', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/16.jpg', '16.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.153', '');
INSERT INTO `kim_resources` VALUES ('EE8C4EF7F82840DCA93CE1D98B86F036', '', '', '', '', '', null, '', '', null, '', '2', 'upload/index/image/17.jpg', '17.jpg', null, 'jpg', null, '', '', '2018-11-18 16:05:06.155', '');
INSERT INTO `kim_resources` VALUES ('f0ac2c9cc19a428181c4c34ea9526916', null, null, null, null, null, null, null, null, null, null, '2', 'upload/index/image/0.jpg', '0.jpg', null, 'jpg', null, null, null, '2018-11-18 15:58:19.736', null);
INSERT INTO `kim_resources` VALUES ('f3ce337c77d4473ebe98b0caf52e907b', null, null, null, null, null, null, null, null, null, null, '2', 'upload/index/image/3.jpg', '3.jpg', null, 'jpg', null, null, null, '2018-11-18 15:54:47.354', null);

-- ----------------------------
-- Table structure for kim_user
-- ----------------------------
DROP TABLE IF EXISTS `kim_user`;
CREATE TABLE `kim_user` (
  `id` int(11) NOT NULL,
  `username` varchar(30) DEFAULT NULL COMMENT '用户名',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `sex` char(1) DEFAULT NULL COMMENT '性别（0女1男2保密）',
  `job` char(1) DEFAULT NULL COMMENT '职业类型(1：Java开发 2：前端开发 3：大数据开发 4：ios开发 5：Android开发 10：学生 11：其它)',
  `realname` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `faceImage` varchar(32) DEFAULT NULL COMMENT '头像地址（资源表主键）',
  `province` varchar(30) DEFAULT NULL COMMENT '省',
  `city` varchar(30) DEFAULT NULL COMMENT '市',
  `district` varchar(30) DEFAULT NULL COMMENT '区',
  `address` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `openid` varchar(100) DEFAULT NULL COMMENT '微信登录id',
  `nt` varchar(255) DEFAULT NULL COMMENT '备注',
  `ts` datetime DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kim_user
-- ----------------------------
INSERT INTO `kim_user` VALUES ('1', 'ccc', '123456', '25', '1', '1', '曹先生', null, '陕西', '榆林', '榆阳区', '榆林大道3号线超越小区6栋', null, null, '2018-11-11 22:14:59');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `bn` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `facel_image` varchar(255) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `openid` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `province` varchar(255) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `ts` datetime DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_f2ksd6h8hsjtd57ipfq9myr64` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '榆林大道3号线超越小区6栋', '25', '', '', null, null, null, null, '123456', null, '曹先生', null, null, 'ccc');
