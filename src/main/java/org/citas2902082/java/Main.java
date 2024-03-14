package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(18,
                "Daniel",
                "zuñiga",
                TipoIdentificacion.TI,
                12345678910L,
                45L,
                Especialidad.PEDIATRIA);
        System.out.println(m.toString());
    }

}