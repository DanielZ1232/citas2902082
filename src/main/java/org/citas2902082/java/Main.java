package org.citas2902082.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.citas2902082.java.entities.Cita;
import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Consultorio;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.IAgendable;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.Estado;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {

        Medico medico1 = new Medico(18,
                "Daniel",
                "zuñiga",
                TipoIdentificacion.TI,
                12345678910L,
                45L,
                Especialidad.PEDIATRIA);

        Medico medico2 = new Medico(19,
                "Miguel",
                "Uran",
                TipoIdentificacion.TI,
                123446436L,
                46L,
                Especialidad.MEDICINA_GENERAL);

        Paciente paciente1 = new Paciente(1,
                "Luis",
                "Lugo",
                TipoIdentificacion.CC,
                3432432,
                "Lugi987@gmail.com",
                234535535,
                LocalDate.of(1995, 9, 25),
                1.55,
                36.5,
                TipoSangre.O,
                '-');

        Paciente paciente2 = new Paciente(2,
                "Santiago",
                "Gomez",
                TipoIdentificacion.CC,
                43453654,
                "gomezsan7@gmail.com",
                235453223,
                LocalDate.of(1996, 5, 5),
                1.87,
                66.5,
                TipoSangre.A,
                '+');

        Paciente paciente3 = new Paciente(3,
                "Luigi",
                "Cortes",
                TipoIdentificacion.CC,
                6756543,
                "Luigi@gmail.com",
                234534565,
                LocalDate.of(1992, 1, 15),
                1.65,
                56.5,
                TipoSangre.B,
                '-');

        Paciente paciente4 = new Paciente(4,
                "Marcos",
                "Lopez",
                TipoIdentificacion.PPT,
                34251132,
                "marcos87@gmail.com",
                234679655,
                LocalDate.of(1995, 8, 25),
                1.75,
                56.5,
                TipoSangre.AB,
                '+');

        Paciente paciente5 = new Paciente(5,
                "Angel",
                "Fierro",
                TipoIdentificacion.CM,
                34365754,
                "angel7@gmail.com",
                563235535,
                LocalDate.of(1997, 5, 25),
                1.75,
                66.5,
                TipoSangre.A,
                '-');

        Enfermero enfermero1 = new Enfermero(10, "Carlos", "Ruiz", TipoIdentificacion.CC, 54345654L);

        Enfermero enfermero2 = new Enfermero(11, "Juan", "Perez", TipoIdentificacion.CC, 54743354L);

        Enfermero enfermero3 = new Enfermero(12, "Luis", "Zuñiga", TipoIdentificacion.CC, 54887716154L);

        Consultorio consultorio1 = new Consultorio(98, "Calle 132", 45);

        CitaMedico cita1 = new CitaMedico(2541, LocalDate.of(2024, 5, 1), consultorio1, paciente1, "Gripe",
                Estado.AGENDADA);

        CitaMedico cita2 = new CitaMedico(2542, LocalDate.of(2024, 5, 5), consultorio1, paciente1, "Escopolamina",
                Estado.AGENDADA);

        System.out.println(
                "Fecha: " + cita1.getFecha()
                        + " || "
                        + consultorio1.getNumero()
                        + " || "
                        + "Nombre Paciente: "
                        + paciente1.nombres
                        + " "
                        + paciente1.apellidos
                        + " || "
                        + "Medico: "
                        + medico2.getNombres()
                        + " "
                        + medico2.getApellidos()
                        + " || "
                        + "Motivo: "
                        + cita1.getMotivo());

        System.out.println(
                "Fecha: "
                        + cita2.getFecha()
                        + " || "
                        + consultorio1.getNumero()
                        + " || "
                        + "Nombre Paciente: "
                        + paciente2.nombres
                        + " "
                        + paciente2.apellidos
                        + " || "
                        + "Medico: "
                        + medico1.getNombres()
                        + " "
                        + medico1.getApellidos()
                        + " || " + "Motivo: "
                        + cita2.getMotivo());

        cita1.cancelarCita();
    }
}
