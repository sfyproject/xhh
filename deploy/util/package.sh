#!/bin/bash

# 请注意
# 本脚本的作用是把本项目编译的结果保存到deploy文件夹中
# 1. 把项目数据库文件拷贝到deploy/db
# 2. 编译xhh-admin
# 3. 编译xhh-all模块，然后拷贝到deploy/xhh

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"
cd $DIR/../..
xhh_HOME=$PWD
echo "xhh_HOME $xhh_HOME"

# 复制数据库
cat $xhh_HOME/xhh-db/sql/xhh_schema.sql > $xhh_HOME/deploy/db/xhh.sql
cat $xhh_HOME/xhh-db/sql/xhh_table.sql >> $xhh_HOME/deploy/db/xhh.sql
cat $xhh_HOME/xhh-db/sql/xhh_data.sql >> $xhh_HOME/deploy/db/xhh.sql

cd $xhh_HOME/xhh-admin
# 安装阿里node镜像工具
npm install -g cnpm --registry=https://registry.npm.taobao.org
# 安装node项目依赖环境
cnpm install
cnpm run build:dep

cd $xhh_HOME
mvn clean package
cp -f $xhh_HOME/xhh-all/target/xhh-all-*-exec.jar $xhh_HOME/deploy/xhh/xhh.jar