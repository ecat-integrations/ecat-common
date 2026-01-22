# 组件作用
管理ecat-integration需要加载的所有公共依赖，解决依赖冲突，是所有ecat-integrations集成的基础必备依赖包

# 依赖管理
只要集成的父依赖ecat-config.yml递归向上能找到此集成即可
```
dependencies: # 依赖的其他ecat集成的信息。可选项，默认无
  - artifactId: integration-ecat-core-ruoyi
  - artifactId: integration-env-data-manager
```
