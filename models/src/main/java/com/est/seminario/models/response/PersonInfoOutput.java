package com.est.seminario.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
public class PersonInfoOutput {
    private int id;
    private String name;
    private String email;
}
