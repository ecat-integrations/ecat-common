# 组件作用
共享三方库**运行时载体**(trunk 层集成):打进本集成 fatjar `lib/` 的公共库,经父优先
类加载器对递归依赖本集成的叶子集成可见,承担全进程扁平类加载层的第三方库版本对齐
(在案实锤:jackson 统一 2.12.5,解决 docker-java 传递 2.10.3 与 Ruoyi/Spring Boot 2.x
所用 2.12.x 的冲突)。本集成不含业务逻辑,唯一生产类为类加载序装置。

# 版本规则(单源)
- 进 `lib/` 的库,版本真相=父 pom(ecat-project)dependencyManagement;本 pom 依赖只写
  坐标不写版本字面量,双写即漂移病灶;
- 新共享库入册流程(需全进程共享时):
  1. 父 pom dependencyManagement 无该库 → 先在父 pom 增版本条目(属性式);
  2. 本 pom `<dependencies>` 增该库依赖(不写版本);
  3. 全量构建,断言该库 jar 出现在 fatjar `lib/`;
- 消费方不引 pom 依赖:在自己的 ecat-config.yml `dependencies:` 声明
  `integration-ecat-common`(或经依赖链递归可达),声明纯为类加载序(trunk 先行,库对叶可见)。

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

