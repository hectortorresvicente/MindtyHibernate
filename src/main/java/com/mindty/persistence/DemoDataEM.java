package com.mindty.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindty.modelos.Alumno;
import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;
import com.mindty.modelos.Nota;
import com.mindty.modelos.Unidad;
import com.mindty.modelos.Usuario;

public class DemoDataEM extends EntityManager {
	
	private static DemoDataEM instance = null;

	public static final DemoDataEM getInstance() {
		if (instance == null)
			instance = new DemoDataEM();
		return instance;
	}

	protected DemoDataEM() {
	}
	
	public boolean updateDemoData() {
		boolean isOK = false;
			
		/* Creamos las unidades*/
		Unidad unidad1 = new Unidad();
		unidad1.setNombreUnidad("UNIDAD 1 - TEST 1");
		Unidad unidad2 = new Unidad();
		unidad2.setNombreUnidad("UNIDAD 2 - TEST 2");
		Unidad unidad3 = new Unidad();
		unidad3.setNombreUnidad("UNIDAD 3 - TEST 3");
		Unidad unidad4 = new Unidad();
		unidad4.setNombreUnidad("UNIDAD 4 - TEST 4");
		
		Unidad unidad5 = new Unidad();
		unidad5.setNombreUnidad("UNIDAD 11 - TEST 11");
		Unidad unidad6 = new Unidad();
		unidad6.setNombreUnidad("UNIDAD 12 - TEST 12");
		Unidad unidad7 = new Unidad();
		unidad7.setNombreUnidad("UNIDAD 13 - TEST 13");
		Unidad unidad8 = new Unidad();
		unidad8.setNombreUnidad("UNIDAD 14 - TEST 14");
		
		Unidad unidad9 = new Unidad();
		unidad9.setNombreUnidad("UNIDAD 21 - TEST 21");
		Unidad unidad10 = new Unidad();
		unidad10.setNombreUnidad("UNIDAD 22 - TEST 22");
		Unidad unidad11 = new Unidad();
		unidad11.setNombreUnidad("UNIDAD 23 - TEST 23");
		Unidad unidad12 = new Unidad();
		unidad12.setNombreUnidad("UNIDAD 24 - TEST 24");

		
		/* Creamos las lista de Unidades*/
		List<Unidad> unidadesModulo1= new ArrayList<Unidad>();
		unidadesModulo1.add(unidad1);
		unidadesModulo1.add(unidad2);
		unidadesModulo1.add(unidad3);
		unidadesModulo1.add(unidad4);
		
		List<Unidad> unidadesModulo2= new ArrayList<Unidad>();
		unidadesModulo2.add(unidad5);
		unidadesModulo2.add(unidad6);
		unidadesModulo2.add(unidad7);
		unidadesModulo2.add(unidad8);
		
		List<Unidad> unidadesModulo3= new ArrayList<Unidad>();
		unidadesModulo3.add(unidad9);
		unidadesModulo3.add(unidad10);
		unidadesModulo3.add(unidad11);
		unidadesModulo3.add(unidad12);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* Creamos los modulos */
		Modulo modulo1 = new Modulo();
		modulo1.setCodigoMondulo("123 ABC");
		modulo1.setNombreModulo("Modulo 1 - TEST CURSO 1");
		modulo1.setUnidad(unidadesModulo1);
		
		Modulo modulo2 = new Modulo();
		modulo2.setCodigoMondulo("456 SFE");
		modulo2.setNombreModulo("Modulo 2 - TEST CURSO 1");
		modulo2.setUnidad(unidadesModulo2);
		
		Modulo modulo3 = new Modulo();
		modulo3.setCodigoMondulo("789 RTF");
		modulo3.setNombreModulo("Modulo 1 - TEST CURSO 2");
		modulo3.setUnidad(unidadesModulo3);
		
		/* Listamos los Modulos con sus Unidades */
		List<Modulo> modulosCurso1 = new ArrayList<Modulo>();
		modulosCurso1.add(modulo1);
		modulosCurso1.add(modulo2);
		
		List<Modulo> modulosCurso2 = new ArrayList<Modulo>();
		modulosCurso2.add(modulo3);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* Creación de los Alumnos */
		Alumno alumno1 = new Alumno();
		alumno1.setNombreUsuario("Nombre 1");
		alumno1.setPassword("Password");
		alumno1.setEmail("email1@email.com");
		alumno1.setTelefono("93-555-75-54");
		alumno1.setTipo(3);
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombreUsuario("Nombre 2");
		alumno2.setPassword("Password");
		alumno2.setEmail("email2@email.com");
		alumno2.setTelefono("93-555-75-54");
		alumno2.setTipo(3);
		
		Alumno alumno3 = new Alumno();
		alumno3.setNombreUsuario("Nombre 3");
		alumno3.setPassword("Password");
		alumno3.setEmail("email3@email.com");
		alumno3.setTelefono("93-555-75-54");
		alumno3.setTipo(3);
		
		/* Creación de los Profesores */
		Usuario profe1 = new Usuario();
		profe1.setNombreUsuario("Nombre 4");
		profe1.setPassword("Password");
		profe1.setEmail("email4@email.com");
		profe1.setTelefono("93-555-75-55");
		profe1.setTipo(2);
		
		Usuario profe2 = new Usuario();
		profe2.setNombreUsuario("Nombre 5");
		profe2.setPassword("Password");
		profe2.setEmail("email5@email.com");
		profe2.setTelefono("93-555-75-55");
		profe2.setTipo(2);
		
		/* Creación del Coordinador */
		Usuario coordi1 = new Usuario();
		coordi1.setNombreUsuario("Nombre 6");
		coordi1.setPassword("Password");
		coordi1.setEmail("email6@email.com");
		coordi1.setTelefono("93-555-75-56");
		coordi1.setTipo(1);	
		
		
		/* Lista de usuarios para los cursos */
		List<Usuario> usuariosCurso1 = new ArrayList<Usuario>();
		usuariosCurso1.add(alumno1);
		usuariosCurso1.add(alumno2);
		
		List<Usuario> usuariosCurso2 = new ArrayList<Usuario>();
		usuariosCurso2.add(alumno3);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* Creamos los Ccursos */
		Curso curs1 = new Curso();
		curs1.setCodCurso("123 CURSO");
		curs1.setNombreCurso("TEST NOMBRE CURSO 1");
		curs1.setFormador(profe1);
		curs1.setAlumnos(usuariosCurso1);
		curs1.setHorasCurso(50);
		curs1.setModulo(modulosCurso1);
		
		Curso curs2 = new Curso();
		curs2.setCodCurso("456 CURSO");
		curs2.setNombreCurso("TEST NOMBRE CURSO 2");
		curs2.setFormador(profe2);
		curs2.setAlumnos(usuariosCurso2);
		curs2.setHorasCurso(255);
		curs2.setModulo(modulosCurso2);
		
		/* Relacionamos Alumnos + Modulo + Nota */
		List<Nota> notasAlmuno1= new ArrayList<Nota>();
		notasAlmuno1.add(new Nota(alumno1,modulo1,5.5));
		notasAlmuno1.add(new Nota(alumno1,modulo2,6));
		
		List<Nota> notasAlmuno2= new ArrayList<Nota>();
		notasAlmuno2.add(new Nota(alumno2,modulo1,9.5));
		notasAlmuno2.add(new Nota(alumno2,modulo2,10));
		
		List<Nota> notasAlmuno3= new ArrayList<Nota>();
		notasAlmuno3.add(new Nota(alumno3,modulo3,5));
		
		alumno1.setListaNota(notasAlmuno1);
		alumno2.setListaNota(notasAlmuno2);
		alumno3.setListaNota(notasAlmuno3);

		try {
		/* Hibernate */
			
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(alumno1);
		session.save(alumno2);
		session.save(alumno3);
		session.save(profe1);
		session.save(profe2);
		session.save(coordi1);
		session.save(curs1);
		session.save(curs2);
		t.commit();
		session.close();
		/*Hibernate*/
		isOK = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isOK;
	}
}
