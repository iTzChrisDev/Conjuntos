package Funciones;

import java.util.ArrayList;

public class Data {

    private ArrayList<String> a, b, c, d;

    public Data() {
        a = new ArrayList<>();
        b = new ArrayList<>();
        c = new ArrayList<>();
        d = new ArrayList<>();
    }

    public void clearData()
    {
        a.clear();
        b.clear();
        c.clear();
        d.clear();
    }
    
    public ArrayList<String> getA() {
        return a;
    }

    public ArrayList<String> getB() {
        return b;
    }

    public ArrayList<String> getC() {
        return c;
    }

    public ArrayList<String> getD() {
        return d;
    }
}
