package ReservasSalas;
import java.time.LocalDateTime;

public class Reserva {
	
	private Estudiante estudiante;
	private Sala salaReserva;
	private LocalDateTime fecha;
	
	
	public Reserva() {
		super();
	}
		
	public Reserva(Estudiante estudiante, Sala salaReserva, LocalDateTime fecha) {
		super();
		this.estudiante = estudiante;
		this.salaReserva = salaReserva;
		this.fecha = fecha;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Sala getSalaReserva() {
		return salaReserva;
	}

	public void setSalaReserva(Sala salaReserva) {
		this.salaReserva = salaReserva;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	public void consultarHistorial() {
		System.out.println("Historial de reservas:");
		System.out.println("Estudiante: " + estudiante.getNombre());
		System.out.println("Sala reservada: " + salaReserva.getNumeroSala());
		System.out.println("Fecha de reserva: " + fecha);
		
		
		
	}

	
	@Override
	public String toString() {
		return "Reserva [estudiante=" + estudiante + ", salaReserva=" + salaReserva + ", fecha=" + fecha + "]";
	}
	
	
	

	

}
