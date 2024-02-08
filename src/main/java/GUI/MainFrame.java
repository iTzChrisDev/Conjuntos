package GUI;

import CustomComponents.CheckBox;
import CustomComponents.ScrollBarCustom;
import Funciones.ConjuntosOperations;
import Funciones.Data;
import Funciones.GenerarOperaciones;
import Funciones.ListManager;
import Funciones.StringOperations;
import java.awt.Color;
import java.awt.Scrollbar;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MainFrame extends javax.swing.JFrame {

    private Data data;
    private ListManager manager;
    private ConjuntosOperations obCon;
    private StringOperations obCad;
    private int cont;
    private ArrayList<String> conjuntos, first, second;
    private GenerarOperaciones obG;

    public MainFrame() {
        initComponents();
        initComponentsCustom();
        setLocationRelativeTo(this);

        cont = 0;
        conjuntos = new ArrayList<>();
        first = new ArrayList<>();
        second = new ArrayList<>();

        data = new Data();
        manager = new ListManager();
        obCad = new StringOperations();
        obCon = new ConjuntosOperations();
        obG = new GenerarOperaciones();
    }

    public void initComponentsCustom() {
        ScrollBarCustom scrollHorA = new ScrollBarCustom(new Color(102, 99, 254), new Color(68, 66, 169));
        scrollHorA.setOrientation(Scrollbar.HORIZONTAL);
        ScrollBarCustom scrollHorB = new ScrollBarCustom(new Color(0, 160, 150), new Color(0, 106, 121));
        scrollHorB.setOrientation(Scrollbar.HORIZONTAL);
        ScrollBarCustom scrollHorC = new ScrollBarCustom(new Color(224, 108, 159), new Color(149, 72, 106));
        scrollHorC.setOrientation(Scrollbar.HORIZONTAL);
        ScrollBarCustom scrollHorD = new ScrollBarCustom(new Color(38, 111, 213), new Color(25, 74, 142));
        scrollHorD.setOrientation(Scrollbar.HORIZONTAL);

        scrollA.setVerticalScrollBar(new ScrollBarCustom(new Color(102, 99, 254), new Color(68, 66, 169)));
        scrollB.setVerticalScrollBar(new ScrollBarCustom(new Color(0, 160, 150), new Color(0, 106, 121)));
        scrollC.setVerticalScrollBar(new ScrollBarCustom(new Color(224, 108, 159), new Color(149, 72, 106)));
        scrollD.setVerticalScrollBar(new ScrollBarCustom(new Color(38, 111, 213), new Color(25, 74, 142)));
        scrollA.setHorizontalScrollBar(scrollHorA);
        scrollB.setHorizontalScrollBar(scrollHorB);
        scrollC.setHorizontalScrollBar(scrollHorC);
        scrollD.setHorizontalScrollBar(scrollHorD);

        scrollConjuntos.getViewport().setBackground(new Color(50, 50, 50));
        ScrollBarCustom scroll = new ScrollBarCustom(new Color(50, 50, 50), new Color(255, 153, 102));
        scroll.setOrientation(Scrollbar.HORIZONTAL);
        scrollConjuntos.setHorizontalScrollBar(scroll);
        scrollConjuntos.setVerticalScrollBar(new ScrollBarCustom(new Color(50, 50, 50), new Color(255, 153, 102)));

        scrollCadenas.getViewport().setBackground(new Color(50, 50, 50));
        ScrollBarCustom scroll1 = new ScrollBarCustom(new Color(50, 50, 50), new Color(255, 153, 102));
        scroll1.setOrientation(Scrollbar.HORIZONTAL);
        scrollCadenas.setHorizontalScrollBar(scroll1);
        scrollCadenas.setVerticalScrollBar(new ScrollBarCustom(new Color(50, 50, 50), new Color(255, 153, 102)));

        btnCalcCon.setIcon(new ImageIcon("./src/main/java/Resources/calcular.png"));
        btnCalcCad.setIcon(new ImageIcon("./src/main/java/Resources/calcular.png"));
        btnGenerar.setIcon(new ImageIcon("./src/main/java/Resources/generar.png"));

        checkCadA.setActionCommand("A");
        checkCadB.setActionCommand("B");
        checkCadC.setActionCommand("C");
        checkCadD.setActionCommand("D");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        pnlPrincipal = new javax.swing.JPanel();
        pnlGenConjuntos = new javax.swing.JPanel();
        pnlInputs = new CustomComponents.PanelRound();
        pnlTxts = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        btnGenerar = new CustomComponents.Button();
        jLabel16 = new javax.swing.JLabel();
        pnlConjuntos = new CustomComponents.PanelRound();
        pnlA = new CustomComponents.PanelRound();
        jPanel5 = new javax.swing.JPanel();
        panelRound1 = new CustomComponents.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        scrollA = new javax.swing.JScrollPane();
        listaA = new javax.swing.JList<>();
        pnlB = new CustomComponents.PanelRound();
        jPanel7 = new javax.swing.JPanel();
        panelRound2 = new CustomComponents.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        scrollB = new javax.swing.JScrollPane();
        listaB = new javax.swing.JList<>();
        pnlC = new CustomComponents.PanelRound();
        jPanel9 = new javax.swing.JPanel();
        panelRound3 = new CustomComponents.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        scrollC = new javax.swing.JScrollPane();
        listaC = new javax.swing.JList<>();
        pnlD = new CustomComponents.PanelRound();
        jPanel11 = new javax.swing.JPanel();
        panelRound4 = new CustomComponents.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        scrollD = new javax.swing.JScrollPane();
        listaD = new javax.swing.JList<>();
        pnlOperaciones = new javax.swing.JPanel();
        pnlOpConjuntos = new CustomComponents.PanelRound();
        pnlCheckBox = new javax.swing.JPanel();
        pnlChecksCon = new javax.swing.JPanel();
        checkConA = new CustomComponents.CheckBox();
        checkConB = new CustomComponents.CheckBox();
        checkConC = new CustomComponents.CheckBox();
        checkConD = new CustomComponents.CheckBox();
        jLabel9 = new javax.swing.JLabel();
        btnCalcCon = new CustomComponents.Button();
        jPanel13 = new javax.swing.JPanel();
        scrollConjuntos = new javax.swing.JScrollPane();
        pnlResultCon = new javax.swing.JPanel();
        pnlUniverso = new CustomComponents.PanelResult();
        pnlUnion = new CustomComponents.PanelResult();
        pnlIntersect = new CustomComponents.PanelResult();
        pnlDifference = new CustomComponents.PanelResult();
        pnlSymetricDiff = new CustomComponents.PanelResult();
        pnlComp1 = new CustomComponents.PanelResult();
        pnlComp2 = new CustomComponents.PanelResult();
        pnlCard1 = new CustomComponents.PanelResult();
        pnlCard2 = new CustomComponents.PanelResult();
        pnlCartesian = new CustomComponents.PanelResult();
        pnlPot1 = new CustomComponents.PanelResult();
        pnlPot2 = new CustomComponents.PanelResult();
        pnlOpCadenas = new CustomComponents.PanelRound();
        pnlCheckBox1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        checkCadA = new CustomComponents.CheckBox();
        checkCadB = new CustomComponents.CheckBox();
        checkCadC = new CustomComponents.CheckBox();
        checkCadD = new CustomComponents.CheckBox();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCadena = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtConcat = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtSubIzq = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSubDer = new javax.swing.JTextField();
        btnCalcCad = new CustomComponents.Button();
        scrollCadenas = new javax.swing.JScrollPane();
        pnlResultCad = new javax.swing.JPanel();
        pnlConcatenacion = new CustomComponents.PanelResult();
        pnlPotencia = new CustomComponents.PanelResult();
        pnlLongitud = new CustomComponents.PanelResult();
        pnlPrefijo = new CustomComponents.PanelResult();
        pnlSufijo = new CustomComponents.PanelResult();
        pnlSubCadenaIzq = new CustomComponents.PanelResult();
        pnlSubCadenaDer = new CustomComponents.PanelResult();
        pnlTranspuesta = new CustomComponents.PanelResult();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(30, 30, 30));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlPrincipal.setLayout(new java.awt.BorderLayout(10, 0));

        pnlGenConjuntos.setOpaque(false);
        pnlGenConjuntos.setLayout(new java.awt.BorderLayout(0, 10));

        pnlInputs.setBackground(new java.awt.Color(50, 50, 50));
        pnlInputs.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 10, 10));
        pnlInputs.setRoundBottomLeft(15);
        pnlInputs.setRoundBottomRight(15);
        pnlInputs.setRoundTopLeft(15);
        pnlInputs.setRoundTopRight(15);
        pnlInputs.setLayout(new java.awt.BorderLayout(10, 5));

        pnlTxts.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        pnlTxts.setOpaque(false);
        pnlTxts.setLayout(new java.awt.GridLayout(4, 1, 10, 10));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel1.setBackground(new java.awt.Color(102, 99, 254));
        jLabel1.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("A:");
        jPanel1.add(jLabel1, java.awt.BorderLayout.WEST);

        txtA.setBackground(new java.awt.Color(50, 50, 50));
        txtA.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtA.setForeground(new java.awt.Color(200, 200, 200));
        txtA.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtA.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel1.add(txtA, java.awt.BorderLayout.CENTER);

        pnlTxts.add(jPanel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel2.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("B:");
        jPanel2.add(jLabel2, java.awt.BorderLayout.WEST);

        txtB.setBackground(new java.awt.Color(50, 50, 50));
        txtB.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtB.setForeground(new java.awt.Color(200, 200, 200));
        txtB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtB.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel2.add(txtB, java.awt.BorderLayout.CENTER);

        pnlTxts.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel3.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("C:");
        jPanel3.add(jLabel3, java.awt.BorderLayout.WEST);

        txtC.setBackground(new java.awt.Color(50, 50, 50));
        txtC.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtC.setForeground(new java.awt.Color(200, 200, 200));
        txtC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtC.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel3.add(txtC, java.awt.BorderLayout.CENTER);

        pnlTxts.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel4.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("D:");
        jPanel4.add(jLabel4, java.awt.BorderLayout.WEST);

        txtD.setBackground(new java.awt.Color(50, 50, 50));
        txtD.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtD.setForeground(new java.awt.Color(200, 200, 200));
        txtD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtD.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel4.add(txtD, java.awt.BorderLayout.CENTER);

        pnlTxts.add(jPanel4);

        pnlInputs.add(pnlTxts, java.awt.BorderLayout.CENTER);

        btnGenerar.setBackground(new java.awt.Color(255, 153, 102));
        btnGenerar.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0));
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar");
        btnGenerar.setBorderColor(new java.awt.Color(255, 153, 102));
        btnGenerar.setColor(new java.awt.Color(255, 153, 102));
        btnGenerar.setColorClick(new java.awt.Color(255, 153, 102));
        btnGenerar.setColorOver(new java.awt.Color(255, 187, 153));
        btnGenerar.setFocusable(false);
        btnGenerar.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        btnGenerar.setRadius(15);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        pnlInputs.add(btnGenerar, java.awt.BorderLayout.SOUTH);

        jLabel16.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 200, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ingresa los conjuntos");
        pnlInputs.add(jLabel16, java.awt.BorderLayout.NORTH);

        pnlGenConjuntos.add(pnlInputs, java.awt.BorderLayout.NORTH);

        pnlConjuntos.setBackground(new java.awt.Color(50, 50, 50));
        pnlConjuntos.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlConjuntos.setRoundBottomLeft(15);
        pnlConjuntos.setRoundBottomRight(15);
        pnlConjuntos.setRoundTopLeft(15);
        pnlConjuntos.setRoundTopRight(15);
        pnlConjuntos.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        pnlA.setBackground(new java.awt.Color(102, 99, 254));
        pnlA.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlA.setRoundBottomLeft(10);
        pnlA.setRoundBottomRight(10);
        pnlA.setRoundTopLeft(10);
        pnlA.setRoundTopRight(10);
        pnlA.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 6));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jLabel5.setBackground(new java.awt.Color(102, 99, 254));
        jLabel5.setFont(new java.awt.Font("Roboto Mono Medium", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 99, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("A");
        panelRound1.add(jLabel5);

        jPanel5.add(panelRound1, java.awt.BorderLayout.WEST);

        jPanel6.setOpaque(false);
        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        pnlA.add(jPanel5, java.awt.BorderLayout.NORTH);

        scrollA.setBorder(null);
        scrollA.setPreferredSize(new java.awt.Dimension(110, 128));

        listaA.setBackground(new java.awt.Color(102, 113, 255));
        listaA.setBorder(null);
        listaA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaA.setForeground(new java.awt.Color(255, 255, 255));
        listaA.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaA.setFocusable(false);
        listaA.setSelectionBackground(new java.awt.Color(102, 99, 254));
        listaA.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollA.setViewportView(listaA);

        pnlA.add(scrollA, java.awt.BorderLayout.CENTER);

        pnlConjuntos.add(pnlA);

        pnlB.setBackground(new java.awt.Color(0, 160, 182));
        pnlB.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlB.setRoundBottomLeft(10);
        pnlB.setRoundBottomRight(10);
        pnlB.setRoundTopLeft(10);
        pnlB.setRoundTopRight(10);
        pnlB.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 6));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);

        jLabel6.setBackground(new java.awt.Color(102, 99, 254));
        jLabel6.setFont(new java.awt.Font("Roboto Mono Medium", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 160, 182));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("B");
        panelRound2.add(jLabel6);

        jPanel7.add(panelRound2, java.awt.BorderLayout.WEST);

        jPanel8.setOpaque(false);
        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        pnlB.add(jPanel7, java.awt.BorderLayout.NORTH);

        scrollB.setBorder(null);
        scrollB.setPreferredSize(new java.awt.Dimension(110, 128));

        listaB.setBackground(new java.awt.Color(0, 180, 176));
        listaB.setBorder(null);
        listaB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaB.setForeground(new java.awt.Color(255, 255, 255));
        listaB.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaB.setFocusable(false);
        listaB.setSelectionBackground(new java.awt.Color(0, 160, 150));
        listaB.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollB.setViewportView(listaB);

        pnlB.add(scrollB, java.awt.BorderLayout.CENTER);

        pnlConjuntos.add(pnlB);

        pnlC.setBackground(new java.awt.Color(224, 108, 159));
        pnlC.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlC.setRoundBottomLeft(10);
        pnlC.setRoundBottomRight(10);
        pnlC.setRoundTopLeft(10);
        pnlC.setRoundTopRight(10);
        pnlC.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 6));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);

        jLabel7.setBackground(new java.awt.Color(102, 99, 254));
        jLabel7.setFont(new java.awt.Font("Roboto Mono Medium", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(224, 108, 159));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C");
        panelRound3.add(jLabel7);

        jPanel9.add(panelRound3, java.awt.BorderLayout.WEST);

        jPanel10.setOpaque(false);
        jPanel9.add(jPanel10, java.awt.BorderLayout.CENTER);

        pnlC.add(jPanel9, java.awt.BorderLayout.NORTH);

        scrollC.setBorder(null);
        scrollC.setPreferredSize(new java.awt.Dimension(110, 128));

        listaC.setBackground(new java.awt.Color(180, 126, 162));
        listaC.setBorder(null);
        listaC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaC.setForeground(new java.awt.Color(255, 255, 255));
        listaC.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaC.setFocusable(false);
        listaC.setSelectionBackground(new java.awt.Color(224, 108, 159));
        listaC.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollC.setViewportView(listaC);

        pnlC.add(scrollC, java.awt.BorderLayout.CENTER);

        pnlConjuntos.add(pnlC);

        pnlD.setBackground(new java.awt.Color(38, 111, 213));
        pnlD.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlD.setRoundBottomLeft(10);
        pnlD.setRoundBottomRight(10);
        pnlD.setRoundTopLeft(10);
        pnlD.setRoundTopRight(10);
        pnlD.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 6));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);

        jLabel8.setBackground(new java.awt.Color(102, 99, 254));
        jLabel8.setFont(new java.awt.Font("Roboto Mono Medium", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(38, 111, 213));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("D");
        panelRound4.add(jLabel8);

        jPanel11.add(panelRound4, java.awt.BorderLayout.WEST);

        jPanel12.setOpaque(false);
        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        pnlD.add(jPanel11, java.awt.BorderLayout.NORTH);

        scrollD.setBorder(null);
        scrollD.setPreferredSize(new java.awt.Dimension(110, 128));

        listaD.setBackground(new java.awt.Color(38, 120, 204));
        listaD.setBorder(null);
        listaD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaD.setForeground(new java.awt.Color(255, 255, 255));
        listaD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaD.setFocusable(false);
        listaD.setSelectionBackground(new java.awt.Color(38, 111, 213));
        listaD.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollD.setViewportView(listaD);

        pnlD.add(scrollD, java.awt.BorderLayout.CENTER);

        pnlConjuntos.add(pnlD);

        pnlGenConjuntos.add(pnlConjuntos, java.awt.BorderLayout.CENTER);

        pnlPrincipal.add(pnlGenConjuntos, java.awt.BorderLayout.WEST);

        pnlOperaciones.setOpaque(false);
        pnlOperaciones.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        pnlOpConjuntos.setBackground(new java.awt.Color(50, 50, 50));
        pnlOpConjuntos.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlOpConjuntos.setRoundBottomLeft(15);
        pnlOpConjuntos.setRoundBottomRight(15);
        pnlOpConjuntos.setRoundTopLeft(15);
        pnlOpConjuntos.setRoundTopRight(15);
        pnlOpConjuntos.setLayout(new java.awt.BorderLayout());

        pnlCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 10, 5));
        pnlCheckBox.setOpaque(false);
        pnlCheckBox.setLayout(new java.awt.BorderLayout());

        pnlChecksCon.setOpaque(false);
        pnlChecksCon.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        checkConA.setBackground(new java.awt.Color(102, 99, 254));
        checkConA.setForeground(new java.awt.Color(220, 220, 220));
        checkConA.setText("A");
        checkConA.setFocusable(false);
        checkConA.setFont(new java.awt.Font("Roboto Mono", 1, 16)); // NOI18N
        checkConA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkConAActionPerformed(evt);
            }
        });
        pnlChecksCon.add(checkConA);

        checkConB.setBackground(new java.awt.Color(0, 160, 182));
        checkConB.setForeground(new java.awt.Color(220, 220, 220));
        checkConB.setText("B");
        checkConB.setFocusable(false);
        checkConB.setFont(new java.awt.Font("Roboto Mono", 1, 16)); // NOI18N
        checkConB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkConBActionPerformed(evt);
            }
        });
        pnlChecksCon.add(checkConB);

        checkConC.setBackground(new java.awt.Color(224, 108, 159));
        checkConC.setForeground(new java.awt.Color(220, 220, 220));
        checkConC.setText("C");
        checkConC.setFocusable(false);
        checkConC.setFont(new java.awt.Font("Roboto Mono", 1, 16)); // NOI18N
        checkConC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkConCActionPerformed(evt);
            }
        });
        pnlChecksCon.add(checkConC);

        checkConD.setBackground(new java.awt.Color(38, 111, 213));
        checkConD.setForeground(new java.awt.Color(220, 220, 220));
        checkConD.setText("D");
        checkConD.setFocusable(false);
        checkConD.setFont(new java.awt.Font("Roboto Mono", 1, 16)); // NOI18N
        checkConD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkConDActionPerformed(evt);
            }
        });
        pnlChecksCon.add(checkConD);

        pnlCheckBox.add(pnlChecksCon, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 200, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Selecciona dos conjuntos");
        pnlCheckBox.add(jLabel9, java.awt.BorderLayout.NORTH);

        btnCalcCon.setBackground(new java.awt.Color(255, 153, 102));
        btnCalcCon.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0));
        btnCalcCon.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcCon.setText("Calcular");
        btnCalcCon.setBorderColor(new java.awt.Color(255, 153, 102));
        btnCalcCon.setColor(new java.awt.Color(255, 153, 102));
        btnCalcCon.setColorClick(new java.awt.Color(255, 153, 102));
        btnCalcCon.setColorOver(new java.awt.Color(255, 187, 153));
        btnCalcCon.setFocusable(false);
        btnCalcCon.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        btnCalcCon.setRadius(15);
        btnCalcCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcConActionPerformed(evt);
            }
        });
        pnlCheckBox.add(btnCalcCon, java.awt.BorderLayout.SOUTH);

        pnlOpConjuntos.add(pnlCheckBox, java.awt.BorderLayout.NORTH);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        scrollConjuntos.setBackground(new java.awt.Color(50, 50, 50));
        scrollConjuntos.setBorder(null);
        scrollConjuntos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollConjuntos.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        pnlResultCon.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlResultCon.setOpaque(false);
        pnlResultCon.setLayout(new java.awt.GridLayout(12, 1, 0, 5));

        pnlUniverso.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlUniverso);

        pnlUnion.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlUnion);

        pnlIntersect.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlIntersect);

        pnlDifference.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlDifference);

        pnlSymetricDiff.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlSymetricDiff);

        pnlComp1.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlComp1);

        pnlComp2.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlComp2);

        pnlCard1.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlCard1);

        pnlCard2.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlCard2);

        pnlCartesian.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlCartesian);

        pnlPot1.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlPot1);

        pnlPot2.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCon.add(pnlPot2);

        scrollConjuntos.setViewportView(pnlResultCon);

        jPanel13.add(scrollConjuntos);

        pnlOpConjuntos.add(jPanel13, java.awt.BorderLayout.CENTER);

        pnlOperaciones.add(pnlOpConjuntos);

        pnlOpCadenas.setBackground(new java.awt.Color(50, 50, 50));
        pnlOpCadenas.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlOpCadenas.setRoundBottomLeft(15);
        pnlOpCadenas.setRoundBottomRight(15);
        pnlOpCadenas.setRoundTopLeft(15);
        pnlOpCadenas.setRoundTopRight(15);
        pnlOpCadenas.setLayout(new java.awt.BorderLayout());

        pnlCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 10, 5));
        pnlCheckBox1.setOpaque(false);
        pnlCheckBox1.setLayout(new java.awt.BorderLayout());

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        checkCadA.setBackground(new java.awt.Color(102, 99, 254));
        btnGroup.add(checkCadA);
        checkCadA.setForeground(new java.awt.Color(220, 220, 220));
        checkCadA.setText("A");
        checkCadA.setFocusable(false);
        checkCadA.setFont(new java.awt.Font("Roboto Mono", 1, 16)); // NOI18N
        jPanel15.add(checkCadA);

        checkCadB.setBackground(new java.awt.Color(0, 160, 182));
        btnGroup.add(checkCadB);
        checkCadB.setForeground(new java.awt.Color(220, 220, 220));
        checkCadB.setText("B");
        checkCadB.setFocusable(false);
        checkCadB.setFont(new java.awt.Font("Roboto Mono", 1, 16)); // NOI18N
        jPanel15.add(checkCadB);

        checkCadC.setBackground(new java.awt.Color(224, 108, 159));
        btnGroup.add(checkCadC);
        checkCadC.setForeground(new java.awt.Color(220, 220, 220));
        checkCadC.setText("C");
        checkCadC.setFocusable(false);
        checkCadC.setFont(new java.awt.Font("Roboto Mono", 1, 16)); // NOI18N
        jPanel15.add(checkCadC);

        checkCadD.setBackground(new java.awt.Color(38, 111, 213));
        btnGroup.add(checkCadD);
        checkCadD.setForeground(new java.awt.Color(220, 220, 220));
        checkCadD.setText("D");
        checkCadD.setFocusable(false);
        checkCadD.setFont(new java.awt.Font("Roboto Mono", 1, 16)); // NOI18N
        jPanel15.add(checkCadD);

        pnlCheckBox1.add(jPanel15, java.awt.BorderLayout.CENTER);

        jLabel10.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 200, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Selecciona un alfabeto");
        pnlCheckBox1.add(jLabel10, java.awt.BorderLayout.NORTH);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridLayout(6, 1, 0, 5));

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel11.setBackground(new java.awt.Color(102, 99, 254));
        jLabel11.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cadena:");
        jPanel16.add(jLabel11, java.awt.BorderLayout.WEST);

        txtCadena.setBackground(new java.awt.Color(50, 50, 50));
        txtCadena.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtCadena.setForeground(new java.awt.Color(200, 200, 200));
        txtCadena.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCadena.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel16.add(txtCadena, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel16);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel12.setBackground(new java.awt.Color(102, 99, 254));
        jLabel12.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cad. Concatenar:");
        jPanel17.add(jLabel12, java.awt.BorderLayout.WEST);

        txtConcat.setBackground(new java.awt.Color(50, 50, 50));
        txtConcat.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtConcat.setForeground(new java.awt.Color(200, 200, 200));
        txtConcat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtConcat.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel17.add(txtConcat, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel17);

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel13.setBackground(new java.awt.Color(102, 99, 254));
        jLabel13.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Potencia:");
        jPanel18.add(jLabel13, java.awt.BorderLayout.WEST);

        txtPotencia.setBackground(new java.awt.Color(50, 50, 50));
        txtPotencia.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtPotencia.setForeground(new java.awt.Color(200, 200, 200));
        txtPotencia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPotencia.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel18.add(txtPotencia, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel18);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel14.setBackground(new java.awt.Color(102, 99, 254));
        jLabel14.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Subcadena Izq:");
        jPanel19.add(jLabel14, java.awt.BorderLayout.WEST);

        txtSubIzq.setBackground(new java.awt.Color(50, 50, 50));
        txtSubIzq.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtSubIzq.setForeground(new java.awt.Color(200, 200, 200));
        txtSubIzq.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtSubIzq.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel19.add(txtSubIzq, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel19);

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel15.setBackground(new java.awt.Color(102, 99, 254));
        jLabel15.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Subcadena Der:");
        jPanel20.add(jLabel15, java.awt.BorderLayout.WEST);

        txtSubDer.setBackground(new java.awt.Color(50, 50, 50));
        txtSubDer.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtSubDer.setForeground(new java.awt.Color(200, 200, 200));
        txtSubDer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtSubDer.setCaretColor(new java.awt.Color(200, 200, 200));
        jPanel20.add(txtSubDer, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel20);

        btnCalcCad.setBackground(new java.awt.Color(255, 153, 102));
        btnCalcCad.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0));
        btnCalcCad.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcCad.setText("Calcular");
        btnCalcCad.setBorderColor(new java.awt.Color(255, 153, 102));
        btnCalcCad.setColor(new java.awt.Color(255, 153, 102));
        btnCalcCad.setColorClick(new java.awt.Color(255, 153, 102));
        btnCalcCad.setColorOver(new java.awt.Color(255, 187, 153));
        btnCalcCad.setFocusable(false);
        btnCalcCad.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        btnCalcCad.setRadius(15);
        btnCalcCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcCadActionPerformed(evt);
            }
        });
        jPanel14.add(btnCalcCad);

        pnlCheckBox1.add(jPanel14, java.awt.BorderLayout.SOUTH);

        pnlOpCadenas.add(pnlCheckBox1, java.awt.BorderLayout.NORTH);

        scrollCadenas.setBackground(new java.awt.Color(50, 50, 50));
        scrollCadenas.setBorder(null);
        scrollCadenas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollCadenas.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        pnlResultCad.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlResultCad.setOpaque(false);
        pnlResultCad.setLayout(new java.awt.GridLayout(8, 1, 0, 5));

        pnlConcatenacion.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCad.add(pnlConcatenacion);

        pnlPotencia.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCad.add(pnlPotencia);

        pnlLongitud.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCad.add(pnlLongitud);

        pnlPrefijo.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCad.add(pnlPrefijo);

        pnlSufijo.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCad.add(pnlSufijo);

        pnlSubCadenaIzq.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCad.add(pnlSubCadenaIzq);

        pnlSubCadenaDer.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCad.add(pnlSubCadenaDer);

        pnlTranspuesta.setBackground(new java.awt.Color(60, 60, 60));
        pnlResultCad.add(pnlTranspuesta);

        scrollCadenas.setViewportView(pnlResultCad);

        pnlOpCadenas.add(scrollCadenas, java.awt.BorderLayout.CENTER);

        pnlOperaciones.add(pnlOpCadenas);

        pnlPrincipal.add(pnlOperaciones, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        data.clearData();
        manager.setList(listaA, txtA, data.getA());
        manager.setList(listaB, txtB, data.getB());
        manager.setList(listaC, txtC, data.getC());
        manager.setList(listaD, txtD, data.getD());
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCalcConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcConActionPerformed
        if (cont == 2) {
            obG.genOpConjuntos(conjuntos, first, second, data, pnlUniverso, pnlUnion, pnlIntersect, pnlDifference, pnlSymetricDiff, pnlComp1, pnlComp2, pnlCard1, pnlCard2, pnlCartesian, pnlPot1, pnlPot2);
            SwingUtilities.updateComponentTreeUI(pnlResultCon);
            System.out.println("GENERAR!");
        } else if (cont == 1) {
            JOptionPane.showMessageDialog(null, "Solo has seleccionado un conjunto", "ADVERTENCIA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se han seleccionado 2 conjuntos", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcConActionPerformed

    private void btnCalcCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcCadActionPerformed
        String alfabeto = "";
        if (btnGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "No se han seleccionado ningun alfabeto", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            alfabeto = btnGroup.getSelection().getActionCommand();
            switch (alfabeto) {
                case "A":
                    obG.genOpCadenas(data.getA(), txtCadena, txtConcat, txtPotencia, txtSubIzq, txtSubDer, pnlResultCad, pnlConcatenacion, pnlPotencia, pnlLongitud, pnlPrefijo, pnlSufijo, pnlSubCadenaIzq, pnlSubCadenaDer, pnlTranspuesta);
                    break;
                case "B":
                    obG.genOpCadenas(data.getB(), txtCadena, txtConcat, txtPotencia, txtSubIzq, txtSubDer, pnlResultCad, pnlConcatenacion, pnlPotencia, pnlLongitud, pnlPrefijo, pnlSufijo, pnlSubCadenaIzq, pnlSubCadenaDer, pnlTranspuesta);
                    break;
                case "C":
                    obG.genOpCadenas(data.getC(), txtCadena, txtConcat, txtPotencia, txtSubIzq, txtSubDer, pnlResultCad, pnlConcatenacion, pnlPotencia, pnlLongitud, pnlPrefijo, pnlSufijo, pnlSubCadenaIzq, pnlSubCadenaDer, pnlTranspuesta);
                    break;
                case "D":
                    obG.genOpCadenas(data.getD(), txtCadena, txtConcat, txtPotencia, txtSubIzq, txtSubDer, pnlResultCad, pnlConcatenacion, pnlPotencia, pnlLongitud, pnlPrefijo, pnlSufijo, pnlSubCadenaIzq, pnlSubCadenaDer, pnlTranspuesta);
                    break;
            }
        }
    }//GEN-LAST:event_btnCalcCadActionPerformed

    private void checkConAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkConAActionPerformed
        getConjuntos(checkConA, conjuntos, "A");
    }//GEN-LAST:event_checkConAActionPerformed

    private void checkConBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkConBActionPerformed
        getConjuntos(checkConB, conjuntos, "B");
    }//GEN-LAST:event_checkConBActionPerformed

    private void checkConCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkConCActionPerformed
        getConjuntos(checkConC, conjuntos, "C");
    }//GEN-LAST:event_checkConCActionPerformed

    private void checkConDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkConDActionPerformed
        getConjuntos(checkConD, conjuntos, "D");
    }//GEN-LAST:event_checkConDActionPerformed

    public void getConjuntos(CheckBox checkBox, ArrayList<String> conjuntos, String conjunto) {
        if (!checkBox.isSelected()) {
            cont--;
            if (conjuntos.contains(conjunto)) {
                conjuntos.remove(conjunto);
            }
        } else {
            cont++;
            if (!conjuntos.contains(conjunto)) {
                conjuntos.add(conjunto);
            }
        }
        System.out.println(cont + " - " + conjuntos);
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomComponents.Button btnCalcCad;
    private CustomComponents.Button btnCalcCon;
    private CustomComponents.Button btnGenerar;
    private javax.swing.ButtonGroup btnGroup;
    private CustomComponents.CheckBox checkCadA;
    private CustomComponents.CheckBox checkCadB;
    private CustomComponents.CheckBox checkCadC;
    private CustomComponents.CheckBox checkCadD;
    private CustomComponents.CheckBox checkConA;
    private CustomComponents.CheckBox checkConB;
    private CustomComponents.CheckBox checkConC;
    private CustomComponents.CheckBox checkConD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
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
    private CustomComponents.PanelRound panelRound1;
    private CustomComponents.PanelRound panelRound2;
    private CustomComponents.PanelRound panelRound3;
    private CustomComponents.PanelRound panelRound4;
    private CustomComponents.PanelRound pnlA;
    private CustomComponents.PanelRound pnlB;
    private CustomComponents.PanelRound pnlC;
    private CustomComponents.PanelResult pnlCard1;
    private CustomComponents.PanelResult pnlCard2;
    private CustomComponents.PanelResult pnlCartesian;
    private javax.swing.JPanel pnlCheckBox;
    private javax.swing.JPanel pnlCheckBox1;
    private javax.swing.JPanel pnlChecksCon;
    private CustomComponents.PanelResult pnlComp1;
    private CustomComponents.PanelResult pnlComp2;
    private CustomComponents.PanelResult pnlConcatenacion;
    private CustomComponents.PanelRound pnlConjuntos;
    private CustomComponents.PanelRound pnlD;
    private CustomComponents.PanelResult pnlDifference;
    private javax.swing.JPanel pnlGenConjuntos;
    private CustomComponents.PanelRound pnlInputs;
    private CustomComponents.PanelResult pnlIntersect;
    private CustomComponents.PanelResult pnlLongitud;
    private CustomComponents.PanelRound pnlOpCadenas;
    private CustomComponents.PanelRound pnlOpConjuntos;
    private javax.swing.JPanel pnlOperaciones;
    private CustomComponents.PanelResult pnlPot1;
    private CustomComponents.PanelResult pnlPot2;
    private CustomComponents.PanelResult pnlPotencia;
    private CustomComponents.PanelResult pnlPrefijo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlResultCad;
    private javax.swing.JPanel pnlResultCon;
    private CustomComponents.PanelResult pnlSubCadenaDer;
    private CustomComponents.PanelResult pnlSubCadenaIzq;
    private CustomComponents.PanelResult pnlSufijo;
    private CustomComponents.PanelResult pnlSymetricDiff;
    private CustomComponents.PanelResult pnlTranspuesta;
    private javax.swing.JPanel pnlTxts;
    private CustomComponents.PanelResult pnlUnion;
    private CustomComponents.PanelResult pnlUniverso;
    private javax.swing.JScrollPane scrollA;
    private javax.swing.JScrollPane scrollB;
    private javax.swing.JScrollPane scrollC;
    private javax.swing.JScrollPane scrollCadenas;
    private javax.swing.JScrollPane scrollConjuntos;
    private javax.swing.JScrollPane scrollD;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCadena;
    private javax.swing.JTextField txtConcat;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtSubDer;
    private javax.swing.JTextField txtSubIzq;
    // End of variables declaration//GEN-END:variables
}
