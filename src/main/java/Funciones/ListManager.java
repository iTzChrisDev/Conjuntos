package Funciones;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

public class ListManager {

    public ArrayList<String> getConjunto(String cadena) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaAux = new ArrayList<>();

        //Dividimos la cadena de entrada
        String[] aux = cadena.split(",");
        for (String s : aux) {
            if (s.contains(" ")) {
                String cad = s.replace(" ", "");
                lista.add(cad);
            } else {
                lista.add(s);
            }
        }

        //Eliminamos aquellos elementos vacios en la lista (Conjunto)
        for (String s : lista) {
            if (s.length() != 0) {
                listaAux.add(s);
            }
        }
        lista.clear();
        lista.addAll(listaAux);
        return lista;
    }

    public void llenarLista(JList lista, JTextField txt, ArrayList<String> conjunto) {
        DefaultListModel model = new DefaultListModel();
        conjunto.addAll(getConjunto(txt.getText()));
        for (String s : conjunto) {
            model.addElement(s);
        }
        lista.setModel(model);
    }
}
