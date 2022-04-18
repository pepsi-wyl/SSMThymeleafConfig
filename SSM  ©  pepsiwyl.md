<a name="UI8wD"></a>
# 准备工作
<a name="rbNsP"></a>
## 创建Maven项目  创建项目结构
![image.png](https://cdn.nlark.com/yuque/0/2022/png/23219042/1646376745540-98cce67b-62e8-490e-8202-b98f2b7a0833.png#clientId=ue2668d3c-c822-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=264&id=u86b89bfd&margin=%5Bobject%20Object%5D&name=image.png&originHeight=264&originWidth=255&originalType=binary&ratio=1&rotation=0&showTitle=false&size=69706&status=done&style=none&taskId=u451eb76f-0f48-475b-b550-50d3f08480e&title=&width=255)
<a name="k5Z7H"></a>
## 添加WEB支持 创建WEB项目结构
![image.png](https://cdn.nlark.com/yuque/0/2022/png/23219042/1646376780001-82f4d3df-a7d0-4eba-94d9-8280018fc9d7.png#clientId=ue2668d3c-c822-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=65&id=uaadc2aa2&margin=%5Bobject%20Object%5D&name=image.png&originHeight=65&originWidth=405&originalType=binary&ratio=1&rotation=0&showTitle=false&size=11607&status=done&style=none&taskId=ubba1dbcd-833e-4924-ac18-2307b9a6653&title=&width=405)<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/23219042/1646376884705-d4512936-f0aa-4c06-9d1b-c7d8e0f1bae4.png#clientId=ue2668d3c-c822-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=172&id=u041b634a&margin=%5Bobject%20Object%5D&name=image.png&originHeight=172&originWidth=245&originalType=binary&ratio=1&rotation=0&showTitle=false&size=5326&status=done&style=none&taskId=u2a1a9fa7-4e0d-40b0-aed8-314586056c0&title=&width=245)<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/23219042/1646377061632-e95e9efc-06a9-40f7-91e1-08da909d2e57.png#clientId=ue2668d3c-c822-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=110&id=u670194b4&margin=%5Bobject%20Object%5D&name=image.png&originHeight=110&originWidth=251&originalType=binary&ratio=1&rotation=0&showTitle=false&size=28726&status=done&style=none&taskId=u1be397bb-6813-4f02-93cf-d2da27ef4cb&title=&width=251)
<a name="SBfPj"></a>
## 配置Tomcat服务器
![image.png](https://cdn.nlark.com/yuque/0/2022/png/23219042/1646376810138-65a682e5-9a0f-4673-b721-6e08040c3e1e.png#clientId=ue2668d3c-c822-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=733&id=u46a6b572&margin=%5Bobject%20Object%5D&name=image.png&originHeight=733&originWidth=592&originalType=binary&ratio=1&rotation=0&showTitle=false&size=36124&status=done&style=none&taskId=uf65837f3-8842-492e-a9a3-ec499bc846c&title=&width=592)
<a name="Bacxv"></a>
## 添加依赖
<a name="lJJfI"></a>
### pom.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>Spring_MVC</artifactId>
        <groupId>org.example</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>SSM</artifactId>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <dependencies>
        <!--
        工具配置
        -->
        <!--Junit-jar包-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
        <!--lombok -jar包-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.22</version>
        </dependency>
        <!--jackson-->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.13.1</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.13.1</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.13.1</version>
        </dependency>
        <!--gson-->
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.9.0</version>
        </dependency>
        <!--文件上传依赖-->
        <dependency>
            <groupId>commons-fileupload</groupId>
            <artifactId>commons-fileupload</artifactId>
            <version>1.4</version>
        </dependency>


        <!--
        日志配置
        -->
        <!--log4j日志-->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        <!--logback日志-->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.2.10</version>
        </dependency>


        <!--
        mysql连接配置
        -->
        <!--mysql驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.24</version>
        </dependency>
        <!--druid数据库连接池 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.2.8</version>
        </dependency>


        <!--
        mybatis配置
        -->
        <!--mybatis-jar包-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.9</version>
        </dependency>
        <!--mybatis-caches-jar包-->
        <dependency>
            <groupId>org.mybatis.caches</groupId>
            <artifactId>mybatis-ehcache</artifactId>
            <version>1.2.1</version>
        </dependency>


        <!--
        Mybatis-spring整合
        -->
        <!--Mybatis - Spring-->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>2.0.7</version>
        </dependency>


        <!--
        spring配置
        -->
        <!-- Servlet依赖-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
        </dependency>
        <!--SpringFramework-webmvc-jar 依赖包-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.15</version>
        </dependency>
        <!--SpringFramework-jdbc-jar 依赖包-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>5.3.15</version>
        </dependency>
        <!--使用AOP织入 依赖 jar包 -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.8</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjrt</artifactId>
            <version>1.9.8</version>
        </dependency>

        <!--
        模板引擎配置
        -->
        <!--thymeleaf模板引擎 替代jsp开发-->
        <dependency>
            <groupId>org.thymeleaf</groupId>
            <artifactId>thymeleaf-spring5</artifactId>
            <version>3.0.14.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>RELEASE</version>
            <scope>compile</scope>
        </dependency>


    </dependencies>

    <!--在build中配置resources，避免资源导出失败问题-->
    <build>
        <resources>
            <resource>
                <directory>
                    src/main/resources
                </directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>
                    src/main/java
                </directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
        </resources>
    </build>
    
</project>
```
<a name="v4TrH"></a>
### 404 （lib依赖缺失）
![image.png](https://cdn.nlark.com/yuque/0/2022/png/23219042/1646377908313-70e0067e-028f-48cd-b4c6-5ab3de05cad4.png#clientId=ue2668d3c-c822-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=339&id=uda9238ae&margin=%5Bobject%20Object%5D&name=image.png&originHeight=339&originWidth=1028&originalType=binary&ratio=1&rotation=0&showTitle=false&size=38470&status=done&style=none&taskId=u49cf5c70-9643-42d3-a74b-c9d37405499&title=&width=1028)<br />![image.png](https://cdn.nlark.com/yuque/0/2022/png/23219042/1646377923631-aacc8607-cfaf-4c4e-9fd9-51405ae8f27b.png#clientId=ue2668d3c-c822-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=494&id=u923244da&margin=%5Bobject%20Object%5D&name=image.png&originHeight=494&originWidth=488&originalType=binary&ratio=1&rotation=0&showTitle=false&size=41926&status=done&style=none&taskId=uc241308f-96ca-4c65-be31-4afb8baeb13&title=&width=488)
<a name="DCBKf"></a>
## 创建数据库和表
```sql
create dabatase ssmbuild;
use ssmbuild; 

create table ssmbuild.user
(
    id       int auto_increment
        primary key,
    userName varchar(30) null,
    password varchar(30) null
);

create table ssmbuild.books
(
    bookID     int,
    bookName   varchar(100) not null,
    bookCounts int          not null,
    detail     varchar(200) not null
)
    charset = utf8;

create index bookID
    on ssmbuild.books (bookID);

alter table ssmbuild.books
    modify bookID int auto_increment;
```
<a name="Xh2fK"></a>
## 创建实体类
```java
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Alias("user")       // Mybatis别名
@Component(value = "user") // spring组件
public class User {
    int id;
    String userName;
    String password;
}
```
```java
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Alias("books")        // Mybatis别名
@Component(value = "books")// spring组件
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
```
<a name="wlP45"></a>
## log4j配置文件
```properties
#将等级为DEBUG的日志信息输出到console和file这两个目的地，console和file的定义在下面的代码
log4j.rootLogger=DEBUG,console,file

#控制台输出的相关设置
log4j.appender.console = org.apache.log4j.ConsoleAppender
log4j.appender.console.Target = System.out
log4j.appender.console.Threshold=DEBUG
log4j.appender.console.layout = org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=[%c]-%m%n

#文件输出的相关设置
log4j.appender.file = org.apache.log4j.RollingFileAppender
log4j.appender.file.File=./log/log.log
log4j.appender.fileAppender.Append = false  #文件追加
log4j.appender.file.MaxFileSize=10mb
log4j.appender.file.Threshold=DEBUG
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=[%p][%d{yy-MM-dd}][%c]%m%n

#日志输出级别
log4j.logger.org.mybatis=DEBUG
log4j.logger.org.apache=DEBUG
log4j.logger.java.sql=DEBUG
log4j.logger.java.sql.Connection=DEBUG
log4j.logger.java.sql.Statement=DEBUG
log4j.logger.java.sql.ResultSet=DEBUG
log4j.logger.java.sql.PreparedStatement=DEBUG
```
<a name="pPVgS"></a>
# mapper层
<a name="aIddC"></a>
## 编写配置文件
<a name="E43H7"></a>
### 数据库配置文件 
mysql.properties
```properties
# DataBase
mysql.driverClassName=com.mysql.cj.jdbc.Driver
mysql.username=root
mysql.password=xxxxxx
mysql.url=jdbc:mysql://localhost:3306/mybatis?useSSL=true&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC&rewriteBatchedStatements=true
```
<a name="r60HL"></a>
### Mybatis配置文件
mybatis-config.xml
```xml
<?xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE configuration 
        PUBLIC
        "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd"
        >

<!--核心配置文件-->
<configuration>

    <!--设置-->
    <settings>
        <!--log4j日志工厂-->
        <setting name="logImpl" value="LOG4J"/>
        <!--开启全局缓存 默认开启-->
        <setting name="cacheEnabled" value="true"/>
        <!--驼峰命名自动映射-->
        <setting name="mapUnderscoreToCamelCase" value="true"/>
    </settings>

    <!--起别名-->
    <typeAliases>
        <package name="pojo"/>
    </typeAliases>

    <!--映射器 mappers-->
    <mappers>
        <package name="mapper"/>
    </mappers>

</configuration>
```
<a name="Yqopn"></a>
### spring整合Mybatis配置文件
spring-mapper.xml
```xml
<?xml version="1.0" encoding="utf-8"?> 
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       https://www.springframework.org/schema/context/spring-context.xsd
">

    <!-- 引入数据库配置文件  配置数据库dataSource -->
    <context:property-placeholder location="classpath:mysql.properties"/>

    <beans>

        <!--data source  使用Druid连接池-->
        <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
            <property name="driverClassName"
                      value="${mysql.driverClassName}"/>
            <property name="url"
                      value="${mysql.url}"/>
            <property name="username"
                      value="${mysql.username}"/>
            <property name="password"
                      value="${mysql.password}"/>
        </bean>

        <!--sqlSessionFactory-->
        <!--利用Spring中SqlSessionFactoryBean生成sqlSessionFactory-->
        <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
            <!--配置数据源-->
            <property name="dataSource" ref="dataSource"/>
            <!--引入外部mybatis-config.xml-->
            <property name="configLocation" value="classpath:mybatis-config.xml"/>
        </bean>

        <!--Mybatis下  配置扫描Dao接口包,动态实现Dao接口注入到spring容器中-->
        <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
            <!-- 注入sqlSessionFactory -->
            <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory"/>
            <!-- 给出需要扫描mapper接口包 -->
            <property name="basePackage" value="mapper"/>
        </bean>

    </beans>


</beans>
```
<a name="zRZuk"></a>
## 编写接口
<a name="HNCVa"></a>
### UserMapper
```java
public interface UserMapper {

    /**
     * 通过userName查找user
     */
    User getUserByUserName(@Param("userName") String userName);

    /**
     * 通过UserName和password得到用户
     */
    User getUserByNameAndPwd(@Param("userName") String userName, @Param("password") String password);

    /**
     * 添加用户
     */
    int addUser(User user);
}
```
<a name="GtCYw"></a>
### BookMapper
```java
public interface BookMapper {

    /**
     * 查询所有书
     */
    List<Books> getBookList();

    /**
     * 查询一本书ByID
     */
    Books getBookByID(@Param("bookID") int bookID);

    /**
     * 查询书ByName
     */
    List<Books> getBookByBookName(@Param("bookName") String bookName);

    /**
     * 增加一本书
     */
    int addBook(Books book);

    /**
     * 删除一本书
     */
    int delBookByID(@Param("bookID") int bookID);

    /**
     * 更新一本书
     */
    int updateBookByID(Books book);

}
```
<a name="Sr2sb"></a>
## 编写SQL XML文件
<a name="MQdFn"></a>
### UserMapper.xml
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="mapper.UserMapper">

    <!--通过userName查找用户-->
    <select id="getUserByUserName" parameterType="string" resultType="user">
        select *
        from ssmbuild.user
        where userName like #{userName};
    </select>

    <!--通过UserName和password得到用户-->
    <select id="getUserByNameAndPwd" parameterType="string" resultType="user">
        select *
        from ssmbuild.user
        where userName like #{userName}
          and password like #{password};
    </select>

    <!--添加用户-->
    <insert id="addUser">
        insert into ssmbuild.user (userName, password) value (#{userName}, #{password})
    </insert>

</mapper>
```
<a name="yvF2v"></a>
### BookMapper.xml
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="mapper.BookMapper">

    <!--查询所有书-->
    <select id="getBookList" resultType="books">
        select *
        from ssmbuild.books;
    </select>

    <!--查询一本书ByID-->
    <select id="getBookByID" resultType="books">
        select *
        from ssmbuild.books
        where bookID = #{bookID};
    </select>

    <!--查询书ByName-->
    <select id="getBookByBookName" parameterType="string" resultType="books">
        select *
        from ssmbuild.books
        where bookName like concat('%', #{bookName}, '%');
    </select>

    <!--增加一本书-->
    <insert id="addBook" parameterType="books">
        insert into ssmbuild.books(bookName, bookCounts, detail)
            value (#{bookName}, #{bookCounts}, #{detail});
    </insert>

    <!--删除一本书ByID-->
    <delete id="delBookByID">
        delete
        from ssmbuild.books
        where bookID = #{bookID};
    </delete>

    <!--更新一本书-->
    <update id="updateBookByID" parameterType="books">
        update ssmbuild.books
        <set>
            <if test="bookName!=null">bookName=#{bookName},</if>
            <if test="bookCounts!=null">bookCounts=#{bookCounts},</if>
            <if test="detail!=null">detail=#{detail},</if>
        </set>
        where bookID = #{bookID};
    </update>

</mapper>
```
<a name="ruYtk"></a>
# service层
<a name="PYpGT"></a>
## 编写接口
<a name="NNxhY"></a>
### UserService
```java
public interface UserService {

    /**
     * 通过userName查找user
     */
    User getUserByUserName(@Param("userName") String userName);

    /**
     * 通过UserName和password得到用户
     */
    User getUserByNameAndPwd(@Param("userName") String userName, @Param("password") String password);

    /**
     * 添加用户
     */
    int addUser(User user);

}

```
<a name="lDemv"></a>
### BookService
```java
public interface BookService {

    /**
     * 查询所有书
     */
    List<Books> getBookList();

    /**
     * 查询一本书ByID
     */
    Books getBookByID(@Param("bookID") int bookID);

    /**
     * 查询书ByName
     */
    List<Books> getBookByBookName(@Param("bookName") String bookName);

    /**
     * 增加一本书
     */
    int addBook(Books book);

    /**
     * 删除一本书
     */
    int delBookByID(@Param("bookID") int bookID);

    /**
     * 更新一本书
     */
    int updateBookByID(Books book);

}

```
<a name="nK2OA"></a>
## 编写实现类
<a name="rGyGg"></a>
### UserServiceImpl
```java
//注册组件
@Service("userService")
@Scope("singleton")

//编写事务
@Transactional(propagation = Propagation.REQUIRED,
        isolation = Isolation.REPEATABLE_READ,
        timeout = 10
)
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    @Override
    public User getUserByNameAndPwd(String userName, String password) {
        return userMapper.getUserByNameAndPwd(userName, password);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

}

```
<a name="hDYCC"></a>
### BookServiceImpl
```java
// 注册组件
@Service("bookService")
@Scope("singleton")
// 编写事务
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.REPEATABLE_READ,
        timeout = 10
)
public class BookServiceImpl implements BookService {

    @Resource(name = "bookMapper")
    private BookMapper bookMapper;

    @Override
    public List<Books> getBookList() {
        return bookMapper.getBookList();
    }

    @Override
    public Books getBookByID(int bookID) {
        return bookMapper.getBookByID(bookID);
    }

    @Override
    public List<Books> getBookByBookName(String bookName) {
        return bookMapper.getBookByBookName(bookName);
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int delBookByID(int bookID) {
        return bookMapper.delBookByID(bookID);
    }

    @Override
    public int updateBookByID(Books book) {
        return bookMapper.updateBookByID(book);
    }

}
```
<a name="AkQEA"></a>
## 编写配置文件
<a name="nyv6P"></a>
### spring整合Mybatis 事务配置文件
```xml
<?xml version="1.0" encoding="utf-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:tx="http://www.springframework.org/schema/tx"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/tx
       https://www.springframework.org/schema/tx/spring-tx.xsd
       http://www.springframework.org/schema/context
       https://www.springframework.org/schema/context/spring-context.xsd
">

    <!--
    配置声明式事务
    -->
    <!--开启 Spring 的事务处理功能     创建事务管理器    mybatis使用DataSourceTransactionManager  -->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <!--注入数据源-->
        <property name="dataSource" ref="dataSource"/>
    </bean>
    <!--开启事务注解-->
    <tx:annotation-driven transaction-manager="transactionManager"/>

</beans>
```
<a name="RsXJV"></a>
# controller层
<a name="L09zL"></a>
## WEB.XML
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">

    <!--配置前端控制器 DispatcherServlet-->
    <servlet>
        <servlet-name>DispatcherServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <!--载入SpringMVC配置文件-->
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:applicationContext.xml</param-value>
        </init-param>
        <!--启动等级1 tomcat实例启动的时候启动Servlet-->
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>DispatcherServlet</servlet-name>
        <!--DispatcherServlet拦截路径-->
        <url-pattern>/</url-pattern>
    </servlet-mapping>

    <!--配置springMVC的编码过滤器-->
    <filter>
        <filter-name>CharacterEncodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
            <param-value>UTF-8</param-value>
        </init-param>
        <init-param>
            <param-name>forceResponseEncoding</param-name>
            <param-value>true</param-value>
        </init-param>
    </filter>
    <filter-mapping>
        <filter-name>CharacterEncodingFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>

    <!--配置HiddenHttpMethodFilter 请求过滤器-->
    <filter>
        <filter-name>HiddenHttpMethodFilter</filter-name>
        <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>HiddenHttpMethodFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>

</web-app>
```
<a name="ikflt"></a>
## 编写配置文件
<a name="t9juz"></a>
### applicationContext
```xml
<?xml version="1.0" encoding="utf-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/aop/spring-aop.xsd
">

    <!--引入配置文件-->
    <import resource="classpath:spring-mapper.xml"/>
    <import resource="classpath:spring-service.xml"/>
    <import resource="classpath:spring-controller.xml"/>

    <!--开启注解支持-->
    <context:annotation-config/>
    <!--扫描注解-->
    <context:component-scan base-package="pojo mapper service controller interceptors"/>

    <!--开启AOP注解支持-->
    <aop:aspectj-autoproxy/>

</beans>
```
<a name="Hgw1J"></a>
### spring-controller
```xml
<?xml version="1.0" encoding="utf-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/mvc
       https://www.springframework.org/schema/mvc/spring-mvc.xsd"
>

    <!-- 配置Thymeleaf视图解析器 -->
    <bean id="viewResolver" class="org.thymeleaf.spring5.view.ThymeleafViewResolver">
        <property name="order" value="1"/>
        <property name="characterEncoding" value="UTF-8"/>
        <property name="templateEngine">
            <bean class="org.thymeleaf.spring5.SpringTemplateEngine">
                <property name="templateResolver">
                    <bean class="org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver">

                        <!-- 视图前缀 -->
                        <property name="prefix" value="/WEB-INF/templates/"/>

                        <!-- 视图后缀 -->
                        <property name="suffix" value=".html"/>
                        <property name="templateMode" value="HTML5"/>
                        <property name="characterEncoding" value="UTF-8"/>
                    </bean>
                </property>
            </bean>
        </property>
    </bean>

    <!--文件解析器配置-->
    <bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
        <!--设置请求编码，碧血和jsp的pageEncoding属性一致，以便于正确读取表单的内容，默认为IOS-1-->
        <property name="defaultEncoding" value="utf-8"/>
        <!--上传文件大小上限，单位为字节 -->
        <property name="maxUploadSize" value="1073741824"/>
        <property name="maxInMemorySize" value="1073741824"/>
        <!--resolveLazily属性启用是为了推迟文件解析，以便在UploadController 中捕获文件大小异常-->
        <property name="resolveLazily" value="true"/>
    </bean>

    <!--配置异常处器-->
    <bean class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
        <property name="exceptionMappings">
            <props>
                <!--
                properties的键表示处理器方法执行过程中出现的异常
                properties的值表示若出现指定异常时，设置一个新的视图名称，跳转到指定页面
                -->
                <!--<prop key="java.lang.ArithmeticException">error</prop>-->
            </props>
        </property>
        <!--exceptionAttribute属性设置一个属性名，将出现的异常信息在请求域中进行共享-->
        <property name="exceptionAttribute" value="exception"></property>
    </bean>

    <!--配置拦截器-->
    <mvc:interceptors>
        <mvc:interceptor>
            <!--拦截-->
            <mvc:mapping path="/**"/>
            <mvc:exclude-mapping path="/"/>
            <mvc:exclude-mapping path="/toRegister"/>
            <mvc:exclude-mapping path="/toLogin"/>
            <mvc:exclude-mapping path="/user/login"/>
            <mvc:exclude-mapping path="/user/register"/>
            <mvc:exclude-mapping path="/cpacha/loginCpacha"/>
            <!--拦截规则-->
            <ref bean="loginInterceptor"></ref>
        </mvc:interceptor>
    </mvc:interceptors>

    <!--页面跳转-->
    <mvc:view-controller path="/" view-name="login"/>
    <mvc:view-controller path="/toLogin" view-name="login"/>
    <mvc:view-controller path="/toRegister" view-name="register"/>
    <mvc:view-controller path="/toAddBook" view-name="addBook"/>

    <!--开放对静态资源的访问 防止静态资源导入失败  一定配置在mvc注解驱动的标签之前-->
    <mvc:default-servlet-handler/>
    <!--开启mvc注解驱动的标签 处理器映射器和处理器适配器只需要开启注解驱动-->
    <mvc:annotation-driven/>

    <!--解决json乱码配置-->
    <mvc:annotation-driven>
        <mvc:message-converters register-defaults="true">
            <bean class="org.springframework.http.converter.StringHttpMessageConverter">
                <constructor-arg value="UTF-8"/>
            </bean>
            <bean class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
                <property name="objectMapper">
                    <bean class="org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean">
                        <property name="failOnEmptyBeans" value="false"/>
                    </bean>
                </property>
            </bean>
        </mvc:message-converters>
    </mvc:annotation-driven>

</beans>
```
<a name="svgt9"></a>
## controller
<a name="o7O3m"></a>
### BookController
```java
@Controller(value = "bookController")
public class BookController {

    // javax下的注解
    @Resource(name = "bookService")
    private BookService bookService;

    @RequestMapping(name = "展示所有书籍", value = {"/book"}, method = RequestMethod.GET)
    public ModelAndView queryBookList(ModelAndView modelAndView) {
        modelAndView.addObject("bookList", bookService.getBookList());
        modelAndView.addObject("queryName", "请输入要查询的书籍名称");
        modelAndView.setViewName("bookList");                                                   // 设置视图名称
        return modelAndView;
    }

    @RequestMapping(name = "查询书籍ByBookName", value = {"/book/{queryBookName}"}, method = RequestMethod.GET)
    public ModelAndView queryBookByBookName(@PathVariable("queryBookName") String queryBookName, ModelAndView modelAndView) {
        List<Books> books = bookService.getBookByBookName(queryBookName.trim());   //去除空格
        modelAndView.addObject("bookList", books);                         // 设置
        if (books.isEmpty()) {              //没有查到书
            modelAndView.addObject("bookIsEmpty", "没有查到数据!!!");
        } else {
            if (queryBookName == "") {
                modelAndView.addObject("queryName", "请输入要查询的书籍名称");
            } else {
                modelAndView.addObject("queryName", queryBookName);
            }
        }
        modelAndView.setViewName("bookList");
        return modelAndView;
    }

    @RequestMapping(name = "添加book", value = "/book", method = RequestMethod.POST)
    public String addBook(Books books) {
        bookService.addBook(books);
        return "redirect:/book";
    }

    @RequestMapping(name = "去修改页面，数据回显", value = "/toUpdate/{id}", method = RequestMethod.GET)
    public String toUpdatePager(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", bookService.getBookByID(id));
        return "updateBook";       // 返回视图
    }

    @RequestMapping(name = "修改信息", value = "/book", method = RequestMethod.PUT)
    public String updateBook(Books book) {
        System.out.println(bookService.updateBookByID(book) > 0 ? "修改成功!" : "修改失败!");
        return "redirect:/book";
    }

    @RequestMapping(name = "删除信息", value = "/book/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        System.out.println(bookService.delBookByID(id) > 0 ? "删除成功!" : "删除失败!");
        return "redirect:/book";
    }

}

```
<a name="SJ8L2"></a>
### UserController
```java
@Controller(value = "userController")
@RequestMapping(value = "/user")  // 根路径
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(name = "注册用户", value = "/register", method = RequestMethod.POST)
    public String register(User user) {
        if ("".equals(user.getUserName()) || "".equals(user.getPassword()))
            return "redirect:/toRegister";
        userService.addUser(user);
        return "redirect:/toLogin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request,
                        @RequestParam(value = "userName") String userName,
                        @RequestParam(value = "password") String password,
                        @RequestParam(value = "vcode") String vcode) {
        if (request.getSession().getAttribute("loginCpacha").toString().toUpperCase(Locale.ROOT).equals(vcode.trim().toUpperCase())) {
            // 验证码正确
            User user = userService.getUserByNameAndPwd(userName.trim(), password.trim());
            if (user != null) {
                //用户密码正确
                request.getSession().setAttribute("userName", userName.trim());      // 用户信息存入Session
                return "redirect:/book";    //跳转页面
            } else {
                // 用户名密码不正确
                request.setAttribute("error", "name错误或者password错误");
                return "login";
            }
        } else {
            //验证码不正确
            request.setAttribute("error", "验证码错误!");
            return "login";
        }
    }
}

```
<a name="SN0pM"></a>
### CpachaController
```java
@Controller
@RequestMapping(value = "/cpacha")
public class CpachaController {
    @SneakyThrows
    @RequestMapping("/loginCpacha")
    public void getLoginCpacha(HttpServletRequest req, HttpServletResponse resp) {
        CpachaUtil cpachaUtil = new CpachaUtil();
        String generatorVCode = cpachaUtil.generatorVCode();                   //获取验证码
        req.getSession().setAttribute("loginCpacha", generatorVCode);       //给Session设置验证码
        System.out.println("生成验证码： " + generatorVCode + "   " + " Session: " + req.getSession().getAttribute("loginCpacha"));
        BufferedImage generatorRotateVCodeImage = cpachaUtil.generatorRotateVCodeImage(generatorVCode, true);   //得到旋转验证码
        ImageIO.write(generatorRotateVCodeImage, "gif", resp.getOutputStream());     //写出验证码
    }
}

```
<a name="DmMtz"></a>
## View
<a name="G1hRk"></a>
### login.html
```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="UTF-8">
    <title>LOG IN</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link type="text/css" rel="stylesheet" th:href="@{/static/css/style.css}"/>
    <script>
        $(function () {
            // 点击图片切换验证码
            $("#vcodeImg").click(function () {
                $(this).prop("src", "/SSM/cpacha/loginCpacha?t=" + new Date().getTime());    //为了避免浏览器的缓存机制，改变参数
            });
            $(".txtb input").on("focus", function () {
                $(this).addClass("focus");
            });
            $(".txtb input").on("blur", function () {
                if ($(this).val() == "")
                    $(this).removeClass("focus");
            });
        });
    </script>
</head>
<body>

<form th:action="@{/user/login}" method="post" class="login-form">
    <h1>Log In</h1>
    <div class="txtb">
        <input type="text" id="userName" name="userName" placeholder="请输入userName:" required>
    </div>
    <div class="txtb">
        <input type="password" id="password" name="password" placeholder="请输入password:" required>
    </div>
    <p>
    <div style="float: left">
        <img id="vcodeImg" th:src="@{/cpacha/loginCpacha}" width="100px">
    </div>
    <input type="text" name="vcode" placeholder="请输入验证码" style=" width: 130px; height: 30px; margin-left:50px;  "
           required>
    </p>
    <input type="submit" value="Log In" class="logbtn">
    <input type="reset" value="reset" class="logbtn"/>
    <div class="info" style="text-align: center" th:text="${error}"></div>
    <div class="bottom-text">
        Don't have account?<a th:href="@{/toRegister}">Sign up</a><br/>
        © 2021 Designed by @wyl
    </div>
</form>


</body>
</html>
```
<a name="tuc4B"></a>
### register.html
```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="UTF-8">
    <title>Sign up</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link type="text/css" rel="stylesheet" th:href="@{/static/css/style.css}"/>
    <script>
        $(function () {
            $(".txtb input").on("focus", function () {
                $(this).addClass("focus");
            });
            $(".txtb input").on("blur", function () {
                if ($(this).val() == "")
                    $(this).removeClass("focus");
            });
        });
    </script>
</head>

<body>

<form th:action="@{/user/register}" method="post" class="login-form">
    <h1>Sign up</h1>
    <div class="txtb">
        <input type="text" id="userName" name="userName" placeholder="请输入userName:" required>
    </div>
    <div class="txtb">
        <input type="password" id="password" name="password" placeholder="请输入password:" required>
    </div>
    <input type="submit" value="submit" class="logbtn">
    <input type="reset" value="reset" class="logbtn"/>
    <div class="bottom-text">
        <a th:href="@{/toLogin}">Log In</a><br/>
        © 2021 Designed by @wyl
    </div>
</form>

</body>
</html>
```
<a name="TfAr7"></a>
### error.html
```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>error</title>
</head>
<body>

error<br/>
<!--异常信息-->
<p th:text="${exception}"></p>

</body>
</html>
```
<a name="Lfk63"></a>
### bookList.html
```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>书籍展示</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">

        <div class="col-md-12 column">
            <h1>
                <small>书籍列表-----显示所有数据</small>
            </h1>
        </div>

        <div class="row">
            <!--显示所有书籍按钮-->
            <div class="col-md-4 column">
                <a class="btn btn-primary" th:href="@{/book}">显示所有书籍</a>
            </div>
            <!--查询数据支持迷糊查询-->
            <div class="col-md-4 column" id="select">
                <form ref="selectFrom" th:action="@{/book/}" method="get" class="form-inline">
                    <span style="color: red;font-weight:bold" th:text="${bookIsEmpty}"></span>
                    <span><input type="text" v-model:name="queryBookName" class="form-control"
                                 th:placeholder="${queryName}"><input @click="selectSubmit" type="submit"
                                                                      value="查询"></span>
                </form>
            </div>
            <!--添加书籍按钮-->
            <div class="col-md-4 column">
                <a class="btn btn-primary" th:href="@{/toAddBook}">新增书籍</a>
            </div>
        </div>

    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">

                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <tr th:each="book:${bookList}">
                    <td th:text="${book.bookID}"></td>
                    <td th:text="${book.bookName}"></td>
                    <td th:text="${book.bookCounts}"></td>
                    <td th:text="${book.detail}"></td>
                    <td>
                        <div>
                            <form th:action="@{/toUpdate/{id}(id=${book.bookID})}" method="get">
                                <input class="btn btn-warning btn-sm" type="submit" value="修改"/>
                            </form>
                            &nbsp
                            <!--删除 DELETE请求-->
                            <form th:action="@{/book/{id}(id=${book.bookID})}" method="post">
                                <input type="hidden" name="_method" value="delete"/>
                                <input class="btn btn-danger btn-sm" type="submit" value="删除"/>
                            </form>
                        </div>
                    </td>
                </tr>
                </tbody>

            </table>
        </div>
    </div>
</div>


<script>
    new Vue({
        el: '#select',
        data: {
            queryBookName: '',
        },
        methods: {
            selectSubmit: function (e) {
                this.$refs.selectFrom.action += this.queryBookName; // 改变action
                this.queryBookName = '';
            }
        },
    });
</script>

</body>
</html>
```
<a name="irYNy"></a>
### addBook.html
```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>添加书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <h1>
                <small>新增书籍</small>
            </h1>
        </div>
    </div>

    <form th:action="@{/book}" method="post">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" class="from-control" id="bookName" name="bookName" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="text" class="from-control" id="bookCounts" name="bookCounts" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" class="from-control" id="detail" name="detail" required>
        </div>
        <div class="form-group">
            <input type="submit" class="from-control" id="submit" value="添加">
        </div>
    </form>

</div>


</body>
</html>
```
<a name="XNNjw"></a>
### updateBook.html
```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <h1>
                <small>修改书籍</small>
            </h1>
        </div>
    </div>

    <form th:action="@{/book}" method="post">
        <!--PUT 请求方式删除-->
        <input type="hidden" name="_method" value="put">

        <input type="hidden" name="bookID" th:value="${book.bookID}">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" class="from-control" id="bookName" name="bookName" th:value="${book.bookName}"
                   required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="text" class="from-control" id="bookCounts" name="bookCounts" th:value="${book.bookCounts}"
                   required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" class="from-control" id="detail" name="detail" th:value="${book.detail}"
                   required>
        </div>
        <div class="form-group">
            <input type="submit" class="from-control" id="submit" value="修改">
        </div>

    </form>

</div>

</body>
</html>
```
<a name="pEVVB"></a>
## utils
<a name="JC8Ho"></a>
### CpachaUtil
```java
/**
 * 生成图片验证码
 */

public class CpachaUtil {

    public CpachaUtil(int vcodeLen, int fontsize, int width, int height, int disturbline) {
        this.vcodeLen = vcodeLen;
        this.fontsize = fontsize;
        this.width = width;
        this.height = height;
        this.disturbline = disturbline;
    }

    /**
     * 验证码来源
     */
    final private char[] code = {
            '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    /**
     * 字体
     */
    final private String[] fontNames = new String[]{
            "黑体", "宋体", "Courier", "Arial",
            "Verdana", "Times", "Tahoma", "Georgia"};

    /**
     * 字体样式
     */
    final private int[] fontStyles = new int[]{
            Font.BOLD, Font.ITALIC | Font.BOLD
    };

    /**
     * 验证码长度
     * 默认4个字符
     */
    private int vcodeLen = 4;

    /**
     * 验证码图片字体大小
     * 默认17
     */
    private int fontsize = 21;

    /**
     * 验证码图片宽度
     */
    private int width = (fontsize + 1) * vcodeLen + 10;

    /**
     * 验证码图片高度
     */
    private int height = fontsize + 12;

    /**
     * 干扰线条数
     * 默认3条
     */
    private int disturbline = 3;


    public CpachaUtil() {
    }

    /**
     * 指定验证码长度
     * @param vcodeLen 验证码长度
     */
    public CpachaUtil(int vcodeLen) {
        this.vcodeLen = vcodeLen;
        this.width = (fontsize + 1) * vcodeLen + 10;
    }

    /**
     * 生成验证码图片
     * @param vcode    要画的验证码
     * @param drawline 是否画干扰线
     */
    public BufferedImage generatorVCodeImage(String vcode, boolean drawline) {
        //创建验证码图片
        BufferedImage vcodeImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = vcodeImage.getGraphics();
        //填充背景色
        g.setColor(new Color(246, 240, 250));
        g.fillRect(0, 0, width, height);
        if (drawline) {
            drawDisturbLine(g);
        }
        //用于生成伪随机数
        Random ran = new Random();
        //在图片上画验证码
        for (int i = 0; i < vcode.length(); i++) {
            //设置字体
            g.setFont(new Font(fontNames[ran.nextInt(fontNames.length)], fontStyles[ran.nextInt(fontStyles.length)], fontsize));
            //随机生成颜色
            g.setColor(getRandomColor());
            //画验证码
            g.drawString(vcode.charAt(i) + "", i * fontsize + 10, fontsize + 5);
        }
        //释放此图形的上下文以及它使用的所有系统资源
        g.dispose();

        return vcodeImage;
    }

    /**
     * 获得旋转字体的验证码图片
     * @param vcode
     * @param drawline 是否画干扰线
     */
    public BufferedImage generatorRotateVCodeImage(String vcode, boolean drawline) {
        //创建验证码图片
        BufferedImage rotateVcodeImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = rotateVcodeImage.createGraphics();
        //填充背景色
        g2d.setColor(new Color(246, 240, 250));
        g2d.fillRect(0, 0, width, height);
        if (drawline) {
            drawDisturbLine(g2d);
        }
        //在图片上画验证码
        for (int i = 0; i < vcode.length(); i++) {
            BufferedImage rotateImage = getRotateImage(vcode.charAt(i));
            g2d.drawImage(rotateImage, null, (int) (this.height * 0.7) * i, 0);
        }
        g2d.dispose();
        return rotateVcodeImage;
    }

    /**
     * 生成验证码
     */
    public String generatorVCode() {
        int len = code.length;
        Random ran = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < vcodeLen; i++) {
            int index = ran.nextInt(len);
            sb.append(code[index]);
        }
        return sb.toString();
    }

    /**
     * 为验证码图片画一些干扰线g
     */
    private void drawDisturbLine(Graphics g) {
        Random ran = new Random();
        for (int i = 0; i < disturbline; i++) {
            int x1 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int x2 = ran.nextInt(width);
            int y2 = ran.nextInt(height);
            g.setColor(getRandomColor());
            //画干扰线
            g.drawLine(x1, y1, x2, y2);
        }
    }

    /**
     * 获取一张旋转的图片
     * c 要画的字符
     */
    private BufferedImage getRotateImage(char c) {
        BufferedImage rotateImage = new BufferedImage(height, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = rotateImage.createGraphics();
        //设置透明度为0
        g2d.setColor(new Color(255, 255, 255, 0));
        g2d.fillRect(0, 0, height, height);
        Random ran = new Random();
        g2d.setFont(new Font(fontNames[ran.nextInt(fontNames.length)], fontStyles[ran.nextInt(fontStyles.length)], fontsize));
        g2d.setColor(getRandomColor());
        double theta = getTheta();
        //旋转图片
        g2d.rotate(theta, height / 2, height / 2);
        g2d.drawString(Character.toString(c), (height - fontsize) / 2, fontsize + 5);
        g2d.dispose();

        return rotateImage;
    }

    /**
     * 返回一个随机颜色
     */
    private Color getRandomColor() {
        Random ran = new Random();
        return new Color(ran.nextInt(220), ran.nextInt(220), ran.nextInt(220));
    }

    /**
     * 角度
     */
    private double getTheta() {
        return ((int) (Math.random() * 1000) % 2 == 0 ? -1 : 1) * Math.random();
    }

    /**
     * 验证码字符个数
     */
    public int getVcodeLen() {
        return vcodeLen;
    }

    /**
     * 设置验证码字符个数vcodeLen
     */
    public void setVcodeLen(int vcodeLen) {
        this.width = (fontsize + 3) * vcodeLen + 10;
        this.vcodeLen = vcodeLen;
    }

    /**
     * 字体大小
     */
    public int getFontsize() {
        return fontsize;
    }

    /**
     * 设置字体大小fontsize
     */
    public void setFontsize(int fontsize) {
        this.width = (fontsize + 3) * vcodeLen + 10;
        this.height = fontsize + 15;
        this.fontsize = fontsize;
    }

    /**
     * 图片宽度
     */
    public int getWidth() {
        return width;
    }

    /**
     * 设置图片宽度width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * 图片高度
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置图片高度height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 干扰线条数
     */
    public int getDisturbline() {
        return disturbline;
    }

    /**
     * 设置干扰线条数
     */
    public void setDisturbline(int disturbline) {
        this.disturbline = disturbline;
    }
}

```
<a name="hfMkP"></a>
### JacksonUtils
```java
public class JacksonUtils {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";    //解析时间格式
    private static ObjectMapper mapper = null;

    //无参的私有构造方法
    private JacksonUtils() {

    }

    //初始化mapper变量
    static {
        if (mapper == null) {
            mapper = new ObjectMapper();
            mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);    //关闭时间戳的方式
            mapper.setDateFormat(new SimpleDateFormat(DATE_FORMAT));                          //设置时间解析方式
        }
    }

    /**
     * 得到json字符串
     */
    @SneakyThrows
    public static String toJson(Object obj) {
        return mapper.writeValueAsString(obj);
    }

    /**
     * json转化为Obj
     */
    @SneakyThrows
    public static <T> T jsonToObj(String jsonString, Class<T> clazz) {
        return (T) mapper.readValue(jsonString, clazz);
    }

    /**
     * json转化为List
     */
    @SneakyThrows
    public static <T> List<T> jsonToList(String jsonString, Class<T> clazz) {
        return mapper.readValue(jsonString, mapper.getTypeFactory().constructParametricType(List.class, clazz));
    }

    /**
     * json转化为Map
     */
    @SneakyThrows
    public static <K, V> Map<K, V> jsonToMap(String jsonString, Class<K> keyType, Class<V> valueType) {
        return mapper.readValue(jsonString, mapper.getTypeFactory().constructMapType(Map.class, keyType, valueType));
    }

}

```
<a name="c7cn3"></a>
### GsonUtils
```java
public class GsonUtils {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";    // 解析时间格式
    private static Gson gson = null;                                    // 私有化Gosn对象

    // 无参的私有构造方法
    private GsonUtils() {

    }

    static {
        if (gson == null) {
            gson = new GsonBuilder()
                    .setLenient()                          //json宽松
                    .enableComplexMapKeySerialization()    //支持Map的key为复杂对象的形式
                    .serializeNulls()                      //智能null
                    .setPrettyPrinting()                   //调教格式
                    .disableHtmlEscaping()                 //默认是GSON把HTML 转义的
                    .setDateFormat(DATE_FORMAT)
                    .create();
        }
    }

    /**
     * 得到Gson对象
     */
    public static Gson getGosn() {
        return gson;
    }

    /**
     * 将对象转成json格式
     */
    @SneakyThrows
    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    /**
     * 将json转成特定的class的对象
     */
    @SneakyThrows
    public static <T> T jsonToObj(String jsonString, Class<T> clazz) {
        return gson.fromJson(jsonString, clazz);
    }

    /**
     * json字符串转成list
     */
    @SneakyThrows
    public static <T> List<T> jsonToList(String jsonString, TypeToken typeToken) {
        return gson.fromJson(jsonString, typeToken.getType());
    }

    @SneakyThrows
    public static <T> List<T> jsonToList(String jsonString, TypeToken typeToken, Class<T> clazz) {
        return gson.fromJson(jsonString, typeToken.getType());
    }

    /**
     * json字符串转成Map
     */
    @SneakyThrows
    public static <K, T> Map<K, T> jsonToMap(String jsonString, TypeToken typeToken) {
        return gson.fromJson(jsonString, typeToken.getType());
    }

    @SneakyThrows
    public static <K, T> Map<K, T> jsonToMap(String jsonString, TypeToken typeToken, Class<K> k, Class<T> t) {
        return gson.fromJson(jsonString, typeToken.getType());
    }
}

```
<a name="Z205N"></a>
## filter
<a name="Vc4p8"></a>
### GenericEncodingFilter
```java
@SuppressWarnings("all")
public class GenericEncodingFilter implements Filter {

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //处理response的字符编码
        HttpServletResponse myResponse = (HttpServletResponse) response;
        myResponse.setContentType("text/html;charset=UTF-8");

        // 转型为与协议相关对象
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        // 对request包装增强
        HttpServletRequest myrequest = new MyRequest(httpServletRequest);
        chain.doFilter(myrequest, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

}

//自定义request对象，HttpServletRequest的包装类
class MyRequest extends HttpServletRequestWrapper {

    private HttpServletRequest request;
    //是否编码的标记
    private boolean hasEncode;

    //定义一个可以传入HttpServletRequest对象的构造函数，以便对其进行装饰
    public MyRequest(HttpServletRequest request) {
        super(request);// super必须写
        this.request = request;
    }

    // 对需要增强方法 进行覆盖
    @Override
    public Map getParameterMap() {
        // 先获得请求方式
        String method = request.getMethod();
        if (method.equalsIgnoreCase("post")) {
            // post请求
            try {
                // 处理post乱码
                request.setCharacterEncoding("utf-8");
                return request.getParameterMap();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else if (method.equalsIgnoreCase("get")) {
            // get请求
            Map<String, String[]> parameterMap = request.getParameterMap();
            if (!hasEncode) { // 确保get手动编码逻辑只运行一次
                for (String parameterName : parameterMap.keySet()) {
                    String[] values = parameterMap.get(parameterName);
                    if (values != null) {
                        for (int i = 0; i < values.length; i++) {
                            try {
                                // 处理get乱码
                                values[i] = new String(values[i]
                                        .getBytes("ISO-8859-1"), "utf-8");
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                hasEncode = true;
            }
            return parameterMap;
        }
        return super.getParameterMap();
    }

    //取一个值
    @Override
    public String getParameter(String name) {
        Map<String, String[]> parameterMap = getParameterMap();
        String[] values = parameterMap.get(name);
        if (values == null) {
            return null;
        }
        return values[0]; // 取回参数的第一个值
    }

    //取所有值
    @Override
    public String[] getParameterValues(String name) {
        Map<String, String[]> parameterMap = getParameterMap();
        String[] values = parameterMap.get(name);
        return values;
    }
}

```
<a name="zJhzw"></a>
## interceptors
<a name="YcD0d"></a>
### LoginInterceptor
```java
@Component(value = "loginInterceptor")
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userName = (String) request.getSession().getAttribute("userName");
        if (userName != null) return true;
        response.sendRedirect(request.getContextPath() + "/toLogin");
        return false;
    }
}

```
<a name="OpX3u"></a>
# @Configuration
<a name="YOmLR"></a>
## WebAppInitializer
```java
// 代替WEB.XML
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 指定Spring的配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    // 指定SpringMVC的配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    // 指定DispatcherServlet的映射规则，即url-pattern
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};  // 路径
    }

    //添加过滤器
    @Override
    protected Filter[] getServletFilters() {

        // 配置springMVC的           编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("utf-8");
        characterEncodingFilter.setForceResponseEncoding(true);

        // 配置HiddenHttpMethodFilter 请求过滤器
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();

        return new Filter[]{characterEncodingFilter, hiddenHttpMethodFilter};
    }
}

```
<a name="emzyG"></a>
## RootConfig
```java
// 全局配置类
@Configuration
@ComponentScan({"config", "mapper", "service", "pojo"})
@Import(MapperConfig.class)         // 注入数据配置
public class RootConfig {

}
```
<a name="rSaHM"></a>
## MapperConfig
```java
@Configuration
@MapperScan(basePackages = "mapper")            // 扫描mapper
@EnableTransactionManagement                    // 开启事务注解
public class MapperConfig {

    private final String dbUrl = "jdbc:mysql://localhost:3306/mybatis?useSSL=true&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC&rewriteBatchedStatements=true";
    private final String username = "root";
    private final String password = "bsy8023.00";
    private final String driverClassName = "com.mysql.cj.jdbc.Driver";

    // 配置数据源
    @SneakyThrows
    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    //mybatis的配置
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml"));
        return sqlSessionFactoryBean;
    }

    // 配置事务管理器
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

}
```
<a name="VHo7P"></a>
## WebConfig
```java
package config;

import interceptors.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.util.List;
import java.util.Properties;

/**
 * @author by pepsi-wyl
 * @date 2022-03-01 17:13
 */

// 代替SpringMVC配置文件
@Configuration  // 标识为一个配置类
@ComponentScan({"controller"})   // 扫描组件
@EnableWebMvc                    // mvc注解驱动
public class WebConfig implements WebMvcConfigurer {


    //配置Thymeleaf视图解析器++++++++++++++++++++++++++++++++++++++++++++++++
    // 配置生成模板解析器
    @Bean
    public ITemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/templates/");   // 前缀
        templateResolver.setSuffix(".html");                 // 后缀
        templateResolver.setCharacterEncoding("UTF-8");      // 编码格式
        templateResolver.setTemplateMode(TemplateMode.HTML); // 模板类型HTML文件
        return templateResolver;
    }

    // 生成模板引擎并为模板引擎注入模板解析器
    @Bean
    public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver) {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver); // 设置templateResolver
        return templateEngine;
    }

    // 生成视图解析器并未解析器注入模板引擎
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine) {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setCharacterEncoding("UTF-8");           // 编码格式
        viewResolver.setTemplateEngine(templateEngine);       // 设置templateEngine
        return viewResolver;
    }
    //配置Thymeleaf视图解析器++++++++++++++++++++++++++++++++++++++++++++++++

    // 视图控制 ViewControllers
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 设置处理路径     设置跳转视图
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/toLogin").setViewName("login");
        registry.addViewController("/toRegister").setViewName("register");
        registry.addViewController("/toAddBook").setViewName("addBook");
    }

    // 拦截器 Interceptors
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 设置拦截路径 排除路径
        registry.addInterceptor(new LoginInterceptor())      // 拦截规则
                .addPathPatterns("/**")
                .excludePathPatterns("/")
                .excludePathPatterns("/toRegister")
                .excludePathPatterns("/toLogin")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/user/register")
                .excludePathPatterns("/cpacha/loginCpacha");
    }

    // 配置文件上传解析器 CommonsMultipartResolver
    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("utf-8");
        commonsMultipartResolver.setMaxUploadSize(1073741824L);
        commonsMultipartResolver.setMaxUploadSize(1073741824L);
        commonsMultipartResolver.setResolveLazily(true);
        return commonsMultipartResolver;
    }

    // 配置异常映射
    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
        Properties prop = new Properties();
        prop.setProperty("java.lang.ArithmeticException", "error");  // 设置异常类型 和 跳转页面
        //设置异常映射
        exceptionResolver.setExceptionMappings(prop);
        //ExceptionAttribute属性设置一个属性名，将出现的异常信息在请求域中进行共享
        exceptionResolver.setExceptionAttribute("exception");
        resolvers.add(exceptionResolver);
    }

    // 使用默认的servlet处理静态资源 DefaultServletHandling
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
    }
}

```
<a name="H556K"></a>
## 
<a name="nqfqV"></a>
## 
<a name="Udr9h"></a>
## 

<a name="L5B4q"></a>
## 

<a name="LgmgC"></a>
## 
<a name="Ho67m"></a>
## 

