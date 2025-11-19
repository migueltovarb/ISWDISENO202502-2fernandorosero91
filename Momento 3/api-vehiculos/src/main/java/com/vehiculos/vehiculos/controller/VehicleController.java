package com.vehiculos.vehiculos.controller;

import com.vehiculos.vehiculos.models.Vehicle;
import com.vehiculos.vehiculos.services.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehiculos")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<Vehicle>> listarTodos() {
        List<Vehicle> vehiculos = vehicleService.listarTodos();
        return ResponseEntity.ok(vehiculos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> buscarPorId(@PathVariable String id) {
        Optional<Vehicle> vehicle = vehicleService.buscarPorId(id);
        return vehicle.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Vehicle> crear(@Valid @RequestBody Vehicle vehicle) {
        Vehicle nuevoVehicle = vehicleService.crear(vehicle);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoVehicle);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vehicle> actualizar(@PathVariable String id, 
                                              @Valid @RequestBody Vehicle vehicle) {
        try {
            Vehicle vehicleActualizado = vehicleService.actualizar(id, vehicle);
            return ResponseEntity.ok(vehicleActualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        try {
            vehicleService.eliminar(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
