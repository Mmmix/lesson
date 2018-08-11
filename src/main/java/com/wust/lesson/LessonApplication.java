package com.wust.lesson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wust.lesson.study.mapper")
public class LessonApplication {
    public static void main(String[] args) {
        SpringApplication.run(LessonApplication.class, args);
    }
}
