/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.telas;

import com.mycompany.listaprodutos.ListaProdutos;
import com.mycompany.entities.Produto;
import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ots
 */
public class TelaListaProdutos extends javax.swing.JPanel {

    private DefaultListModel<String> listModel;
    private ListaProdutos listaProdutos;
    private int selectedItemIndice;
    
    /**
     * Creates new form TelaListaProdutosJPanel
     */
    public TelaListaProdutos() {
        listaProdutos = ListaProdutos.getInstance();
        this.listModel = new DefaultListModel<>();
        initComponents();
        initListaProdutos();
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
        jbVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProdutos = new javax.swing.JList<>();
        jbAdicionarItem = new javax.swing.JButton();
        jbEditarItem = new javax.swing.JButton();
        jbRemoverItem = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loja IFSC");

        jbVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Produtos"));

        jListProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProdutos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListProdutosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListProdutos);

        jbAdicionarItem.setText("Adicionar Item");
        jbAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarItemActionPerformed(evt);
            }
        });

        jbEditarItem.setText("Editar Item");
        jbEditarItem.setEnabled(false);
        jbEditarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarItemActionPerformed(evt);
            }
        });

        jbRemoverItem.setText("Remover Item");
        jbRemoverItem.setEnabled(false);
        jbRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEditarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbAdicionarItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditarItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbRemoverItem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVoltar)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        Janela.telaInicial = new TelaInicial();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.telaListaProdutos);
        janela.add(Janela.telaInicial, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarItemActionPerformed
        Produto novoProduto = abrirDialogInserirProduto("", 0.0);
        
        this.listModel.addElement(novoProduto.getNome());
        this.listaProdutos.produtos.add(novoProduto);
    }//GEN-LAST:event_jbAdicionarItemActionPerformed

    private void jListProdutosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListProdutosValueChanged
        int[] selectedIndices = jListProdutos.getSelectionModel().getSelectedIndices();
        if (selectedIndices.length <= 0){
            this.jbEditarItem.setEnabled(false);
            this.jbRemoverItem.setEnabled(false);
            return;
        }
        this.selectedItemIndice = selectedIndices[0];
        this.jbEditarItem.setEnabled(true);
        this.jbRemoverItem.setEnabled(true);
    }//GEN-LAST:event_jListProdutosValueChanged

    private void jbRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverItemActionPerformed
        Produto produtoARemover = listaProdutos.produtos.get(selectedItemIndice);
        JLabel removerProdutoLabel = new JLabel("Deseja remover o produto '"+produtoARemover.getNome()+"'");
        int result = JOptionPane.showConfirmDialog(null,removerProdutoLabel, null, JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            listaProdutos.produtos.remove(selectedItemIndice);
            listModel.removeElementAt(selectedItemIndice);
            jListProdutos.setModel(listModel);
        }
    }//GEN-LAST:event_jbRemoverItemActionPerformed

    private void jbEditarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarItemActionPerformed
        Produto produtoAEditar = listaProdutos.produtos.get(selectedItemIndice);
        produtoAEditar = abrirDialogInserirProduto(produtoAEditar.getNome(), produtoAEditar.getValor());
        listModel.remove(selectedItemIndice);
        listaProdutos.produtos.remove(selectedItemIndice);
        listModel.add(selectedItemIndice, produtoAEditar.getNome());
        listaProdutos.produtos.add(selectedItemIndice, produtoAEditar);
    }//GEN-LAST:event_jbEditarItemActionPerformed

    private Produto abrirDialogInserirProduto(String nomeProdutoAEditar, double valorProdutoAEditar){
        JTextField nomeField = new JTextField(15);
        nomeField.setText(nomeProdutoAEditar);
        SpinnerNumberModel precoFieldModel = new SpinnerNumberModel(valorProdutoAEditar, 0.0, 99999.9, 0.1);
        JSpinner precoField = new JSpinner(precoFieldModel);
        
        JPanel dialogPanel = new JPanel();
        dialogPanel.add(new JLabel("Nome do produto:"));
        dialogPanel.add(nomeField);
        dialogPanel.add(new JLabel("Preço:"));
        dialogPanel.add(precoField);
        
        int result = JOptionPane.showConfirmDialog(null, dialogPanel, "Insira o nome e o preço do produto", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION){
            String nomeProduto = nomeField.getText();
            Double precoProduto = Double.valueOf(precoField.getValue().toString());
            return new Produto(nomeProduto, precoProduto);
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListProdutos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionarItem;
    private javax.swing.JButton jbEditarItem;
    private javax.swing.JButton jbRemoverItem;
    private javax.swing.JButton jbVoltar;
    // End of variables declaration//GEN-END:variables

    private void initListaProdutos() {
        for (Produto produto : this.listaProdutos.produtos) {
            this.listModel.addElement(produto.getNome());
        }
        
        this.jListProdutos.setModel(listModel);
    }
}
