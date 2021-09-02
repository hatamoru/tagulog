package com.example.tagulog.Service;

import com.example.tagulog.model.Member;
import com.example.tagulog.repository.InfoMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class InfoServiceImpl implements InfoService
{

    private final InfoMapper infoMapper;
    /*
    店の情報を追加する
     */
    @Override
    public void add(Member member)
    {

        // 値判定
        this.infoMapper.add(member);
    }

    /*
    店の情報を削除する
     */
    @Override
    public void delete(Member member)
    {
        this.infoMapper.delete(member);

    }

    /*
    店の情報を取得する
     */
    @Override
    public Collection<Member> get()
    {
        Collection<Member> infoMapperAll = this.infoMapper.findAll();
        return infoMapperAll;
    }
}
