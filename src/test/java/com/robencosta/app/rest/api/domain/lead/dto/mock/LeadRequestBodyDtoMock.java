package com.robencosta.app.rest.api.domain.lead.dto.mock;

import com.robencosta.app.rest.api.domain.lead.dto.request.LeadRequestBodyDto;

public final class LeadRequestBodyDtoMock {
    
    private static final LeadRequestBodyDtoMock INSTANCE = new LeadRequestBodyDtoMock();

    private LeadRequestBodyDtoMock() {
    }

    public LeadRequestBodyDto getOneLead() {
        
        return          
            LeadRequestBodyDto.builder()
                .name("Ana Maria de Souza Lima")
                .email("ana.souza@gmail.com")
                .build();
    }
    
    public static LeadRequestBodyDtoMock getInstance() {
        return INSTANCE;
    }
}
