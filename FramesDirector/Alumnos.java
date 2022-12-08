/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesDirector;

import Clases.Conector;
import Frames.PrincipalDirector;
import Frames.TextPrompt;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel
 */
public class Alumnos extends javax.swing.JFrame {

    /**
     * Creates new form Alumnos
     */
    public Alumnos() {
        initComponents();
        
        TextPrompt nombre = new TextPrompt("Escribe tu nombre", txtNombre);
        TextPrompt apellidop = new TextPrompt("Escribe tu Apellido", txtApellidoP);
        TextPrompt apellidom = new TextPrompt("Escribe tu Apellido", txtApellidoM);
        TextPrompt edad = new TextPrompt("Escribe tu edad", txtEdad);
        TextPrompt curp = new TextPrompt("Escribe tu CURP", txtCurp);
        TextPrompt nia = new TextPrompt("Escribe tu NIA", txtNia);
        TextPrompt telefono = new TextPrompt("Escribe tu telefono", txtTelefono);
        TextPrompt correo = new TextPrompt("Escribe tu email", txtCorreo);
        TextPrompt tutor = new TextPrompt("Escribe el nombre de tu tutor", txtTutor);
        TextPrompt calle = new TextPrompt("Escribe tu Calle", txtCalle);
        TextPrompt numext = new TextPrompt("Escribe tu Numero exterior", txtNumExt);
        TextPrompt numint = new TextPrompt("Escribe tu Numero interior", txtNumInt);
        
        this.setLocationRelativeTo(null);
        limpiar();
        txtId.setEnabled(false);
        mostrartabla("");
        cerrar2();
        cargarcombocurso(jComboBoxMateria);
        cargarcomboNacionalidad(jComboBoxNacionalidad1);
        cargarcomboEstado(jComboBoxEstado);
        cargarcomboMunicipio(jComboBoxMunicipio);
    }
    
