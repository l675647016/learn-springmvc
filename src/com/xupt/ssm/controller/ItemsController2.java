package com.xupt.ssm.controller;

import com.xupt.ssm.po.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 梁峻磊 on 2017/8/14.
 * 实现HttpRequestHandler接口的 处理器
 */
public class ItemsController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException {

        //调用service查找 数据库，查询商品列表，这里使用静态数据模拟
        List<Items> itemsList = new ArrayList<Items>();
        //向list中填充静态数据

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);
        //设置模型数据
        request.setAttribute("itemsList", itemsList);
        //设置转发的视图
        request.getRequestDispatcher("items/itemsList").forward(request, response);
    }

    /*@Override
    public ModelAndView handleRequest
            (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
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
        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

        return modelAndView;
    }*/
}
