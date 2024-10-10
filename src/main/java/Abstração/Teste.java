package Abstração;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota da N1 do aluno para a UCB:");
        double notaN1UCB = scanner.nextDouble();
        System.out.println("Digite a nota da N2 do aluno para a UCB:");
        double notaN2UCB = scanner.nextDouble();
        
        ProvaUCB provaUCB = new ProvaUCB(notaN1UCB, notaN2UCB);
        
        System.out.println("Digite a nota da N1 do aluno para a Fafifo:");
        double notaN1Fafifo = scanner.nextDouble();
        System.out.println("Digite a nota da N2 do aluno para a Fafifo:");
        double notaN2Fafifo = scanner.nextDouble();
        
        ProvaFafifo provaFafifo = new ProvaFafifo(notaN1Fafifo, notaN2Fafifo);
        
        if (provaUCB.aprovado()) {
            System.out.println("Aluno na UCB: Aprovado");
        } else {
            System.out.println("Aluno na UCB: Reprovado, o aluno deve procurar a secretaria escolar para mais informações.");
        }
        
        if (provaFafifo.aprovado()) {
            System.out.println("Aluno na Fafifo: Aprovado");
        } else {
            System.out.println("Aluno na Fafifo: Reprovado, o aluno deve procurar a secretaria escolar para mais informações.");
        }
        
        scanner.close();
    }
}