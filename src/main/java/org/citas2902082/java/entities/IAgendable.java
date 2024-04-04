package org.citas2902082.java.entities;

import java.time.LocalDate;

public interface IAgendable {
    public void agendarCita(LocalDate fecha);

    public void cancelarCita();

    public void reAgendarCita(LocalDate fecha);
}
