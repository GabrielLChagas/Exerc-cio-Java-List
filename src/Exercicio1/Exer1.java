package Exercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args ){

        Scanner scan = new Scanner(System.in);
        List<Double> tempeMedia = new ArrayList<Double>();

        Integer cout = 0;
        while(cout < 6){
            System.out.println("Insera a temperatura: ");
            Double temp = scan.nextDouble();
            tempeMedia.add(temp);
            cout++;
        }

        System.out.println(tempeMedia.toString());

        Iterator<Double> interator = tempeMedia.iterator();
        Double soma = 0.0;
        Double media = 0.0;
        while (interator.hasNext()){
            Double next = interator.next();
            soma += next;
            media = soma/tempeMedia.size();
        }

        System.out.println("A média semestral é: " + media);

        Double finalMedia = media;
        tempeMedia.stream()
                        .filter(t -> t > finalMedia)
                       .forEach(t -> System.out.printf("%.1f\n", t));


        Iterator<Double> filtro = tempeMedia.iterator();
        cout = 0;

        while(filtro.hasNext()){
            Double temp = filtro.next();
            if (temp > finalMedia) {
                switch (cout){
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            cout++;
        }

    }

}


