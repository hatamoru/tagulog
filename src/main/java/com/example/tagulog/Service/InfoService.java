package com.example.tagulog.Service;

import com.example.tagulog.model.Member;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface InfoService {

    //店の情報をデータベースに追加
    public void add(Member member);

    //店の情報をデータベースから削除
    public void delete(Member member);

    //店の情報を取得 (選択式にしてもいいかも)
    public Collection<Member> get();

}
