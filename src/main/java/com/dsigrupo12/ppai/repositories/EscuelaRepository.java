package com.dsigrupo12.ppai.repositories;

import java.util.ArrayList;
import java.util.List;

import com.dsigrupo12.ppai.entities.Escuela;

public interface EscuelaRepository {

	public default List<Escuela> findAll() {
		List<Escuela> escuelas = new ArrayList<>();
		escuelas.add(new Escuela());
		return escuelas;
	}
}
