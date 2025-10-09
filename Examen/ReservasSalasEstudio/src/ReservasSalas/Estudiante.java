package ReservasSalas;

public class Estudiante {
	private String nombre;
	private String codigo;
	private String programaAcademico;
	
	public Estudiante() {
		super();
	}
	
	
	public Estudiante(String nombre, String codigo, String programaAcademico) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.programaAcademico = programaAcademico;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getProgramaAcademico() {
		return programaAcademico;
	}


	public void setProgramaAcademico(String programaAcademico) {
		this.programaAcademico = programaAcademico;
	}
	
	public void registrarEstudiante() {
		System.out.println("Estudiante registrado con exito");
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", codigo=" + codigo + ", programaAcademico=" + programaAcademico + "]";
	}
	
	
	
	
	

}
