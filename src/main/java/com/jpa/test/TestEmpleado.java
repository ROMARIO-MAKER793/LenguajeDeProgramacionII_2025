package com.jpa.test;

<<<<<<< HEAD
import java.util.Date;
import java.util.List;

import java.text.SimpleDateFormat;

=======
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

>>>>>>> cbf14af0e3ae6b332c057c9906d65671a7dc0194
import com.jpa.dao.ClassCrudEmpleadoImp;
import com.jpa.modelo.TblEmpleado;

public class TestEmpleado {

	public static void main(String[] args) {
<<<<<<< HEAD
		//realizamos la respectiva instancia...
		ClassCrudEmpleadoImp crud=new ClassCrudEmpleadoImp();
		TblEmpleado emp=new TblEmpleado();
		  //insertamos datos....
	/*	emp.setNombre("iban jorge");
		emp.setApellido("ramirez");
		emp.setDni("10356669");
		emp.setEmail("luis@gmail.com");
		emp.setSexo("m");
		emp.setTelf("35554689");
		 Date fecha=new Date();
		 Date fechasql=new Date(fecha.getTime());
		emp.setFechanac(fechasql); 
		//invocamos el metodo registrar...
		crud.registrarEmpleado(emp);
		//enviamos mensaje por pantalla
		System.out.println("datos registrados en BD ****");*/
		
		// *********testeando el listado.....
	/*	List<TblEmpleado> listaempleado=crud.listadoEmpleado();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 //aplicamos un bucle....
		for(TblEmpleado lista:listaempleado){
			//imprimimos por pantalla
			System.out.println("nombre "+lista.getNombre()+
					" apellido "+lista.getApellido()+" dni "+
					lista.getDni()+" email "+lista.getEmail()+
					" sexo "+lista.getSexo()
				+" telefono "+lista.getTelf()+
					" fechanaci "+sdf.format(lista.getFechanac()));
		} //fin del bucle for....
		
		//Testeando el eliminar
		 
		 
*/
		//Testeando eliminar
		
		emp.setIdempleado(5);
		crud.eliminarEmpleado(emp);
		
	} //fin del metodo principal.....

} //fin de la clase....
=======
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
>>>>>>> cbf14af0e3ae6b332c057c9906d65671a7dc0194
