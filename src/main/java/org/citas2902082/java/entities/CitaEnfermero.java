package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class CitaEnfermero extends Cita {

    private String procedimiento;
    private Enfermero enfermero;

    public CitaEnfermero(LocalDateTime fecha, Medico medico, Consultorio consultorio, Paciente paciente,
            String procedimiento, Enfermero enfermero) {
        super(fecha, medico, consultorio, paciente);
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

}
