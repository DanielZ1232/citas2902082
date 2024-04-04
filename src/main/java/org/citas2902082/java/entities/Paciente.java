package org.citas2902082.java.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;

public class Paciente {
    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Integer numeroIdentificacion;
    public String correoElectronico;
    public Integer celular;
    public LocalDate fechaNacimiento;
    public Double altura;
    public Double peso;
    public TipoSangre tipoSangre;
    public char factorRH;

    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, String correoElectronico, Integer celular, LocalDate fechaNacimiento,
            Double altura, Double peso, TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    public void addCita(Medico medico1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCita'");
    }

    public void addCitaMedico(Medico medico1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCitaMedico'");
    }

}
