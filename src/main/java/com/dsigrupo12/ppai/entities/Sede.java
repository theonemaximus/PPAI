package com.dsigrupo12.ppai.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sede {

	private String nombre;
	private int cantMaximaVisitantes;
	private List<Empleado> empleados;
	private List<Exposicion> exposiciones;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantMaximaVisitantes() {
		return cantMaximaVisitantes;
	}
	public void setCantMaximaVisitantes(int cantMaximaVisitantes) {
		this.cantMaximaVisitantes = cantMaximaVisitantes;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public List<Exposicion> getExposiciones() {
		return exposiciones;
	}
	public void setExposiciones(List<Exposicion> exposiciones) {
		this.exposiciones = exposiciones;
	}
	
	
	public List<Exposicion> getExposicionesTemporalesVigentes(LocalDate fechaInicio, LocalDate fechaFin) {
		List<Exposicion> exposicionesVigentes = new ArrayList<>();
		for (Exposicion exposicion: this.exposiciones) {
			if (exposicion.getFechaInicio().isAfter(fechaInicio) && exposicion.getFechaFin().isBefore(fechaFin)) {
				exposicionesVigentes.add(exposicion);
			}
		}
		return exposicionesVigentes;
	}
}
