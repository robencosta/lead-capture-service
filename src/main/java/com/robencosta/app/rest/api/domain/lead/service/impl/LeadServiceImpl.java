package com.robencosta.app.rest.api.domain.lead.service.impl;

import java.util.List;

import com.robencosta.app.rest.api.domain.lead.dto.response.LeadResponseBodyDto;
import com.robencosta.app.rest.api.domain.lead.mapper.LeadMapper;
import com.robencosta.app.rest.api.domain.lead.mock.LeadMock;
import com.robencosta.app.rest.api.domain.lead.model.Lead;
import com.robencosta.app.rest.api.domain.lead.service.LeadService;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LeadServiceImpl implements LeadService {
    
    private LeadMapper animeMapper;
    
    @Override
    public List<LeadResponseBodyDto> getLeads(Pageable pageable) {
        
        List<Lead> leads = LeadMock.getInstance()
                                      .getLeads();

        return animeMapper.leadsToLeadsDto(leads);
    }
}
