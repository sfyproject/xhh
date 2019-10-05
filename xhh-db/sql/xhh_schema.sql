drop database if exists weshow;
drop user if exists 'weshow'@'localhost';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database weshow default character set utf8mb4 collate utf8mb4_unicode_ci;
use weshow;
create user 'weshow'@'localhost' identified by 'weshow';
grant all privileges on weshow.* to 'weshow'@'localhost';
flush privileges;