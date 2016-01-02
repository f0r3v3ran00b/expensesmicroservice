package com.transience.expenses.repositories;

import com.transience.expenses.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by sanju on 2/01/2016.
 */
@RepositoryRestResource(collectionResourceRel = "tags", path = "tags")
public interface TagRepository extends JpaRepository<Tag, Long> {

}
