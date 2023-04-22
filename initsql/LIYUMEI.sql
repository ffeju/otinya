
# 计划表
CREATE TABLE PLAN(
 ID CHAR(64) PRIMARY KEY NOT NULL,
 NAME CHAR(64) NOT NULL,
 CREATE_TIME DATETIME NOT NULL,
 MODIFY_TIME DATETIME NOT NULL,
 CREATER_ID CHAR(64) NOT NULL,
 MODIFIER_ID CHAR(64) NOT NULL,
 IS_TEST TINYINT NOT NULL,
 STATUS TINYINT NOT NULL
);
