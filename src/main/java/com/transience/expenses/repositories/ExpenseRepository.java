package com.transience.expenses.repositories;

import com.transience.expenses.domain.Expense;
import com.transience.expenses.domain.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Created by sanju on 2/01/2016.
 */
@RepositoryRestResource(collectionResourceRel = "expenses", path = "expenses")
public interface ExpenseRepository extends PagingAndSortingRepository<Expense, Long> {

}