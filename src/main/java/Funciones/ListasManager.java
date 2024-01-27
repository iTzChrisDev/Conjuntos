package Funciones;

import java.util.ArrayList;

public class ListasManager {
    public ArrayList<String> getConjunto(String cadena) {
        String[] aux = cadena.split(",");
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaAux = new ArrayList<>();
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
}
