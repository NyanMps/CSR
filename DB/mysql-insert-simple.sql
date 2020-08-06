-- mysql 简单创建脚本
-- 多选择：CMD + D
-- 列选择模式：OPT + 鼠标左键 / 鼠标选择区域，然后 CMD + shift + L
-- 大小写转换：大写 CMD + K + U  / 小写 CMD + K + L

CREATE TABLE `p_project` (
  `id` BIGINT(32) NOT NULL AUTO_INCREMENT COMMENT '项目id',
  `project_name` VARCHAR(200) NOT NULL COMMENT '项目名称',
  `project_code` VARCHAR(100) NOT NULL COMMENT '项目编号',
  `project_description` VARCHAR(1000) COMMENT '项目描述',
  `current_stage` INT(16) COMMENT '当前阶段',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标识：0-未删除，1-已删除',
  `created_by` BIGINT(32) COMMENT '创建人',
  `created_time` datetime COMMENT '创建时间',
  `last_modified_by` BIGINT(32) COMMENT '更新人',
  `last_modified_time` datetime COMMENT '更新时间',
  `status` INT(1) DEFAULT 1 COMMENT '状态，1 项目进行中 2 项目已结束',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '项目表'


-- 注释
ALTER TABLE `p_project` modify column `id` BIGINT(32) comment '项目id';
ALTER TABLE `p_project` COMMENT '项目表';

-- 数据
INSERT INTO `p_project` VALUES ('1', '齐鲁分公司油品质量升级碳四资源综合利用技术改造项目（旧版）', 't4xm-2019', NULL, '1', '0', '59', '2020-07-30 09:43:01', '59', '2020-07-30 09:43:01', '1');
INSERT INTO `p_project` VALUES ('2', '齐鲁分公司油品质量升级碳四资源综合利用技术改造项目', 't4xm-2020', NULL, '1', '0', '59', '2020-07-30 09:43:01', '59', '2020-07-30 09:43:01', '1');
INSERT INTO `p_project` VALUES ('3', '科鲁尔公司丙烯腈装置扩能改造项目', 'kle-2020', NULL, '1', '1', '59', '2020-07-30 09:43:01', '59', '2020-07-30 09:43:01', '2');
INSERT INTO `p_project` VALUES ('4', '测试', '20200430', NULL, '1', '1', '59', '2020-07-30 09:43:01', '59', '2020-07-30 09:43:01', '0');
INSERT INTO `p_project` VALUES ('5', '测试项目20200529', '20200529', NULL, '1', '1', '59', '2020-07-30 09:43:01', '59', '2020-07-30 09:43:01', '0');

COMMIT;