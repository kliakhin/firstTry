package com.test.bu.controller;


import com.test.bu.entity.Goods;
import com.test.bu.service.interfaces.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, @RequestParam(value = "edit", required = false) boolean edit, Model model) {
        model.addAttribute("goods", goodsService.getById(id));
        if (edit) {
            return "editGoods";
        } else {
            return "showGoods";
        }
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("goodsList", goodsService.getAll());
        return "goodsList";
    }

    @GetMapping("/create")
    public String createPage() {
        return "createGoodsForm";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Goods goods) {
        goodsService.save(goods);
        return "redirect:all";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Goods goods) {
        goodsService.update(goods);
        return "redirect:" + goods.getId() + "?edit=false";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        goodsService.delete(id);
        return "redirect:/all";
    }

}
