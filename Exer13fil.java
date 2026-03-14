/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exemplo.exer13fil;

import java.util.LinkedList; 
import java.util.List; 
import java.util.Scanner;

public class Exer13fil {
    
    

    public static int imprimirMenu(){
        Scanner ler = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("1 - adicionar filme");
        System.out.println("2 - remover filme");
        System.out.println("3 - pesquisar filme (titulo)");
        System.out.println("4 - pesquisar filme (diretor)");
        System.out.println("0 - sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opcao:");

        return ler.nextInt();
    }

    public static void main(String[] args) {

 
         List<Filme> listaFilmes = new LinkedList<>();
        Scanner ler = new Scanner(System.in);

        int opcao;

        do{

            opcao = imprimirMenu();

            if(opcao == 1){

                Filme f1 = new Filme();
                f1.preencher();
                listaFilmes.add(f1);

            }

            else if(opcao == 2){

                ler.nextLine();
                System.out.println("Informe o titulo do filme ou o nome de seu diretor para remover:");
                String titulo = ler.nextLine();
                String diretor= ler.nextLine();

                for(int i = 0; i < listaFilmes.size(); i++){

                    Filme f1 = listaFilmes.get(i);

                    if(f1.getTitulo().equalsIgnoreCase(titulo)){
                        listaFilmes.remove(i);
                        System.out.println("Filme removido.");
                        break;
                    }

                }
                 for(int j = 0; j < listaFilmes.size(); j++){

                    Filme f1 = listaFilmes.get(j);

                    if(f1.getDiretor().equalsIgnoreCase(diretor)){
                        listaFilmes.remove(j);
                        System.out.println("Filme removido.");
                        break;
                    }

                }

            }

            else if(opcao == 3){

                ler.nextLine();
                System.out.println("Informe o titulo:");
                String titulo = ler.nextLine();

                for(int i = 0; i < listaFilmes.size(); i++){

                    Filme f1 = listaFilmes.get(i);

                    if(f1.getTitulo().equalsIgnoreCase(titulo)){
                        f1.imprimir();
                    }

                }

            }

            else if(opcao == 4){

                ler.nextLine();
                System.out.println("Informe o diretor:");
                String diretor = ler.nextLine();

                for(int i = 0; i < listaFilmes.size(); i++){

                    Filme f1 = listaFilmes.get(i);

                    if(f1.getDiretor().equalsIgnoreCase(diretor)){
                        f1.imprimir();
                    }

                }

            }

            else if(opcao != 0){
                System.out.println("Opcao invalida");
            }

        }while(opcao != 0);

    }
}

