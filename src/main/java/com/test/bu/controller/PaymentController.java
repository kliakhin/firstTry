package com.test.bu.controller;

import com.test.bu.entity.Payment;
import com.test.bu.service.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, @RequestParam(value = "edit", required = false) boolean edit, Model model) {
        model.addAttribute("payment", paymentService.getById(id));
        if (edit) {
            return "editPayment";
        } else {
            return "showPayment";
        }
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("payments", paymentService.getAll());
        return "paymentList";
    }

    @GetMapping("/create")
    public String createPage(Principal principal) {
        if (principal != null) {
            System.out.println(principal.getName());
        }
        return "createPaymentForm";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Payment payment) {
        paymentService.save(payment);
        return "redirect:all";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Payment payment) {
        paymentService.update(payment);
        return "redirect:" + payment.getId() + "?edit=false";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        paymentService.delete(id);
        return "redirect:/all";
    }
}
