package com.transience.expenses.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpensesController {
    @RequestMapping("/expense/list")
    String index(){

        return "list_expenses";
    }
}
