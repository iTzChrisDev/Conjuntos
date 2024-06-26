package Funciones;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

public class ListManager {

    private ConjuntosOperations obS;

    public ListManager() {
        obS = new ConjuntosOperations();
    }

    public void setList(JList lista, JTextField txt, ArrayList<String> conjunto) {
        DefaultListModel model = new DefaultListModel();
        conjunto.addAll(obS.getConjunto(txt.getText()));
        for (String s : conjunto) {
            model.addElement(s);
        }
        lista.setModel(model);
    }
}
