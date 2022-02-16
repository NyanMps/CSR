@echo off
chcp 65001
color 0a
title Mps-Admin running...
set REDIS_PWD=
set DB_HOST=localhost
java -Dfile.encoding=utf-8 -jar C:\Users\kerronex\Downloads\mps-admin.jar
pause