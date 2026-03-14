/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.exer13fil;
import java.util.Scanner;
/**
 *
 * @author Marcos Roberto
 */

public class Filme {
    private String titulo;
    private String diretor;
    
    
public Filme(){
    
}
public void Filme(String titulo,String diretor ){
    this.setTitulo(titulo);
    this.setDiretor(diretor);
   
    
}





public void preencher(){
    Scanner ler= new Scanner(System.in);
    System.out.println("informe os dados do filme:");
    System.out.println("titulo:");
    this.setTitulo(ler.nextLine());
    System.out.println("diretor:");
    this.setDiretor(ler.nextLine());
  
    }
public void imprimir(){
    System.out.println("titulo:"+getTitulo());
    System.out.println("diretor:"+getDiretor());
    
   
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
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    
}
    

