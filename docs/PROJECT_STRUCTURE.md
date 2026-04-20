# 项目结构说明

这份文档用于说明当前仓库的职责划分、目录组织和后续扩展建议。

## 仓库结构

```text
h5_practice_pro/
├── h5-web/
├── server-api/
├── docs/
├── .gitignore
└── README.md
```

## 前端项目 `h5-web`

```text
h5-web/
├── public/
├── src/
│   ├── api/                # 接口请求封装
│   ├── assets/             # 静态资源与全局样式
│   ├── components/         # 公共组件
│   ├── layouts/            # 页面布局
│   ├── router/             # 路由配置
│   ├── stores/             # Pinia 状态管理
│   ├── utils/              # 工具方法
│   └── views/              # 页面模块
├── package.json
├── package-lock.json
└── vite.config.ts
```

### 当前前端职责

- 管理页面路由
- 维护登录态
- 封装接口请求
- 承担移动端页面展示与交互

### 前端后续建议

- 增加 `components/common` 存放可复用组件
- 把业务页面按模块拆分，例如 `views/product`、`views/order`
- 新增 `types/` 管理 TypeScript 类型
- 增加 `hooks/` 存放组合式逻辑

## 后端项目 `server-api`

```text
server-api/
├── db/
│   └── init.sql
├── src/main/java/com/example/project/
│   ├── common/
│   │   ├── config/         # 全局配置
│   │   ├── exception/      # 异常处理
│   │   └── result/         # 统一返回结构
│   └── modules/
│       ├── auth/           # 登录模块
│       └── user/           # 用户模块
├── src/main/resources/
│   ├── application.yml
│   ├── application-dev.yml
│   └── application-prod.yml
└── pom.xml
```

### 当前后端职责

- 提供登录与用户信息接口
- 统一处理异常返回
- 管理运行环境配置
- 作为后续业务模块扩展基础

### 后端后续建议

- 按业务继续增加 `product`、`order`、`file` 等模块
- 为每个模块补齐 `controller/service/mapper/entity/dto/vo`
- 引入真实数据库查询替换演示数据
- 使用真实 `JWT` 和鉴权过滤器替换演示 token

## 当前规范化调整

本轮已做的整理包括：

- 重写根目录 `README.md`
- 增加 `docs/` 文档目录
- 补充项目结构文档
- 补充对话总结文档
- 清理不应提交的构建产物

## 建议的开发习惯

- 前端开发优先在 `views` 下新增模块目录
- 后端开发优先按模块拆分，避免所有代码堆在一个包里
- 修改功能时同步补 README 或 docs，减少后续遗忘
- 每完成一个闭环功能就做一次提交，保持 Git 历史清晰
