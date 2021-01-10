package com.robencosta.app.rest.api.domain.lead.mapper;

import java.util.List;

import com.robencosta.app.rest.api.domain.lead.dto.response.LeadResponseBodyDto;
import com.robencosta.app.rest.api.domain.lead.model.Lead;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LeadMapper {
    
    LeadMapper INSTANCE = Mappers.getMapper(LeadMapper.class);
    
    List<Lead> leadsDtoToLeadsDto(List<LeadResponseBodyDto> leadsDTO);

    List<LeadResponseBodyDto> leadsToLeadsDto(List<Lead> leads);
}
