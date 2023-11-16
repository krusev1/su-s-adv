package com.example.imdbg.model.entity.movies.apidtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiBoxOfficeAddDTO {

    private String openingWeekend;
    private String grossUsa;
    private String worldwide;
}
