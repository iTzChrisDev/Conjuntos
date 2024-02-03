package Funciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

public class ListManager {

    public void setList(JList lista, JTextField txt, ArrayList<String> conjunto) {
        DefaultListModel model = new DefaultListModel();
        conjunto.addAll(getConjunto(txt.getText()));
        for (String s : conjunto) {
            model.addElement(s);
        }
        lista.setModel(model);
    }

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

    public ArrayList<String> getUniverse(ArrayList<String> a, ArrayList<String> b) {
        Set<String> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);
        return new ArrayList<String>(set);
    }

    public ArrayList<String> getUnion(ArrayList<String> firstSet, ArrayList<String> secondSet) {
        ArrayList<String> union = new ArrayList<>(firstSet);
        for (String s : secondSet) {
            if (!union.contains(s)) {
                union.add(s);
            }
        }

        return union;
    }

    public ArrayList<String> getIntersect(ArrayList<String> firstSet, ArrayList<String> secondSet) {
        ArrayList<String> intersection = new ArrayList<>();
        for (String f : firstSet) {
            if (secondSet.contains(f)) {
                intersection.add(f);
            }
        }

        return intersection;
    }

    public ArrayList<String> getDifference(ArrayList<String> firstSet, ArrayList<String> secondSet) {
        ArrayList<String> difference = new ArrayList<>();
        for (String f : firstSet) {
            if (!secondSet.contains(f)) {
                difference.add(f);
            }
        }

        return difference;
    }

    public ArrayList<String> getSimetricDifference(ArrayList<String> firstSet, ArrayList<String> secondSet) {
        ArrayList<String> simetricDifference = new ArrayList<>();
        for (String f : firstSet) {
            if (!secondSet.contains(f)) {
                simetricDifference.add(f);
            }
        }

        for (String s : secondSet) {
            if (!firstSet.contains(s)) {
                simetricDifference.add(s);
            }
        }

        return simetricDifference;
    }

    public ArrayList<String> getComplement(ArrayList<String> firstSet, ArrayList<String> secondSet, ArrayList<String> complementarySet) {
        ArrayList<String> complement = new ArrayList<>();
        for (String u : getUniverse(firstSet, secondSet)) {
            if (!complementarySet.contains(u)) {
                complement.add(u);
            }
        }
        return complement;
    }

    public int getCardinality(ArrayList<String> set) {
        return set.size();
    }

    public ArrayList<String[]> getCartesianProduct(ArrayList<String> firstSet, ArrayList<String> secondSet) {
        ArrayList<String[]> product = new ArrayList<>();
        for (String f : firstSet) {
            for (String s : secondSet) {
                String aux[] = {f, s};
                product.add(aux);
            }
        }
        return product;
    }

//    public ArrayList<String> getPotenciaSet() {
//
//    }
    
    public String getLinkStr(String str, String auxStr) {
        return str + auxStr;
    }

    public String getPotenciaAlf(int index, String str) {
        String aux = "";
        for (int i = 0; i < index; i++) {
            aux += str;
        }
        return aux;
    }

    public String getSubstringLeft(int index, String str) {
        return str.substring(0, index);
    }

    public String getSubstringRight(int index, String str) {
        return str.substring(str.length() - index, str.length());
    }
}
