package com.test.bu.controller;


import com.test.bu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goodsList")
    public String getAllGoods(Model model) {
        model.addAttribute("goodsList", goodsService.getAll());
        return "goodsList";
    }

}
