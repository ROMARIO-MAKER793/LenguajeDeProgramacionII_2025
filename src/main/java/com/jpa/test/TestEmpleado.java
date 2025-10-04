package com.jpa.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.jpa.dao.ClassCrudEmpleadoImp;
import com.jpa.modelo.TblEmpleado;

public class TestEmpleado {

	public static void main(String[] args) {
		// Realizamos la respectiva instancia
		ClassCrudEmpleadoImp crud = new ClassCrudEmpleadoImp();
		TblEmpleado emp = new TblEmpleado();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		//Insertamos datos
		
		emp.setNombre("Erika");
		emp.setApellido("Fernandez");
		emp.setDni("15963247");
		emp.setEmail("ErikaFa@gmail.com");
		emp.setSexo("f");
		emp.setTelf("35789652");
		Date fecha = new Date();
			Date fechasql = new Date(fecha.getTime());
		emp.setFechanac(fechasql);
		
		//Invocamos el metodo registrar
				crud.registrarEmpleado(emp);
		
		// Enviamos por Consola
		
		System.out.println("datos Registrados en la BD *****" );
		
		//Testeando el Listado
		
		/*List<TblEmpleado> listaempleado = crud.listadoEmpleado();
		
		// Aplicando bucle for
		
		for(TblEmpleado lista : listaempleado){
			String fechaFormateada = sdf.format(lista.getFechanac());
			 
			System.out.println(
				    "Nombre: " + lista.getNombre() + "\n" + 
				    "Apellido: " + lista.getApellido() + "\n" +
				    "DNI: " + lista.getDni() + "\n" +
				    "Email: " + lista.getEmail() + "\n" +
				    "Sexo: " + lista.getSexo() + "\n" +
				    "Teléfono: " + lista.getTelf() + "\n" +
				    "Fecha de nacimiento: " + fechaFormateada + "\n"
				);

			
		} // Fin del bucle
*/			
		
	}	//Fin del metodo Main

}	//Fin de la clase..
