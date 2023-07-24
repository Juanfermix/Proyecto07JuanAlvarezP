/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica5.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
public class Compositor extends Persona {

    //Atributos
    private int numeroDeComposiciones;
    private List<Cancion> cancionesTop100Billboard;
    private List<Cantante> clientes;

    //Constructores
    public Compositor() {
        this.cancionesTop100Billboard = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public Compositor(int numeroDeComposiciones, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Billboard = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    //Getters y Setters
    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.cancionesTop100Billboard);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        return Objects.equals(this.cancionesTop100Billboard, other.cancionesTop100Billboard);
    }

    //Metodos
    @Override
    public double calcularSalario() {
        if (numeroDeComposiciones > 5) {
            double salarioFinal = super.getSalario() + 300;
            return salarioFinal;
        } else if (cancionesTop100Billboard.size() > 0 && cancionesTop100Billboard.size() < 4) {
            double porcentaje = super.getSalario() * 0.1;
            double salarioFinal = super.getSalario() + porcentaje;
            return salarioFinal;

        } else if (cancionesTop100Billboard.size() > 3 && cancionesTop100Billboard.size() < 7) {
            double porcentaje = super.getSalario() * 0.2;
            double salarioFinal = super.getSalario() + porcentaje;
            return salarioFinal;
        } else if (cancionesTop100Billboard.size() > 6) {
            double porcentaje = super.getSalario() * 0.2;
            double salarioFinal = super.getSalario() + porcentaje;
            return salarioFinal;
        } else {
            return super.getSalario();

        }
    }

    public void agregarCancion(Cancion cancion) {
        cancionesTop100Billboard.add(cancion);

    }

    public Cancion leerCancion(int codigo) {
        for (Cancion cancion : cancionesTop100Billboard) {
            if (cancion.getCodigo() == codigo) {
                return cancion;
            }
        }
        return null;
    }

    public void actualizarCancion(Cancion cancion) {
        for (int i = 0; i < cancionesTop100Billboard.size(); i++) {
            Cancion c = cancionesTop100Billboard.get(i);
            if (c.getCodigo() == cancion.getCodigo()) {
                cancionesTop100Billboard.set(i, cancion);
                break;
            }
        }
    }

    public void eliminarCancion(Cancion cancion) {
        Iterator<Cancion> it = cancionesTop100Billboard.iterator();
        while (it.hasNext()) {
            Cancion c = it.next();
            if (c.getCodigo() == cancion.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    public List<Cancion> listarCanciones() {
        return cancionesTop100Billboard;
    }

    public void agregarCliente(Cantante cantante) {
        clientes.add(cantante);
    }

    public List<Cancion> buscarNombreDeCancion(String titulo) {
        return cancionesTop100Billboard.stream().filter(e -> e.getTitulo().startsWith(titulo)).collect(Collectors.toList());
    }

}
