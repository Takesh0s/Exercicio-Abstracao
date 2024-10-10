package Abstração;

public abstract class ProvaUniversidade implements Aprovacao {
    private double notaN1;
    private double notaN2;

    public ProvaUniversidade(double notaN1, double notaN2) {
        if (notaN1 < 0 || notaN1 > 10 || notaN2 < 0 || notaN2 > 10) {
            throw new IllegalArgumentException("Notas devem ser entre 0 e 10.");
        }
        this.notaN1 = notaN1;
        this.notaN2 = notaN2;
    }

    public double getNotaN1() {
        return notaN1;
    }

    public double getNotaN2() {
        return notaN2;
    }

    public abstract double calcularMedia();
}