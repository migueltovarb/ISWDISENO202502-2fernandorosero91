package com.vehiculos.vehiculos.services;

import com.vehiculos.vehiculos.models.Vehicle;
import com.vehiculos.vehiculos.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> listarTodos() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> buscarPorId(String id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public Vehicle crear(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle actualizar(String id, Vehicle vehicle) {
        if (!vehicleRepository.existsById(id)) {
            throw new RuntimeException("Vehículo no encontrado con id: " + id);
        }
        vehicle.setId(id);
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void eliminar(String id) {
        if (!vehicleRepository.existsById(id)) {
            throw new RuntimeException("Vehículo no encontrado con id: " + id);
        }
        vehicleRepository.deleteById(id);
    }
}
