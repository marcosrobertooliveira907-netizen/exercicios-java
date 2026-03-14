/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.exer1tv;

import java.util.Scanner;

public class Tv {
    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;

    public Tv(){
 
}
    public Tv(String marca, double tamanho, String resolucao, double preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
public void preencher(){
   Scanner ler = new Scanner(System. in);
    System.out.println("informe os dados");
     System.out.println("marca");
     this.marca= ler.nextLine();
     System.out.println("tamanho:");
     this.tamanho= ler.nextDouble();
     ler.nextLine();
     System.out.println("resolucao:");
     this.resolucao= ler.nextLine();
     System.out.println("preco:");
     this.preco= ler.nextDouble();         
   }
public void imprimir(){
    System.out.println("dadod da tv:");
    System.out.println("marca"+marca);
    System.out.println("tamanho"+tamanho);
    System.out.println("resolucao"+resolucao);
    System.out.println("preco"+preco);
   
}
public void copiar(Tv outra){
    this.marca=outra.getMarca();
    this.tamanho= outra.getTamanho();
    this.resolucao=outra.getResolucao();
    this.preco=outra.getPreco();
 }
}