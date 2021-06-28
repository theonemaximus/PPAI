package com.dsigrupo12.ppai.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exposicion {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalTime horaApertura;
	private LocalTime horaCierre;
	private PublicoDestino publicoDestino;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public LocalTime getHoraApertura() {
		return horaApertura;
	}
	public void setHoraApertura(LocalTime horaApertura) {
		this.horaApertura = horaApertura;
	}
	public LocalTime getHoraCierre() {
		return horaCierre;
	}
	public void setHoraCierre(LocalTime horaCierre) {
		this.horaCierre = horaCierre;
	}
	public PublicoDestino getPublicoDestino() {
		return publicoDestino;
	}
	public void setPublicoDestino(PublicoDestino publicoDestino) {
		this.publicoDestino = publicoDestino;
	}
}
