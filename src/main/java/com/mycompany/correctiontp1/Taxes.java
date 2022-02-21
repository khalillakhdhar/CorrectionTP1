/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correctiontp1;

/**
 *
 * @author khali
 */
public class Taxes {
    private double prix;
    private String marque;

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void calculerTtc()
    {
        double taxe=0;
        double ttc=0;
        if(this.prix<100)
        {
            ttc=prix *1.12;
            System.out.println("le prix TTC est "+ttc);
        }
        else if(this.prix<1000)
        {
            ttc=prix *1.15;
            System.out.println("le prix TTC est "+ttc);
        }
        else
        {
        
        
            ttc=prix *1.19;
            System.out.println("le prix TTC est "+ttc);
        
        }
    
    
    }

    public Taxes(double prix, String marque) {
        this.prix = prix;
        this.marque = marque;
    }
    
    
}
