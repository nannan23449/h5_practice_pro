# h5_practice_pro

一个面向移动端网页场景的前后端分离练手项目，包含：

- `h5-web`：移动端 H5 前端
- `server-api`：Spring Boot 后端接口服务

项目目标不是一次做成“大而全”，而是先搭一个能真实运行、能继续扩展的最小业务骨架。

## 项目特点

- 前端使用 `Vue 3 + Vite + TypeScript + Vant`
- 后端使用 `Spring Boot 3 + Spring Security + MyBatis-Plus`
- 已包含登录接口、用户信息接口、统一返回结构和全局异常处理
- 已完成前后端本地联调
- 已配置 GitHub SSH 推送

## 技术栈

### 前端

- `Vue 3`
- `Vite`
- `TypeScript`
- `Vue Router`
- `Pinia`
- `Axios`
- `Vant`

### 后端

- `Spring Boot 3`
- `Spring Web`
- `Spring Security`
- `Spring Validation`
- `MyBatis-Plus`
- `MySQL`
- `Maven`

## 当前功能

- 登录页
- 首页
- 演示登录接口
- 用户信息查询接口
- Swagger 接口文档

## 目录结构

```text
h5_practice_pro/
├── h5-web/                  # H5 前端项目
├── server-api/              # Spring Boot 后端项目
├── docs/                    # 项目说明与过程记录
├── .gitignore
└── README.md
```

更详细的结构说明见：

- [项目结构说明](./docs/PROJECT_STRUCTURE.md)
- [本次对话总结](./docs/SESSION_SUMMARY_2026-04-20.md)

## 本地启动

### 1. 启动前端

```bash
cd h5-web
npm install
npm run dev
```

默认访问：

- `http://127.0.0.1:5173/`

### 2. 启动后端

```bash
cd server-api
mvn spring-boot:run
```

默认访问：

- 接口服务：`http://127.0.0.1:8080`
- Swagger：`http://127.0.0.1:8080/swagger-ui.html`

## 演示账号

- 用户名：`demo`
- 密码：`123456`

## 已完成的基础工作

- 设计并搭建前后端分离骨架
- 安装并配置 `JDK`、`Maven`
- 修复后端构建与启动问题
- 验证登录接口与用户信息接口
- 推送项目到 GitHub 仓库

## 下一步建议

1. 把演示登录替换成真实 `JWT`
2. 增加业务模块，例如 `product`、`order`、`booking`
3. 补数据库表、Mapper、分页查询与参数校验
4. 增加测试、日志和部署说明
