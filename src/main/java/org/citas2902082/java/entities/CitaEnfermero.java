package org.citas2902082.java.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitaEnfermero extends Cita implements IAgendable {

    private String procedimiento;
    private Enfermero enfermero;

    public CitaEnfermero(Integer id, LocalDate fecha, Consultorio consultorio, Paciente paciente,
            String procedimiento, Enfermero enfermero) {
        super(id, fecha, consultorio, paciente);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void cancelarCita() {
        System.out.println("Cita cancelada");
    }

    @Override
    public void reAgendarCita(LocalDate fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
    }

    @Override
    public void agendarCita(LocalDate fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

}
