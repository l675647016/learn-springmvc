package com.xupt.ssm.controller;

import com.xupt.ssm.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 梁峻磊 on 2017/8/14.
 * 实现controller接口的 处理器
 */
public class ItemsController1 implements Controller {
    @Override
    public ModelAndView handleRequest
            (HttpServletRequest request, HttpServletResponse response) throws Exception {
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

        //相当于request.setAttribut,在jsp页面中通关过itemList取数据
        modelAndView.addObject("itemsList",itemsList);

        //指定视图
        modelAndView.setViewName("items/itemsList");

        return modelAndView;
    }
}
