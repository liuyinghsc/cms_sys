# cms_sys
业务需求：做一个CMS系统。用户可注册，登录。登录后可查看、创建、修改、删除自己的文章。

步骤：
1. 创建一个 git 仓库，并提交到远程仓库。初始化项目代码。1
2. 用 Docker 运行 MySQL 数据库。可以通过本地连接访问 1
3. 搭建一个基于 Gradle 的 Spring Boot 项目。可通过 /about 接口返回当前时间 1
4. 测试 /about 接口，会用到 junit、rest-assured。测试并通过 1
5. 提供用户注册接口，验证用户名，密码不为空。测试并通过 1
6. 提供 basic 方式的登录接口，会用到 spring security。会用到 DBUnit。测试并通过 2
7. 提供 RESTful 风格，DDD 建模的查看、创建、修改、删除文章接口，用 TDD 的方式实现功能。测试并通过 2

其它补充：
使用 Git 提交，Postman 测试接口
开发流程：开卡、CI、CD
重构，编码规范
