package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.interfaces.IEmpleado;
import com.jpa.modelo.TblEmpleado;

public class ClassCrudEmpleadoImp implements IEmpleado {

	@Override
	public void registrarEmpleado(TblEmpleado tblempleado) {
		// Establecemos con la conexion de la unidad de persistencia
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
		
		// Manejador de Entidades segun la unidad de persistencia
		
		EntityManager em = conex.createEntityManager();
		
		// Realizamos el proceso
		
		// Iniciar la transaccion
		
		em.getTransaction().begin();
		
		// Registramos datos
		
		em.persist(tblempleado);
		
		// Confirmamos
		
		em.getTransaction().commit();
		
		// Cerramos
		
		em.close();
		
	} // Fin del metodo registrar

	@Override
	public void actualizarEmpleado(TblEmpleado tblempleado) {
		// Establecemos con la conexion de la unidad de persistencia
				EntityManagerFactory conex = Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
				
				// Manejador de Entidades segun la unidad de persistencia
				
				EntityManager em = conex.createEntityManager();
				
				// Realizamos el proceso
				
				// Iniciar la transaccion
				
				em.getTransaction().begin();
				
				// Actualizar datos
				
				em.merge(tblempleado);
				
				// Confirmamos
				
				em.getTransaction().commit();
				
				// Cerramos
				
				em.close();

	} // Fin del metodo actualizar

	@Override
	public void eliminarEmpleado(TblEmpleado tblempleado) {
		// TODO Auto-generated method stub

	} // Fin del metodo Eliminar

	@Override
	public List<TblEmpleado> listadoEmpleado() {
		// Establecemos conexion con la unidad de persistencia
		
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
		
		// Manejador de Entidades
		
		EntityManager em = conex.createEntityManager();
		
		// Realizamos el proceso
			// Iniciar la transaccion
		
		em.getTransaction().begin();
		
		// Aplicamos JPQL se basa en entidades
		
		List<TblEmpleado> listado = em.createQuery("select e from TblEmpleado e", TblEmpleado.class).getResultList();
		
		// Confirmamos
		
		em.getTransaction().commit();
		
		// Cerramos
		
		em.close();
		
		
		return listado;
	} // Fin del metodo Listar

	@Override
	public TblEmpleado buscarEmpleado(TblEmpleado tblempleado) {
		// TODO Auto-generated method stub
		return null;
	}	//Fin del metodo Buscar

} // Fin de la clase....
