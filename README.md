## 图智乐BI数据分析平台

### 项目介绍

图智乐BI数据分析平台是基于 Spring Boot + MQ + AIGC 的智能数据分析平台。区别于传统 BI，用户只需要导入原始数据集、并输入分析诉求，就能自动生成可视化图表及分析结论。

### 项目界面

![image-20230831160111255](D:\markdownImg\image-20230831160111255.png)

![image-20230831154201196](D:\markdownImg\image-20230831154201196.png)

![image-20230831154225113](D:\markdownImg\image-20230831154225113.png)

### 功能点

1. 调用第三方AI，根据需求进行图表分析
2. 使用分表对用户Excel表中的大数据进行相应的存储
3. 采用三种方式生成图表
   - 同步
   - 线程池
   - 异步(MQ)
4. 使用redission中的RateLimiter令牌桶算法进行对用户的限流

## 项目技术

### 框架 & 特性

- SpringBoot 2.7.x
- Mybatis + MybatisPlus（分页）
- SpringAOP
- Java8

- Mysql数据库
- Redis内存数据库
- RabbitMQ
