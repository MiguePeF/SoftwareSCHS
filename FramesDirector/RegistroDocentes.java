/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesDirector;

/**
 *
 * @author Miguel
 */
public class RegistroDocentes extends javax.swing.JFrame {

    /**
     * Creates new form RegistroDocentes
     */
    public RegistroDocentes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        Tutor = new javax.swing.JLabel();
        txtTutor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumInt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumExt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jComboBoxMunicipio = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxColonia = new javax.swing.JComboBox<>();
        jComboBoxNacionalidad1 = new javax.swing.JComboBox<>();
        Tutor2 = new javax.swing.JLabel();
        txtTelefonoTutor1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxColonia1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        labelBuscar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        labelResultados = new javax.swing.JLabel();
        txtResultados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Docentes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 200, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 14))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("Tel??fono");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel19.setText("Correo Electronico");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 170, -1));

        Tutor.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Tutor.setText("Cedula");
        jPanel3.add(Tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, -1));
        jPanel3.add(txtTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 150, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setText("Calle");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        jPanel3.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 170, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel13.setText("Numero Interior");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jPanel3.add(txtNumInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel12.setText("Numero Exterior");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        txtNumExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumExtActionPerformed(evt);
            }
        });
        jPanel3.add(txtNumExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel17.setText("Nacionalidad");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel16.setText("Estado");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una opci??n--" }));
        jPanel3.add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 170, -1));

        jComboBoxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una Opci??n--" }));
        jPanel3.add(jComboBoxMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel15.setText("Municipio");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel14.setText("Colonia");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 60, -1));

        jComboBoxColonia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione una Opci??n--", "Agua Santa Ana", "Almolonga", "Chapultepec", "Ca??ada Coyote", "Huajoyuca", "Huejonapan", "Mariscala", "Moralilo", "Tepexi de Rodr??guez", "Tula", " ", " ", " " }));
        jPanel3.add(jComboBoxColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 180, -1));

        jComboBoxNacionalidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione su Pa??s--" }));
        jComboBoxNacionalidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNacionalidad1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxNacionalidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 170, -1));

        Tutor2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Tutor2.setText("Profesion");
        jPanel3.add(Tutor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));
        jPanel3.add(txtTelefonoTutor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 170, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel18.setText("Materia");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 60, -1));

        jComboBoxColonia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione una Opci??n--", "Agua Santa Ana", "Almolonga", "Chapultepec", "Ca??ada Coyote", "Huajoyuca", "Huejonapan", "Mariscala", "Moralilo", "Tepexi de Rodr??guez", "Tula", " ", " ", " " }));
        jPanel3.add(jComboBoxColonia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 180, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 390, 480));
        jPanel3.getAccessibleContext().setAccessibleName("Docentes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, 450));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salvar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha-hacia-atras.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        labelBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelBuscar.setText("Buscar:");
        jPanel1.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 160, -1));

        labelResultados.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelResultados.setText("Resultados:");
        jPanel1.add(labelResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, -1, -1));

        txtResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadosActionPerformed(evt);
            }
        });
        jPanel1.add(txtResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 150, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel2.setText("BACHILLERATO GENERAL \"HERMANOS SERD??N\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 440, 20));

        jPanel2.setBackground(new java.awt.Color(195, 240, 240));
        jPanel2.setForeground(new java.awt.Color(195, 241, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNacionalidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNacionalidad1ActionPerformed

    }//GEN-LAST:event_jComboBoxNacionalidad1ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNumExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumExtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumExtActionPerformed

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

    private void txtResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tutor;
    private javax.swing.JLabel Tutor2;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboBoxColonia;
    private javax.swing.JComboBox<String> jComboBoxColonia1;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxMunicipio;
    private javax.swing.JComboBox<String> jComboBoxNacionalidad1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelResultados;
    private javax.swing.JLabel labelid;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumInt;
    private javax.swing.JTextField txtResultados;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoTutor1;
    private javax.swing.JTextField txtTutor;
    // End of variables declaration//GEN-END:variables
}
