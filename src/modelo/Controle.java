package modelo;

public class Controle extends absPropriedades {

    public Controle(String valor) {
        super(valor);
    }

    public void executar() {
        absPropriedades validacao = new Validacao(valor);

        if (Estaticos.mensagem.equals("")) {
            absPropriedades celsius = new CalculoCelsius(validacao.valorTemperatura);
            this.valor = celsius.toString();
        }
    }

    @Override
    public String toString() {
        return this.valor;
    }

}