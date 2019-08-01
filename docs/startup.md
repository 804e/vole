
[TOC]

# 启动
## 启动vole-eureka
1. 服务注册中心先启动，默认是单点配置，高可用需要两个节点相互注册
2. 运行com.github.vole.eureka.VoleEurekaApplication启动应用
3. 启动后访问http://localhost:1025/访问控制台可以查看注册的服务信息

## 启动vole-config
1. 启动配置中心，配置中心用于管理配置，可使用本地文件或者版本管理工具Git（推荐）等存储系统配置
2. vole-config默认使用本地配置文件，在目录vole\vole-config\src\main\resources\resposity集中修改应用配置
3. 运行com.github.vole.config.VoleConfigApplication启动应用

## 启动vole-portal-data
1. RBAC管理接口
2. 运行com.github.vole.portal.data.VolePortalDataApplication启动应用

## 启动vole-passport
1. sso登录平台
2. 运行com.github.vole.passport.server.VolePassportApplication启动应用
3. 不可直接访问

## 启动vole-portal
1. RBAC管理界面端，提供包含接口在内的完整页面服务
2. 运行com.github.vole.portal.VolePortalApplication启动应用
3. 访问http://localhost:7008进行登录，会先跳转passport

## 启动vole-auth
1. oauth2授权应用，访问接口前必须要调用该应用获取token
2. 运行com.github.vole.auth.VoleAuthApplication启动应用
3. 访问http://localhost:7001/oauth进行相关操作

## 启动vole-mps
1. 网关和应用列表授权管理，动态路由配置，所有对外接口都通过这里配置动态网关提供对外服务和授权
2. 运行com.github.vole.mps.VoleMpsApplication启动应用
3. 访问http://localhost:6001进行登录，会先跳转passport

# FAQ
## lombok
系统使用了lombok简化bean，IDE需要安装lombok插件才可以正确编译

