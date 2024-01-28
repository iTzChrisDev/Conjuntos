package Funciones;

import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JTextField;

public class ListManager {
    public ArrayList<String> getConjunto(String cadena) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaAux = new ArrayList<>();
        
        String[] aux = cadena.split(",");
        for (String s : aux) {
            if (s.contains(" ")) {
                String cad = s.replace(" ", "");
                lista.add(cad);
            } else {
                lista.add(s);
            }
        }
        for (String s : lista) {
            if (s.length() != 0) {
                listaAux.add(s);
            }
        }
        lista.clear();
        lista.addAll(listaAux);
        return lista;
    }
    
    public void llenarLista(JList lista, JTextField txt)
    {
        
    }
}
