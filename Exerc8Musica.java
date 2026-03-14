/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exemplo.exerc8musica;

/**
 *
 * @author Marcos Roberto
 */
public class Exerc8Musica {

    public static void main(String[] args) {
        Musica m1 = new Musica();
        m1.preencher();
        System.out.println(m1.toString());
        m1.tocarMusica();
        m1.desligarMusica();
    }
}
