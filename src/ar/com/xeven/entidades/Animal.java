package ar.com.xeven.entidades;

import javax.persistence.*;

@Entity
@Table(name="animales")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    private String nombre;
    private int edad;
    private String color;

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
