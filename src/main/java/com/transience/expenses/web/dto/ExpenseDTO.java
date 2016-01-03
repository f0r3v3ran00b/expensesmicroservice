package com.transience.expenses.web.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by sanju on 3/01/2016.
 */
@Component
public class ExpenseDTO {

    private Long id;

    private Double expenseAmount;

    private LocalDateTime expenseDateTime;

    private String expenseDescription;

    private List<String> tagList;

    private List<Long> tagIdsList;

    private Long currencyId;


    // --------------- BORING STUFF


    public ExpenseDTO() {
    }

    public ExpenseDTO(Long id, Double expenseAmount, LocalDateTime expenseDateTime, String expenseDescription, List<String> tagList, List<Long> tagIdsList, Long currencyId) {
        this.id = id;
        this.expenseAmount = expenseAmount;
        this.expenseDateTime = expenseDateTime;
        this.expenseDescription = expenseDescription;
        this.tagList = tagList;
        this.tagIdsList = tagIdsList;
        this.currencyId = currencyId;
    }

    public Long getId() {
        return id;
    }

    public ExpenseDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public ExpenseDTO setExpenseAmount(Double expenseAmount) {
        this.expenseAmount = expenseAmount;
        return this;
    }

    public LocalDateTime getExpenseDateTime() {
        return expenseDateTime;
    }

    public ExpenseDTO setExpenseDateTime(LocalDateTime expenseDateTime) {
        this.expenseDateTime = expenseDateTime;
        return this;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public ExpenseDTO setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
        return this;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public ExpenseDTO setTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public List<Long> getTagIdsList() {
        return tagIdsList;
    }

    public ExpenseDTO setTagIdsList(List<Long> tagIdsList) {
        this.tagIdsList = tagIdsList;
        return this;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public ExpenseDTO setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
        return this;
    }
}
