package br.uniesp.poo.aula05;

import java.util.Scanner;

public class aula05 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        float media;

        System.out.println("Qual é o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Qual é o seu curso: ");
        String curso = scanner.nextLine();

        System.out.println("Você está em qual período: ");
        int periodo = scanner.nextInt();

        System.out.println("Digite sua primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite sua segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Entre com a quantidade de faltas: ");
        int faltas = scanner.nextInt();

        System.out.println("Seu nome completo é: " + nome +"\nSeu curso é: "+ curso);
        System.out.println("Seu periodo é: " + periodo + "\nSua primeira nota é: "+nota1);
        System.out.println("Sua segunda nota é: " + nota2 + "\nVocê teve " + faltas + " faltas.");

        media = (nota1 + nota2) /2;

        System.out.println("A média das notas é: " + media);



        }


}
