package com.gestion.productos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int idProducto;
	private String Nombre;
	private String Descripcion;
	private double Precio;
	private String Imagen;
	private int CantidadStock;

	public Producto(int idProducto, String nombre, String descripcion, double precio, String imagen,
			int cantidadStock) {
		super();
		this.idProducto = idProducto;
		Nombre = nombre;
		Descripcion = descripcion;
		Precio = precio;
		Imagen = imagen;
		CantidadStock = cantidadStock;
	}
	
	
	public Producto(String nombre, String descripcion, double precio, String imagen,
			int cantidadStock) {
		super();		
		Nombre = nombre;
		Descripcion = descripcion;
		Precio = precio;
		Imagen = imagen;
		CantidadStock = cantidadStock;
	}

	
	public Producto() {
		super();
		
	}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	public String getImagen() {
		return Imagen;
	}


	public void setImagen(String imagen) {
		Imagen = imagen;
	}


	public int getCantidadStock() {
		return CantidadStock;
	}


	public void setCantidadStock(int cantidadStock) {
		CantidadStock = cantidadStock;
	}
	
	
	
	
	
}
