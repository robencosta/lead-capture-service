package com.robencosta.app.rest.api.domain.lead.repository;

import com.robencosta.app.rest.api.domain.lead.model.Lead;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface LeadRepository extends PagingAndSortingRepository<Lead, Long>{
    
}
