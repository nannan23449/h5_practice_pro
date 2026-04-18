# h5_practice_pro

这是一个面向移动端网页项目的前后端分离脚手架骨架：

- `h5-web`: Vue 3 + Vite + TypeScript + Vant
- `server-api`: Spring Boot 3 + Spring Security + MyBatis-Plus

## 前端启动

```bash
cd /Users/oonm/newaiprogram/h5-web
npm install
npm run dev
```

## 后端启动

```bash
cd /Users/oonm/newaiprogram/server-api
mvn spring-boot:run
```

## 演示账号

- 用户名：`demo`
- 密码：`123456`

## 下一步建议

1. 把演示登录替换成真实 JWT 逻辑
2. 新增你的核心业务模块，例如 `product`、`order`、`booking`
3. 补数据库表、Mapper 和接口文档
