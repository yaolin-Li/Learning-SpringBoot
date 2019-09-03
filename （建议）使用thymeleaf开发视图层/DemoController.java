package com.lyl.controller;

import com.lyl.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class DemoController {

    @RequestMapping("/show")
    public String showInfo(Model model){
        model.addAttribute("msg","Thymeleaf 第一个案例");
        model.addAttribute("key",new Date());
        return "index";
    }

    @RequestMapping("/show2")
    public String showInfor2(Model model){
        model.addAttribute("sex","男");
        model.addAttribute("id","2");
        return "index2";
    }

    @RequestMapping("/show3")
    public String showInfor3(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users(1,"张三",20));
        list.add(new Users(2,"李四",23));
        list.add(new Users(3,"王五",51));
        model.addAttribute("list",list);
        return "index3";
    }

    @RequestMapping("/show4")
    public String showInfor4(Model model){
        Map<String,Users> map = new HashMap<>();
        map.put("u1",new Users(1,"张三",20));
        map.put("u2",new Users(2,"李四",23));
        map.put("u3",new Users(3,"王五",51));
        model.addAttribute("map",map);
        return "index4";
    }

    @RequestMapping("/show5")
    public String showInfor5(HttpServletRequest request, Model model){
    request.setAttribute("req","HttpServletRequest");
    request.getSession().setAttribute("sess","HttpSession");
    request.getSession().getServletContext().setAttribute("app","Application");
    return "index5";
    }
}
