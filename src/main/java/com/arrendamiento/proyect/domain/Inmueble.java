package com.arrendamiento.proyect.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.List;


/**
 * The persistent class for the inmueble database table.
 * 
 */
@Entity
@NamedQuery(name="Inmueble.findAll", query="SELECT i FROM Inmueble i")
public class Inmueble implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_inmueble")
	private Integer idInmueble;
	@NotNull
	private String descripcion;
	@NotNull
	private String direccion;
	@NotNull
	private String imagen;
	@NotNull
	private Long monto;

	@Column(name="tipo_inmueble")
	private String tipoInmueble;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	public Inmueble() {
	}
	
	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getIdInmueble() {
		return this.idInmueble;
	}

	public void setIdInmueble(Integer idInmueble) {
		this.idInmueble = idInmueble;
	}

	public Long getMonto() {
		return this.monto;
	}

	public void setMonto(Long monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoInmueble() {
		return this.tipoInmueble;
	}

	public void setTipoInmueble(String tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}