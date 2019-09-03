package com.lyl.service;

import com.lyl.mapper.UsersMapper;
import com.lyl.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public void insert(Users users){
        this.usersMapper.insertUser(users);
    }

    public List<Users> findUserAll(){
        return  this.usersMapper.selectUsersAll();
    }
    public Users findUserById(int id){
        return this.usersMapper.selectUsersById(id);
    }
    public void updateUsers(Users users){
         this.usersMapper.updateUser(users);
    }
    public void deleteUserById(int id){
        this.usersMapper.deleteUserById(id);
    }
}
