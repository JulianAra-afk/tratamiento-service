package com.rancho_smart.domain.administracion_medicamentos.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.domain.administracion_medicamentos.Entidad.Tratamiento;
import com.rancho_smart.domain.administracion_medicamentos.Repositorio.RepositorioTratamiento;

@Service
public class TratamientoService {

    @Autowired
    private RepositorioTratamiento tratamientoRepository;

    public List<Tratamiento> getAllTratamientos() {
        return tratamientoRepository.findAll();
    }

    public Optional<Tratamiento> getTratamientoById(Long id) {
        return tratamientoRepository.findById(id);
    }

    public Tratamiento createTratamiento(Tratamiento tratamiento) {
        return tratamientoRepository.save(tratamiento);
    }

    public Optional<Tratamiento> updateTratamiento(Long id, Tratamiento tratamientoDetails) {
        return tratamientoRepository.findById(id)
            .map(tratamiento -> {
                tratamiento.setNombreMedicamento(tratamientoDetails.getNombreMedicamento());
                tratamiento.setCantidadDosis(tratamientoDetails.getCantidadDosis());
                tratamiento.setFechaInicio(tratamientoDetails.getFechaInicio());
                tratamiento.setFechaFin(tratamientoDetails.getFechaFin());
                return tratamientoRepository.save(tratamiento);
            });
    }

    public boolean deleteTratamiento(Long id) {
        return tratamientoRepository.findById(id)
            .map(tratamiento -> {
                tratamientoRepository.delete(tratamiento);
                return true;
            }).orElse(false);
    }
}