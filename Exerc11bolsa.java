/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exemplo.exerc11bolsa;

/**
 *
 * @author Marcos Roberto
 */
public class Exerc11bolsa {
   public static void main(String[] args) {
   
       
       Bolsa bolsa1,bolsa2,bolsa3;
       bolsa1= new Bolsa();
       bolsa2= new Bolsa();
       bolsa3= new Bolsa();
       
       bolsa1.prreecher();
       bolsa2.prreecher();
       bolsa3.prreecher();
       
       bolsa1.exibirResumo();
       bolsa2.exibirResumo();
       bolsa3.exibirResumo();
       double soma;
       soma=+bolsa1.calcularPosicaoDoAtivo()+bolsa2.calcularPosicaoDoAtivo()+bolsa3.calcularPosicaoDoAtivo();
       
       System.out.println("--------------------------");
       System.out.println("Valor total da carteira:"+soma);
       
       

    }
}
