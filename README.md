# springboot-template
springboot-template

## 1. 基本需求

* Kotlin/Java/GraphQl
* Gradle 7.0+
* spring boot、 jpa
* mysql
* junit

## 2. 核心原则

* 领域驱动设计 (DDD)
* 测试驱动开发 (TDD)

## 3. 如何配置
1. 参考目录 `src/main/resources` 中提供的 `application-env.template.yml` 文件，创建本地配置文件 `application-local.yml`。
2. 修改 `application-local.yml` 文件中的配置参数。

## 4. 如何开发

### 4.1. 开发工具

* IDEA 2021.1+

### 4.2. 安装 Git hook

在项目根目录下执行以下命令

```shell
cp pre-commit .git/hooks/
```





