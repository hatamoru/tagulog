package com.example.tagulog.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Member {
    private String name;
    private String password;
    private String url;
    private String comment;
    private String evaluation;
    private String email;

}
