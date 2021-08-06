package POO.Elevador;

public class Predio {
    public static void main(String[] args) {
        Elevador[] e = new Elevador[1];

        e[0] = new Elevador(0,15, 8, 0);

        e[0].entra(4);
        System.out.println(e[0].situacao());

        e[0].sobe(7);
        System.out.println(e[0].situacao());

        e[0].sai(2);
        System.out.println(e[0].situacao());

        e[0].desce(2);
        System.out.println(e[0].situacao());
    }
}
