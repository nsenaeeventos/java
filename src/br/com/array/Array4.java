/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 * Estudo do array - exemplo 4 - Preechendo um array com o laço for
 * @author fernando.vsena
 *///github.com/nsenaeeventos
public class Array4 {
    public static void main(String[] args) {
        int[] idades = new int [10];
        //a estrutura abaixo cria as variaveis que irão preencher as 10 posições("casinhas") do array
        for (int i = 0; i < 10; i++) {
            idades[i] = i*10;
            System.out.println("idades[" + i +"] " + idades[i]);
            
        }
    }
    
}
