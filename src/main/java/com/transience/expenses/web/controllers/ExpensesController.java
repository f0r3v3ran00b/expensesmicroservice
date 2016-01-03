package com.transience.expenses.web.controllers;

import com.transience.expenses.services.TagService;
import com.transience.expenses.web.dto.ExpenseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExpensesController {

    @Autowired
    TagService tagService;

    @RequestMapping("/expense/list")
    String index(){

        return "list_expenses";
    }

    @RequestMapping(value = "/expense/add", method = RequestMethod.GET)
    public String showAddExpenseForm(Model model) {
        model.addAttribute("allTags", tagService.getAllTags());
        model.addAttribute("expenseDTO", new ExpenseDTO());

        return "add_expense";
    }

    @RequestMapping(value = "/expense/add", method = RequestMethod.POST)
    public String addExpense(Model model) {
        return "add_expense";
    }

    // --------------BORING STUFF


    public ExpensesController setTagService(TagService tagService) {
        this.tagService = tagService;
        return this;
    }
}
