create database mydb;
use mydb;
create table user(
	user_id int not null primary key auto_increment comment '用户编号',
    user_name varchar(50) not null comment '用户名',
    password varchar(50) not null comment '密码',
    user_desc varchar(255) default '' comment '用户描述'
)engine innodb default charset = utf8 comment '用户信息表';
insert into user values(null,'admin','admin','管理员');