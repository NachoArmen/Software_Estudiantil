package Logica;

public class Profesor extends Persona {
  private int nroLegajo;


  public Profesor(int id, int pin, String nombre, int nroLegajo) {
	super(id, pin, nombre);
	this.nroLegajo = nroLegajo;
}
  
  public int getNroLegajo() {
	return nroLegajo;
}
  
  public void setNroLegajo(int nroLegajo) {
	this.nroLegajo = nroLegajo;
}
  
  public String añadirTarea(Aula nroAula) {
	  
	  return"";
	    
  }
  
 
  public double calificarTarea(int nroAula, int id, int nota) {
	
      return this.calificarTarea(1,433,10);
	  
  }
  
  public String modificarClase(Aula nroAula) {
	  
	  return  "";
	  
	  
  }  
  
  public String visualizarClase(Aula nroAula) {
	  
	  return "";
	  
  }
  
  
  public String editarClases(Aula nroAula, String nameClase) {
	  
	  
	  return "";
	  
  }
  
  
  
  
  
  
  
  
  
  
  
}
