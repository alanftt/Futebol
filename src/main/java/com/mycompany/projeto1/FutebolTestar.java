package com.mycompany.projeto1;

import java.util.Scanner;
import java.util.Vector;

public class FutebolTestar {

    public static void main(String[] args) {
        String time;
        int vitoria;
        int derrota;
        int participantes;
        int contador = 0;
        Scanner texto = new Scanner(System.in);
        Vector<Futebol>times = new Vector<>();

        System.out.println("Digite o numero de participantes do campeonato: ");
        participantes = texto.nextInt();

        while (contador < participantes) {

            texto.nextLine();
            System.out.println("Digite o nome do Time: ");
            time = texto.nextLine();

            System.out.println("Digite o numero de vitórias ele possui: ");
            vitoria = texto.nextInt();

            System.out.println("Digite o numero de derrotas que ele possui: ");
            derrota = texto.nextInt();

            
            Futebol clube = new Futebol(time, vitoria, derrota);
            times.add(clube);
            

            contador++;

        }
        
       
        for(int i=0; i<times.size(); i++){
            if (times.get(i).getVitorias() > times.get(i).getDerrotas()) {
            System.out.println("O time do " + times.get(i).getTime() + " esta classificado");
        }
        if (times.get(i).getVitorias() < times.get(i).getDerrotas()) {
            System.out.println("O time esta desclassificado");
        }
        if(times.get(i).getVitorias() == times.get(i).getDerrotas()){
           System.out.println("Ocorreu um empate"); 
        }
        }
                
       
    }

}
