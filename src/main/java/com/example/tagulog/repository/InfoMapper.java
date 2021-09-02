package com.example.tagulog.repository;

import com.example.tagulog.model.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface InfoMapper {
    //infoDB周りのSQLの実行

    @Select("select * from info")
    Collection<Member> findAll();

    @Insert("insert into val~")
    void add(Member member);

    @Delete("delete from info where e~")
    void delete(Member member);


}
