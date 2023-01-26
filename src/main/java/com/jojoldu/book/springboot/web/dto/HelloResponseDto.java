package com.jojoldu.book.springboot.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


//선언된 모든 필드의 get메소드 생성
//선언된 모든 final필드가 포함된 생성자 생성.

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;

}
