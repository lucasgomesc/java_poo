package POO.Televisao;

public class ControleRemoto implements Funcoes{
    private int volume;
    private int canal;

    public ControleRemoto(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public String consulta() {
        return "ControleRemoto {" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void aumentarVolume() {
        if (volume<30) {
            volume++;
        }else if (volume == 30) {
            System.out.println("Volume Maximo!");
        }
    }

    @Override
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else if (volume == 0) {
            System.out.println("Mudo!");
        }
    }

    @Override
    public void aumentarCanal() {
        canal++;
    }

    @Override
    public void diminuirCanal() {
        if (canal > 0) {
            canal--;
        } else if (canal <= 0) {
            canal = 1;
        }
    }

    @Override
    public void escolherCanal(int e) {
        this.canal = e;
    }
}
