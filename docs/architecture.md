# 系统架构

Copyright 2026 上海如静知华信息科技有限公司。

```text
车间触屏 / H5 ─┐
                 ├─ Vue 3 SPA ─ Nginx ─ Spring Boot REST API ─ MySQL 8
管理人员浏览器 ─┘                         │
                                JWT + 角色接口权限
```

前端包含排程协同端与生产管理端两套路由。`OPERATOR` 进入班组任务和反馈场景，`PLANNER`、`QUALITY`、`ADMIN` 使用管理接口。服务端以工单为制造主线，将工作中心、反馈、检验和资源负荷关联起来。

## 分层

- `controller`：登录、排程执行和生产管理 REST API。
- `service`：工单进度、反馈数量校验、看板指标聚合。
- `model`：工作中心、工单、反馈、检验、资源和账号实体。
- `repository`：Spring Data JPA 数据访问。
- `db/migration`：Flyway 管理的 MySQL 结构。

社区版未直连真实 PLC。商业部署中的资源采集建议通过独立边缘网关接入，并实施生产网与办公网分区、协议白名单、断点续传和数据质量监测。
