package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Medico extends Usuario {

    private Long registroMedico;
    private Especialidad especialidad;

    public Medico(Integer id,
            String nombres,
            String apellidos,
            TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion,
            Long registroMedico,
            Especialidad especialidad) {

        // contructor de la clase padre
        // Es un constructor de la clase hija
        // Es lo primero que debe aparecer
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        // inicializar los atributos propios de la clase pádre

        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]";
    }

}
