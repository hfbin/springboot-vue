#!/bin/bash

if [ $# != 2 ] ; then
    echo "Usage: ./mergecode.sh <src> <project-name>"
    echo "You must first cd to the project root dir, and then run the following command"
    echo "eg: ./mergecode.sh ~/Downloads/platform platform-sys"
    exit 1;
fi

# 源码位置
sourceDir=$1

# 目标项目位置
projectName=$2

# 复制Java代码: 包括控制器、服务、DAO
cp -rf $sourceDir/main/java ./platform/$projectName/src/main

# 复制mapper
cp -rf $sourceDir/main/resources/mapper ./platform/$projectName/src/main/resources

# 复制前端代码
cp -rf $sourceDir/main/resources/src/views ./vue-admin/src

# 数据库插入
