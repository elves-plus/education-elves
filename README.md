# education-elves

### edu-parent pom 版本控制顶层pom依赖

### edu-gateway 微服务网关服务

### edu-common-starter 封装自己服务的starter

    - redis-starter 封装redis工厂、redistemplate模板、序列化方式。



### 协议约定
    - model 约定返回接口返回vo对象，内部RPC调用对象dto结尾。数据库层调用实体类entity结尾，对外接口入参 params
    - nacos 配置中心yaml后缀是项目的主要配置文件。yml后缀的文件，是共享配置文件
    - 业务模块，代码使用四层结构
        - api 定义接口，入参，返回参数
            - api 模块必须在 edu-parent dependencyManagement中进行声明，方便其他业务模块pom引入
            - 如需要引用内部模块的接口，请在此模块进行引入
        - common 当前模块util类
        - service 当前模块实现类模块
        - web 对外提供服务controller  
