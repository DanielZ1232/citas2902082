package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Cita {
    private Integer id;
    private LocalDateTime fecha;
    private Medico medico;
    private Consultorio consultorio;
    private Paciente paciente;

    public Cita(LocalDateTime fecha,
            Medico medico,
            Consultorio consultorio,
            Paciente paciente) {
        this.fecha = fecha;
        this.medico = medico;
        this.consultorio = consultorio;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
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
