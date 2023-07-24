/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5.ventanas.compositor;

import ec.edu.ups.practica5.controlador.ControladorCompositor;
import ec.edu.ups.practica5.modelo.Compositor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaActualizarCompositor extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaActualizarCompositor
     */
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;

    public VentanaActualizarCompositor(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jlNombre.setText(mensajes.getString("lbl.nombre"));
        jlApellido.setText(mensajes.getString("lbl.apellido"));
        jlCodigo.setText(mensajes.getString("lbl.codigo"));
        jlEdad.setText(mensajes.getString("lbl.edad"));
        jlSalario.setText(mensajes.getString("lbl.salario"));
        jlNacionalidad.setText(mensajes.getString("lbl.nacionalidad"));
        jlNumeroComposiciones.setText(mensajes.getString("lbl.nComposiciones"));
        btnAceptar.setText(mensajes.getString("btn.aceptar"));
        btnCancelar.setText(mensajes.getString("btn.Cancelar"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlEdad = new javax.swing.JLabel();
        jlNumeroComposiciones = new javax.swing.JLabel();
        txtActualizarCompositorSalario = new javax.swing.JTextField();
        txtActualizarCompositorComposiciones = new javax.swing.JTextField();
        txtActualizarCompositorNombre = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        jlNacionalidad = new javax.swing.JLabel();
        jlSalario = new javax.swing.JLabel();
        txtActualizarCompositorCodigo = new javax.swing.JTextField();
        jlCodigo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        txtActualizarCompositorApellido = new javax.swing.JTextField();
        txtActualizarCompositorEdad = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        cbxNacionalidades = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualizar Compositor");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jlEdad.setText("Edad");

        jlNumeroComposiciones.setText("Número de composiciones");

        txtActualizarCompositorSalario.setEditable(false);
        txtActualizarCompositorSalario.setToolTipText("Ingrese las cancionesTop100Billboard");

        txtActualizarCompositorComposiciones.setEditable(false);
        txtActualizarCompositorComposiciones.setToolTipText("Ingrese las cancionesTop100Billboard");

        txtActualizarCompositorNombre.setEditable(false);
        txtActualizarCompositorNombre.setToolTipText("Ingrese las cancionesTop100Billboard");

        jlApellido.setText("Apellido");

        jlNacionalidad.setText("Nacionalidad");

        jlSalario.setText("Salario");

        txtActualizarCompositorCodigo.setToolTipText("Ingrese las cancionesTop100Billboard");

        jlCodigo.setText("Código");

        jlNombre.setText("Nombre");

        txtActualizarCompositorApellido.setEditable(false);
        txtActualizarCompositorApellido.setToolTipText("Ingrese las cancionesTop100Billboard");

        txtActualizarCompositorEdad.setEditable(false);
        txtActualizarCompositorEdad.setToolTipText("Ingrese las cancionesTop100Billboard");

        btnAceptar.setText("Aceptar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbxNacionalidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione un pais---" }));
        cbxNacionalidades.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCodigo)
                    .addComponent(jlNombre)
                    .addComponent(jlApellido)
                    .addComponent(jlEdad)
                    .addComponent(jlNacionalidad)
                    .addComponent(jlSalario)
                    .addComponent(jlNumeroComposiciones))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtActualizarCompositorComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtActualizarCompositorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addComponent(cbxNacionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNacionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarCompositorComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        // TODO add your handling code here:        
        int codigo = Integer.valueOf(txtActualizarCompositorCodigo.getText());

        Compositor compositor = controladorCompositor.verCompositor(codigo);
        if (compositor != null) {
            txtActualizarCompositorCodigo.setEditable(false);
            txtActualizarCompositorNombre.setText(compositor.getNombre());
            txtActualizarCompositorNombre.setEditable(true);

            txtActualizarCompositorApellido.setText(compositor.getApellido());
            txtActualizarCompositorApellido.setEditable(true);

            txtActualizarCompositorEdad.setText(String.valueOf(compositor.getEdad()));
            txtActualizarCompositorEdad.setEditable(true);

            txtActualizarCompositorSalario.setText(String.valueOf(compositor.getSalario()));
            txtActualizarCompositorSalario.setEditable(true);

            txtActualizarCompositorComposiciones.setText(String.valueOf(compositor.getNumeroDeComposiciones()));
            txtActualizarCompositorComposiciones.setEditable(true);

        } else {
            JOptionPane.showMessageDialog(this, "El cantante ingresado no existe");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        String rutaNacionalidades = "src\\main\\resources\\nacionalidades\\paises.csv";
        cargarDatosExcel(rutaNacionalidades, cbxNacionalidades, Locale.getDefault().getLanguage());

    }//GEN-LAST:event_formInternalFrameActivated

    public void limpiarCampos() {
        txtActualizarCompositorCodigo.setText("");
        txtActualizarCompositorNombre.setText("");
        txtActualizarCompositorApellido.setText("");
        txtActualizarCompositorEdad.setText("");
        txtActualizarCompositorSalario.setText("");
        txtActualizarCompositorComposiciones.setText("");

    }

    private void cargarDatosExcel(String rutaNacionalidades, JComboBox<String> comboBox, String idioma) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaNacionalidades));
            String read;
            while ((read = br.readLine()) != null) {
                String[] valores = read.replaceAll("\"", "").split(",");
                if (valores.length > 0) {
                    String valor;
                    if (idioma.equals("en")) {
                        valor = valores[0]; // Columna para idioma ingles
                    } else if (idioma.equals("es")) {
                        valor = valores[1]; // Columna para idioma español
                    } else {
                        valor = valores[2]; // Columna para idioma frances
                    }
                    model.addElement(valor);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error General");
        }
        comboBox.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxNacionalidades;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEdad;
    private javax.swing.JLabel jlNacionalidad;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNumeroComposiciones;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JTextField txtActualizarCompositorApellido;
    private javax.swing.JTextField txtActualizarCompositorCodigo;
    private javax.swing.JTextField txtActualizarCompositorComposiciones;
    private javax.swing.JTextField txtActualizarCompositorEdad;
    private javax.swing.JTextField txtActualizarCompositorNombre;
    private javax.swing.JTextField txtActualizarCompositorSalario;
    // End of variables declaration//GEN-END:variables
}