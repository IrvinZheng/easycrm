##easycrm是什么?

easycrm系统是一个快速启动并可投入企业使用的管理后台系统，

前端部分采用以bootstrap为基础的hAdmin开源框架，后端部分使用springboot+mybatis+mysql的组合框架。

##前期需要准备什么样的系统环境

easycrm需要常规的web服务部署环境，要求jdk8以上，数据库使用mysql，

启动之前需要新建easycrm数据库并执行mysql.sql文件内语句。

另外还需要修改配置文件application.properties中的配置选项

* spring.datasource.url
* spring.datasource.username
* spring.datasource.password
* spring.redis.host

根据你环境下的数据库进行对应的配置



