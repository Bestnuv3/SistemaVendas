/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.telas;

/**
 *
 * @author julia
 */
public class Recibo extends javax.swing.JFrame {

    /**
     * Creates new form Recibo
     */
    public Recibo() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jbConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Recibo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(118, 6, 58, 25);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jlNome.setText("jLabel2");
        jPanel1.add(jlNome);
        jlNome.setBounds(7, 2, 139, 200);

        jlQuantidade.setText("jLabel2");
        jPanel1.add(jlQuantidade);
        jlQuantidade.setBounds(158, -3, 48, 200);

        jlPreco.setText("jLabel3");
        jPanel1.add(jlPreco);
        jlPreco.setBounds(220, 0, 70, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 49, 300, 200);

        jbConcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbConcluir.setText("Concluir");
        getContentPane().add(jbConcluir);
        jbConcluir.setBounds(114, 260, 76, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbConcluir;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlQuantidade;
    // End of variables declaration//GEN-END:variables
}
