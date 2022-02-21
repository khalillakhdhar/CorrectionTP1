/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.correctiontp1;

/**
 *
 * @author khali
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Taxes t=new Taxes(1890, "laptop");
        t.calculerTtc();
        Mathematique m=new Mathematique();
       m.factoriel(4);
        
        
    }
    
}
