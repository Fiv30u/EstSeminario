package com.est.seminario.models.Entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "PERSON")
public class PersonEntity {

    @Id
    @Generated
    private int id;
    private String name;
    private String email;
}
