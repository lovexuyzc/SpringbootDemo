package com.boot.springbootdemo.controller;


import com.boot.springbootdemo.Entity.Entitys;
import com.boot.springbootdemo.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @outhor shkstart
 * @create 2019-09-11 11:37
 */
@Controller
public class test {
    Logger logger=LoggerFactory.getLogger(test.class);
    @Autowired
    EntityRepository entityRepository;
    @RequestMapping("/test")
    public String A(Map map){
        map.put("wwt","2333");
        map.put("wwts","23111");
        logger.info("sdsds");
        return "test";
    }
    @RequestMapping("/login")
    public String Login(Map<String,Object> map, HttpSession session){
        session.setAttribute("loginuser","张三" );

        return "login";
    }
    @PutMapping("/emp")
    public String puts(Model model, Entitys entity){

        System.out.println(entity);
        entityRepository.save(entity);
       return "redirect:/test";
        //return "forward:/test";
    }
    @DeleteMapping("/emp/{id}")
    public String delete(@PathVariable("id") Integer id){
        System.out.println(id);

        return "redirect:/test";
        //return "forward:/test";
    }


}
