package com.wms.controller;


import com.wms.entity.Menu;
import com.wms.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bobo
 * @since 2022-11-03
 */
@RestController
public class MenuController {
    @Autowired
    private MenuServiceImpl menuService;
    @GetMapping("/menu")
    public List<Menu> list(){
        return menuService.list();
    }
}
