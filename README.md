## 图智乐BI数据分析平台

### 项目介绍

图智乐BI数据分析平台是基于 Spring Boot + MQ + AIGC 的智能数据分析平台。区别于传统 BI，用户只需要导入原始数据集、并输入分析诉求，就能自动生成可视化图表及分析结论。

### 项目界面

![image-20230831160111255](https://gulimall-helloxlf.oss-cn-hangzhou.aliyuncs.com/xubi%E9%A6%96%E9%A1%B5.png)

![image-20230831154201196](https://gulimall-helloxlf.oss-cn-hangzhou.aliyuncs.com/MQ.png)

![image-20230831154225113](https://gulimall-helloxlf.oss-cn-hangzhou.aliyuncs.com/%E5%9B%BE%E8%A1%A8.png)

### 功能点

1. 调用第三方AI，根据需求进行图表分析
2. 使用分表对用户Excel表中的大数据进行相应的存储
3. 采用三种方式生成图表
   - 同步
   - 线程池
   - 异步(MQ)
4. 使用第三方OpenAi**自定义Prompt预设模板**并封装用户输入的数据和分析述求,**对接AIGC接口**生成可视化图表JSON和分析结论,返回给前端渲染
5.  由于AIGC的输入Token限制,使用Easy Excel 解析用户上传的XLSX表格数据文件并压缩为CSV,实测 **提高了12%**的单次输入数据量,节约了调用成本 
6. 为防止某用户恶意占用系统资源 ,基于Redisson的**RateLimiter令牌桶算法**实现分布式限流 
7. 考虑到单个图表用的原始数据较大,基于Mybatis + 业务层构建自定义SQL实现对每份原始数据进行**分表存储,提高查询性能12%**
8.  由于AIGC的响应时间较长,基于自定义**IO密集型线程池 + 任务队列**实现AIGC的并发执行和异步化, 提高用户体验,支持更多用户排队而不是无限给系统压力导致提交失败 
9. 通过**策略模式以及反向压力思想**,根据当前系统负载进行策略选择 
10. 通过Spring-Retry进行**线程失败重试** 
11. 通过WebSocket进行图表生成结果的实时推送 使用RabbitMQ来接收并持久化任务消息,**死信队列来处理**异常情况,将图表生成任务置为失败 

## 项目技术

### 框架 & 特性

- SpringBoot 2.7.x
- Mybatis + MybatisPlus（分页）
- SpringAOP
- Java8

- Mysql数据库
- Redis内存数据库
- RabbitMQ
