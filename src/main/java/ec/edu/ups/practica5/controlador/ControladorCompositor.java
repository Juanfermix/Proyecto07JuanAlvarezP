/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica5.controlador;

import ec.edu.ups.practica5.idao.ICompositorDAO;
import ec.edu.ups.practica5.modelo.Cancion;
import ec.edu.ups.practica5.modelo.Compositor;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ControladorCompositor {

    private Compositor compositor;
    private Cancion cancion;

    private ICompositorDAO compositorDAO;

    public ControladorCompositor(ICompositorDAO compositorDAO) {
        this.compositorDAO = compositorDAO;
    }

    public void crearCompositor(Compositor compositor) {
        this.compositor = compositor;
        compositorDAO.create(compositor);
    }

    public Compositor verCompositor(int codigo) {
        compositor = compositorDAO.read(codigo);
        return this.compositor;
    }

    public boolean actualizarCompositor(Compositor compositor) {
        Compositor compositorEncontrado = this.verCompositor(compositor.getCodigo());
        if (compositorEncontrado != null) {
            compositorDAO.update(compositorEncontrado);
            return true;
        }
        return false;
    }

    public boolean eliminarCompositor(int codigo) {
        Compositor compositorEncontrado = this.verCompositor(compositor.getCodigo());
        if (compositorEncontrado != null) {
            compositorDAO.delete(compositorEncontrado);
            return true;
        }
        return false;
    }

    public List<Compositor> verCompositores() {
        return compositorDAO.findAll();

    }

    public void agregarCancion(int codigo) {
        compositor = compositorDAO.read(codigo);
        compositor.agregarCancion(cancion);
    }

}
