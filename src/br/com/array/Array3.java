/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 * Estudo do array - exemplo 3 - Instanciando um array
 * @author fernando.vsena
 *///github.com/nsenaeeventos
public class Array3 {
    public static void main(String[] args) {
        //iniciando um array com tamanho fixo de 5 variaveis
        int[] impares = new int[5];
        impares[0]=1;
        impares[1]=3;
        impares[2]=5;
        impares[3]=7;
        impares[4]=9;
        
        System.out.println("Tamanho do array: " + impares.length);
        System.out.println("Posição 1 de array: " + impares[1]);
        //a linha abaixo gera um erro, pois o tamanho do array e 5
        impares[5] = 11;
        System.out.println("Posição 5 do array: " + impares[5]);
    }
    
}
