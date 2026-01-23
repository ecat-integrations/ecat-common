# 组件作用
管理ecat-integration需要加载的所有公共依赖，解决依赖冲突，是所有ecat-integrations集成的基础必备依赖包

# 依赖管理
只要集成的父依赖ecat-config.yml递归向上能找到此集成即可
```
dependencies: # 依赖的其他ecat集成的信息。可选项，默认无
  - artifactId: integration-ecat-core-ruoyi
  - artifactId: integration-env-data-manager
```

## 协议声明
1. 核心依赖：本插件基于 **ECAT Core**（Apache License 2.0）开发，Core 项目地址：https://github.com/ecat-project/ecat-core。
2. 插件自身：本插件的源代码采用 [Apache License 2.0] 授权。
3. 合规说明：使用本插件需遵守 ECAT Core 的 Apache 2.0 协议规则，若复用 ECAT Core 代码片段，需保留原版权声明。

### 许可证获取
- ECAT Core 完整许可证：https://github.com/ecat-project/ecat-core/blob/main/LICENSE
- 本插件许可证：./LICENSE

