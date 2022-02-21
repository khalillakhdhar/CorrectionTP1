/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correctiontp1;

/**
 *
 * @author khali
 */
public class Mathematique {
    
    public double factoriel(int x)
    {
        int f=1;
        for(int i=2;i<=x;i++)
        {
        f=f*i;
        }
    
    return f;
    
    }
    
    public int pgcd(int a,int b)
    {
    while(a!=b)
    {
    if(a>b)
        a=a-b;
    else
        b=b-a;
    
    }
    return a;
    /*
    a=15 b=10
    a=15-10=5
    b=10-5
    
    
    
    */
    
    
    }
    
}
