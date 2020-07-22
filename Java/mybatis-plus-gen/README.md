MybatisPlus 代码自动生成相关示例

## 依赖
必要依赖：

``` xml
<dependencies>
  <!-- mybatis-plus依赖 -->
  <dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>${mybatis.plus.version}</version>
  </dependency>

  <!-- Druid引入 -->
  <dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid-spring-boot-starter</artifactId>
    <version>${druid.version}</version>
  </dependency>

  <!-- 数据源驱动 -->
  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>${mysql.version}</version>
  </dependency>

  <!-- 代码生成器依赖 -->
  <dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-generator</artifactId>
    <version>${mybatis.plus.version}</version>
  </dependency>

  <dependency>
    <groupId>com.ibeetl</groupId>
    <artifactId>beetl</artifactId>
    <version>${beetl.version}</version>
  </dependency>
</dependencies>
```

## 使用
config 文件夹中的类为必要的配置类，需要加入到 src 目录中。

EntityGenerator 为主要执行类，放在测试目录下填写好必要的信息运行即可。
