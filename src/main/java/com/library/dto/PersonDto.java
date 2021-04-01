package com.library.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PersonDto {
    private String id;
    private String name;
    private List<TakenBookDto> books;



}
