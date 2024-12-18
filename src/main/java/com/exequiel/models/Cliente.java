package com.exequiel.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String apellido;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(	
				name ="Cliente_Venta", 
				joinColumns = @JoinColumn(name ="cliente_id"),
				inverseJoinColumns = @JoinColumn(name = "venta_id")
				)
	private List<Venta> Ventas = new ArrayList<>();
	
	private LocalDateTime createdAt;
	
	public Cliente() {
		super();
	}
	
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}


	public Cliente(Long id, String nombre, String apellido, List<Venta> ventas, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		Ventas = ventas;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Venta> getVentas() {
		return Ventas;
	}
	public void setVentas(List<Venta> ventas) {
		Ventas = ventas;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", Ventas=" + Ventas
				+ ", createdAt=" + createdAt + "]";
	}
	
	
	
}
