package Interfaz;
import Logica.*;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import Logica.*;


public class Main {
	public static void main(String[] args) {
		
		
		Aula davinci = new Aula(1,"Programacion orientada a objetos","Programacion"); 
		Aula icnivad = new Aula(1,"Introduccion a la programacion","Programacion");
		Persona usuario = new Persona(1,1234,"A");
		Persona usuario1 = new Persona(1,1234,"B");
		Alumno cesar = new Alumno(1,1234,"cesar",true); 
		Alumno luis = new Alumno(2,1234,"luis",true);
		Alumno chambi = new Alumno(1,1234,"chambi",false); 
		
		ArrayList <Alumno> ListaGeneral = new ArrayList <Alumno>();
		
		ListaGeneral.add(cesar);
		ListaGeneral.add(luis);
		ListaGeneral.add(chambi);
		ListaGeneral.add(new Alumno(1,1234,"Gamaliel",true));
		ListaGeneral.add(new Alumno(1,1234,"Martina",true));
		ListaGeneral.add(new Alumno(2,1234,"Sebastian",true));
		ListaGeneral.add(new Alumno(2,1234,"Ignacio",true));
		ListaGeneral.add(new Alumno(1,1234,"Agustin",true));
		
	
		//Uso la lista de todos los alumnos y 
		//Agrego a la lista del AULA, los alumnos con el id 1
		//y ademas deben estar habilitados
		for (Alumno alumno : ListaGeneral) {
			if (alumno.getId()==1) {
				if(davinci.AgregarAlumno(alumno)) {
					//JOptionPane.showMessageDialog(null, "Se agrego");
				}else {
					//JOptionPane.showMessageDialog(null, "no se agrego");
				}
			}
		}
		for (Alumno alumno : ListaGeneral) {
			if (alumno.getId()==2) {
				if(icnivad.AgregarAlumno(alumno)) {
					//JOptionPane.showMessageDialog(null, "Se agrego");
				}else {
					//JOptionPane.showMessageDialog(null, "no se agrego");
				}
			}
		}
		//Lista de alumnos en el aula
		 
		String Acum="Alumnos:";
		for (Alumno alumno : davinci.getListaAlumnos()) {
			Acum = Acum + "\n"+  alumno.getNombre();
		}
		
		JOptionPane.showMessageDialog(null,"El aula es: " +davinci.getTitulo() +" \n" + Acum);
		
		 
		String Acum2="Alumnos:";
		for (Alumno alumno : icnivad.getListaAlumnos()) {
			Acum2 = Acum2 + "\n"+  alumno.getNombre();
		}
		
		JOptionPane.showMessageDialog(null,"El aula es: " +icnivad.getTitulo() +"\n" + Acum2);
		
		Aula cbc = new Aula(7,"Introduccion a la Fisica","Principios Fisicos");
		Materia fisica = new Materia("Fisica");
		Ejercicio cons1= new Ejercicio(fisica,3,"Caida Libre");
		Alumno mateo= new Alumno(3,1234,"Mateo",true);
		
		
		
		
		
		
		
	}

}
