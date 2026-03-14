/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.exer10casa;
import java.util.Scanner;


public class Casa {

    private String endereco;
    private double area;
    private int num_quartos;
    private double preco;

    public Casa(){
    }

    public Casa(String endereco, double area, int num_quartos, double preco){
        this.endereco = endereco;
        this.area = area;
        this.num_quartos = num_quartos;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNum_quartos() {
        return num_quartos;
    }

    public void setNum_quartos(int num_quartos) {
        this.num_quartos = num_quartos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void preencher(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe os dados da casa:");

        System.out.println("Endereco:");
        this.endereco = ler.nextLine();

        System.out.println("Area:");
        this.area = ler.nextDouble();

        System.out.println("Numero de quartos:");
        this.num_quartos = ler.nextInt();

        System.out.println("Preco:");
        this.preco = ler.nextDouble();
    }

    public void copiar(Casa outra){
        this.endereco = outra.getEndereco();
        this.area = outra.getArea();
        this.num_quartos = outra.getNum_quartos();
        this.preco = outra.getPreco();
    }

    public double calcularPrecoM2(){
        return this.preco / this.area;
    }

    @Override
    public String toString(){
        return "Endereco: " + this.endereco +
               " | Area: " + this.area +
               " | Numero de quartos: " + this.num_quartos +
               " | Preco: " + this.preco;
    }

    public void exibirResumo(){
        System.out.println(this.toString());
        System.out.println("Preco por m2: " + calcularPrecoM2());
    }
}