package com.explodingsnap.graphql.api.explodingsnapgraphqlapi.resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model.Alumne;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model.Partida;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.repository.PartidaRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AlumneResolver implements GraphQLResolver<Alumne> {
	private PartidaRepository partidaRepository; 
	
	public List<Partida> getPartidesJugades(Alumne alumne){
		return partidaRepository.findByIdAlumne(alumne.getIdAlumne());
	}
}
