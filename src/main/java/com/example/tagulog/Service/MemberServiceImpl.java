package com.example.tagulog.Service;

import com.example.tagulog.model.Member;
import com.example.tagulog.repository.MemberMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.naming.NoPermissionException;
import java.nio.channels.AcceptPendingException;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService
{
    private final Member member;
    private final MemberMapper memberMapper;

    @Override
    public void login(Member member)
    {
        // login処理を行う
        // email とpw を引っ張ってきて二つで照合
        // email pwのどちらかが違う場合　エラー
    }

    @Override
    @Transactional
    public void add(String name, String password, String email)
    {

        // 登録済みのアドレスを利用しようとした場合はエラー mapper
        String userEmail = this.memberMapper.searchUser(email);
        if (userEmail == null) {
            System.out.println("hoge");
        }

        // 登録処理
        //必要なパラメータを入力しているか判定 name password email
        if (name == null || password == null || email == null){
            System.out.println("error");
        }

        try {
            //DBに追加 mapper利用 暗号化処理
            this.memberMapper.add(name, password, email);

        } catch (Exception e){
            //throw new Exception();　エラー
        }
    }

    @Override
    @Transactional
    public void delete(Member member)
    {
        //登録済みのアドレスの存在確認
        //mapper で検索
        if ("ff".equals("ff")) {
            //存在してない場合はエラー
        }
            //存在してない場合はエラー
        //削除処理
            //削除 mapper
        //例外処理
            //何かしらの予期せぬエラーが発生した場合はエラー
    }

    @Override
    @Transactional
    public void forget(Member member)
    {

    }

}
