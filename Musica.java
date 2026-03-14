/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.exerc8musica;

import java.util.Scanner;
/**
 *
 * @author Marcos Roberto
 */
public class Musica {
    private String titulo;
    private String artista;
    private int duracao;
    private double preco;       
            

public Musica(){
    
}

public Musica(String titulo,String artista,int duracao,double preco ){
    this.titulo= titulo;
    this.artista= artista;
    this.duracao=duracao;
    this.preco= preco;
    
}

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

public void preencher(){
    Scanner ler= new Scanner(System.in);
    System.out.println("informe os dados da musica:");
    System.out.println("titulo:");
    this.titulo=ler.nextLine();
    System.out.println("artista:");
    this.artista= ler.nextLine();
    System.out.println("duracao:");
    this.duracao= ler.nextInt();
    System.out.println("preco:");
    this.preco= ler.nextDouble();
}
public void outra(Musica outra){
    this.titulo= outra.getTitulo();
    this.artista= outra.getArtista();
    this.duracao= outra.getDuracao();
    this.preco= outra.getPreco();
 
}

@Override
public String toString(){
    return "titulo: " + this.getTitulo()+ " | Artista: " + this.getArtista()+" | Duracao:"+this.getDuracao()+" | Preco: "+this.getPreco();
    
}
 public void tocarMusica() {
        System.out.println("A musica "+ this.titulo + " esta tocando!");
    }

 public void desligarMusica(){
     System.out.println("A musica"+ this.titulo+"esta desligada!");
 }
}
