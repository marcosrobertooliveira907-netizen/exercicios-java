/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exemplo.exer10casa;

/**
 *
 * @author Marcos Roberto
 */
public class Exer10casa {

    public static void main(String[] args) {
       Casa c1;
       Casa c2;
       Casa c3;
       c1 = new Casa();
       c2 = new Casa();
       c3 = new Casa();
       c1.preencher();
       c2.preencher();
       c3.preencher();
       c1.exibirResumo();
       c2.exibirResumo();
       c3.exibirResumo();
       
       
       
       
     
 if (c1.calcularPrecoM2() < c2.calcularPrecoM2() && c1.calcularPrecoM2() < c3.calcularPrecoM2()){
        System.out.println("----------------------------------------------------");
        System.out.println("Melhor preço por m2: "+ c1.toString());
    }
 else if (c2.calcularPrecoM2() < c1.calcularPrecoM2() && c2.calcularPrecoM2() < c3.calcularPrecoM2()){
       System.out.println("----------------------------------------------------");
       System.out.println("Melhor preço por m2: "+ c2.toString());
    }
 else if (c3.calcularPrecoM2() < c2.calcularPrecoM2() && c3.calcularPrecoM2() < c1.calcularPrecoM2()){
        System.out.println("----------------------------------------------------");
        System.out.println("Melhor preço por m2: "+ c3.toString());
    }
      
    }
}
