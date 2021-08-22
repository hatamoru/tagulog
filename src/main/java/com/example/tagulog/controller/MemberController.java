package com.example.tagulog.controller;

import com.example.tagulog.Service.MemberService;
import com.example.tagulog.model.Member;
import com.example.tagulog.varidation.CheckBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController
{
    @Autowired
    private MemberService memberService;

    //ユーザログイン
    @PostMapping("/login")
    public Object login(@RequestBody Member member)
    {
        this.memberService.login(member);
        ResponseEntity<Object> status = new ResponseEntity<>(HttpStatus.CREATED);
        return status;
    }

    //ユーザ追加
    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody Member member)
    {
        this.memberService.add(member.getName(), member.getPassword(), member.getEmail());
        ResponseEntity<Object> status = new ResponseEntity<>(HttpStatus.CREATED);
        return status;
    }

    //ユーザ削除
    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestBody Member member)
    {
        this.memberService.delete(member);
        ResponseEntity<Object> status = new ResponseEntity<>(HttpStatus.CREATED);
        return status;
    }

    //登録ユーザ情報を出力 ログイン済みユーザかadminでないとできないようにする
    @GetMapping("/get")
    public void getPage(@RequestBody Member member)
    {

    }
}
