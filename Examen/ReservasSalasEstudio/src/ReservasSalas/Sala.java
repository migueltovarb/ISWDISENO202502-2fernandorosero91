package ReservasSalas;

public class Sala {
	private int numeroSala;
	private int capacidadMax;
	private boolean disponibilidad;
	
	public Sala() {
		super();
		
	}
	
	public Sala(int numeroSala, int capacidadMax, boolean disponibilidad) {
		super();
		this.numeroSala = numeroSala;
		this.capacidadMax = capacidadMax;
		this.disponibilidad = disponibilidad;
	}

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public boolean isDidponibilidad() {
		return disponibilidad;
	}

	public void setDidponibilidad(boolean didponibilidad) {
		this.disponibilidad = didponibilidad;
	}
	
	public void registrarSalas() {
		System.out.println("Sala registrada con exito");
		
	}
	
	public boolean reservarSala() {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("Sala reservada con exito");
            return true;
        } else {
            System.out.println("La sala no está disponible");
            return false;
        }
    }
	
	public void mostrarSalaDisponible() {
        if (disponibilidad) {
            System.out.println("Sala " + numeroSala + " está disponible.");
        } else {
            System.out.println("Sala " + numeroSala + " no está disponible.");
        }
    }

	@Override
	public String toString() {
		return "Sala [numeroSala=" + numeroSala + ", capacidadMax=" + capacidadMax + ", disponibilidad="
				+ disponibilidad + "]";
	}
	
	
	

}
