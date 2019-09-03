package com.lyl.controller;

import com.lyl.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class  UserController {
    /**
     * 处理请求，产生数据
     */
    @RequestMapping("/showUser")
    public String showUser(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users(1,"张1",20));
        list.add(new Users(2,"张2",21));
        list.add(new Users(3,"张3",22));
        //将List传递到jsp中，需要一个model对象
        model.addAttribute("list",list);
        //跳转视图
        return "userList";
    }
}
