package Logica;



public class Ejercicio {
	

	private Materia nombreMateria;
	private int cantConsignas;
	private String temaEjercicio;
	
	public Ejercicio(Materia nombreMateria, int cantConsignas, String temaEjercicio) {
		super();
		this.nombreMateria = nombreMateria;
		this.cantConsignas = cantConsignas;
		this.temaEjercicio = temaEjercicio;
	}

	public int getCantConsignas() {
		return cantConsignas;
	}

	public void setCantConsignas(int cantConsignas) {
		this.cantConsignas = cantConsignas;
	}

	public String getTemaEjercicio() {
		return temaEjercicio;
	}

	public void setTemaEjercicio(String temaEjercicio) {
		this.temaEjercicio = temaEjercicio;
	}

	public Materia getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(Materia nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	
	public boolean añadirEjercicio(Aula nroAula){
		
		return true;
		
		
	}	
	
	public String calificarEjercicio(Alumno id, Aula nroAula,double nota) {
		
		return "Alumno: " + id + "\nAula: " + nroAula + "\nNota: " + nota;
		
		
	}
	
	
	
	
	
}
