package com.liuencier.thymeleaf.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private long id;
    private String name;
    private int age;
}
