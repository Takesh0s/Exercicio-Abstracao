package Abstração;

public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double notaN1, double notaN2) {
        super(notaN1, notaN2);
    }

    @Override
    public double calcularMedia() {
        double media = (getNotaN1() + getNotaN2()) / 2;
        return media;
    }

    @Override
    public boolean aprovado() {
        double media = calcularMedia();
        System.out.println("Média do aluno na UCB: " + media);
        return media >= 7;
    }
}