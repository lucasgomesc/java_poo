package POO.Desconto;

public class Desconto {
    private double valorTotal;
    private double valorDesconto;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Desconto(double valorTotal, double valorDesconto) {
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
    }

    public String detalhes2() {
        return "Desconto{" +
                "valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                '}';
    }


}
