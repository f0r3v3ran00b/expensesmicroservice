package com.transience.expenses.repositories;

import com.transience.expenses.domain.Currency;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by sanju on 2/01/2016.
 */
@RepositoryRestResource(collectionResourceRel = "currencies", path = "currencies")
public interface CurrencyRepository extends PagingAndSortingRepository<Currency, Long> {

}
