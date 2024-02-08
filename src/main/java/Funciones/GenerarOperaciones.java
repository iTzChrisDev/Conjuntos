package Funciones;

import CustomComponents.PanelResult;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GenerarOperaciones {

    private StringOperations obCad = new StringOperations();
    private ConjuntosOperations obCon = new ConjuntosOperations();

    public void genOpCadenas(ArrayList<String> alfabeto, JTextField txtCadena, JTextField txtConcat, JTextField txtPotencia, JTextField txtSubIzq, JTextField txtSubDer, JPanel pnlResultCad, PanelResult pnlConcatenacion, PanelResult pnlPotencia, PanelResult pnlLongitud, PanelResult pnlPrefijo, PanelResult pnlSufijo, PanelResult pnlSubCadenaIzq, PanelResult pnlSubCadenaDer, PanelResult pnlTranspuesta) {
        boolean val = false;
//        String aux[] = new String[txtCadena.getText().length()];
//        for (int i = 0; i < txtCadena.getText().length(); i++) {
//            aux[i] = String.valueOf(txtCadena.getText().charAt(i));
//        }
//        for (String s : aux) {
//            if (alfabeto.contains(s)) {
//                val = true;
//            } else {
//                val = false;
//                break;
//            }
//        }

        String cadena = txtCadena.getText();
        
        for (String s : alfabeto) {
            System.out.println(s);
            if (cadena.contains(s)) {
                val = true;
            } else {
                val = false;
            }
        }

        if (val) {
            System.out.println("CADENA CORRECTA!");
            SwingUtilities.updateComponentTreeUI(pnlResultCad);
            pnlConcatenacion.setData("./src/main/java/Resources/concatenacion.png", Color.orange, "Concatenación", obCad.getConcatStr(txtCadena.getText(), txtConcat.getText()));
            pnlPotencia.setData("./src/main/java/Resources/potencia.png", Color.orange, "Potencia", obCad.getPotencia(Integer.parseInt(txtPotencia.getText()), txtCadena.getText()));
            pnlLongitud.setData("./src/main/java/Resources/longitud.png", Color.orange, "Longitud", String.valueOf(obCad.getLongitud(txtCadena.getText())));
            pnlPrefijo.setData("./src/main/java/Resources/prefijo.png", Color.orange, "Prefijo", String.valueOf(obCad.getPrefijo(txtCadena.getText())));
            pnlSufijo.setData("./src/main/java/Resources/sufijo.png", Color.orange, "Sufijo", String.valueOf(obCad.getSufijo(txtCadena.getText())));
            pnlSubCadenaIzq.setData("./src/main/java/Resources/subcadena.png", Color.orange, "Subcadena Izquierda", obCad.getSubstringLeft(Integer.parseInt(txtSubIzq.getText()), txtCadena.getText()));
            pnlSubCadenaDer.setData("./src/main/java/Resources/subcadena.png", Color.orange, "Subcadena Derecha", obCad.getSubstringRight(Integer.parseInt(txtSubDer.getText()), txtCadena.getText()));
            pnlTranspuesta.setData("./src/main/java/Resources/transpuesta.png", Color.orange, "Transpuesta", obCad.getTranspuesta(txtCadena.getText()));
        } else {
            System.out.println("LA CADENA NO EXISTE EN EL ALFABETO");
            JOptionPane.showMessageDialog(null, "La cadena no se encuentra dentro del alfabeto", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void genOpConjuntos(ArrayList<String> conjuntos, ArrayList<String> first, ArrayList<String> second,
            Data data, PanelResult pnlUniverso, PanelResult pnlUnion, PanelResult pnlIntersect,
            PanelResult pnlDifference, PanelResult pnlSymetricDiff, PanelResult pnlComp1, PanelResult pnlComp2,
            PanelResult pnlCard1, PanelResult pnlCard2, PanelResult pnlCartesian, PanelResult pnlPot1, PanelResult pnlPot2) {
        first.clear();
        second.clear();
        String strFirst = "", strSec = "";
        for (String s : conjuntos) {
            switch (s) {
                case "A":
                    if (first.isEmpty()) {
                        first.addAll(data.getA());
                        strFirst = "A";
                    } else {
                        second.addAll(data.getA());
                        strSec = "A";
                    }
                    break;
                case "B":
                    if (first.isEmpty()) {
                        first.addAll(data.getB());
                        strFirst = "B";
                    } else {
                        second.addAll(data.getB());
                        strSec = "B";
                    }
                    break;
                case "C":
                    if (first.isEmpty()) {
                        first.addAll(data.getC());
                        strFirst = "C";
                    } else {
                        second.addAll(data.getC());
                        strSec = "C";
                    }
                    break;
                case "D":
                    if (first.isEmpty()) {
                        first.addAll(data.getD());
                        strFirst = "D";
                    } else {
                        second.addAll(data.getD());
                        strSec = "D";
                    }
                    break;
            }
        }
        pnlUniverso.setData("./src/main/java/Resources/universe.png", Color.orange, "Universo", String.valueOf(obCon.getUniverse(data.getA(), data.getB(), data.getC(), data.getD())));
        pnlUnion.setData("./src/main/java/Resources/union.png", Color.orange, "Union", String.valueOf(obCon.getUnion(first, second)));
        pnlIntersect.setData("./src/main/java/Resources/interseccion.png", Color.orange, "Intersección", String.valueOf(obCon.getIntersect(first, second)));
        pnlDifference.setData("./src/main/java/Resources/diferencia.png", Color.orange, "Diferencia", String.valueOf(obCon.getDifference(first, second)));
        pnlSymetricDiff.setData("./src/main/java/Resources/diferencia.png", Color.orange, "Diferencia Simetrica", String.valueOf(obCon.getSimetricDifference(first, second)));
        pnlComp1.setData("./src/main/java/Resources/complemento.png", Color.orange, "Complemento " + strFirst, String.valueOf(obCon.getComplement(data.getA(), data.getB(), data.getC(), data.getD(), first)));
        pnlComp2.setData("./src/main/java/Resources/complemento.png", Color.orange, "Complemento " + strSec, String.valueOf(obCon.getComplement(data.getA(), data.getB(), data.getC(), data.getD(), second)));
        pnlCard1.setData("./src/main/java/Resources/cardinalidad.png", Color.orange, "Cardinalidad " + strFirst, String.valueOf(obCon.getCardinality(first)));
        pnlCard2.setData("./src/main/java/Resources/cardinalidad.png", Color.orange, "Cardinalidad " + strSec, String.valueOf(obCon.getCardinality(second)));
        pnlCartesian.setData("./src/main/java/Resources/producto.png", Color.orange, "Producto Cartesiano", String.valueOf(obCon.getCartesianProduct(first, second)));
        pnlPot1.setData("./src/main/java/Resources/potencia.png", Color.orange, "Potencia " + strFirst, String.valueOf(obCon.getConjuntoPotencia(first)));
        pnlPot2.setData("./src/main/java/Resources/potencia.png", Color.orange, "Potencia " + strSec, String.valueOf(obCon.getConjuntoPotencia(second)));
    }
}
