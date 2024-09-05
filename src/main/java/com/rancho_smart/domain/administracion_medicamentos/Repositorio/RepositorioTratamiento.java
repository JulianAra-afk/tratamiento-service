package com.rancho_smart.domain.administracion_medicamentos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rancho_smart.domain.administracion_medicamentos.Entidad.Tratamiento;


public interface RepositorioTratamiento extends JpaRepository<Tratamiento, Long> {
}