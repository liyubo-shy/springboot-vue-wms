package com.wms.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.wms.common.QueryPageParam;
import com.wms.entity.User;
import com.wms.service.impl.MenuServiceImpl;
import com.wms.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowReactiveWebServerFactory;
import org.springframework.web.bind.annotation.*;

import javax.jnlp.ClipboardService;
import java.util.List;
import java.util.Queue;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bobo
 * @since 2022-11-03
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }

    //新增
    @PostMapping("/save")
    public boolean save (@RequestBody User user ){
        return userService.save(user);
    }

    //删除
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userService.removeById(id);
    }

    //修改
    @PostMapping("/update")
    public boolean update(@RequestBody User user){
        return userService.updateById(user);
    }

    //修改或新增
    @PostMapping("/saveOrUpdate")
    public boolean saveOrUpdate(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    //模糊查询 by name
    @PostMapping("/listP")
    public List<User> listP(@RequestBody User user){
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.like(User::getName,user.getName());
        return userService.list(userLambdaQueryWrapper);
    }

    //分页查询
    @PostMapping("/listPage")
    public void listPage(@RequestBody QueryPageParam param){
        System.out.println("页数="+param.getPageNum());
        System.out.println("条数="+param.getPageSize());

    }
}