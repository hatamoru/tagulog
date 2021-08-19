package com.example.tagulog.controller;


import com.example.tagulog.model.Member;
import com.example.tagulog.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    private String Home(){
        return "this is home\n";
    }

}
