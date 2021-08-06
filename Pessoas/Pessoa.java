package POO.Pessoas;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String altura;

    public Pessoa(String nome, String dataNascimento, String altura) {
        setNome(nome);
        setDataNascimento(dataNascimento);
        setAltura(altura);
    }

    public void exibir(){
        System.out.println("Os dados da pessoa sao: ");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
