package com.vehiculos.vehiculos.services;

import com.vehiculos.vehiculos.models.Vehicle;
import java.util.List;
import java.util.Optional;

public interface VehicleService {
    
    List<Vehicle> listarTodos();
    
    Optional<Vehicle> buscarPorId(String id);
    
    Vehicle crear(Vehicle vehicle);
    
    Vehicle actualizar(String id, Vehicle vehicle);
    
    void eliminar(String id);
}
