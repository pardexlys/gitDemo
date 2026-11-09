package com.example.gitdemo2.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String name;

    private Integer age;

    private Long idCard;

    private Long phoneNum;
    
}
