/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.views;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author sKm
 */
public class TelaEstoque extends javax.swing.JFrame {

    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque() {
        initComponents();
        this.setLocationRelativeTo(null);

        // Setando Icone Janela
        
        URL IconRoute = getClass().getResource("/IconLogo-S.png");
        Image IconWindow = Toolkit.getDefaultToolkit().getImage(IconRoute);
        this.setIconImage(IconWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSidebarTop = new javax.swing.JPanel();
        panelLogoEstoque = new javax.swing.JPanel();
        lblLojaRoupaLogoProduto = new javax.swing.JLabel();
        lblLineProduto = new javax.swing.JLabel();
        panelLineFullLogoProduto = new javax.swing.JPanel();
        lblEstoque = new javax.swing.JLabel();
        panelFiltro = new javax.swing.JPanel();
        lblIdProdutos = new javax.swing.JLabel();
        txtIdProdutos = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        panelBotoesEstoque = new javax.swing.JPanel();
        btnBuscarRelatorio = new javax.swing.JButton();
        btnLimparRelatorio = new javax.swing.JButton();
        btnRemoverRelatorio = new javax.swing.JButton();
        btnCancelarRelatorio = new javax.swing.JButton();
        btnBuscarRelatorio1 = new javax.swing.JButton();
        spanelEstoque = new javax.swing.JScrollPane();
        tbEstoque = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelSidebarTop.setBackground(new java.awt.Color(15, 76, 117));

        panelLogoEstoque.setBackground(new java.awt.Color(15, 76, 117));
        panelLogoEstoque.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(190, 176, 40), 1, true));
        panelLogoEstoque.setForeground(new java.awt.Color(190, 176, 40));
        panelLogoEstoque.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLojaRoupaLogoProduto.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        lblLojaRoupaLogoProduto.setForeground(new java.awt.Color(190, 176, 40));
        lblLojaRoupaLogoProduto.setText("Synthesia");
        panelLogoEstoque.add(lblLojaRoupaLogoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, 41));

        lblLineProduto.setBackground(new java.awt.Color(190, 190, 190));
        lblLineProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLineProduto.setForeground(new java.awt.Color(190, 176, 40));
        lblLineProduto.setText("____________________________________");
        panelLogoEstoque.add(lblLineProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, -1));

        panelLineFullLogoProduto.setBackground(new java.awt.Color(190, 176, 40));

        javax.swing.GroupLayout panelLineFullLogoProdutoLayout = new javax.swing.GroupLayout(panelLineFullLogoProduto);
        panelLineFullLogoProduto.setLayout(panelLineFullLogoProdutoLayout);
        panelLineFullLogoProdutoLayout.setHorizontalGroup(
            panelLineFullLogoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelLineFullLogoProdutoLayout.setVerticalGroup(
            panelLineFullLogoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelLogoEstoque.add(panelLineFullLogoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 290, 10));

        lblEstoque.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblEstoque.setForeground(new java.awt.Color(190, 176, 40));
        lblEstoque.setText("Estoque");

        javax.swing.GroupLayout panelSidebarTopLayout = new javax.swing.GroupLayout(panelSidebarTop);
        panelSidebarTop.setLayout(panelSidebarTopLayout);
        panelSidebarTopLayout.setHorizontalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(panelLogoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEstoque)
                .addGap(53, 53, 53))
        );
        panelSidebarTopLayout.setVerticalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelLogoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        panelFiltro.setBackground(new java.awt.Color(224, 224, 224));
        panelFiltro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));

        lblIdProdutos.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblIdProdutos.setForeground(new java.awt.Color(27, 38, 44));
        lblIdProdutos.setText("ID Produto:");

        lblQuantidade.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(27, 38, 44));
        lblQuantidade.setText("Quantidade:");

        javax.swing.GroupLayout panelFiltroLayout = new javax.swing.GroupLayout(panelFiltro);
        panelFiltro.setLayout(panelFiltroLayout);
        panelFiltroLayout.setHorizontalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQuantidade)
                    .addComponent(lblIdProdutos)
                    .addComponent(txtIdProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(txtQuantidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFiltroLayout.setVerticalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblIdProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        panelBotoesEstoque.setBackground(new java.awt.Color(224, 224, 224));

        btnBuscarRelatorio.setBackground(new java.awt.Color(224, 224, 224));
        btnBuscarRelatorio.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnBuscarRelatorio.setForeground(new java.awt.Color(27, 38, 44));
        btnBuscarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_search_32px_1_1.png"))); // NOI18N
        btnBuscarRelatorio.setText("Buscar");
        btnBuscarRelatorio.setToolTipText("");
        btnBuscarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRelatorioActionPerformed(evt);
            }
        });

        btnLimparRelatorio.setBackground(new java.awt.Color(224, 224, 224));
        btnLimparRelatorio.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnLimparRelatorio.setForeground(new java.awt.Color(27, 38, 44));
        btnLimparRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_broom_24px.png"))); // NOI18N
        btnLimparRelatorio.setText("Limpar");
        btnLimparRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparRelatorioActionPerformed(evt);
            }
        });

        btnRemoverRelatorio.setBackground(new java.awt.Color(224, 224, 224));
        btnRemoverRelatorio.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnRemoverRelatorio.setForeground(new java.awt.Color(27, 38, 44));
        btnRemoverRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_trash_24px.png"))); // NOI18N
        btnRemoverRelatorio.setText("Remover");
        btnRemoverRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverRelatorioActionPerformed(evt);
            }
        });

        btnCancelarRelatorio.setBackground(new java.awt.Color(224, 224, 224));
        btnCancelarRelatorio.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCancelarRelatorio.setForeground(new java.awt.Color(27, 38, 44));
        btnCancelarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_cancel_24px.png"))); // NOI18N
        btnCancelarRelatorio.setText("Cancelar");
        btnCancelarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRelatorioActionPerformed(evt);
            }
        });

        btnBuscarRelatorio1.setBackground(new java.awt.Color(224, 224, 224));
        btnBuscarRelatorio1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnBuscarRelatorio1.setForeground(new java.awt.Color(27, 38, 44));
        btnBuscarRelatorio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_plus_math_24px.png"))); // NOI18N
        btnBuscarRelatorio1.setText("Adicionar");
        btnBuscarRelatorio1.setToolTipText("");
        btnBuscarRelatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRelatorio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesEstoqueLayout = new javax.swing.GroupLayout(panelBotoesEstoque);
        panelBotoesEstoque.setLayout(panelBotoesEstoqueLayout);
        panelBotoesEstoqueLayout.setHorizontalGroup(
            panelBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesEstoqueLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnBuscarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBuscarRelatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249)
                .addComponent(btnLimparRelatorio)
                .addGap(226, 226, 226)
                .addComponent(btnRemoverRelatorio)
                .addGap(40, 40, 40)
                .addComponent(btnCancelarRelatorio)
                .addGap(6, 6, 6))
        );

        panelBotoesEstoqueLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscarRelatorio, btnCancelarRelatorio, btnLimparRelatorio, btnRemoverRelatorio});

        panelBotoesEstoqueLayout.setVerticalGroup(
            panelBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverRelatorio)
                    .addComponent(btnCancelarRelatorio)
                    .addComponent(btnLimparRelatorio)
                    .addComponent(btnBuscarRelatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBotoesEstoqueLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscarRelatorio, btnCancelarRelatorio, btnLimparRelatorio, btnRemoverRelatorio});

        tbEstoque.setBackground(new java.awt.Color(27, 38, 44));
        tbEstoque.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        tbEstoque.setForeground(new java.awt.Color(190, 190, 190));
        tbEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Tipo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEstoque.setToolTipText("Tabela Produtos");
        tbEstoque.setFocusable(false);
        tbEstoque.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbEstoque.setRowHeight(25);
        tbEstoque.setShowHorizontalLines(false);
        tbEstoque.setShowVerticalLines(false);
        tbEstoque.getTableHeader().setReorderingAllowed(false);
        spanelEstoque.setViewportView(tbEstoque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSidebarTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBotoesEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spanelEstoque, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSidebarTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBotoesEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(spanelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRelatorioActionPerformed

    }//GEN-LAST:event_btnBuscarRelatorioActionPerformed

    private void btnLimparRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparRelatorioActionPerformed

    }//GEN-LAST:event_btnLimparRelatorioActionPerformed

    private void btnRemoverRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverRelatorioActionPerformed

    }//GEN-LAST:event_btnRemoverRelatorioActionPerformed

    private void btnCancelarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRelatorioActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarRelatorioActionPerformed

    private void btnBuscarRelatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRelatorio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarRelatorio1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRelatorio;
    private javax.swing.JButton btnBuscarRelatorio1;
    private javax.swing.JButton btnCancelarRelatorio;
    private javax.swing.JButton btnLimparRelatorio;
    private javax.swing.JButton btnRemoverRelatorio;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblIdProdutos;
    private javax.swing.JLabel lblLineProduto;
    private javax.swing.JLabel lblLojaRoupaLogoProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JPanel panelBotoesEstoque;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JPanel panelLineFullLogoProduto;
    private javax.swing.JPanel panelLogoEstoque;
    private javax.swing.JPanel panelSidebarTop;
    private javax.swing.JScrollPane spanelEstoque;
    private javax.swing.JTable tbEstoque;
    private javax.swing.JTextField txtIdProdutos;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
