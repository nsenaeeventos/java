/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 * Estudo do array - exemplo 5- percorrendo um array com o laço for e foreach
 * @author fernando.vsena
 *///github.com/nsenaeeventos
public class Array5 {
    public static void main(String[] args) {
        //instanciando um array de tamanho variavel
        int [] pares = {2,4,6,8};
        //a estrutura abaixo percorreo array de 0 ate seu tamanho maximo
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares["+ i + "] = " + pares[i]);
            
        }
        //usando uma estrutura simplificada do laço for(foreach) para percorrer o array
        System.out.println("uso do foreach");
        for (int i : pares) {
            System.out.println(i);
        }
    }
    
}
