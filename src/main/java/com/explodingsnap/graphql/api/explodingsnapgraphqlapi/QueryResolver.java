package com.explodingsnap.graphql.api.explodingsnapgraphqlapi;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model.Alumne;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model.Partida;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.repository.AlumneRepository;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.repository.PartidaRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {
	private AlumneRepository alumneRepository;
	private PartidaRepository partidaRepository;

	public List<Alumne> getLlistaAlumnes(){
		return alumneRepository.findAll();
	}
	
	public List<Partida> getLlistaPartides(){
		return partidaRepository.findAll();
	}
	
	public Optional<Alumne> getAlumne(Long idAlumne) {
		return alumneRepository.findById(idAlumne);
	}
	
	public Optional<Partida> getPartida(Long id){
		return partidaRepository.findById(id);
	}
	
}
