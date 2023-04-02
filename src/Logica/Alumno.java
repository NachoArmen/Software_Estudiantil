package Logica;

import javax.swing.JOptionPane;

public class Alumno extends Persona{
	
	private boolean habilitado;

	public Alumno(int id, int pin,String nombre, boolean habilitado) {
		super(id, pin,nombre);
		this.habilitado = habilitado;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	@Override
	public String toString() {
		return "Alumno [habilitado=" + habilitado + ", getNombre()=" + getNombre() + ", getId()=" + getId()
				+ ", getPin()=" + getPin() + "] \n";
	}

	
	public String visualizarClase(Aula nroAula) {
		
		if(this.isHabilitado()) {
			JOptionPane.showMessageDialog(null, "Su aula es" + nroAula );;
		}
		return "No esta habilitado";
	}
	
	
	
	

}
