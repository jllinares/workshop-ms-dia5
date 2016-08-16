package org.jllinares.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * The Class SaludaService.
 */
@Service
public class SaludaService {
	
	/** The saludo. */
	private String saludo;
	
	/**
	 * Sets the saludo.
	 *
	 * @param saludo the new saludo
	 */
	@Value("${app.saludo}")
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	/**
	 * Saluda.
	 *
	 * @param nombre the nombre
	 * @return the string
	 */
	public String saluda(String nombre) {
		return saludo + " " + nombre;
	}
}