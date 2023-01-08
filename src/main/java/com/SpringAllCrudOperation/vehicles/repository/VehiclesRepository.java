package com.SpringAllCrudOperation.vehicles.repository;

import com.SpringAllCrudOperation.vehicles.model.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepository extends JpaRepository<Vehicles,Integer> {
}
