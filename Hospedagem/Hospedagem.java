package POO.Hospedagem;

public class Hospedagem {
    public double valor;

    public Hospedagem(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void printValor() {
        System.out.println(this.valor);
    }
}
