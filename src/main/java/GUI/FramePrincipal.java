package GUI;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        pnlHeader = new CustomComponents.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        mainContainer = new javax.swing.JPanel();
        txtContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnContainer = new javax.swing.JPanel();
        button1 = new CustomComponents.Button();
        pnlMain = new CustomComponents.PanelRound();
        pnlConjunto1 = new CustomComponents.PanelRound();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        panelRound5 = new CustomComponents.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        pnlConjunto2 = new CustomComponents.PanelRound();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        panelRound6 = new CustomComponents.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        pnlConjunto3 = new CustomComponents.PanelRound();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        panelRound7 = new CustomComponents.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        pnlConjunto4 = new CustomComponents.PanelRound();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        panelRound8 = new CustomComponents.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBg.setBackground(new java.awt.Color(225, 225, 225));
        pnlBg.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlBg.setLayout(new java.awt.BorderLayout(0, 10));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlHeader.setRoundBottomLeft(15);
        pnlHeader.setRoundBottomRight(15);
        pnlHeader.setRoundTopLeft(15);
        pnlHeader.setRoundTopRight(15);
        pnlHeader.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(6, 52, 118));
        jLabel1.setText("Elementos");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        pnlHeader.add(jLabel1, java.awt.BorderLayout.NORTH);

        mainContainer.setOpaque(false);
        mainContainer.setLayout(new java.awt.BorderLayout());

        txtContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txtContainer.setOpaque(false);
        txtContainer.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 52, 118));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A");
        jPanel1.add(jLabel2, java.awt.BorderLayout.WEST);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 52, 118), 2, true));
        jPanel1.add(jTextField1, java.awt.BorderLayout.CENTER);

        txtContainer.add(jPanel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 52, 118));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("B");
        jPanel2.add(jLabel3, java.awt.BorderLayout.WEST);

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 52, 118), 2, true));
        jPanel2.add(jTextField2, java.awt.BorderLayout.CENTER);

        txtContainer.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 52, 118));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("C");
        jPanel3.add(jLabel4, java.awt.BorderLayout.WEST);

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 52, 118), 2, true));
        jPanel3.add(jTextField3, java.awt.BorderLayout.CENTER);

        txtContainer.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 52, 118));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("D");
        jPanel4.add(jLabel5, java.awt.BorderLayout.WEST);

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 52, 118), 2, true));
        jPanel4.add(jTextField4, java.awt.BorderLayout.CENTER);

        txtContainer.add(jPanel4);

        mainContainer.add(txtContainer, java.awt.BorderLayout.CENTER);

        btnContainer.setOpaque(false);
        btnContainer.setLayout(new java.awt.GridLayout());

        button1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("<html><center>Separar<br>elementos</html>");
        button1.setBorderColor(new java.awt.Color(6, 52, 118));
        button1.setColor(new java.awt.Color(6, 52, 118));
        button1.setColorClick(new java.awt.Color(4, 34, 78));
        button1.setColorOver(new java.awt.Color(6, 57, 148));
        button1.setFocusable(false);
        button1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        button1.setRadius(20);
        btnContainer.add(button1);

        mainContainer.add(btnContainer, java.awt.BorderLayout.EAST);

        pnlHeader.add(mainContainer, java.awt.BorderLayout.CENTER);

        pnlBg.add(pnlHeader, java.awt.BorderLayout.NORTH);

        pnlMain.setBackground(new java.awt.Color(220, 220, 220));
        pnlMain.setRoundBottomLeft(15);
        pnlMain.setRoundBottomRight(15);
        pnlMain.setRoundTopLeft(15);
        pnlMain.setRoundTopRight(15);
        pnlMain.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

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

        jPanel9.setOpaque(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlConjunto1.add(jPanel9, java.awt.BorderLayout.CENTER);

        pnlMain.add(pnlConjunto1);

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

        jPanel10.setOpaque(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlConjunto2.add(jPanel10, java.awt.BorderLayout.CENTER);

        pnlMain.add(pnlConjunto2);

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

        jPanel11.setOpaque(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlConjunto3.add(jPanel11, java.awt.BorderLayout.CENTER);

        pnlMain.add(pnlConjunto3);

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

        jPanel12.setOpaque(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlConjunto4.add(jPanel12, java.awt.BorderLayout.CENTER);

        pnlMain.add(pnlConjunto4);

        pnlBg.add(pnlMain, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private CustomComponents.Button button1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
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
    private CustomComponents.PanelRound pnlHeader;
    private CustomComponents.PanelRound pnlMain;
    private javax.swing.JPanel txtContainer;
    // End of variables declaration//GEN-END:variables
}
