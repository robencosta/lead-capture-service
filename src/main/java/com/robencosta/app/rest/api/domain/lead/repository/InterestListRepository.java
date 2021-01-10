package com.robencosta.app.rest.api.domain.lead.repository;

import com.robencosta.app.rest.api.domain.lead.model.Interest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InterestListRepository extends PagingAndSortingRepository<Interest, Long> {
    
}
