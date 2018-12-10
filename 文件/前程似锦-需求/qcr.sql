/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : qcr

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-03-31 16:19:16
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `qcr_recruit`
-- ----------------------------
DROP TABLE IF EXISTS `qcr_recruit`;
CREATE TABLE `qcr_recruit` (
  `recruit_id` int(8) NOT NULL AUTO_INCREMENT,
  `company` varchar(60) NOT NULL,
  `job` varchar(60) NOT NULL,
  `type_id` int(8) NOT NULL,
  `recruit_count` int(8) NOT NULL,
  `salary` varchar(20) NOT NULL,
  `work_place` varchar(60) NOT NULL,
  `position_statement` text NOT NULL,
  `job_requirements` text NOT NULL,
  `hits` int(8) NOT NULL,
  `hot_flag` int(1) NOT NULL,
  `verify_flag` int(1) NOT NULL,
  `create_user` int(8) NOT NULL,
  `update_user` int(8) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  `delete_flag` int(1) NOT NULL DEFAULT '0',
  `publish_date` varchar(20) NOT NULL,
  PRIMARY KEY (`recruit_id`),
  KEY `rec_create_fk` (`create_user`),
  KEY `rec_update_fk` (`update_user`),
  KEY `type_fk` (`type_id`),
  CONSTRAINT `rec_create_fk` FOREIGN KEY (`create_user`) REFERENCES `qcr_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rec_update_fk` FOREIGN KEY (`update_user`) REFERENCES `qcr_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `type_fk` FOREIGN KEY (`type_id`) REFERENCES `qcr_recruit_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qcr_recruit
-- ----------------------------
INSERT INTO qcr_recruit VALUES ('1', '大连雨琳信息技术有限公司', '软件工程师（C++，java，应届生可投）', '4', '1', '6001—7000', '大连', '无', '1.计算机软件/软件工程/计算机应用/通讯工程等相关专业大专及以上学历； \r\n\r\n2.实习期超过半年的毕业生优先； \r\n3.了解C/C++ 或者Java编程语言，对面向过程或面向对象软件开发有一定认识； \r\n4.掌握软件工程概念，了解软件开发、测试流程； \r\n5.工作有热情、积极，学习能力强，具有一定的创造力，具有较好的沟通及协作能力，能承受一定的压力。', '0', '0', '0', '1', '1', '2017-03-31 11:02:45', '2017-03-31 16:02:25', '0', '2017-03-30');
INSERT INTO qcr_recruit VALUES ('2', '上海众阮信息科技有限公司大连分公司', ' Java+安卓 软件游戏/开发/编程/测试/维护工程师/实习生', '4', '10', '4001—6000', '大连', '1、在上级的领导和监督下定期完成量化的工作要求；\r\n2、能独立处理和解决所负责的任务，负责公司新产品的研发和设计；\r\n3、根据开发进度和任务分配，完成相应模块软件的设计、开发、编程任务；', '1、大专及以上学历，计算机、数学、财务类、机电类、电子类、网络类及相关理工科专业毕业；\r\n2、想长期从事IT行业发展，喜欢计算机编程，手机游戏开发的人员；\r\n3、做事认真、细心、负责，能够专心学习技术；\r\n4、有良好的工作态度和团队合作精神；\r\n5、优秀的应往届毕业生可适当放宽条件；', '0', '2', '1', '1', '1', '2017-03-31 11:29:02', '2017-03-31 15:54:51', '0', '2017-03-31');
INSERT INTO qcr_recruit VALUES ('3', '大连中科云信息技术有限公司', ' 上市公司+java、web、php软件开发工程师（项目提成）', '4', '10', '4001—5000', '北京', '1、在Java开发工程师的带领下定期完成量化的工作要求； \r\n2、能独立处理和解决所负责的任务； \r\n3、根据java开发进度和任务分配，完成相应模块软件的开发任务；', '1、大专及以上学历； \r\n2、热爱软件开发行业，善于学习和总结分析； \r\n3、做事认真、细心、负责，能够专心学习技术； \r\n4、有良好的工作态度和团队合作精神； \r\n5、年龄18-28岁； ', '0', '0', '0', '1', '1', '2017-03-31 11:32:16', '2017-03-31 15:43:05', '1', '2017-03-31');
INSERT INTO qcr_recruit VALUES ('4', '大连锐英科技有限公司', ' JAVA软件工程师', '4', '1', '4001—6000', '大连', '无', '1、有一定的java基础，能够接受公司安排。\r\n2、有java工作经验者，优先考虑。', '0', '0', '0', '1', '1', '2017-03-31 14:57:40', '2017-03-31 15:54:39', '0', '2017-03-31');
INSERT INTO qcr_recruit VALUES ('5', '心医国际数字医疗系统有限公司', ' JAVA软件研发工程师（大连）', '4', '1', '8001—10000', '大连', '1、需求分析和软件功能设计，软件详细设计；\r\n2、系统模块的编码实现； \r\n3、能够书写上述软件开发过程中涉及的各类规范文档；\r\n4、完成项目组组长分配的日常研发工作。', '1、本科及以上学历，计算机或信息类相关专业；\r\n2、3年以上JAVA开发经验，有良好的编程风格，掌握OO分析设计思想和设计方法，了解常用的设计模式和UML建模语言；\r\n3、熟悉J2ee、B/S三层架构，熟练使用JSP、Servlet，理解和掌握SSH等框架技术，并能够在应用框架下进行项目开发；\r\n4、理解并掌握Javascript语言核心技术DOM、BOM、Ajax、JSON等，对Javascript框架应用（如jQuery等）有一定的经验,；\r\n5、熟悉Web前端技术，对符合Web标准的网站重构有丰富经验,对CSS/Javascript性能优化、解决多浏览器兼容性问题有一定的经验；\r\n6、熟悉tomcat、resin等服务器的部署与应用；\r\n7、熟悉Oracle、Sqlserver、DB2、MySQL等数据库构建、维护和使用；\r\n8、能够熟练使用eclipse、svn等开发工具；\r\n9、能吃苦耐劳，反应敏捷，语言表达流利，愿意出色完成领导交办的事情；\r\n10、有医疗IT从业背景者(HIS/EMR/EHR/PACS/LIS等)优先。', '0', '1', '0', '1', '1', '2017-03-31 15:25:35', '2017-03-31 15:49:26', '0', '2017-03-31');
INSERT INTO qcr_recruit VALUES ('6', '大连思汤达信息技术有限公司', 'JAVA高级软件工程师', '4', '10', '6001—8000', '大连', '无', '①3年以上项目经验，胜任需求设计，概要设计，详细设计任务。\r\n②日语能力N3以上，能看懂并书写各类日文式样书。\r\n③精通Java，精通Struts开发框架。\r\n④有seasar，ajax，mysql数据库经验者优先录用。\r\n⑤具备较强的逻辑分析和整理及提案能力。', '0', '0', '0', '1', '1', '2017-03-31 16:00:19', '2017-03-31 16:00:19', '0', '2017-03-31');
INSERT INTO qcr_recruit VALUES ('7', '大连斯维特科技有限公司', ' Java国内软件工程师', '4', '5', '6001—8000', '大连', '无', '1、Java2年国内经验以上，做过国内开发经验者；\r\n2、Java基础知识好，动手能力强，有独立的编程能力；\r\n3、语言没有要求，技术能力强；\r\n4、有带队经验者优先；\r\n5、勇于挑战，团队协作能力强；', '0', '0', '0', '1', '1', '2017-03-31 16:02:07', '2017-03-31 16:02:07', '0', '2017-03-31');

-- ----------------------------
-- Table structure for `qcr_recruit_type`
-- ----------------------------
DROP TABLE IF EXISTS `qcr_recruit_type`;
CREATE TABLE `qcr_recruit_type` (
  `type_id` int(8) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(30) NOT NULL,
  `type_description` varchar(120) DEFAULT NULL,
  `sub_id` int(8) DEFAULT NULL,
  `create_user` int(8) NOT NULL,
  `update_user` int(8) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  `delete_flag` int(8) NOT NULL DEFAULT '0',
  PRIMARY KEY (`type_id`),
  KEY `type_create_fk` (`create_user`),
  KEY `type_update_fk` (`update_user`),
  KEY `sub_fk` (`sub_id`),
  CONSTRAINT `sub_fk` FOREIGN KEY (`sub_id`) REFERENCES `qcr_recruit_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `type_create_fk` FOREIGN KEY (`create_user`) REFERENCES `qcr_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `type_update_fk` FOREIGN KEY (`update_user`) REFERENCES `qcr_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qcr_recruit_type
-- ----------------------------
INSERT INTO qcr_recruit_type VALUES ('1', '会计', '会计相关工作', null, '1', '1', '2017-03-27 15:59:02', '2017-03-27 15:59:02', '0');
INSERT INTO qcr_recruit_type VALUES ('2', '计算机软件', '计算机软件相关工作', null, '1', '1', '2017-03-27 16:00:44', '2017-03-27 16:00:44', '0');
INSERT INTO qcr_recruit_type VALUES ('3', '出纳', '出纳相关工作', '1', '1', '1', '2017-03-27 16:01:34', '2017-03-27 16:01:34', '0');
INSERT INTO qcr_recruit_type VALUES ('4', 'Java', 'Java工程师相关工作', '2', '1', '1', '2017-03-27 16:02:26', '2017-03-27 16:02:26', '0');
INSERT INTO qcr_recruit_type VALUES ('5', '.Net', '.Net工程师相关工作', '2', '1', '1', '2017-03-27 16:03:08', '2017-03-31 13:55:45', '1');
INSERT INTO qcr_recruit_type VALUES ('6', '注会', '注册会计师', '1', '1', '1', '2017-03-30 17:53:11', '2017-03-30 17:53:11', '0');
INSERT INTO qcr_recruit_type VALUES ('7', 'PHP', 'PHP工程师相关岗位', '2', '1', '1', '2017-03-30 21:19:12', '2017-03-31 08:55:19', '0');
INSERT INTO qcr_recruit_type VALUES ('8', 'Oracle', 'Oracle工程师相关岗位', '2', '1', '1', '2017-03-30 21:30:50', '2017-03-31 08:56:31', '0');
INSERT INTO qcr_recruit_type VALUES ('9', '会计', '会计相关工作岗位', '1', '1', '1', '2017-03-30 21:32:01', '2017-03-30 21:32:01', '0');

-- ----------------------------
-- Table structure for `qcr_user`
-- ----------------------------
DROP TABLE IF EXISTS `qcr_user`;
CREATE TABLE `qcr_user` (
  `user_id` int(8) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(60) NOT NULL,
  `password` varchar(32) NOT NULL,
  `mobile_phone` varchar(30) NOT NULL,
  `school` varchar(60) DEFAULT NULL,
  `major` varchar(60) DEFAULT NULL,
  `authority` int(1) NOT NULL DEFAULT '0',
  `last_login_time` datetime DEFAULT NULL,
  `last_login_ip` varchar(15) DEFAULT NULL,
  `create_user` int(8) DEFAULT NULL,
  `update_user` int(8) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  `delete_flag` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`),
  KEY `create_user_fk` (`create_user`),
  KEY `update_user_fk` (`update_user`),
  CONSTRAINT `create_user_fk` FOREIGN KEY (`create_user`) REFERENCES `qcr_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `update_user_fk` FOREIGN KEY (`update_user`) REFERENCES `qcr_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qcr_user
-- ----------------------------
INSERT INTO qcr_user VALUES ('1', 'jx', '123456', '13512345678', null, null, '0', '2017-03-31 16:17:54', '0:0:0:0:0:0:0:1', null, null, '2017-03-27 09:26:56', '2017-03-27 09:26:56', '0');
INSERT INTO qcr_user VALUES ('2', 'Jack', '123456', '13412345678', 'qianchengtech', 'Java', '2', null, null, '2', '1', '2017-03-27 14:20:51', '2017-03-31 10:20:53', '0');
INSERT INTO qcr_user VALUES ('3', 'gy', '123456', '13712345678', '', '', '1', '2017-03-31 16:17:31', '0:0:0:0:0:0:0:1', '1', '1', '2017-03-31 10:13:39', '2017-03-31 10:13:39', '0');
INSERT INTO qcr_user VALUES ('4', 'Marry', '123456', '13612345678', 'qianchengtech', 'Android', '2', null, null, '1', '1', '2017-03-31 10:21:37', '2017-03-31 13:57:01', '1');
