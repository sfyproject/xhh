drop database if exists xhh;
drop user if exists 'xhh'@'localhost';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database xhh default character set utf8mb4 collate utf8mb4_unicode_ci;
use xhh;
create user 'xhh'@'localhost' identified by 'xhh';
grant all privileges on xhh.* to 'xhh'@'localhost';
flush privileges;