package com.mycompany.conjuntos;

import functions.SetsManager;

public class Conjuntos {

    public static void main(String[] args) {
        String a = "a,b,g,sd,s,f,a,s";
        String b = "g,a,d,f,y,t,rrt,hh";
        String c = "a,b,g,,sd,s,f,a,s";
        String d = "a, ,o we, g d,po ,c,f,vs, ,qwerty";
                
        SetsManager obS = new SetsManager();
        for (String s : obS.getConjunto(d)) 
        {
            System.out.print(s + "_");
        }
    }
}
