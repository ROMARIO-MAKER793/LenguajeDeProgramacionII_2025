package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.interfaces.IEmpleado;
import com.jpa.modelo.TblEmpleado;

<<<<<<< HEAD
public class ClassCrudEmpleadoImp  implements IEmpleado{

	@Override
	public void registrarEmpleado(TblEmpleado tblempleado) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory  conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
	//menejador de entidades segun unidad de persistencia....
		EntityManager em=conex.createEntityManager();
		//************realizamos el proceso.....
		    //iniciar la transaccion...
		em.getTransaction().begin();
		    //registramos datos...
		     //si fuera JDBC seria insert into tbl_empleado values......
		em.persist(tblempleado);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
	
	
	} //fin del metodo registrar....

	@Override
	public void actualizarEmpleado(TblEmpleado tblempleado) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory  conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
	//menejador de entidades segun unidad de persistencia....
		EntityManager em=conex.createEntityManager();
		//************realizamos el proceso.....
		    //iniciar la transaccion...
		em.getTransaction().begin();
		    //actualizar datos...
		     //si fuera JDBC seria update tbl_empleado values......
		em.merge(tblempleado);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	} //fin del metodo actualizar...

	@Override
	public void eliminarEmpleado(TblEmpleado tblempleado) {

		//establecemos conexion con la unidad de persistencia
				EntityManagerFactory  conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
			//menejador de entidades segun unidad de persistencia....
				EntityManager em=conex.createEntityManager();
				//************realizamos el proceso.....
				    //iniciar la transaccion...
				em.getTransaction().begin();
				//recuperar el codigo a programar
				TblEmpleado elim = em.merge(tblempleado);
				//Eliminando el dato
				em.remove(elim);
				//
				System.out.println("Empleado eliminado de la BD***");
				//
				em.getTransaction().commit();
				//
				em.close();
		
	} //fin del metodo eliminar....

	@Override
	public List<TblEmpleado> listadoEmpleado() {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
		//manejador de entidades...
		EntityManager em=conex.createEntityManager();
		//realizamos el proceso...
		    //iniciar la transaccion....
		em.getTransaction().begin();
		//aplicamos JPQL  se base en entidades....
		List<TblEmpleado> listado=em.createQuery("select e from TblEmpleado e",TblEmpleado.class).getResultList();
		//confirmamos...
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listado;
	
	} //fin del metodo listar.....

	@Override
	public TblEmpleado buscarEmpleado(TblEmpleado tblempleado) {

		//establecemos conexion con la unidad de persistencia...
				EntityManagerFactory conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
				//manejador de entidades...
				EntityManager em=conex.createEntityManager();
				//realizamos el proceso...
				    //iniciar la transaccion....
				em.getTransaction().begin();
				//
				TblEmpleado buscar = em.find(TblEmpleado.class, tblempleado.getIdempleado());
				//
				em.getTransaction().commit();
				//cerramos
				em.close();
				
		return buscar;
	} //fin del metodo buscar.....

} //fin de la clase....
=======
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
>>>>>>> cbf14af0e3ae6b332c057c9906d65671a7dc0194
