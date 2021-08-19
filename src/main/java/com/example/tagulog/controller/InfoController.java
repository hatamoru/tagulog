package com.example.tagulog.controller;

import com.example.tagulog.Service.InfoService;
import com.example.tagulog.model.Member;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class InfoController
{
    private InfoService infoService;

    // Todo アノテーション適用
    @GetMapping("/info")
    public ResponseEntity<Object> getInfo(@RequestBody Member member)
    {
        this.infoService.get(member);

        ResponseEntity<Object> status = new ResponseEntity<>(HttpStatus.OK);
        return status;
    }

    // Todo アノテーション適用
    @PostMapping("/info")
    public ResponseEntity<Object> addInfo(@RequestBody Member member)
    {
        this.infoService.add(member);

        ResponseEntity<Object> status = new ResponseEntity<>(HttpStatus.CREATED);
        return status;

    }

    // Todo アノテーション適用
    @DeleteMapping("/info")
    public ResponseEntity<Object> deleteInfo(@RequestBody Member member)
    {
        this.infoService.delete(member);

        ResponseEntity<Object> status = new ResponseEntity<>(HttpStatus.OK);
        return status;

    }
}