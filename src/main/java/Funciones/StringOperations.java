package Funciones;

public class StringOperations {

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
