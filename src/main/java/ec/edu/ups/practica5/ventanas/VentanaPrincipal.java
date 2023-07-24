/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.practica5.ventanas;

import ec.edu.ups.practica5.controlador.ControladorCantante;
import ec.edu.ups.practica5.controlador.ControladorCompositor;
import ec.edu.ups.practica5.dao.CantanteDAO;
import ec.edu.ups.practica5.dao.CompositorDAO;
import ec.edu.ups.practica5.idao.ICantanteDAO;
import ec.edu.ups.practica5.idao.ICompositorDAO;
import ec.edu.ups.practica5.modelo.Cantante;
import ec.edu.ups.practica5.ventanas.cantante.VentanaActualizarCantante;
import ec.edu.ups.practica5.ventanas.cantante.VentanaAgregarCantante;
import ec.edu.ups.practica5.ventanas.cantante.VentanaBuscarCantante;
import ec.edu.ups.practica5.ventanas.cantante.VentanaEliminarCantante;
import ec.edu.ups.practica5.ventanas.cantante.VentanaListarCantantes;
import ec.edu.ups.practica5.ventanas.cantante.disco.VentanaActualizarDisco;
import ec.edu.ups.practica5.ventanas.cantante.disco.VentanaAgregarDisco;
import ec.edu.ups.practica5.ventanas.cantante.disco.VentanaBuscarDisco;
import ec.edu.ups.practica5.ventanas.cantante.disco.VentanaEliminarDisco;
import ec.edu.ups.practica5.ventanas.cantante.disco.VentanaListarDiscos;
import ec.edu.ups.practica5.ventanas.compositor.VentanaActualizarCompositor;
import ec.edu.ups.practica5.ventanas.compositor.VentanaAgregarCompositor;
import ec.edu.ups.practica5.ventanas.compositor.VentanaBuscarCompositor;
import ec.edu.ups.practica5.ventanas.compositor.VentanaEliminarCompositor;
import ec.edu.ups.practica5.ventanas.compositor.VentanaListarCompositor;
import ec.edu.ups.practica5.ventanas.compositor.cancion.VentanaActualizarCancion;
import ec.edu.ups.practica5.ventanas.compositor.cancion.VentanaAgregarCancion;
import ec.edu.ups.practica5.ventanas.compositor.cancion.VentanaBuscarCancion;
import ec.edu.ups.practica5.ventanas.compositor.cancion.VentanaEliminarCancion;
import ec.edu.ups.practica5.ventanas.compositor.cancion.VentanaListarCanciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Administrator
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    //Ventanas compositor
    private VentanaAgregarCompositor ventanaAgregarCompositor;
    private VentanaActualizarCompositor ventanaActualizarCompositor;
    private VentanaBuscarCompositor ventanaBuscarCompositor;
    private VentanaEliminarCompositor ventanaEliminarCompositor;
    private VentanaListarCompositor ventanaListarCompositor;

    //Ventanas cantante
    private VentanaAgregarCantante ventanaAgregarCantante;
    private VentanaBuscarCantante ventanaBuscarCantante;
    private VentanaActualizarCantante ventanaActualizarCantante;
    private VentanaEliminarCantante ventanaEliminarCantante;
    private VentanaListarCantantes ventanaListarCantantes;

    //Ventanas canciones
    private VentanaAgregarCancion ventanaAgregarCancion;
    private VentanaBuscarCancion ventanaBuscarCancion;
    private VentanaActualizarCancion ventanaActualizarCancion;
    private VentanaEliminarCancion ventanaEliminarCancion;
    private VentanaListarCanciones ventanaListarCanciones;

    //Ventana disco
    private VentanaAgregarDisco ventanaAgregarDisco;
    private VentanaBuscarDisco ventanaBuscarDisco;
    private VentanaActualizarDisco ventanaActualizarDisco;
    private VentanaEliminarDisco ventanaEliminarDisco;
    private VentanaListarDiscos ventanaListarDiscos;

    //Localizacion
    private Locale localizacion;
    private ResourceBundle mensajes;

    //DAOs
    private ICantanteDAO cantanteDAO;
    private ICompositorDAO compositorDAO;

    //Controladores
    private ControladorCompositor controladorCompositor;
    private ControladorCantante controladorCantante;
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cantanteDAO = new CantanteDAO();
        controladorCantante = new ControladorCantante(cantanteDAO);
        compositorDAO = new CompositorDAO();
        controladorCompositor = new ControladorCompositor(compositorDAO);
        localizacion = Locale.getDefault();
        cambiarIdioma();
    }
    
    private void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        //Menu principal
        menuCompositor.setText(mensajes.getString("menu.compositor"));
        menuCantante.setText(mensajes.getString("menu.cantante"));
        menuCancion.setText(mensajes.getString("menu.cancion"));
        menuDisco.setText(mensajes.getString("menu.disco"));
        menuIdiomas.setText(mensajes.getString("menu.idiomas"));
        menuOpciones.setText(mensajes.getString("menu.opciones"));
        menuSalirOpciones.setText(mensajes.getString("menu.salir"));
        //Menu Compositor        
        menuCrearCompositor.setText(mensajes.getString("menu.crear"));
        menuBuscarCompositor.setText(mensajes.getString("menu.buscar"));
        menuActualizarCompositor.setText(mensajes.getString("menu.actualizar"));
        menuEliminarCompositor.setText(mensajes.getString("menu.eliminar"));
        menuSalirOpciones.setText(mensajes.getString("menu.salir"));
        menuListarCompositores.setText(mensajes.getString("menu.listar"));
        //Menu Cantante
        menuCrearCantante.setText(mensajes.getString("menu.crear"));
        menuBuscarCantante.setText(mensajes.getString("menu.buscar"));
        menuActualizarCantante.setText(mensajes.getString("menu.actualizar"));
        menuEliminarCantante.setText(mensajes.getString("menu.eliminar"));
        menuListarCantantes.setText(mensajes.getString("menu.listar"));
        //Menu Canción
        menuCrearCancion.setText(mensajes.getString("menu.crear"));
        menuBuscarCancion.setText(mensajes.getString("menu.buscar"));
        menuActualizarCancion.setText(mensajes.getString("menu.actualizar"));
        menuEliminarCancion.setText(mensajes.getString("menu.eliminar"));
        menuListarCancion.setText(mensajes.getString("menu.listar"));

        //Menu Composición
        menuCrearDisco.setText(mensajes.getString("menu.crear"));
        menuBuscarDisco.setText(mensajes.getString("menu.buscar"));
        menuActualizarDisco.setText(mensajes.getString("menu.actualizar"));
        menuEliminarDisco.setText(mensajes.getString("menu.eliminar"));
        menuListarDisco.setText(mensajes.getString("menu.listar"));
        
        if (ventanaAgregarCantante != null) {
            ventanaAgregarCantante.cambiarIdioma(localizacion);
        }
        if (ventanaBuscarCantante != null) {
            ventanaBuscarCantante.cambiarIdioma(localizacion);
        }
        if (ventanaActualizarCantante != null) {
            ventanaActualizarCantante.cambiarIdioma(localizacion);
        }
        if (ventanaEliminarCantante != null) {
            ventanaEliminarCantante.cambiarIdioma(localizacion);
        }
        if (ventanaListarCantantes != null) {
            ventanaListarCantantes.cambiarIdioma(localizacion);
        }
        if (ventanaAgregarDisco != null) {
            ventanaAgregarDisco.cambiarIdioma(localizacion);
        }
        if (ventanaActualizarDisco != null) {
            ventanaActualizarDisco.cambiarIdioma(localizacion);
        }
        if (ventanaBuscarDisco != null) {
            ventanaBuscarDisco.cambiarIdioma(localizacion);
        }
        if (ventanaEliminarDisco != null) {
            ventanaEliminarDisco.cambiarIdioma(localizacion);
        }
        if (ventanaListarDiscos != null) {
            ventanaListarDiscos.cambiarIdioma(localizacion);
        }
        if (ventanaAgregarCompositor != null) {
            ventanaAgregarCompositor.cambiarIdioma(localizacion);
        }
        if (ventanaBuscarCompositor != null) {
            ventanaBuscarCompositor.cambiarIdioma(localizacion);
        }
        if (ventanaActualizarCompositor != null) {
            ventanaActualizarCompositor.cambiarIdioma(localizacion);
        }
        if (ventanaEliminarCompositor != null) {
            ventanaEliminarCompositor.cambiarIdioma(localizacion);
        }
        if (ventanaListarCompositor != null) {
            ventanaListarCompositor.cambiarIdioma(localizacion);
        }
        if (ventanaAgregarCancion != null) {
            ventanaAgregarCancion.cambiarIdioma(localizacion);
        }
        if (ventanaBuscarCancion != null) {
            ventanaBuscarCancion.cambiarIdioma(localizacion);
        }
        if (ventanaActualizarCancion != null) {
            ventanaActualizarCancion.cambiarIdioma(localizacion);
        }
        if (ventanaEliminarCancion != null) {
            ventanaEliminarCancion.cambiarIdioma(localizacion);
        }
        if (ventanaListarCanciones != null) {
            ventanaListarCanciones.cambiarIdioma(localizacion);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCompositor = new javax.swing.JMenu();
        menuCrearCompositor = new javax.swing.JMenuItem();
        menuBuscarCompositor = new javax.swing.JMenuItem();
        menuActualizarCompositor = new javax.swing.JMenuItem();
        menuEliminarCompositor = new javax.swing.JMenuItem();
        menuListarCompositores = new javax.swing.JMenuItem();
        menuCantante = new javax.swing.JMenu();
        menuCrearCantante = new javax.swing.JMenuItem();
        menuBuscarCantante = new javax.swing.JMenuItem();
        menuActualizarCantante = new javax.swing.JMenuItem();
        menuEliminarCantante = new javax.swing.JMenuItem();
        menuListarCantantes = new javax.swing.JMenuItem();
        menuCancion = new javax.swing.JMenu();
        menuCrearCancion = new javax.swing.JMenuItem();
        menuBuscarCancion = new javax.swing.JMenuItem();
        menuActualizarCancion = new javax.swing.JMenuItem();
        menuEliminarCancion = new javax.swing.JMenuItem();
        menuListarCancion = new javax.swing.JMenuItem();
        menuDisco = new javax.swing.JMenu();
        menuCrearDisco = new javax.swing.JMenuItem();
        menuBuscarDisco = new javax.swing.JMenuItem();
        menuActualizarDisco = new javax.swing.JMenuItem();
        menuEliminarDisco = new javax.swing.JMenuItem();
        menuListarDisco = new javax.swing.JMenuItem();
        menuIdiomas = new javax.swing.JMenu();
        menuItemEspañol = new javax.swing.JMenuItem();
        menuItemIngles = new javax.swing.JMenuItem();
        menuItemFrances = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        menuSalirOpciones = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCompositor.setMnemonic('f');
        menuCompositor.setText("Compositor");

        menuCrearCompositor.setMnemonic('o');
        menuCrearCompositor.setText("Crear");
        menuCrearCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearCompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuCrearCompositor);

        menuBuscarCompositor.setMnemonic('a');
        menuBuscarCompositor.setText("Buscar");
        menuBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarCompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuBuscarCompositor);

        menuActualizarCompositor.setMnemonic('s');
        menuActualizarCompositor.setText("Actualizar");
        menuActualizarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarCompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuActualizarCompositor);

        menuEliminarCompositor.setMnemonic('x');
        menuEliminarCompositor.setText("Eliminar");
        menuEliminarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarCompositorActionPerformed(evt);
            }
        });
        menuCompositor.add(menuEliminarCompositor);

        menuListarCompositores.setText("Listar");
        menuListarCompositores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarCompositoresActionPerformed(evt);
            }
        });
        menuCompositor.add(menuListarCompositores);

        menuBar.add(menuCompositor);

        menuCantante.setMnemonic('e');
        menuCantante.setText("Cantante");

        menuCrearCantante.setMnemonic('t');
        menuCrearCantante.setText("Crear");
        menuCrearCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuCrearCantante);

        menuBuscarCantante.setMnemonic('p');
        menuBuscarCantante.setText("Buscar");
        menuBuscarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuBuscarCantante);

        menuActualizarCantante.setMnemonic('y');
        menuActualizarCantante.setText("Actualizar");
        menuActualizarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuActualizarCantante);

        menuEliminarCantante.setMnemonic('d');
        menuEliminarCantante.setText("Eliminar");
        menuEliminarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuEliminarCantante);

        menuListarCantantes.setText("Listar");
        menuListarCantantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarCantantesActionPerformed(evt);
            }
        });
        menuCantante.add(menuListarCantantes);

        menuBar.add(menuCantante);

        menuCancion.setText("Canción");

        menuCrearCancion.setMnemonic('t');
        menuCrearCancion.setText("Crear");
        menuCrearCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearCancionActionPerformed(evt);
            }
        });
        menuCancion.add(menuCrearCancion);

        menuBuscarCancion.setMnemonic('p');
        menuBuscarCancion.setText("Buscar");
        menuBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarCancionActionPerformed(evt);
            }
        });
        menuCancion.add(menuBuscarCancion);

        menuActualizarCancion.setMnemonic('y');
        menuActualizarCancion.setText("Actualizar");
        menuActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarCancionActionPerformed(evt);
            }
        });
        menuCancion.add(menuActualizarCancion);

        menuEliminarCancion.setMnemonic('d');
        menuEliminarCancion.setText("Eliminar");
        menuEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarCancionActionPerformed(evt);
            }
        });
        menuCancion.add(menuEliminarCancion);

        menuListarCancion.setText("Listar");
        menuListarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarCancionActionPerformed(evt);
            }
        });
        menuCancion.add(menuListarCancion);

        menuBar.add(menuCancion);

        menuDisco.setText("Disco");

        menuCrearDisco.setMnemonic('t');
        menuCrearDisco.setText("Crear");
        menuCrearDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearDiscoActionPerformed(evt);
            }
        });
        menuDisco.add(menuCrearDisco);

        menuBuscarDisco.setMnemonic('p');
        menuBuscarDisco.setText("Buscar");
        menuBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarDiscoActionPerformed(evt);
            }
        });
        menuDisco.add(menuBuscarDisco);

        menuActualizarDisco.setMnemonic('y');
        menuActualizarDisco.setText("Actualizar");
        menuActualizarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarDiscoActionPerformed(evt);
            }
        });
        menuDisco.add(menuActualizarDisco);

        menuEliminarDisco.setMnemonic('d');
        menuEliminarDisco.setText("Eliminar");
        menuEliminarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarDiscoActionPerformed(evt);
            }
        });
        menuDisco.add(menuEliminarDisco);

        menuListarDisco.setText("Listar");
        menuListarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarDiscoActionPerformed(evt);
            }
        });
        menuDisco.add(menuListarDisco);

        menuBar.add(menuDisco);

        menuIdiomas.setText("Idiomas");

        menuItemEspañol.setText("Español");
        menuItemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspañolActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemEspañol);

        menuItemIngles.setText("English");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemIngles);

        menuItemFrances.setText("Français");
        menuItemFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFrancesActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemFrances);

        menuBar.add(menuIdiomas);

        menuOpciones.setText("Opciones");

        menuSalirOpciones.setText("Salir");
        menuSalirOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirOpcionesActionPerformed(evt);
            }
        });
        menuOpciones.add(menuSalirOpciones);

        jMenuItem1.setText("Leer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuOpciones.add(jMenuItem1);

        menuBar.add(menuOpciones);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCrearCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearCompositorActionPerformed
        
        if (ventanaAgregarCompositor == null) {
            ventanaAgregarCompositor = new VentanaAgregarCompositor(controladorCompositor);
            desktopPane.add(ventanaAgregarCompositor);
            ventanaAgregarCompositor.cambiarIdioma(localizacion);
            
        }
        
        ventanaAgregarCompositor.setVisible(true);
    }//GEN-LAST:event_menuCrearCompositorActionPerformed

    private void menuBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarCompositorActionPerformed
        
        if (ventanaBuscarCompositor == null) {
            ventanaBuscarCompositor = new VentanaBuscarCompositor(controladorCompositor);
            desktopPane.add(ventanaBuscarCompositor);
            ventanaBuscarCompositor.cambiarIdioma(localizacion);
        }
        
        ventanaBuscarCompositor.setVisible(true);
    }//GEN-LAST:event_menuBuscarCompositorActionPerformed

    private void menuActualizarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarCompositorActionPerformed
        if (ventanaActualizarCompositor == null) {
            ventanaActualizarCompositor = new VentanaActualizarCompositor(controladorCompositor);
            desktopPane.add(ventanaActualizarCompositor);
            ventanaActualizarCompositor.cambiarIdioma(localizacion);
        }
        
        ventanaActualizarCompositor.setVisible(true);
    }//GEN-LAST:event_menuActualizarCompositorActionPerformed

    private void menuEliminarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarCompositorActionPerformed
        if (ventanaEliminarCompositor == null) {
            ventanaEliminarCompositor = new VentanaEliminarCompositor(controladorCompositor);
            desktopPane.add(ventanaEliminarCompositor);
            ventanaEliminarCompositor.cambiarIdioma(localizacion);
        }
        
        ventanaEliminarCompositor.setVisible(true);
    }//GEN-LAST:event_menuEliminarCompositorActionPerformed

    private void menuListarCompositoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarCompositoresActionPerformed
        
        if (ventanaListarCompositor == null) {
            ventanaListarCompositor = new VentanaListarCompositor(controladorCompositor);
            desktopPane.add(ventanaListarCompositor);
            ventanaListarCompositor.cambiarIdioma(localizacion);
        }
        
        ventanaListarCompositor.setVisible(true);
    }//GEN-LAST:event_menuListarCompositoresActionPerformed

    private void menuCrearCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearCantanteActionPerformed
        
        if (ventanaAgregarCantante == null) {
            ventanaAgregarCantante = new VentanaAgregarCantante(controladorCantante);
            desktopPane.add(ventanaAgregarCantante);
            ventanaAgregarCantante.cambiarIdioma(localizacion);
        }
        
        ventanaAgregarCantante.setVisible(true);
    }//GEN-LAST:event_menuCrearCantanteActionPerformed

    private void menuBuscarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarCantanteActionPerformed
        if (ventanaBuscarCantante == null) {
            ventanaBuscarCantante = new VentanaBuscarCantante(controladorCantante);
            desktopPane.add(ventanaBuscarCantante);
            ventanaBuscarCantante.cambiarIdioma(localizacion);
        }
        
        ventanaBuscarCantante.setVisible(true);
    }//GEN-LAST:event_menuBuscarCantanteActionPerformed

    private void menuActualizarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarCantanteActionPerformed
        if (ventanaActualizarCantante == null) {
            ventanaActualizarCantante = new VentanaActualizarCantante(controladorCantante);
            desktopPane.add(ventanaActualizarCantante);
            ventanaActualizarCantante.cambiarIdioma(localizacion);
        }
        
        ventanaActualizarCantante.setVisible(true);
    }//GEN-LAST:event_menuActualizarCantanteActionPerformed

    private void menuEliminarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarCantanteActionPerformed
        if (ventanaEliminarCantante == null) {
            ventanaEliminarCantante = new VentanaEliminarCantante(controladorCantante);
            desktopPane.add(ventanaEliminarCantante);
            ventanaEliminarCantante.cambiarIdioma(localizacion);
        }
        
        ventanaEliminarCantante.setVisible(true);
    }//GEN-LAST:event_menuEliminarCantanteActionPerformed

    private void menuListarCantantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarCantantesActionPerformed
        if (ventanaListarCantantes == null) {
            ventanaListarCantantes = new VentanaListarCantantes(controladorCantante);
            desktopPane.add(ventanaListarCantantes);
            ventanaListarCantantes.cambiarIdioma(localizacion);
        }
        
        ventanaListarCantantes.setVisible(true);
    }//GEN-LAST:event_menuListarCantantesActionPerformed

    private void menuItemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspañolActionPerformed
        localizacion = new Locale("es", "EC");
        cambiarIdioma();
        

    }//GEN-LAST:event_menuItemEspañolActionPerformed

    private void menuSalirOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSalirOpcionesActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("en", "US");
        cambiarIdioma();

    }//GEN-LAST:event_menuItemInglesActionPerformed

    private void menuItemFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFrancesActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("fr", "FR");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemFrancesActionPerformed

    private void menuCrearCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearCancionActionPerformed
        // TODO add your handling code here:
        if (ventanaBuscarCancion == null) {
            ventanaBuscarCancion = new VentanaBuscarCancion(controladorCompositor);
            desktopPane.add(ventanaBuscarCancion);
            ventanaAgregarCancion.cambiarIdioma(localizacion);
        }
        
        ventanaBuscarCancion.setVisible(true);

    }//GEN-LAST:event_menuCrearCancionActionPerformed

    private void menuBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarCancionActionPerformed
        // TODO add your handling code here:
        if (ventanaBuscarCancion == null) {
            ventanaBuscarCancion = new VentanaBuscarCancion(controladorCompositor);
            desktopPane.add(ventanaBuscarCancion);
            ventanaBuscarCancion.cambiarIdioma(localizacion);
        }
        
        ventanaBuscarCancion.setVisible(true);
    }//GEN-LAST:event_menuBuscarCancionActionPerformed

    private void menuActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarCancionActionPerformed
        // TODO add your handling code here:
        if (ventanaActualizarCancion == null) {
            ventanaActualizarCancion = new VentanaActualizarCancion(controladorCompositor);
            desktopPane.add(ventanaActualizarCancion);
            ventanaActualizarCancion.cambiarIdioma(localizacion);
        }
        
        ventanaActualizarCancion.setVisible(true);
    }//GEN-LAST:event_menuActualizarCancionActionPerformed

    private void menuEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarCancionActionPerformed
        // TODO add your handling code here:
        if (ventanaEliminarCancion == null) {
            ventanaEliminarCancion = new VentanaEliminarCancion(controladorCompositor);
            desktopPane.add(ventanaEliminarCancion);
            ventanaEliminarCancion.cambiarIdioma(localizacion);
        }
        
        ventanaEliminarCancion.setVisible(true);
    }//GEN-LAST:event_menuEliminarCancionActionPerformed

    private void menuListarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarCancionActionPerformed
        // TODO add your handling code here:
        if (ventanaListarCanciones == null) {
            ventanaListarCanciones = new VentanaListarCanciones(controladorCompositor);
            desktopPane.add(ventanaListarCanciones);
            ventanaListarCanciones.cambiarIdioma(localizacion);
        }
        
        ventanaListarCanciones.setVisible(true);
    }//GEN-LAST:event_menuListarCancionActionPerformed

    private void menuCrearDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearDiscoActionPerformed
        // TODO add your handling code here:
        if (ventanaAgregarDisco == null) {
            ventanaAgregarDisco = new VentanaAgregarDisco(controladorCantante);
            desktopPane.add(ventanaAgregarDisco);
            ventanaAgregarDisco.cambiarIdioma(localizacion);
        }
        
        ventanaAgregarDisco.setVisible(true);
    }//GEN-LAST:event_menuCrearDiscoActionPerformed

    private void menuBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarDiscoActionPerformed
        // TODO add your handling code here:
        if (ventanaBuscarDisco == null) {
            ventanaBuscarDisco = new VentanaBuscarDisco(controladorCantante);
            desktopPane.add(ventanaBuscarDisco);
            ventanaBuscarDisco.cambiarIdioma(localizacion);
        }
        
        ventanaBuscarDisco.setVisible(true);
    }//GEN-LAST:event_menuBuscarDiscoActionPerformed

    private void menuActualizarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarDiscoActionPerformed
        // TODO add your handling code here:
        if (ventanaActualizarDisco == null) {
            ventanaActualizarDisco = new VentanaActualizarDisco(controladorCantante);
            desktopPane.add(ventanaActualizarDisco);
            ventanaActualizarDisco.cambiarIdioma(localizacion);
        }
        
        ventanaActualizarDisco.setVisible(true);
    }//GEN-LAST:event_menuActualizarDiscoActionPerformed

    private void menuEliminarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarDiscoActionPerformed
        // TODO add your handling code here:
        if (ventanaEliminarDisco == null) {
            ventanaEliminarDisco = new VentanaEliminarDisco(controladorCantante);
            desktopPane.add(ventanaEliminarDisco);
            ventanaEliminarDisco.cambiarIdioma(localizacion);
        }
        
        ventanaEliminarDisco.setVisible(true);
    }//GEN-LAST:event_menuEliminarDiscoActionPerformed

    private void menuListarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarDiscoActionPerformed
        // TODO add your handling code here:
        if (ventanaListarDiscos == null) {
            ventanaListarDiscos = new VentanaListarDiscos(controladorCantante);
            desktopPane.add(ventanaListarDiscos);
            ventanaListarDiscos.cambiarIdioma(localizacion);
        }
        
        ventanaListarDiscos.setVisible(true);
    }//GEN-LAST:event_menuListarDiscoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        List<Cantante> cantantes = cantanteDAO.findAll();
        for (Cantante cantante : cantantes) {
            System.out.println(cantante.getCodigo());       
            System.out.println(cantante.getApellido());
            System.out.println(cantante.getNombre());
            System.out.println(cantante.getNacionalidad());

        }
        System.out.println("holas");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuActualizarCancion;
    private javax.swing.JMenuItem menuActualizarCantante;
    private javax.swing.JMenuItem menuActualizarCompositor;
    private javax.swing.JMenuItem menuActualizarDisco;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuBuscarCancion;
    private javax.swing.JMenuItem menuBuscarCantante;
    private javax.swing.JMenuItem menuBuscarCompositor;
    private javax.swing.JMenuItem menuBuscarDisco;
    private javax.swing.JMenu menuCancion;
    private javax.swing.JMenu menuCantante;
    private javax.swing.JMenu menuCompositor;
    private javax.swing.JMenuItem menuCrearCancion;
    private javax.swing.JMenuItem menuCrearCantante;
    private javax.swing.JMenuItem menuCrearCompositor;
    private javax.swing.JMenuItem menuCrearDisco;
    private javax.swing.JMenu menuDisco;
    private javax.swing.JMenuItem menuEliminarCancion;
    private javax.swing.JMenuItem menuEliminarCantante;
    private javax.swing.JMenuItem menuEliminarCompositor;
    private javax.swing.JMenuItem menuEliminarDisco;
    private javax.swing.JMenu menuIdiomas;
    private javax.swing.JMenuItem menuItemEspañol;
    private javax.swing.JMenuItem menuItemFrances;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenuItem menuListarCancion;
    private javax.swing.JMenuItem menuListarCantantes;
    private javax.swing.JMenuItem menuListarCompositores;
    private javax.swing.JMenuItem menuListarDisco;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenuItem menuSalirOpciones;
    // End of variables declaration//GEN-END:variables
}
