package com.explodingsnap.graphql.api.explodingsnapgraphqlapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.transaction.annotation.Transactional;

import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model.Alumne;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.model.Partida;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.repository.AlumneRepository;
import com.explodingsnap.graphql.api.explodingsnapgraphqlapi.repository.PartidaRepository;

public class DataProvider implements CommandLineRunner  {
	private AlumneRepository alumneRepository;
	private PartidaRepository partidaRepository;
	
	@Override
	@Transactional
	public void run(String... strings) {
		Alumne alumne1 = alumneRepository.save(new Alumne(null, "Harry"));
		Alumne alumne2 = alumneRepository.save(new Alumne(null, "Ron"));
		partidaRepository.save(new Partida(null, 13, true, alumne1.getIdAlumne()));
		partidaRepository.save(new Partida(null, 33, false, alumne1.getIdAlumne()));
		partidaRepository.save(new Partida(null, 14, true, alumne2.getIdAlumne()));
		partidaRepository.save(new Partida(null, 23, true, alumne2.getIdAlumne()));
		
	}
}
