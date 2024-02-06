package Funciones;

import java.util.ArrayList;

public class StringOperations {
    
    public String getConcatStr(String str, String auxStr) {
        return str + auxStr;
    }
    
    public String getPotencia(int index, String str) {
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
    
    public int getLongitud(String cadena) {
        return cadena.length();
    }
    
    public String getTranspuesta(String cadena) {
        String aux = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            aux += cadena.charAt(i);
        }
        return aux;
    }
    
    public ArrayList<String> getPrefijo(String cadena) {
        ArrayList<String> prefijo = new ArrayList<>();
        for (int i = 0; i <= cadena.length(); i++) {
            prefijo.add(cadena.substring(0, i));
        }       
        return prefijo;
    }
    
    public ArrayList<String> getSufijo(String cadena) {
        ArrayList<String> sufijo = new ArrayList<>();
        sufijo.add("");
        for (int i = cadena.length() - 1; i >= 0; i--) {
            sufijo.add(cadena.substring(i, cadena.length()));
        }
        return sufijo;
    }
}
