package com.dsigrupo12.ppai.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsigrupo12.ppai.entities.EstadoReserva;


@Controller
@RequestMapping("/")
public class GestorReservas {

	/*private EscuelaService escuelaService;
	
	@Autowired
	public GestorReservas(EscuelaService escuelaService) {
		this.escuelaService = escuelaService;
	}*/

	@GetMapping
	public String opcionRegReservaGuiada() {
		return "PantallaAdministrarReservas";
	}
	
	public List<String> buscarEscuelas() {
		return null;
	}
	
	public void tomarIngresoCantVisitantes() {
		
	}
	
	public List<String> buscarSede() {
		return null;
	}
	
	public List<String> buscarTiposVisita() {
		return null;
	}
	
	public List<String> buscarExposicionesTemporalesVigentes() {
		return null;
	}
	
	public Double calcularDuracionEstimada() {
		return null;
	}
	
	public void VerificarCapacidadMaximaSede() {
		
	}
	
	public int CalcularCantidadGuiasNecesarios() {
		return 0;
	}
	
	public String buscarEmpleadoLogueado() {
		return null;
	}
	
	public int buscarUltimoNroReserva() {
		return 0;
	}
	
	public EstadoReserva buscarEstadoReserva() {
		return null;
	}
	
	public Long obtenerFechaHoraSistema() {
		return null;
	}
	
	public void registrarReserva() {
		
	}
	
}
