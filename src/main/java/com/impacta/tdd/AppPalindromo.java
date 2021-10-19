package com.impacta.tdd;

import com.impacta.tdd.model.Palindromo;

import java.util.Scanner;

public class AppPalindromo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a palavra a ser validada: ");
        String inputPalavraFrase = scanner.nextLine();

        Palindromo palindromo = new Palindromo();

        if (palindromo.validaPalindromo(inputPalavraFrase)){
            System.out.println(inputPalavraFrase + "\" é um palíndromo!");
        }else{
            System.out.println(inputPalavraFrase + "\" NÃO é um palíndromo!");
        }

    }

}
