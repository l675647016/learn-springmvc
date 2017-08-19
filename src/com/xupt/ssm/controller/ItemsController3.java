package com.xupt.ssm.controller;

import com.xupt.ssm.po.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 梁峻磊 on 2017/8/14.
 * 注解开发handler
 */
//Controller标识控制器
@Controller
public class ItemsController3 {
    //RequestMapping实现对queryItems方法和url进行映射，一个方法对应一个url
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{

        List<Items> itemsList = new ArrayList<Items>();

        Items items1 = new Items();
        items1.setName("联想笔记本");
        items1.setPrice(5000f);
        items1.setDetail("ThinkPad T430联想笔记本！！");

        Items items2 = new Items();
        items2.setName("苹果手机");
        items2.setPrice(4000f);
        items2.setDetail("iphone7苹果手机！！！");

        itemsList.add(items1);
        itemsList.add(items2);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",itemsList);
        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }

}
