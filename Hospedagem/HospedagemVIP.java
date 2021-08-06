package POO.Hospedagem;

public class HospedagemVIP extends Hospedagem {
    private double adicional = 35;
    private double valorTotal;

    public HospedagemVIP(double valor) {
        super(valor);
        this.valor += adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
