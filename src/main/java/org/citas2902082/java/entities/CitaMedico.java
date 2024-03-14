package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.Estado;

public class CitaMedico extends Cita implements IAgendable {
    private String motivo;
    private Estado estado;

    public CitaMedico(LocalDateTime fecha, Medico medico, Consultorio consultorio, Paciente paciente, String motivo) {
        super(fecha, medico, consultorio, paciente);
        this.motivo = motivo;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {

        super.setFecha(fecha);
    }

    @Override
    public void cancelarCita() {
        this.estado = Estado.CANCELADA;
    }

    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

}
