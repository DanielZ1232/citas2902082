package org.citas2902082.java.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cita {
    protected Integer id;
    public LocalDate fecha;
    protected Consultorio consultorio;
    protected Paciente paciente;

    public Cita(Integer id,
            LocalDate fecha,
            Consultorio consultorio,
            Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
