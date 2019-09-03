package com.lyl.controller;

import com.lyl.pojo.Users;
import com.lyl.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

//    @RequestMapping(value="/insert")
//    public String insert(String name, int age) {
//        return usersService.insert(name, age);
//    }
    /**
     * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.insert(users);
        return "ok";
    }
    /**
     * 查询全部用户
     */
    @RequestMapping("/findUserAll")
    public String findUserAll(Model model){
        List<Users> list = this.usersService.findUserAll();
        model.addAttribute("list",list);
        return "showUsers";
    }
    /**
     * 查询单个用户
     */
    @RequestMapping("/findUserById")
    public String findUserById(Model model,int id){
        Users user = this.usersService.findUserById(id);
        model.addAttribute("user",user);
        return "updateUsers";
    }
    /**
     * 修改单个用户
     */
    @RequestMapping("/editUser")
    public String editUser(Users users){
        this.usersService.updateUsers(users);
        return "ok";
    }
    /**
     * 删除用户
     */
    @RequestMapping("/delUser")
    public String delUser(int id){
        this.usersService.deleteUserById(id);
        return "redirect:/users/findUserAll";//重定向
    }
}

