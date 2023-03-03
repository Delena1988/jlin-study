package cn.joinhealth.springbootsqlite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.joinhealth.springbootsqlite.mapper")
public class SpringBootSqliteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSqliteApplication.class, args);
    }

}
