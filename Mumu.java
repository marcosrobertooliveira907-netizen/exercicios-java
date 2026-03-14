/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.exer12mus;
import java.util.Scanner;

public class Mumu {
    private String titulo;
    private String artista;

            

public Mumu(){
    
}

public Mumu(String titulo,String artista,int duracao,double preco ){
    this.titulo= titulo;
    this.artista= artista;
 
    
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

    

public void preencher(){
    Scanner ler= new Scanner(System.in);
    System.out.println("informe os dados da musica:");
    System.out.println("titulo:");
    this.titulo=ler.nextLine();
    System.out.println("artista:");
    this.artista= ler.nextLine();
}
public void outra(Mumu outra){
    this.titulo= outra.getTitulo();
    this.artista= outra.getArtista();
 
 
}
public void imprimir (){
    System.out.println("titulo"+titulo);
    System.out.println("artista"+artista);
}

}
    
    

