package com.exequiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exequiel.dao.DaoFactory;
import com.exequiel.models.Cliente;
import com.exequiel.models.Producto;
import com.exequiel.models.Venta;

@SpringBootApplication
public class PrimeraEntregaApplication implements CommandLineRunner{
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		
		SpringApplication.run(PrimeraEntregaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		try {
			
			Cliente cliente1 = new Cliente("Roberto");
			Cliente cliente2 = new Cliente("Martin");
			Cliente cliente3 = new Cliente("Tomas");
			
			Venta venta1 = new Venta("coca cola");
			Venta venta2 = new Venta("pan");
			Venta venta3 = new Venta("leche");
			
			Producto producto1 = new Producto("Coca cola",5);
			Producto producto2 = new Producto("pan",3);
			Producto producto3 = new Producto("leche",4);
			Producto producto4 = new Producto("factura",7);
			Producto producto5 = new Producto("chisitos",2);
			
			dao.persistirCliente(cliente1);
			dao.persistirCliente(cliente2);
			dao.persistirCliente(cliente3);
			
			dao.persistirCliente(venta1);
			dao.persistirCliente(venta2);
			dao.persistirCliente(venta3);
			
			dao.persistirCliente(producto1);
			dao.persistirCliente(producto2);
			dao.persistirCliente(producto3);
			dao.persistirCliente(producto4);
			dao.persistirCliente(producto5);
			
			
		}catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

}
