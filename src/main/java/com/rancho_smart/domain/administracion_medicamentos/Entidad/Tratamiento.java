package com.rancho_smart.domain.administracion_medicamentos.Entidad;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tratamiento {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreMedicamento;

    @Column(nullable = false)
    private Integer cantidadDosis;

    @Column(nullable = false)
    private LocalDate fechaInicio;

    @Column(nullable = false)
    private LocalDate fechaFin;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public Integer getCantidadDosis() {
        return cantidadDosis;
    }

    public void setCantidadDosis(Integer cantidadDosis) {
        this.cantidadDosis = cantidadDosis;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Constructor por defecto
    public Tratamiento() {}

    // Constructor con parámetros
    public Tratamiento(String nombreMedicamento, Integer cantidadDosis, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombreMedicamento = nombreMedicamento;
        this.cantidadDosis = cantidadDosis;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}


