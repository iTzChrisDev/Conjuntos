package GUI;

import CustomComponents.ScrollBarCustom;
import java.awt.Color;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
        initComponentsCustom();
        setLocationRelativeTo(this);
    }

    public void initComponentsCustom()
    {
        scrollA.setVerticalScrollBar(new ScrollBarCustom(new Color(102, 99, 254), new Color(68, 66, 169)));
        scrollB.setVerticalScrollBar(new ScrollBarCustom(new Color(0,160,150), new Color(0, 106, 121)));
        scrollC.setVerticalScrollBar(new ScrollBarCustom(new Color(224, 108, 159), new Color(149, 72, 106)));
        scrollD.setVerticalScrollBar(new ScrollBarCustom(new Color(38, 111, 213), new Color(25, 74, 142)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnlInputs = new CustomComponents.PanelRound();
        mainContainer = new javax.swing.JPanel();
        txtContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        btnContainer = new javax.swing.JPanel();
        btnSeparar = new CustomComponents.Button();
        jLabel1 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        pnlConjuntos = new CustomComponents.PanelRound();
        pnlConjunto1 = new CustomComponents.PanelRound();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        panelRound5 = new CustomComponents.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        scrollA = new javax.swing.JScrollPane();
        listaA = new javax.swing.JList<>();
        pnlConjunto2 = new CustomComponents.PanelRound();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        panelRound6 = new CustomComponents.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        scrollB = new javax.swing.JScrollPane();
        listaB = new javax.swing.JList<>();
        pnlConjunto3 = new CustomComponents.PanelRound();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        panelRound7 = new CustomComponents.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        scrollC = new javax.swing.JScrollPane();
        listaC = new javax.swing.JList<>();
        pnlConjunto4 = new CustomComponents.PanelRound();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        panelRound8 = new CustomComponents.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        scrollD = new javax.swing.JScrollPane();
        listaD = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        pnlBg.setBackground(new java.awt.Color(30, 30, 30));
        pnlBg.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlBg.setLayout(new java.awt.BorderLayout(0, 10));

        pnlHeader.setOpaque(false);
        pnlHeader.setLayout(new java.awt.BorderLayout());

        pnlInputs.setBackground(new java.awt.Color(50, 50, 50));
        pnlInputs.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlInputs.setRoundBottomLeft(15);
        pnlInputs.setRoundBottomRight(15);
        pnlInputs.setRoundTopLeft(15);
        pnlInputs.setRoundTopRight(15);
        pnlInputs.setLayout(new java.awt.BorderLayout());

        mainContainer.setOpaque(false);
        mainContainer.setLayout(new java.awt.BorderLayout(0, 5));

        txtContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 1, 5));
        txtContainer.setOpaque(false);
        txtContainer.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A");
        jPanel1.add(jLabel2, java.awt.BorderLayout.WEST);

        txtA.setBackground(new java.awt.Color(50, 50, 50));
        txtA.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        txtA.setForeground(new java.awt.Color(230, 230, 230));
        txtA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 102), 2, true));
        txtA.setCaretColor(new java.awt.Color(230, 230, 230));
        jPanel1.add(txtA, java.awt.BorderLayout.CENTER);

        txtContainer.add(jPanel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("B");
        jPanel2.add(jLabel3, java.awt.BorderLayout.WEST);

        txtB.setBackground(new java.awt.Color(50, 50, 50));
        txtB.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        txtB.setForeground(new java.awt.Color(230, 230, 230));
        txtB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 102), 2, true));
        txtB.setCaretColor(new java.awt.Color(230, 230, 230));
        jPanel2.add(txtB, java.awt.BorderLayout.CENTER);

        txtContainer.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("C");
        jPanel3.add(jLabel4, java.awt.BorderLayout.WEST);

        txtC.setBackground(new java.awt.Color(50, 50, 50));
        txtC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        txtC.setForeground(new java.awt.Color(230, 230, 230));
        txtC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 102), 2, true));
        txtC.setCaretColor(new java.awt.Color(230, 230, 230));
        jPanel3.add(txtC, java.awt.BorderLayout.CENTER);

        txtContainer.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("D");
        jPanel4.add(jLabel5, java.awt.BorderLayout.WEST);

        txtD.setBackground(new java.awt.Color(50, 50, 50));
        txtD.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        txtD.setForeground(new java.awt.Color(230, 230, 230));
        txtD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 102), 2, true));
        txtD.setCaretColor(new java.awt.Color(230, 230, 230));
        jPanel4.add(txtD, java.awt.BorderLayout.CENTER);

        txtContainer.add(jPanel4);

        mainContainer.add(txtContainer, java.awt.BorderLayout.CENTER);

        btnContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 20, 5, 20));
        btnContainer.setOpaque(false);
        btnContainer.setLayout(new java.awt.GridLayout());

        btnSeparar.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnSeparar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeparar.setText("Separar elementos");
        btnSeparar.setBorderColor(new java.awt.Color(170, 102, 68));
        btnSeparar.setColor(new java.awt.Color(255, 153, 102));
        btnSeparar.setColorClick(new java.awt.Color(170, 102, 68));
        btnSeparar.setColorOver(new java.awt.Color(255, 168, 112));
        btnSeparar.setFocusable(false);
        btnSeparar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSeparar.setRadius(20);
        btnContainer.add(btnSeparar);

        mainContainer.add(btnContainer, java.awt.BorderLayout.SOUTH);

        pnlInputs.add(mainContainer, java.awt.BorderLayout.CENTER);

        pnlHeader.add(pnlInputs, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elementos");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 5, 0));
        pnlHeader.add(jLabel1, java.awt.BorderLayout.NORTH);

        pnlBg.add(pnlHeader, java.awt.BorderLayout.NORTH);

        pnlMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnlMain.setOpaque(false);
        pnlMain.setLayout(new java.awt.BorderLayout());

        pnlConjuntos.setBackground(new java.awt.Color(30, 30, 30));
        pnlConjuntos.setRoundBottomLeft(15);
        pnlConjuntos.setRoundBottomRight(15);
        pnlConjuntos.setRoundTopLeft(15);
        pnlConjuntos.setRoundTopRight(15);
        pnlConjuntos.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        pnlConjunto1.setBackground(new java.awt.Color(102, 99, 254));
        pnlConjunto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlConjunto1.setRoundBottomLeft(20);
        pnlConjunto1.setRoundBottomRight(20);
        pnlConjunto1.setRoundTopLeft(20);
        pnlConjunto1.setRoundTopRight(20);
        pnlConjunto1.setLayout(new java.awt.BorderLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.GridLayout());
        jPanel5.add(jPanel13, java.awt.BorderLayout.CENTER);

        panelRound5.setBackground(new java.awt.Color(255, 255, 255));
        panelRound5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        panelRound5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);
        panelRound5.setLayout(new java.awt.GridLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 99, 254));
        jLabel6.setText("A");
        panelRound5.add(jLabel6);

        jPanel5.add(panelRound5, java.awt.BorderLayout.WEST);

        pnlConjunto1.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout());

        scrollA.setBorder(null);

        listaA.setBackground(new java.awt.Color(102, 99, 254));
        listaA.setBorder(null);
        listaA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaA.setForeground(new java.awt.Color(255, 255, 255));
        listaA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaA.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaA.setFocusable(false);
        listaA.setSelectionBackground(new java.awt.Color(102, 99, 254));
        listaA.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollA.setViewportView(listaA);

        jPanel9.add(scrollA);

        pnlConjunto1.add(jPanel9, java.awt.BorderLayout.CENTER);

        pnlConjuntos.add(pnlConjunto1);

        pnlConjunto2.setBackground(new java.awt.Color(0, 160, 150));
        pnlConjunto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlConjunto2.setRoundBottomLeft(20);
        pnlConjunto2.setRoundBottomRight(20);
        pnlConjunto2.setRoundTopLeft(20);
        pnlConjunto2.setRoundTopRight(20);
        pnlConjunto2.setLayout(new java.awt.BorderLayout());

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridLayout());
        jPanel6.add(jPanel14, java.awt.BorderLayout.CENTER);

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        panelRound6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        panelRound6.setRoundBottomLeft(50);
        panelRound6.setRoundBottomRight(50);
        panelRound6.setRoundTopLeft(50);
        panelRound6.setRoundTopRight(50);
        panelRound6.setLayout(new java.awt.GridLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 160, 150));
        jLabel7.setText("B");
        panelRound6.add(jLabel7);

        jPanel6.add(panelRound6, java.awt.BorderLayout.WEST);

        pnlConjunto2.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout());

        scrollB.setBorder(null);

        listaB.setBackground(new java.awt.Color(0, 160, 150));
        listaB.setBorder(null);
        listaB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaB.setForeground(new java.awt.Color(255, 255, 255));
        listaB.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaB.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaB.setFocusable(false);
        listaB.setSelectionBackground(new java.awt.Color(0, 160, 150));
        listaB.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollB.setViewportView(listaB);

        jPanel10.add(scrollB);

        pnlConjunto2.add(jPanel10, java.awt.BorderLayout.CENTER);

        pnlConjuntos.add(pnlConjunto2);

        pnlConjunto3.setBackground(new java.awt.Color(224, 108, 159));
        pnlConjunto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlConjunto3.setRoundBottomLeft(20);
        pnlConjunto3.setRoundBottomRight(20);
        pnlConjunto3.setRoundTopLeft(20);
        pnlConjunto3.setRoundTopRight(20);
        pnlConjunto3.setLayout(new java.awt.BorderLayout());

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.GridLayout());
        jPanel7.add(jPanel15, java.awt.BorderLayout.CENTER);

        panelRound7.setBackground(new java.awt.Color(255, 255, 255));
        panelRound7.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        panelRound7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        panelRound7.setRoundBottomLeft(50);
        panelRound7.setRoundBottomRight(50);
        panelRound7.setRoundTopLeft(50);
        panelRound7.setRoundTopRight(50);
        panelRound7.setLayout(new java.awt.GridLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(224, 108, 159));
        jLabel8.setText("C");
        panelRound7.add(jLabel8);

        jPanel7.add(panelRound7, java.awt.BorderLayout.WEST);

        pnlConjunto3.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.GridLayout());

        scrollC.setBorder(null);

        listaC.setBackground(new java.awt.Color(224, 108, 159));
        listaC.setBorder(null);
        listaC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaC.setForeground(new java.awt.Color(255, 255, 255));
        listaC.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaC.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaC.setFocusable(false);
        listaC.setSelectionBackground(new java.awt.Color(224, 108, 159));
        listaC.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollC.setViewportView(listaC);

        jPanel11.add(scrollC);

        pnlConjunto3.add(jPanel11, java.awt.BorderLayout.CENTER);

        pnlConjuntos.add(pnlConjunto3);

        pnlConjunto4.setBackground(new java.awt.Color(38, 111, 213));
        pnlConjunto4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlConjunto4.setRoundBottomLeft(20);
        pnlConjunto4.setRoundBottomRight(20);
        pnlConjunto4.setRoundTopLeft(20);
        pnlConjunto4.setRoundTopRight(20);
        pnlConjunto4.setLayout(new java.awt.BorderLayout());

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.GridLayout());
        jPanel8.add(jPanel16, java.awt.BorderLayout.CENTER);

        panelRound8.setBackground(new java.awt.Color(255, 255, 255));
        panelRound8.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        panelRound8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        panelRound8.setRoundBottomLeft(50);
        panelRound8.setRoundBottomRight(50);
        panelRound8.setRoundTopLeft(50);
        panelRound8.setRoundTopRight(50);
        panelRound8.setLayout(new java.awt.GridLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 111, 213));
        jLabel9.setText("D");
        panelRound8.add(jLabel9);

        jPanel8.add(panelRound8, java.awt.BorderLayout.WEST);

        pnlConjunto4.add(jPanel8, java.awt.BorderLayout.NORTH);

        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridLayout());

        scrollD.setBorder(null);

        listaD.setBackground(new java.awt.Color(38, 111, 213));
        listaD.setBorder(null);
        listaD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaD.setForeground(new java.awt.Color(255, 255, 255));
        listaD.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaD.setFocusable(false);
        listaD.setSelectionBackground(new java.awt.Color(38, 111, 213));
        listaD.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollD.setViewportView(listaD);

        jPanel12.add(scrollD);

        pnlConjunto4.add(jPanel12, java.awt.BorderLayout.CENTER);

        pnlConjuntos.add(pnlConjunto4);

        pnlMain.add(pnlConjuntos, java.awt.BorderLayout.CENTER);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(230, 230, 230));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Conjuntos");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 5, 0));
        pnlMain.add(jLabel10, java.awt.BorderLayout.NORTH);

        pnlBg.add(pnlMain, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnContainer;
    private CustomComponents.Button btnSeparar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JList<String> listaA;
    private javax.swing.JList<String> listaB;
    private javax.swing.JList<String> listaC;
    private javax.swing.JList<String> listaD;
    private javax.swing.JPanel mainContainer;
    private CustomComponents.PanelRound panelRound5;
    private CustomComponents.PanelRound panelRound6;
    private CustomComponents.PanelRound panelRound7;
    private CustomComponents.PanelRound panelRound8;
    private javax.swing.JPanel pnlBg;
    private CustomComponents.PanelRound pnlConjunto1;
    private CustomComponents.PanelRound pnlConjunto2;
    private CustomComponents.PanelRound pnlConjunto3;
    private CustomComponents.PanelRound pnlConjunto4;
    private CustomComponents.PanelRound pnlConjuntos;
    private javax.swing.JPanel pnlHeader;
    private CustomComponents.PanelRound pnlInputs;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JScrollPane scrollA;
    private javax.swing.JScrollPane scrollB;
    private javax.swing.JScrollPane scrollC;
    private javax.swing.JScrollPane scrollD;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JPanel txtContainer;
    private javax.swing.JTextField txtD;
    // End of variables declaration//GEN-END:variables
}
