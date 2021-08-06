package POO.Livro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Lucas", 21, "M");
        p[1] = new Pessoa("Marcos", 52, "M");

        l[0] = new Livro("Biblia", "Jesus", 1562, p[0]);
        l[1] = new Livro("Querido John", "Nicholas Sparks", 183, p[1]);
        l[2] = new Livro("A culpa é das estrelas", "John Green", 255, p[1]);

        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
