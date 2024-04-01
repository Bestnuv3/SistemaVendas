/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.telas;

import com.mycompany.entities.Pedido;
import com.mycompany.entities.ProdutoCarrinho;
import com.mycompany.listaprodutos.Carrinho;
import com.mycompany.listaprodutos.ListaProdutos;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ots
 */
public class TelaRecibo extends javax.swing.JPanel {

    private Pedido pedido;
    /**
     * Creates new form TelaRecibo
     */
    public TelaRecibo(Pedido pedido) {
        this.pedido = pedido;
        initComponents();
        this.jlTotal.setText("R$ " + pedido.getValorTotal());
        preencherFormaDePagamento();
        preencherListaProdutos();
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
        jbConcluir = new javax.swing.JButton();
        jpListaProdutos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlFormaPagamento = new javax.swing.JLabel();
        jlParcelas = new javax.swing.JLabel();
        jlQuantidadeParcelas = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recibo");

        jbConcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbConcluir.setText("Concluir");
        jbConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpListaProdutosLayout = new javax.swing.GroupLayout(jpListaProdutos);
        jpListaProdutos.setLayout(jpListaProdutosLayout);
        jpListaProdutosLayout.setHorizontalGroup(
            jpListaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        jpListaProdutosLayout.setVerticalGroup(
            jpListaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jLabel2.setText("Total:");

        jlTotal.setText("jLabel3");

        jLabel3.setText("Forma de Pagamento:");

        jlFormaPagamento.setText("jLabel4");

        jlParcelas.setText("jLabel5");

        jlQuantidadeParcelas.setText("Parcelas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpListaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlQuantidadeParcelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlParcelas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jbConcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlTotal))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlFormaPagamento))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQuantidadeParcelas)
                    .addComponent(jlParcelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpListaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jbConcluir)
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirActionPerformed
        Carrinho.getInstance().clearProdutos();
        
        Janela.telaInicial = new TelaInicial();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.telaRecibo);
        janela.add(Janela.telaInicial, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jbConcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbConcluir;
    private javax.swing.JLabel jlFormaPagamento;
    private javax.swing.JLabel jlParcelas;
    private javax.swing.JLabel jlQuantidadeParcelas;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JPanel jpListaProdutos;
    // End of variables declaration//GEN-END:variables

    private void preencherListaProdutos() {
        this.jpListaProdutos.setLayout(new GridLayout(0,1));
        for (ProdutoCarrinho listaProduto : pedido.getListaProdutos()) {
            JLabel label = new JLabel(listaProduto.toString());
            jpListaProdutos.add(label);
        }
        jpListaProdutos.setVisible(true);
    }

    private void preencherFormaDePagamento() {
        switch (pedido.getFormaDePagamento()) {
            case CARTAO_CREDITO -> {
                jlQuantidadeParcelas.setVisible(true);
                
                jlParcelas.setText(pedido.getNumeroParcelas()+"x R$ " + pedido.getValorParcela());
                jlParcelas.setVisible(true);
                jlFormaPagamento.setText("Cartão de Crédito");
            }
            default ->  {
                {
                    jlParcelas.setVisible(false);
                    jlQuantidadeParcelas.setVisible(false);
                    jlFormaPagamento.setText("Débito");
                }
            }
        }
    }
}
