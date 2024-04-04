package org.citas2902082.java.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.Estado;

public class CitaMedico extends Cita implements IAgendable {
    private String motivo;
    private Estado estado;

    public CitaMedico(Integer id, LocalDate fecha, Consultorio consultorio, Paciente paciente, String motivo,
            Estado estado) {
        super(id, fecha, consultorio, paciente);
        this.motivo = motivo;
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDate fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public void reAgendarCita(LocalDate fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
    }

    @Override
    public String toString() {
        return "CitaMedico [motivo=" + motivo + ", estado=" + estado + "]";
    }

    @Override
    public void cancelarCita() {
        System.out.println("Cita cancelada");
    }

}
