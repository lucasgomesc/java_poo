package POO.Pessoas;

/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
da pessoa.*/

public class TestePessoa {
    public static void main(String[] args) {
        String nome = "Lucas";
        String dataNascimento = "30/05/2000";
        String altura = "1,72 m";

        Pessoa pessoa = new Pessoa(nome, dataNascimento, altura);
        pessoa.exibir();
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Altura: " + pessoa.getAltura());

        String anoNascimento = String.valueOf(dataNascimento.charAt(6) + "" + dataNascimento.charAt(7) + "" +
                dataNascimento.charAt(8) + "" + dataNascimento.charAt(9));
        int anoNasc = Integer.parseInt(anoNascimento);
        int anoAtual = 2021;
        int idade = anoAtual - anoNasc;
        System.out.println("Sua idade é: " + idade);

    }
}
