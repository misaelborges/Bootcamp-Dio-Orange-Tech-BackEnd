public class Carro {
    /* Atributos do carro */
    private String cor;
    private String modelo;
    private int capacidadeTanque;

    /* Metodos */
    public void Carro() {

    }
 
    public void Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

}