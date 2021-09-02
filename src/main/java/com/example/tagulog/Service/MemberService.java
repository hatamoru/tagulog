package com.example.tagulog.Service;

import com.example.tagulog.model.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    //ログイン
    public void login(String email, String password);

    //ユーザ追加
    public void add(String name, String password, String email);

    //ユーザ削除
    public  void delete(Member member);

    //パスワード忘れの場合の再発行
    public void forget(Member member);
}
