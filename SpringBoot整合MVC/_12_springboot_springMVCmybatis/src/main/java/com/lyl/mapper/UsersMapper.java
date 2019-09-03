package com.lyl.mapper;

import com.lyl.pojo.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsersMapper {
    @Results({ //2
            @Result(property = "id", column = "id"), //2
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })

    @Insert("INSERT INTO users(name,age) VALUES (#{name},#{age})")
    void insertUser(Users users);

    @Select("select * from users")
    List<Users> selectUsersAll();

    @Select("select * from users where id=#{id}")
    Users selectUsersById(int id);

    @Update("update users set name=#{name}, age=#{age} where id=#{id}")
    void updateUser(Users users);

    @Delete("delete from users where id=#{id}")
    void deleteUserById(int id);
}
