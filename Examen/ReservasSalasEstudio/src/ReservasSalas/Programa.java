package ReservasSalas;

import java.time.LocalDateTime;

public class Programa {

    public static void main(String[] args) {
       
        Estudiante estudiante = new Estudiante("Juan", "12345", "Ingeniería de Sistemas");
        estudiante.registrarEstudiante();

       
        Sala sala1 = new Sala(1, 20, true);
        sala1.registrarSalas();
        Sala sala2 = new Sala(2, 30, true);
        sala2.registrarSalas();
        Sala sala3 = new Sala(3, 40, true);
        sala3.registrarSalas();

  
        sala1.mostrarSalaDisponible();
        sala2.mostrarSalaDisponible();
        sala3.mostrarSalaDisponible();

    
        Reserva reserva1 = new Reserva(estudiante, sala1, LocalDateTime.now());
        if (sala1.reservarSala()) {
            reserva1.consultarHistorial();
        }
        
    }
    
    
    
}
