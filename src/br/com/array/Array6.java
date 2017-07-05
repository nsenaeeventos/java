/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 * Estudo do array - exemplo 6 - Array Multidimencional
 *
 * @author fernando.vsena
 *///github.com/nsenaeeventos
public class Array6 {

    public static void main(String[] args) {
        //a linha abaixo cria um array de duas dimenções com 3 lnhas e 3 colunas
        String[][] agenda = {{"Bill", "1111-1111", "bill@outlook.com"}, {"Linux", "2222-2222", "Linus@tux.com"}, {"Steve", "3333-3333", "steve@icloud.com"}};
        //exemplo 1: recuperando o email do bill
        //System.out.println(agenda[0][2]);
        //exemplo 2: montado a agenda de contatos
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("_________________________");
            //o segundo laço dentro do primeiro laço, percorre as colunas montado a agenda
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println(agenda[i][j]);

            }

        }
    }

}