     void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellidoP.setText("");
        txtApellidoM.setText("");
        txtCurp.setText("");
        txtNia.setText("");
        txtTelefono.setText("");
        jComboBoxSemestre.setSelectedIndex(0);
        txtCorreo.setText("");
        txtCalle.setText("");
        txtNumExt.setText("");
        txtNumInt.setText("");
        jComboBoxMateria.setSelectedIndex(0);
        jComboBoxEstado.setSelectedIndex(0);
        jComboBoxMunicipio.setSelectedIndex(0);
        jComboBoxColonia.setSelectedIndex(0);
        jComboBoxMateria.setSelectedIndex(0);
    }
     
    void mostrartabla(String valor){
        DefaultTableModel modelo = new DefaultTableModel ();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Edad");
        modelo.addColumn("CURP");
        modelo.addColumn("NIA");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tutor");
        modelo.addColumn("Telefono_Tutor");
        modelo.addColumn("Semestre");
        modelo.addColumn("id_direccion");
        modelo.addColumn("id_cursoAsignado");
        
       
       TablaAlumnos.setModel(modelo);
       
       String sql = "SELECT * FROM alumno WHERE CONCAT (Nombre,' ',ApellidoP,' ',ApellidoM,' ',Edad,' 'Curp,' ',NIA,' ',Telefono,' ',Tutor,' ',TelefonoTutor,' ',Semestre,' ',id_direccion,' ',id_cursoAsignado) LIKE '%"+valor+"%'";
       String datos[] = new String[13];
       Statement st;
       
       try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               datos[0] = rs.getString("idAlumno");
               datos[1] = rs.getString("Nombre");
               datos[2] = rs.getString("ApellidoP");
               datos[3] = rs.getString("ApellidoM");
               datos[4] = rs.getString("Edad");
               datos[5] = rs.getString("Curp");
               datos[6] = rs.getString("NIA");
               datos[7] = rs.getString("Telefono");//notas aqui hay que ordenar bien este apartado ya que da error de sentencias sql
               datos[8] = rs.getString("Tutor");
               datos[9] = rs.getString("TelefonoTutor");
               datos[10] = rs.getString("Semestre");
               datos[11] = rs.getString("id_direccion");
               datos[12] = rs.getString("id_cursoAsignado");
               modelo.addRow(datos);
           }
            TablaAlumnos.setModel(modelo);
        } catch (SQLException e) {
            System.err.print(e);
        }
       
    }
    //lista de los combo box llamados desde la base de datos/////*********************************
    public void cargarcombocurso(JComboBox combodelcurso){
        try {
            String sql = "SELECT NombreMateria FROM materia";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                combodelcurso.addItem(rs.getString("NombreMateria"));
            }
        } catch (SQLException e) {
            System.err.print(e);
            
        }
        
        
    }
    
        public void cargarcomboNacionalidad(JComboBox combodeNacionalidad){
        try {
            String sql = "SELECT Pais FROM pais";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                combodeNacionalidad.addItem(rs.getString("Pais"));
            }
        } catch (SQLException e) {
            System.err.print(e);
            
        }
        
        
    }
        
        public void cargarcomboEstado(JComboBox combodeEstado){
        try {
            String sql = "SELECT Estado FROM estado";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                combodeEstado.addItem(rs.getString("Estado"));
            }
        } catch (SQLException e) {
            System.err.print(e);
            
        }
        
        
    }
        public void cargarcomboMunicipio(JComboBox combodeMunicipio){
        try {
            String sql = "SELECT Municipio FROM municipio";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                combodeMunicipio.addItem(rs.getString("Municipio"));
            }
        } catch (SQLException e) {
            System.err.print(e);
            
        }
        
        
    }
    public void cerrar2(){
        try {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter()  {
               
                public void windowClosing(WindowEvent e){
                
                    confirmarsalida2();
                
                }
            
            });
            
        } catch (Exception e) {
        }
    }
    
    public void confirmarsalida2(){
        int valor1=JOptionPane.showConfirmDialog(this, "¿Desea cerrar la Aplicacion","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(valor1==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Hasta Pronto","",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
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

        PopUpBorrar = new javax.swing.JPopupMenu();
        PopUpEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelid = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxSemestre = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        Tutor = new javax.swing.JLabel();
        txtTutor = new javax.swing.JTextField();
        Tutor1 = new javax.swing.JLabel();
        txtTelefonoTutor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumInt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumExt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jComboBoxMunicipio = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxColonia = new javax.swing.JComboBox<>();
        labelMateria = new javax.swing.JLabel();
        jComboBoxNacionalidad1 = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        labelBuscar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        labelResultados = new javax.swing.JLabel();
        txtResultados = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();

        PopUpEliminar.setText("jMenuItem1");
        PopUpEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopUpEliminarActionPerformed(evt);
            }
        });
        PopUpBorrar.add(PopUpEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(195, 240, 240));
        jPanel2.setForeground(new java.awt.Color(195, 241, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("Alumnos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel1)
                .addContainerGap(894, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelid.setText("Id");
        jPanel3.add(labelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 30, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 120, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setText("Apellido Paterno");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 120, -1));
        jPanel3.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 170, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setText("Apellido Materno");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel3.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("Edad:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));
        jPanel3.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 110, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setText("CURP");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel3.add(txtCurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setText("NIA");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));
        jPanel3.add(txtNia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 125, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("Teléfono");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 150, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel18.setText("Semestre");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jComboBoxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer", "Segundo", "Tercer", "Cuarto", "Quinto", "Sexto" }));
        jComboBoxSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSemestreActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 150, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel19.setText("Correo Electronico");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        jPanel3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, -1));

        Tutor.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Tutor.setText("Tutor");
        jPanel3.add(Tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 50, -1));
        jPanel3.add(txtTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, -1));

        Tutor1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Tutor1.setText("Telefono Tutor");
        jPanel3.add(Tutor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jPanel3.add(txtTelefonoTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setText("Calle");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));
        jPanel3.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 170, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel13.setText("Numero Interior");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));
        jPanel3.add(txtNumInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel12.setText("Numero Exterior");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
        jPanel3.add(txtNumExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel17.setText("Nacionalidad");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jComboBoxMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione la materia--" }));
        jPanel3.add(jComboBoxMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 160, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel16.setText("Estado");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una opción--" }));
        jPanel3.add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 170, -1));

        jComboBoxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una Opción--" }));
        jPanel3.add(jComboBoxMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel15.setText("Municipio");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel14.setText("Colonia");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 60, -1));

        jComboBoxColonia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione una Opción--", "Agua Santa Ana", "Almolonga", "Chapultepec", "Cañada Coyote", "Huajoyuca", "Huejonapan", "Mariscala", "Moralilo", "Tepexi de Rodríguez", "Tula", " ", " ", " " }));
        jPanel3.add(jComboBoxColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 170, -1));

        labelMateria.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelMateria.setText("Materia");
        jPanel3.add(labelMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        jComboBoxNacionalidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione su País--" }));
        jComboBoxNacionalidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNacionalidad1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxNacionalidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 550));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salvar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha-hacia-atras.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, -1, -1));

        labelBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelBuscar.setText("Buscar:");
        getContentPane().add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, 160, -1));

        labelResultados.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelResultados.setText("Resultados:");
        getContentPane().add(labelResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, -1, -1));

        txtResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadosActionPerformed(evt);
            }
        });
        getContentPane().add(txtResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 630, 150, -1));

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaAlumnos.setComponentPopupMenu(PopUpBorrar);
        jScrollPane1.setViewportView(TablaAlumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 930, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSemestreActionPerformed

    private void txtResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadosActionPerformed

    private void PopUpEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopUpEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PopUpEliminarActionPerformed

    private void jComboBoxNacionalidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNacionalidad1ActionPerformed
        
    }//GEN-LAST:event_jComboBoxNacionalidad1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String id_materia=jComboBoxMateria.getSelectedItem().toString();
        String Materia = (String)jComboBoxMateria.getSelectedItem();
        String Semestre = (String)jComboBoxSemestre.getSelectedItem();
        String Nacionalidad = (String)jComboBoxNacionalidad1.getSelectedItem();
        String Estado = (String)jComboBoxEstado.getSelectedItem();
        String Municipio = (String)jComboBoxMunicipio.getSelectedItem();
        String Colonia = (String)jComboBoxColonia.getSelectedItem();
        
        try {
            if(txtNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo nombre vacio");
            }
            ////////////////////////////////////////***
            else if(txtApellidoP.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de apellido paterno vacio");
            }
            ////////////////////////////////////////***
            else if(txtApellidoM.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de apellido materno vacio");
            }
            ////////////////////////////////////////***
            else if(txtEdad.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de edad vacio");
            }
            ////////////////////////////////////////***
            else if(txtCurp.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de CURP vacio");
            }
            ////////////////////////////////////////***
            else if(txtNia.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de NIA vacio");
            }
            ////////////////////////////////////////***
            else if(txtNia.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de telefono vacio");
            }
            ////////////////////////////////////////***
            else if(Semestre.equals("Seleccione Semestre")){
                JOptionPane.showMessageDialog(null,"Selecciona un semestre");
            }
            ////////////////////////////////////////***
            else if(txtCorreo.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de correo vacio");
            }
            ////////////////////////////////////////***
             else if(txtTutor.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de tutor vacio");
            }
             ////////////////////////////////////////***
             else if(txtTelefonoTutor.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de Telefono tutor vacio");
            }
            ////////////////////////////////////////***
            else if(txtCalle.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de Calle vacio");
            }
            ////////////////////////////////////////***
            else if(txtNumExt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No puedes dejar el campo de Numero Exterior vacio");
            }
            ////////////////////////////////////////***
            else if(Nacionalidad.equals("Seleccione Nacionalidad")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una Nacionalidad");
            }
            ////////////////////////////////////////***
            else if(Estado.equals("Seleccione un Estado")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un Estado");
            }
             ////////////////////////////////////////***
             
            else if(Municipio.equals("Seleccione un Municipio")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un Municipio");
            }
             ////////////////////////////////////////***
            else if(Colonia.equals("Seleccione una Colonia")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una Colonia");
            }
            ////////////////////////////////////////***
            else if(Materia.equals("Seleccione una Materia")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una Materia");
            }
            
            else{
                PreparedStatement ps=cn.prepareStatement("INSERT INTO alumno (Nombre,ApellidoP,ApellidoM,Edad,Curp,NIA,Telefono,Tutor,TelefonoTutor,Semestre) VALUES (?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtApellidoP.getText());
                ps.setString(3, txtApellidoM.getText());
                ps.setString(4, txtEdad.getText());
                ps.setString(5, txtCurp.getText());
                ps.setString(6, txtNia.getText());
                ps.setString(7, txtTelefono.getText());
                ps.setString(8, txtTutor.getText());
                ps.setString(9, txtTelefonoTutor.getText());
                ps.setString(10, jComboBoxSemestre.getSelectedItem().toString());
                ps.setString(11, id_materia);
                
                PreparedStatement pt=cn.prepareStatement("INSERT INTO direccion (calle,numExt,numInt,id_colonia,id_municipio,id_estado,id_pais) VALUES (?,?,?,?,?,?,?)");
                pt.setString(1, txtCalle.getText());
                pt.setString(2, txtNumExt.getText());
                pt.setString(3, txtNumInt.getText());
                pt.setString(4, jComboBoxColonia.getSelectedItem().toString());;
                pt.setString(5, Municipio);
                pt.setString(6, Estado);
                pt.setString(7, Nacionalidad);
                
                PreparedStatement pu=cn.prepareStatement("INSERT INTO materia (NombreMateria) VALUES (?)");
                pu.setString(1, Materia);
                
                ps.executeUpdate();
                pt.executeUpdate();
                pu.executeUpdate();
                JOptionPane.showMessageDialog(null, "Alumno Registro con exito");
                mostrartabla("");
                limpiar();
            }
        } catch (SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al guardar Alumno");
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PrincipalDirector menuPrincipal = new PrincipalDirector();
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopUpBorrar;
    private javax.swing.JMenuItem PopUpEliminar;
    private javax.swing.JTable TablaAlumnos;
    private javax.swing.JLabel Tutor;
    private javax.swing.JLabel Tutor1;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboBoxColonia;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxMateria;
    private javax.swing.JComboBox<String> jComboBoxMunicipio;
    private javax.swing.JComboBox<String> jComboBoxNacionalidad1;
    private javax.swing.JComboBox<String> jComboBoxSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelResultados;
    private javax.swing.JLabel labelid;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumInt;
    private javax.swing.JTextField txtResultados;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoTutor;
    private javax.swing.JTextField txtTutor;
    // End of variables declaration//GEN-END:variables
    Conector con=new Conector();       //Esto es para que exista conexion con la base de adtos
    Connection cn=con.conexion();
}
