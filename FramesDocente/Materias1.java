/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesDocente;

import Clases.Conector;
import Frames.PrincipalDocente;
import Frames.TextPrompt;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel
 */
public class Materias1 extends javax.swing.JFrame {

    /**
     * Creates new form Materias
     */
    public Materias1() {
        initComponents();
        TextPrompt nombre_materia = new TextPrompt("Escribe la Materia", txt_Materia);
        this.setLocationRelativeTo(null);
        mostrartabla(" ");
        limpiar();
        txt_IDMateria.setEnabled(false);
    }
    
    void limpiar(){
        txt_IDMateria.setText("");
        txt_Materia.setText("");
    }
    
    void mostrartabla(String valor){
        DefaultTableModel modelo = new DefaultTableModel ();
        modelo.addColumn("Id");
        modelo.addColumn("Materia");
        
        RegistroMaterias.setModel(modelo);
        String sql = "SELECT * FROM materia";
        String datos[] = new String[2];
        Statement st;
        
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               datos[0] = rs.getString(1);
               datos[1] = rs.getString(2);
               modelo.addRow(datos);
           }
            RegistroMaterias.setModel(modelo);
        } catch (SQLException e) {
            System.err.print(e);
            JOptionPane.showMessageDialog(null,"Error al cargar Materias");
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

        PopBorrar = new javax.swing.JPopupMenu();
        PopEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_IDMateria = new javax.swing.JTextField();
        txt_Materia = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistroMaterias = new javax.swing.JTable();

        PopEliminar.setText("Elliminar");
        PopEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopEliminarActionPerformed(evt);
            }
        });
        PopBorrar.add(PopEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(195, 240, 240));
        jPanel2.setForeground(new java.awt.Color(195, 241, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("Registro de Materias");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        jPanel3.setBackground(new java.awt.Color(193, 239, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Materias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("ID_materia:");

        jLabel3.setText("Materia:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_IDMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txt_Materia))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_IDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 140));

        BotonGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salvar.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 40));

        BotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 40));

        BotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha-hacia-atras.png"))); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 110, 40));

        RegistroMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        RegistroMaterias.setComponentPopupMenu(PopBorrar);
        RegistroMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RegistroMaterias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 250, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        try {
            if(txt_Materia.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No puedes dejar campos vacios");
            }
            else{
                PreparedStatement ps=cn.prepareStatement("INSERT INTO materia (NombreMateria) VALUES (?)");
                ps.setString(1, txt_Materia.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Materia agregada Correctamente");
                mostrartabla("");
                limpiar();
            }
            
        } catch (SQLException e){
             System.err.print(e);
             JOptionPane.showMessageDialog(null,"Error al agregar Materia");
            
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        try {
                PreparedStatement ps=cn.prepareStatement("UPDATE materia SET NombreMateria='"+txt_Materia.getText()+"'WHERE idMateria='"+txt_IDMateria.getText()+"' ");
                int respuesta = ps.executeUpdate();
                
                if(respuesta>0){
                  JOptionPane.showMessageDialog(null, "Materia Actualizada Correctamente");
                  limpiar();
                  mostrartabla("");
                }
                else{
                   JOptionPane.showMessageDialog(null,"No ha seleccionado ninguna fila");
                }
                
            
        } catch (SQLException e){
            System.err.print(e); 
            JOptionPane.showMessageDialog(null,"Error al actualizar Materia");
            
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        PrincipalDocente menuPrincipal = new PrincipalDocente();
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void RegistroMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMateriasMouseClicked
        int fila=this.RegistroMaterias.getSelectedRow();
        this.txt_IDMateria.setText(this.RegistroMaterias.getValueAt(fila, 0).toString());
        this.txt_Materia.setText(this.RegistroMaterias.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_RegistroMateriasMouseClicked

    private void PopEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopEliminarActionPerformed
        try {
            PreparedStatement ps=cn.prepareStatement("DELETE FROM materia WHERE idMateria='"+txt_IDMateria.getText()+"'");
            int respuesta=ps.executeUpdate();
            if(respuesta>0){
               JOptionPane.showMessageDialog(null,"Curso eliminado");
               limpiar();
               mostrartabla("");
            }
            
            else{
                JOptionPane.showMessageDialog(null,"No a seleccionado ningna fila");
            }
        } catch (SQLException e){
            System.err.print(e); 
            JOptionPane.showMessageDialog(null,"Error al eliminar materia");
        }
    }//GEN-LAST:event_PopEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Materias1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Materias1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Materias1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Materias1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Materias1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPopupMenu PopBorrar;
    private javax.swing.JMenuItem PopEliminar;
    private javax.swing.JTable RegistroMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_IDMateria;
    private javax.swing.JTextField txt_Materia;
    // End of variables declaration//GEN-END:variables

    Conector con=new Conector();       //Esto es para que exista conexion con la base de adtos
    Connection cn=con.conexion();
}
