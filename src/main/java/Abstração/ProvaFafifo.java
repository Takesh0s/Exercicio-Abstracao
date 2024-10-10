package Abstração;

public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double notaN1, double notaN2) {
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
        System.out.println("Média do aluno na Fafifo: " + media);
        return media >= 6;
    }
}