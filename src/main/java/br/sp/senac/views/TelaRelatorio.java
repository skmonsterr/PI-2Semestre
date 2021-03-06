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
 * @author Vitor Lima Brandão
 */
public class TelaRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorio() {
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

        panelBg = new javax.swing.JPanel();
        panelSidebarTop = new javax.swing.JPanel();
        panelLogoRelatorio = new javax.swing.JPanel();
        lblLojaRoupaLogoProduto = new javax.swing.JLabel();
        lblLineProduto = new javax.swing.JLabel();
        panelLineFullLogoProduto = new javax.swing.JPanel();
        lblRelatorio = new javax.swing.JLabel();
        panelFiltro = new javax.swing.JPanel();
        ftxtData = new javax.swing.JFormattedTextField();
        lblData = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        ftxtData1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        ftxtData2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        ftxtData3 = new javax.swing.JFormattedTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        lblData2 = new javax.swing.JLabel();
        lblData3 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        spanelProdutos = new javax.swing.JScrollPane();
        tbRelatorio = new javax.swing.JTable();
        panelBotoesProduto5 = new javax.swing.JPanel();
        btnBuscarRelatorio = new javax.swing.JButton();
        btnLimparRelatorio = new javax.swing.JButton();
        btnRemoverRelatorio = new javax.swing.JButton();
        btnCancelarRelatorio = new javax.swing.JButton();
        separadorBotoesUp = new javax.swing.JSeparator();
        separadorBotoesDown = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelBg.setBackground(new java.awt.Color(224, 224, 224));

        panelSidebarTop.setBackground(new java.awt.Color(15, 76, 117));

