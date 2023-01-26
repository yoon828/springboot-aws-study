package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//어노테이션으로 인해 스프링부트 자동설정, 스프링 Bean 읽기, 생성 자동으로 설정
@SpringBootApplication
public class Application { //프로젝트의 메인 클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //내장 WAS 실행
    }
}
