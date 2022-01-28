package com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alumne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlumne;
    private String nom;
}


