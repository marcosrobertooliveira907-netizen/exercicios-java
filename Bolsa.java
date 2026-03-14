/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.exerc11bolsa;

import java.util.Scanner;

/**
 *
 * @author Marcos Roberto
 */
public class Bolsa {
    
    private String nome_empresa;
    private double preco_acao;
    private int qtd_acoes;
    private double variacao_diaria;
    
public Bolsa(){
    
}
public void Bolsa(String nome_empresa,double preco_acao,int qtd_acoes,double variacao_diaria){
    this.nome_empresa=nome_empresa;
    this.preco_acao= preco_acao;
    this.qtd_acoes=qtd_acoes;
    this.variacao_diaria=variacao_diaria;
}




    /**
     * @return the nome_empresa
     */
    public String getNome_empresa() {
        return nome_empresa;
    }

    /**
     * @param nome_empresa the nome_empresa to set
     */
    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    /**
     * @return the preco_acao
     */
    public double getPreco_acao() {
        return preco_acao;
    }

    /**
     * @param preco_acao the preco_acao to set
     */
    public void setPreco_acao(double preco_acao) {
        this.preco_acao = preco_acao;
    }

    /**
     * @return the qtd_acoes
     */
    public int getQtd_acoes() {
        return qtd_acoes;
    }

    /**
     * @param qtd_acoes the qtd_acoes to set
     */
    public void setQtd_acoes(int qtd_acoes) {
        this.qtd_acoes = qtd_acoes;
    }

    /**
     * @return the variacao_diaria
     */
    public double getVariacao_diaria() {
        return variacao_diaria;
    }

    /**
     * @param variacao_diaria the variacao_diaria to set
     */
    public void setVariacao_diaria(double variacao_diaria) {
        this.variacao_diaria = variacao_diaria;
    }

public void prreecher(){
    Scanner ler=new Scanner(System. in);
    System.out.println("informe os seguintes dados:");
    System.out.println("nome da empresa");
    this.nome_empresa= ler.nextLine();
    System.out.println("preco da acao:");
    this.preco_acao=ler.nextDouble();
    System.out.println("qauntidade de acoes");
    this.qtd_acoes= ler.nextInt();
    System.out.println("variacao diaria");
    this.variacao_diaria=ler.nextDouble();
}
public void copiar(Bolsa outra){
    this.nome_empresa = outra.getNome_empresa();
    this.preco_acao = outra.getPreco_acao();
    this.qtd_acoes = outra.getQtd_acoes();
    this.variacao_diaria = outra.getVariacao_diaria();
}

public double calcularPosicaoDoAtivo(){
    return (double) (this.preco_acao* this.qtd_acoes);
    
}
@Override

public String toString(){
    return this.nome_empresa+" | preco: "+this.preco_acao +" |qtd: "+this.qtd_acoes+" | variacao:"+this.variacao_diaria+" |posicao: "+calcularPosicaoDoAtivo();
    
}
public void exibirResumo(){
    System.out.println(this.toString());
}
}