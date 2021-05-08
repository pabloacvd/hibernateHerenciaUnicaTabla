package ar.com.xeven;

import ar.com.xeven.dao.GatoDAO;
import ar.com.xeven.entidades.Animal;
import ar.com.xeven.entidades.Ave;
import ar.com.xeven.entidades.Gato;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Gato felix = GatoDAO.buscar("lix");

        felix.setCantidadVidasRestantes(4);
        felix.guardar();

        Gato nuevoGato = new Gato();
        nuevoGato.setNombre("garfield mejorado");
        nuevoGato.setIdAnimal(6);
        nuevoGato.setColor("naranja y negro");
        nuevoGato.setEdad(39);
        nuevoGato.setCantidadVidasRestantes(4);
        nuevoGato.guardar();


        //GatoDAO.eliminar(felix);

        if(GatoDAO.eliminarPorID(4))
            System.out.println("Gato eliminado correctamente!");
        else
            System.out.println("El gato no se pudo eliminar o no existe");

        for(Gato gato: GatoDAO.listarTodo())
            System.out.println(gato);

    }
}
