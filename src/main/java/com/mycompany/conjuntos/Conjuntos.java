package com.mycompany.conjuntos;

import Funciones.ListManager;
import java.util.ArrayList;

public class Conjuntos {

    public static void main(String[] args) {
        //new FramePrincipal().setVisible(true);
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        ArrayList<String> b = new ArrayList<>();
        b.add("e");
        b.add("f");
        b.add("g");
        b.add("h");
        b.add("a");
        ListManager obL = new ListManager();
        System.out.println("UNIVERSO");
        for (String s : obL.getUniverse(a, b)) {
            System.out.println(s);
        }
//        System.out.println("UNION");
//        for (String s : obL.getUnion(a, b)) {
//            System.out.println(s);
//        }
//        System.out.println("INTERSECTION");
//        for (String s : obL.getIntersect(a, b)) {
//            System.out.println(s);
//        }
//        System.out.println("DIFFERENCE");
//        for (String s : obL.getDifference(a, b)) {
//            System.out.println(s);
//        }
//        System.out.println("DIFFERENCE");
//        for (String s : obL.getDifference(b, a)) {
//            System.out.println(s);
//        }
//        System.out.println("SIMETRIC DIFFERENCE");
//        for (String s : obL.getSimetricDifference(a, b)) {
//            System.out.println(s);
//        }
//        System.out.println("COMPLEMENT");
//        for (String s : obL.getComplement(a, b, b)) {
//            System.out.println(s);
//        }
//        System.out.println("CARTESIAN PRODUCT");
//        for (String s[] : obL.getCartesianProduct(a, b)) {
//            System.out.println("{" + s[0] + ", " + s[1] + "}");
//        }
        System.out.println(obL.getLinkStr("Dec", "123"));
        System.out.println(obL.getPotenciaAlf(3, "Dec"));
        System.out.println(obL.getSubstringLeft(3, "Decada"));
        System.out.println(obL.getSubstringRight(4, "Decada"));
    }
}
