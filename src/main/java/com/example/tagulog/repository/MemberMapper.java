package com.example.tagulog.repository;

import com.example.tagulog.model.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Mapper
@Repository
public interface MemberMapper {

    @Select("select * from members")
    Collection<Member> findAll();

    @Insert("INSERT INTO members (name, password, email) VALUES(#{name}, #{password}, #{email})")
    void add(String name, String password, String email);

    @Select("select password from members where email = #{email}")
    String searchUser(String email);

    @Delete("DELETE from members where email = {email}")
    String deleteUser(String email);


}
