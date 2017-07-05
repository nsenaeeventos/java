package br.com.array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Estudo do array - exemplo 1 - Array simples
 * 05 07 2017
 * @author Fernando.vsena
 *///github.com/nsenaeeventos
public class Array1 {
    public static void main(String[] args) {
        //Sem array
        System.out.println("Array simples");
        System.out.println("1.Sem Array");
        String time1="Palmeira";
        String time2="Corinthians";
        String time3="São Paulo";
        String time4="Santos";
        System.out.println("Time: " + time2);
        System.out.println("2.Com Array");
        //a linha abaixo cria um array simples de tamanho 4
        String[] times ={"Palmeiras", "Corinthians", "São Paulo", "Santos"};
        //a linha abaixo exibe o conteudo do array
        //[0] [1] [2] [3]
        System.out.println("Times: " + times[1]);
        //a linha abaixo o ponto .length exibe o tamanho do array
        System.out.println("Tamanho do array: " + times.length);
        //a linha abaixo altera o conteudo de uma array
        times[1] = "Flamengo";
        System.out.println("Times: " + times[1]);
    }
    
}
