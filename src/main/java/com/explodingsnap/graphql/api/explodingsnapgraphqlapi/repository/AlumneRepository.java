package com.explodingsnap.graphql.api.explodingsnapgraphqlapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model.Alumne;

public interface AlumneRepository extends JpaRepository<Alumne, Long> {
	Optional<Alumne> findById(Long idAlumne);

}
