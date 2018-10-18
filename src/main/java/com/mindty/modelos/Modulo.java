package com.mindty.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="modulo")
public class Modulo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idm;
	
	@Column(unique = true)
	private String codigoMondulo;
	
	@Column
	private String nombreModulo;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
        name = "modulo_unidad", 
        joinColumns = { @JoinColumn(name = "idModulo") }, 
        inverseJoinColumns = { @JoinColumn(name = "idUnidad") }
    )
	private List<Unidad> unidad;
	
	@OneToOne(mappedBy = "modulo")
	private Nota nota;

	
	/* Constructores de Modulo */
	
	public Modulo() {
	}
	
	public Modulo(String codigoMondulo, String nombreModulo, List<Unidad> unidad) {
		this.codigoMondulo = codigoMondulo;
		this.nombreModulo = nombreModulo;
		this.unidad = unidad;
	}

	public Modulo(int idm, String codigoMondulo, String nombreModulo) {
		this.idm = idm;
		this.codigoMondulo = codigoMondulo;
		this.nombreModulo = nombreModulo;
	}

	
	/* Geters & Seters de Modulo */
	
	public int getIdm() {
		return idm;
	}

	public void setIdm(int idm) {
		this.idm = idm;
	}

	public String getCodigoMondulo() {
		return codigoMondulo;
	}

	public void setCodigoMondulo(String codigoMondulo) {
		this.codigoMondulo = codigoMondulo;
	}

	public String getNombreModulo() {
		return nombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

	public List<Unidad> getUnidad() {
		return unidad;
	}

	public void setUnidad(List<Unidad> unidad) {
		this.unidad = unidad;
	}	
}