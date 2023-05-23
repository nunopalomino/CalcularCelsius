package modelo;

public class CalculoCelsius extends absPropriedades {

    public CalculoCelsius(Double valorTemperatura) {
        super(valorTemperatura);
    }

    @Override
    public void executar() {
        valorTemperatura = valorTemperatura * 1.8 + 32;
    }

    @Override
    public String toString() {
        return valorTemperatura.toString();
    }
}
