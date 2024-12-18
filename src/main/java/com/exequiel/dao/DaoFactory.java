package com.exequiel.dao;

import org.springframework.stereotype.Service;

import com.exequiel.models.Cliente;
import com.exequiel.models.Producto;
import com.exequiel.models.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void persistirCliente(Cliente cliente) {
		em.persist(cliente);
	}
	
	@Transactional
	public void persistirCliente(Venta venta) {
		em.persist(venta);
	}
	
	@Transactional
	public void persistirCliente(Producto producto) {
		em.persist(producto);
	}
	
}
