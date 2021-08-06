package POO.Elevador;

public class Elevador implements Metodos {
    private int andarAtual;
    private int totalAndar;
    private int capacElevador;
    private int pessoasPresentes;

    public String situacao() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", totalAndar=" + totalAndar +
                ", capacElevador=" + capacElevador +
                ", pessoasPresentes=" + pessoasPresentes +
                '}';
    }

    public Elevador(int andarAtual, int totalAndar, int capacElevador, int pessoasPresentes) {
        this.andarAtual = andarAtual;
        this.totalAndar = totalAndar;
        this.capacElevador = capacElevador;
        this.pessoasPresentes = pessoasPresentes;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndar() {
        return totalAndar;
    }

    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    public int getCapacElevador() {
        return capacElevador;
    }

    public void setCapacElevador(int capacElevador) {
        this.capacElevador = capacElevador;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    @Override
    public void inicializa() {
        this.capacElevador = capacElevador;
        this.totalAndar = 15;
        this.pessoasPresentes = 0;
        this.andarAtual = 0;
    }

    @Override
    public void entra(int p) {
        if (capacElevador>p) {
            this.pessoasPresentes += p;
        } else if (p>capacElevador){
            this.pessoasPresentes = capacElevador;
        }
    }

    @Override
    public void sai(int s) {
        if (pessoasPresentes>0){
            this.pessoasPresentes-= s;
        } else {
            this.pessoasPresentes = pessoasPresentes;
        }
    }

    @Override
    public void sobe(int a) {
        if (andarAtual == totalAndar) {
            this.andarAtual = totalAndar;
        } else if (andarAtual < totalAndar) {
            this.andarAtual+=a;
        }
    }

    @Override
    public void desce(int d) {
        if (andarAtual == 0) {
            this.andarAtual = 0;
        } else if (andarAtual > 0) {
            this.andarAtual -= d;
        }
    }
}
