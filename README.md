你好！
很冒昧用这样的方式来和你沟通，如有打扰请忽略我的提交哈。我是光年实验室（gnlab.com）的HR，在招Golang开发工程师，我们是一个技术型团队，技术氛围非常好。全职和兼职都可以，不过最好是全职，工作地点杭州。
我们公司是做流量增长的，Golang负责开发SAAS平台的应用，我们做的很多应用是全新的，工作非常有挑战也很有意思，是国内很多大厂的顾问。
如果有兴趣的话加我微信：13515810775  ，也可以访问 https://gnlab.com/，联系客服转发给HR。
# springboot+jpa代码自动生成工具,集成swagger2

现已支持生成springboot完整项目文件,记得修改下application.yml中的数据库数据源配置,改成自己的数据库即可~~~
## 命令示例:
```
./hoopa.exe -gen test -tables="user" -conn=root:123456@tcp\(127.0.0.1:3306\)/test_db -driver=mysql -group=com.example.user
```
支持多表,中间用逗号分割,如果tables为空,则遍历整个数据库

## 生成的目录结构
```
├── test
	├── pom.xml
	└── src
    	├── main
		│   ├── java
		|   |   └── com.example.user
		|   |   	├── config
		|   |   	|   └── Swagger2Config.java
		|   |   	├── controller
		|   |   	|   └── UserController.java
		|   |   	├── dao
		|   |   	|   └── UserDao.java
		|   |   	├── dto
		|   |   	|   └── Result.java
		|   |   	├── enums
		|   |   	|   └── ErrorCodeEnum.java
		|   |   	├── exception
		|   |   	|   ├── BusinessException.java
		|   |   	|   └── GlobalDefaultExceptionHandler.java
		|   |   	├── model
		|   |   	|   └── User.java
		|   |   	├── service
		|   |   	|   └── UserService.java
		|   |   	└── Application.java
		│   └── resources
		│  		├── application.yml
		│  		├── bootstrap.yml
		│  		└── log4j2.xml
		└── test
		    └── java
				└── com.example.user
					└── ApplicationTests.java
```

## TODO
生成springboot完整项目
