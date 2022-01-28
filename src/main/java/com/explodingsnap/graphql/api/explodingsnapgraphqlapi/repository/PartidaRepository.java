package com.explodingsnap.graphql.api.explodingsnapgraphqlapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model.Partida;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
	List<Partida> findByIdAlumne(Long idAlumne);
}
