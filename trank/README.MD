### 简介

- trank

  统一的父项目，管理所有的jar包的版本，其他项目都会进行继承

- registry-center

  注册中心，用于服务的注册与发现，第一个要启动的程序

- config-center

  配置中心，用来管理所有的配置文件，配置文件可以存放在github，或者gitlab上，第二个启动的程序

- gateway-center

  网关中心，所有服务的统一入口，用来做认证和鉴权。开发阶段可以不启动
  
- admin-center

  监控中心，对所有的服务进行简单的监控  

- common-service

  一些公共的工具类，全局的接口返回和异常处理，可以在所有的业务服务中进行引入，不需要启动

- order-center

  订单服务，一个业务服务

- message-center

  消息服务，通过feign对外提供声明式的接口API，供其他需要的项目调用