        panelLogoRelatorio.setBackground(new java.awt.Color(15, 76, 117));
        panelLogoRelatorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(190, 176, 40), 1, true));
        panelLogoRelatorio.setForeground(new java.awt.Color(190, 176, 40));
        panelLogoRelatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLojaRoupaLogoProduto.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        lblLojaRoupaLogoProduto.setForeground(new java.awt.Color(190, 176, 40));
        lblLojaRoupaLogoProduto.setText("Synthesia");
        panelLogoRelatorio.add(lblLojaRoupaLogoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, 41));

        lblLineProduto.setBackground(new java.awt.Color(190, 190, 190));
        lblLineProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLineProduto.setForeground(new java.awt.Color(190, 176, 40));
        lblLineProduto.setText("____________________________________");
        panelLogoRelatorio.add(lblLineProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, -1));

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

        panelLogoRelatorio.add(panelLineFullLogoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 290, 10));

        lblRelatorio.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblRelatorio.setForeground(new java.awt.Color(190, 176, 40));
        lblRelatorio.setText("Relatorio");

        javax.swing.GroupLayout panelSidebarTopLayout = new javax.swing.GroupLayout(panelSidebarTop);
        panelSidebarTop.setLayout(panelSidebarTopLayout);
        panelSidebarTopLayout.setHorizontalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(panelLogoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 785, Short.MAX_VALUE)
                .addComponent(lblRelatorio)
                .addGap(53, 53, 53))
        );
        panelSidebarTopLayout.setVerticalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelLogoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        panelFiltro.setBackground(new java.awt.Color(224, 224, 224));
        panelFiltro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));

        ftxtData.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        ftxtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDataActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(27, 38, 44));
        lblData.setText("Valor:");

        lblData1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblData1.setForeground(new java.awt.Color(27, 38, 44));
        lblData1.setText("Período:");

        try {
            ftxtData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtData1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftxtData1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        ftxtData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtData1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Até");

        try {
            ftxtData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtData2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftxtData2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        ftxtData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtData2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel3.setText("-");

        ftxtData3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        ftxtData3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtData3ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton1.setText("Calças");

        jRadioButton2.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton2.setText("Boné");

        jRadioButton3.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton3.setText("Camisetas");

        jRadioButton4.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton4.setText("Blusas");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton5.setText("Shorts");

        lblData2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblData2.setForeground(new java.awt.Color(27, 38, 44));
        lblData2.setText("Tipos:");

        lblData3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblData3.setForeground(new java.awt.Color(27, 38, 44));
        lblData3.setText("Tamanhos:");

        jRadioButton6.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton6.setText("Único");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton7.setText("PP");

        jRadioButton8.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton8.setText("M");

        jRadioButton9.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton9.setText("G");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton10.setText("GG");

        jRadioButton11.setBackground(new java.awt.Color(224, 224, 224));
        jRadioButton11.setText("XGG");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFiltroLayout = new javax.swing.GroupLayout(panelFiltro);
        panelFiltro.setLayout(panelFiltroLayout);
        panelFiltroLayout.setHorizontalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftxtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData1))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(ftxtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFiltroLayout.createSequentialGroup()
                                .addComponent(ftxtData3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9)
                                .addComponent(ftxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblData)))
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(17, 17, 17)
                        .addComponent(jRadioButton4)
                        .addGap(17, 17, 17)
                        .addComponent(jRadioButton3)
                        .addGap(17, 17, 17)
                        .addComponent(jRadioButton1)
                        .addGap(17, 17, 17)
                        .addComponent(jRadioButton5))
                    .addComponent(lblData2))
                .addGap(167, 167, 167)
                .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData3)
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton8))
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addComponent(jRadioButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton11)))
                .addContainerGap(396, Short.MAX_VALUE))
        );

        panelFiltroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButton10, jRadioButton11, jRadioButton6, jRadioButton7, jRadioButton8, jRadioButton9});

        panelFiltroLayout.setVerticalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ftxtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblData1)
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ftxtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ftxtData3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ftxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(lblData3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8))))
                .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblData2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton1)
                                .addComponent(jRadioButton5))))
                    .addGroup(panelFiltroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton11)
                            .addGroup(panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton10)
                                .addComponent(jRadioButton9)))))
                .addGap(37, 37, 37))
        );

        tbRelatorio.setBackground(new java.awt.Color(27, 38, 44));
        tbRelatorio.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        tbRelatorio.setForeground(new java.awt.Color(190, 190, 190));
        tbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
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
        tbRelatorio.setToolTipText("Tabela Produtos");
        tbRelatorio.setFocusable(false);
        tbRelatorio.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbRelatorio.setRowHeight(25);
        tbRelatorio.setShowHorizontalLines(false);
        tbRelatorio.setShowVerticalLines(false);
        tbRelatorio.getTableHeader().setReorderingAllowed(false);
        spanelProdutos.setViewportView(tbRelatorio);

        panelBotoesProduto5.setBackground(new java.awt.Color(224, 224, 224));

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

        javax.swing.GroupLayout panelBotoesProduto5Layout = new javax.swing.GroupLayout(panelBotoesProduto5);
        panelBotoesProduto5.setLayout(panelBotoesProduto5Layout);
        panelBotoesProduto5Layout.setHorizontalGroup(
            panelBotoesProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesProduto5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnBuscarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413)
                .addComponent(btnLimparRelatorio)
                .addGap(226, 226, 226)
                .addComponent(btnRemoverRelatorio)
                .addGap(40, 40, 40)
                .addComponent(btnCancelarRelatorio)
                .addGap(6, 6, 6))
        );

        panelBotoesProduto5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscarRelatorio, btnCancelarRelatorio, btnLimparRelatorio, btnRemoverRelatorio});

        panelBotoesProduto5Layout.setVerticalGroup(
            panelBotoesProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesProduto5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverRelatorio)
                    .addComponent(btnCancelarRelatorio)
                    .addComponent(btnLimparRelatorio))
                .addContainerGap())
        );

        panelBotoesProduto5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscarRelatorio, btnCancelarRelatorio, btnLimparRelatorio, btnRemoverRelatorio});

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSidebarTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separadorBotoesDown)
                            .addComponent(panelBotoesProduto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                                .addComponent(separadorBotoesUp, javax.swing.GroupLayout.PREFERRED_SIZE, 1272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spanelProdutos)
                            .addComponent(panelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))))
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                .addComponent(panelSidebarTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(separadorBotoesUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoesProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorBotoesDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(spanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparRelatorioActionPerformed

    }//GEN-LAST:event_btnLimparRelatorioActionPerformed

    private void btnRemoverRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverRelatorioActionPerformed


        
    }//GEN-LAST:event_btnRemoverRelatorioActionPerformed

    private void btnCancelarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRelatorioActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarRelatorioActionPerformed

    private void ftxtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtDataActionPerformed

    private void ftxtData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtData1ActionPerformed

    private void ftxtData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtData2ActionPerformed

    private void ftxtData3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtData3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtData3ActionPerformed

    private void btnBuscarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRelatorioActionPerformed

    }//GEN-LAST:event_btnBuscarRelatorioActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRelatorio;
    private javax.swing.JButton btnCancelarRelatorio;
    private javax.swing.JButton btnLimparRelatorio;
    private javax.swing.JButton btnRemoverRelatorio;
    private javax.swing.JFormattedTextField ftxtData;
    private javax.swing.JFormattedTextField ftxtData1;
    private javax.swing.JFormattedTextField ftxtData2;
    private javax.swing.JFormattedTextField ftxtData3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblData3;
    private javax.swing.JLabel lblLineProduto;
    private javax.swing.JLabel lblLojaRoupaLogoProduto;
    private javax.swing.JLabel lblRelatorio;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelBotoesProduto5;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JPanel panelLineFullLogoProduto;
    private javax.swing.JPanel panelLogoRelatorio;
    private javax.swing.JPanel panelSidebarTop;
    private javax.swing.JSeparator separadorBotoesDown;
    private javax.swing.JSeparator separadorBotoesUp;
    private javax.swing.JScrollPane spanelProdutos;
    private javax.swing.JTable tbRelatorio;
    // End of variables declaration//GEN-END:variables
}
