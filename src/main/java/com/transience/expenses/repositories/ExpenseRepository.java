package com.transience.expenses.repositories;

import com.transience.expenses.domain.Expense;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by sanju on 2/01/2016.
 */
@RepositoryRestResource(collectionResourceRel = "expenses", path = "expenses")
public interface ExpenseRepository extends PagingAndSortingRepository<Expense, Long> {

}
