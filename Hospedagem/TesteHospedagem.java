package POO.Hospedagem;

public class TesteHospedagem {
    public static void main(String[] args) {
        Hospedagem h = new Hospedagem(200);
        HospedagemVIP hv = new HospedagemVIP(200);

        System.out.println("Hospedagem comum: ");
        h.printValor();
        System.out.println("Hospedagem VIP: ");
        hv.printValor();
        System.out.println("A diferença de valores é: ");

        double a = h.getValor();
        double b = hv.getValor();
        double d = b-a;
        System.out.println(d);
    }
}
