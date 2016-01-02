package com.transience.expenses.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by sanju on 2/01/2016.
 */

@Entity
@Table(name = "expenses", schema = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expenseSeqGen")
    @SequenceGenerator(name = "expenseSeqGen", sequenceName = "expenses.expenses_id_seq")
    private Long id;


    @Column(name = "expense_amount")
    private Long expenseAmount;


    @Column(name = "expense_description")
    private String expenseDescription;


    @Column(name = "expense_datetime")
    private LocalDateTime expenseDateTime;


    @ManyToMany(mappedBy = "tagExpenses")
    private Set<Tag> expenseTags;
}
