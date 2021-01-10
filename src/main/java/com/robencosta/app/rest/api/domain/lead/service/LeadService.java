package com.robencosta.app.rest.api.domain.lead.service;

import java.util.List;

import com.robencosta.app.rest.api.domain.lead.dto.response.LeadResponseBodyDto;

import org.springframework.data.domain.Pageable;

public interface LeadService {
    
    List<LeadResponseBodyDto> getLeads(Pageable pageable);
}
