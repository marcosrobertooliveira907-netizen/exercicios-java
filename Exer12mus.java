
package com.exemplo.exer12mus;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exer12mus {

    public static int imprimirMenu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("1 - inserir musica");
        System.out.println("2 - remover musica");
        System.out.println("3 - pesquisar musica (titulo)");
        System.out.println("4 - pesquisar musica (artista)");
        System.out.println("0 - sair");
        System.out.println("-----------------------------");
        System.out.println("escolha uma opcao:");

        return ler.nextInt();
    }

    public static void main(String[] args) {

        List<Mumu> listamusicas = new LinkedList<Mumu>();
        Scanner ler = new Scanner(System.in);

        int opcao;

        do{

            opcao = imprimirMenu();

            if(opcao == 1){

                Mumu m1 = new Mumu();
                m1.preencher();
                listamusicas.add(m1);

            }

            else if(opcao == 2){

                System.out.println("Informe o titulo da musica para remover:");
                String titulo = ler.nextLine();
                String artista= ler.nextLine();


                for(int i = 0; i < listamusicas.size(); i++){

                    Mumu m1 = listamusicas.get(i);

                    if(m1.getTitulo().equalsIgnoreCase(titulo)){
                        listamusicas.remove(i);
                        System.out.println("Musica removida.");
                        break;
                    }

                }
                for(int j = 0; j < listamusicas.size(); j++){

                    Mumu m1 = listamusicas.get(j);

                    if(m1.getArtista().equalsIgnoreCase(artista)){
                    } else {
                        listamusicas.remove(j);
                        System.out.println("Musica removida.");
                        break;
                    }

                }

            }

            else if(opcao == 3){

                ler.nextLine();
                System.out.println("Informe o titulo:");
                String title = ler.nextLine();

                for(int i = 0; i < listamusicas.size(); i++){

                    Mumu m1 = listamusicas.get(i);

                    if(m1.getTitulo().equalsIgnoreCase(title)){
                        m1.imprimir();
                    }

                }

            }

            else if(opcao == 4){

                ler.nextLine();
                System.out.println("Informe o artista:");
                String artista = ler.nextLine();

                for(int i = 0; i < listamusicas.size(); i++){

                    Mumu m1 = listamusicas.get(i);

                    if(m1.getArtista().equalsIgnoreCase(artista)){
                        m1.imprimir();
                    }

                }

            }

            else if(opcao != 0){
                System.out.println("Opcao invalida");
            }

        }while(opcao != 0);

    }

}

