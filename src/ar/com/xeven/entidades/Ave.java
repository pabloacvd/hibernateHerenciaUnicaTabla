package ar.com.xeven.entidades;

import javax.persistence.Entity;

@Entity
public class Ave extends Animal{
    private int cantidadPlumas;
    private int cantidadAlas;

    @Override
    public String toString() {
        return "Ave{" +
                "idAnimal=" + idAnimal +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", cantidadPlumas=" + cantidadPlumas +
                ", cantidadAlas=" + cantidadAlas +
                '}';
    }

    public int getCantidadPlumas() {
        return cantidadPlumas;
    }

    public void setCantidadPlumas(int cantidadPlumas) {
        this.cantidadPlumas = cantidadPlumas;
    }

    public int getCantidadAlas() {
        return cantidadAlas;
    }

    public void setCantidadAlas(int cantidadAlas) {
        this.cantidadAlas = cantidadAlas;
    }
}
