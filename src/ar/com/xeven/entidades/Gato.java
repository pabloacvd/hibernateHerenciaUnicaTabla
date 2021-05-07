package ar.com.xeven.entidades;

import javax.persistence.Entity;

@Entity
public class Gato extends Animal{

    private int cantidadVidasRestantes;

    public int getCantidadVidasRestantes() {
        return cantidadVidasRestantes;
    }

    public void setCantidadVidasRestantes(int cantidadVidasRestantes) {
        this.cantidadVidasRestantes = cantidadVidasRestantes;
    }

    @Override
    public String toString() {
        return super.getNombre()+"Gato{" +
                "cantidadVidasRestantes=" + cantidadVidasRestantes +
                '}';
    }
}
