package Funciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConjuntosOperations {

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

    // Operaciones con conjuntos
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

    public ArrayList<ArrayList<String>> getCartesianProduct(ArrayList<String> firstSet, ArrayList<String> secondSet) {
        ArrayList<ArrayList<String>> product = new ArrayList<>();
        for (String f : firstSet) {
            for (String s : secondSet) {
                ArrayList<String> aux = new ArrayList<>();
                aux.add(f);
                aux.add(s);
                product.add(aux);
            }
        }
        return product;
    }

    public ArrayList<ArrayList<String>> getConjuntoPotencia(ArrayList<String> conjunto) {
        // Se crea una lista para almacenar el conjunto potencia
        ArrayList<ArrayList<String>> conjuntoPotencia = new ArrayList<>();

        // Se agrega el conjunto vacío al conjunto potencia
        conjuntoPotencia.add(new ArrayList<>());

        // Se recorre cada elemento del conjunto original
        for (String elemento : conjunto) {

            // Se crea una lista temporal para almacenar los subconjuntos que se van a generar
            ArrayList<ArrayList<String>> subconjuntosTemporales = new ArrayList<>();

            // Se recorre cada subconjunto del conjunto potencia actual
            for (ArrayList<String> subconjunto : conjuntoPotencia) {

                // Se crea un nuevo subconjunto a partir del subconjunto actual y se agrega el elemento
                ArrayList<String> nuevoSubconjunto = new ArrayList<>(subconjunto);
                nuevoSubconjunto.add(elemento);

                // Se agrega el nuevo subconjunto a la lista temporal
                subconjuntosTemporales.add(nuevoSubconjunto);
            }

            // Se agregan los subconjuntos temporales al conjunto potencia
            conjuntoPotencia.addAll(subconjuntosTemporales);
        }

        // Se retorna el conjunto potencia
        return conjuntoPotencia;
    }
}
