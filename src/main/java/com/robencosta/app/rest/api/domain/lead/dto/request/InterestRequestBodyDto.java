package com.robencosta.app.rest.api.domain.lead.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterestRequestBodyDto {
    
    @NotBlank(message = "The description interest field is required.")
    private String description;
}
