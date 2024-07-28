package Exercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("\nTelefonou para vítima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> cheak = respostas.iterator();
        while(cheak.hasNext()){
            String resp = cheak.next();
            if(resp.contains("sim")){
                count++;
            }
        }

        System.out.println("Classificação do intrevistado: \n");
        switch (count){
            case 2:
                System.out.println("Suspeito"); break;
            case 3:
            case 4:
                System.out.println("Cúplice"); break;
            case 5:
                System.out.println("Assasina"); break;
            default:
                System.out.println("Inocente");
        }

    }
}
