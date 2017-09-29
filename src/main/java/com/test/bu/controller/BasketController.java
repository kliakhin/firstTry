package com.test.bu.controller;

import com.test.bu.entity.Basket;
import com.test.bu.service.interfaces.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    private BasketService basketService;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, @RequestParam(value = "edit", required = false) boolean edit, Model model) {
        model.addAttribute("basket", basketService.getById(id));
        if (edit) {
            return "editBasket";
        } else {
            return "showBasket";
        }
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("basketList", basketService.getAll());
        return "basketList";
    }

    @GetMapping("/create")
    public String createPage() {
        return "createBasketForm";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Basket basket) {
        basketService.save(basket);
        return "redirect:all";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Basket basket) {
        basketService.update(basket);
        return "redirect:" + basket.getId() + "?edit=false";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        basketService.delete(id);
        return "redirect:/all";
    }

}
